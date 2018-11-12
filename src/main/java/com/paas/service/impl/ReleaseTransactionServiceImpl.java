package com.paas.service.impl;

import static com.paas.constants.PaasConstants.AE_STATUS_CODE;
import static com.paas.constants.PaasConstants.LINE_SPACE;
import static com.paas.constants.PaasConstants.RELEASE_TXN_SERVICE_STATUS;
import static com.paas.constants.PaasConstants.RESPONSE_INTERNAL_ERR;
import static com.paas.constants.PaasConstants.RESPONSE_SUCCESS;
import static com.paas.constants.PaasConstants.SUB_STATUS_CODE;
import static com.paas.constants.PaasConstants.SUCCESS_CODE;
import static com.paas.constants.PaasConstants.SUCCESS_RELEASED;
import static com.paas.constants.PaasConstants.USER_ID;
import static com.paas.constants.PaasConstants.EMPTY_STRING;
import static com.paas.utils.PaasUtils.authenticateAgent;
import static com.paas.utils.PaasUtils.getDBErrorCodeOrMsg;
import static com.paas.utils.PaasUtils.getSQLException;
import static com.paas.utils.PaasUtils.getServerResponse;
import static com.paas.utils.RequestValidator.validateReleaseTxnRequest;

import java.sql.SQLException;
import java.util.Map;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.paas.dao.ReleaseTransactionDAO;
import com.paas.model.ReleaseTransactionRequest;
import com.paas.model.ReleaseTransactionResponse;
import com.paas.model.ServerResponse;
import com.paas.service.AuthenticationService;
import com.paas.service.ReXPIServices;
import com.paas.service.ReleaseTransactionService;

@Service
public class ReleaseTransactionServiceImpl implements ReleaseTransactionService {

	private static final Logger log = LoggerFactory.getLogger(ReleaseTransactionServiceImpl.class);

	@Autowired
	private Environment props;

	@Autowired
	public ReleaseTransactionDAO releaseTransactionDAO;

	@Autowired
	private AuthenticationService authenticationService;

	@Autowired
	private ReXPIServices reXPIServices;

	@Override
	public ResponseEntity<ReleaseTransactionResponse> doReleaseTxn(ReleaseTransactionRequest releaseTransactionRequest,
			String agentCode) {
		ReleaseTransactionResponse releaseTransactionResponse = null;
		ObjectMapper objectMapper = new ObjectMapper();
		String userID = "System";
		ServerResponse serverResponse = null;
		String subStatusCode = "";
		String subStatusDesc = "";
		String serviceProviderCode = "";
		String ssPrefix = "ssPrefixReleaseAndLock";
		String txnRefNo = "";
		String jsonResponseString = "";
		String jsonRequest = "";
		Integer statusFlag = 1;
		Map<String, String> authenticationMap = null;
		try {

			txnRefNo = releaseTransactionRequest.getTxnRefNo();

			authenticationMap = authenticateAgent(authenticationService, agentCode, RELEASE_TXN_SERVICE_STATUS, props);

			subStatusCode = Optional.ofNullable(authenticationMap.get(SUB_STATUS_CODE)).orElse(EMPTY_STRING);

			if (SUCCESS_CODE.equalsIgnoreCase(subStatusCode)) {

				userID = Optional.ofNullable(authenticationMap.get(USER_ID)).orElse(userID);
				subStatusCode = validateReleaseTxnRequest(releaseTransactionRequest, props);
				if (SUCCESS_CODE.equalsIgnoreCase(subStatusCode)) {

					jsonRequest = objectMapper.writerWithDefaultPrettyPrinter()
							.writeValueAsString(releaseTransactionRequest);

					log.info(" Request Sending to API to ReleaseTransaction for TxnRefNo : " + txnRefNo + LINE_SPACE
							+ LINE_SPACE + jsonRequest + LINE_SPACE + LINE_SPACE
							+ "Request Completed to ReleaseTransaction");

					/*
					 * Calling the Stored procedure to release the txn - Incase of UAE SP, the
					 * Stored procedure will return SubStatusCode as 'S7777' and
					 * subStatusDescription as ServiceProviderCode from this we can identify the
					 * service provider
					 */

					releaseTransactionResponse = callReleaseTxnSP(userID, agentCode, statusFlag,
							releaseTransactionRequest);

					if (null != releaseTransactionResponse) {

						if (AE_STATUS_CODE.equals(releaseTransactionResponse.getServerResponse().getSubStatusCode())) {

							/*
							 * In case of UAE service provider - we are calling the ReXPI services based on
							 * the releaseFlag value from the request releaseFlag 1 = Send Authorize, 2 =
							 * Cancel Authorize, 3 = Revert cancel (1 - Revert with lock (Not using as of
							 * now) , 2 - Revert with unlock)
							 */
							serviceProviderCode = releaseTransactionResponse.getServerResponse()
									.getSubStatusDescription();

							serverResponse = reXPIServices.doReleaseAETxn(releaseTransactionRequest, agentCode,
									serviceProviderCode, props);

							if (RESPONSE_SUCCESS.equals(serverResponse)) {

								/*
								 * status flag = 16 appended to skip exiting condition with the result set in
								 * case of UAE service provider
								 */
								if (releaseTransactionRequest.getReleaseFlag() != 2) {
									statusFlag = statusFlag ^ 16;
									releaseTransactionResponse = callReleaseTxnSP(userID, agentCode, statusFlag,
											releaseTransactionRequest);
								} else {
									/*
									 * In case of Cancel Authorization - @aReleaseFlag = 2 During 1st DB execution
									 * itself the transaction cancellation is authorized Hence there is no need to
									 * call the stored procedure again.
									 */
									subStatusCode = SUCCESS_RELEASED;
								}

							} else {

								subStatusCode = serverResponse.getSubStatusCode();

							}

						}

						if (SUCCESS_RELEASED
								.equals(releaseTransactionResponse.getServerResponse().getSubStatusCode())) {
							subStatusCode = SUCCESS_RELEASED; // Transaction Released
						}
					}
				}

			}

		} catch (Exception ex) {

			log.info(" Fatal Error - : " + LINE_SPACE + LINE_SPACE + ex.getMessage());

			SQLException sqlEx = getSQLException(ex);
			if (null != getSQLException(ex)) {
				subStatusCode = getDBErrorCodeOrMsg(sqlEx, false);
				subStatusDesc = getDBErrorCodeOrMsg(sqlEx, true);
			} else {
				subStatusCode = "503";
				subStatusDesc = ex.getMessage();
			}

		}

		serverResponse = getServerResponse(subStatusCode, subStatusDesc, ssPrefix, props);

		if (subStatusCode.equals(SUCCESS_RELEASED)) {
			try {
				jsonRequest = objectMapper.writerWithDefaultPrettyPrinter()
						.writeValueAsString(releaseTransactionRequest);
				releaseTransactionResponse = objectMapper.readValue(jsonRequest, ReleaseTransactionResponse.class);
			} catch (Exception e) {
				log.info(" Fatal Error - for : " + LINE_SPACE + LINE_SPACE + e.getMessage());
			}
		}

		serverResponse = Optional.ofNullable(serverResponse).orElse(RESPONSE_INTERNAL_ERR);

		releaseTransactionResponse = Optional.ofNullable(releaseTransactionResponse)
				.orElse(new ReleaseTransactionResponse());

		releaseTransactionResponse.setServerResponse(serverResponse);

		try {
			jsonResponseString = objectMapper.writeValueAsString(releaseTransactionResponse);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		log.info(
				" Response Received from API to ReleaseTransaction for TxnRefNo : " + txnRefNo + LINE_SPACE + LINE_SPACE
						+ jsonResponseString + LINE_SPACE + LINE_SPACE + "Response Completed to ReleaseTransaction");

		return new ResponseEntity<ReleaseTransactionResponse>(releaseTransactionResponse,
				subStatusCode.equals(SUCCESS_RELEASED) ? HttpStatus.OK : HttpStatus.INTERNAL_SERVER_ERROR);

	}

	private ReleaseTransactionResponse callReleaseTxnSP(String userID, String agentCode, Integer statusFlag,
			ReleaseTransactionRequest releaseTransactionRequest) {

		return releaseTransactionDAO.doReleaseTxn(userID, agentCode, statusFlag, releaseTransactionRequest);
	}

}
