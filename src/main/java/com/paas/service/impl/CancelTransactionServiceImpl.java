package com.paas.service.impl;

import static com.paas.constants.PaasConstants.AE_SERVICE_PROVIDER_SUBCODE;
import static com.paas.constants.PaasConstants.INVALID_TXN;
import static com.paas.constants.PaasConstants.LINE_SPACE;
import static com.paas.constants.PaasConstants.RESPONSE_INTERNAL_ERR;
import static com.paas.constants.PaasConstants.SUCCESS_CODE;
import static com.paas.constants.PaasConstants.SUCCESS_SUBCODE;
import static com.paas.constants.PaasConstants.RESPONSE_SUCCESS;
import static com.paas.constants.PaasConstants.CANCEL_TXN_QUEUE;
import static com.paas.constants.PaasConstants.CANCEL_TXN_SERVICE_STATUS;
import static com.paas.constants.PaasConstants.SUB_STATUS_CODE;
import static com.paas.constants.PaasConstants.EMPTY_STRING;
import static com.paas.constants.PaasConstants.USER_ID;
import static com.paas.constants.PaasConstants.AGENT_STATUS;

import static com.paas.utils.PaasUtils.callReXPIService;
import static com.paas.utils.PaasUtils.dataPush;
import static com.paas.utils.PaasUtils.getDBErrorCodeOrMsg;
import static com.paas.utils.PaasUtils.getSQLException;
import static com.paas.utils.PaasUtils.getServerResponse;
import static com.paas.utils.PaasUtils.authenticateAgent;
import static com.paas.utils.RequestValidator.generateSOAPformatForLockTxn;
import static com.paas.utils.RequestValidator.validateCancelTxnRequest;

import java.sql.SQLException;
import java.util.Map;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.paas.dao.CancelTransactionDAO;
import com.paas.dto.CancelTxnDTO;
import com.paas.model.CancelTransactionRequest;
import com.paas.model.CancelTransactionResponse;
import com.paas.model.LockTransactionRequest;
import com.paas.model.ServerResponse;
import com.paas.service.AuthenticationService;
import com.paas.service.CancelTransactionService;

@Service
public class CancelTransactionServiceImpl implements CancelTransactionService {

	private static final Logger log = LoggerFactory.getLogger(CancelTransactionServiceImpl.class);

	@Autowired
	private Environment props;

	@Autowired
	private CancelTransactionDAO cancelTransactionDAO;

	@Autowired
	private AuthenticationService authenticationService;

	@Autowired
	JmsTemplate jmsTemplate;

	@Override
	public ResponseEntity<CancelTransactionResponse> doCancelTxn(CancelTransactionRequest cancelTransactionRequest,
			String agentCode) {
		// TODO Auto-generated method stub

		CancelTransactionResponse cancelTransactionResponse = null;
		CancelTxnDTO cancelTransactionDTO = null;
		ObjectMapper objectMapper = new ObjectMapper();
		String subStatusCode = "";
		String subStatusDesc = "";
		ServerResponse serverResponse = null;
		String userID = "";
		String ssPrefix = "ssPrefixCancel";
		int reXPILockAPIFlag = 0;
		int agentStatus = 0;
		boolean triggerDataPush = false;
		Map<String, String> authenticationMap = null;

		int statusFlag = 0;
		/*
		 * 0 - Pointing to TR in UK 
		 * 1 - pointing to PR in UK 
		 * 2 - pointing to PR in AE 
		 * 3-  pointing to PR in AE
		 */
		try {
			authenticationMap = authenticateAgent(authenticationService, agentCode, CANCEL_TXN_SERVICE_STATUS, props);
			subStatusCode = Optional.ofNullable(authenticationMap.get(SUB_STATUS_CODE)).orElse(EMPTY_STRING);

			if (SUCCESS_CODE.equals(subStatusCode)) {
				userID = Optional.ofNullable(authenticationMap.get(USER_ID)).orElse(userID);
				agentStatus = Integer.parseInt(Optional.ofNullable(authenticationMap.get(AGENT_STATUS)).orElse(""));
				subStatusCode = validateCancelTxnRequest(cancelTransactionRequest, props);
			}
			if (SUCCESS_CODE.equals(subStatusCode)) {

				log.info("Sending Request to CancelTransaction API for TxnRefNo : "
						+ cancelTransactionRequest.getTxnRefNo() + LINE_SPACE + LINE_SPACE + cancelTransactionRequest);

				cancelTransactionDTO = cancelTransactionDAO.doCancellation(cancelTransactionRequest, agentCode, userID,
						statusFlag, agentStatus);

				log.info("Respone Received from cancellation API for TxnRefNo in TR : "
						+ cancelTransactionRequest.getTxnRefNo() + LINE_SPACE + LINE_SPACE + cancelTransactionDTO);

				if (null != cancelTransactionDTO.getReturnCode()
						&& cancelTransactionDTO.getReturnCode().equals(AE_SERVICE_PROVIDER_SUBCODE)) {

					/*
					 * performing lock in KDC via ReXPI API (reXPILockAPIFlag =1) 
					 * performing cancellation in PAAS DC (status flag = 2;)
					 */
					statusFlag = 2;
					reXPILockAPIFlag = 1;
				}
				if (null != cancelTransactionDTO.getReturnCode()
						&& cancelTransactionDTO.getReturnCode().equals(INVALID_TXN)) {
					/*
					 * performing cancellation in PAAS PR (status flag = 1;)
					 */
					statusFlag = 1;

					cancelTransactionDTO = cancelTransactionDAO.doCancellation(cancelTransactionRequest, agentCode,
							userID, statusFlag, agentStatus);

					log.info("Respone Received from cancellation API for TxnRefNo in PR : "
							+ cancelTransactionRequest.getTxnRefNo() + LINE_SPACE + LINE_SPACE + cancelTransactionDTO);

					if (null != cancelTransactionDTO.getReturnCode()
							&& cancelTransactionDTO.getReturnCode().equals(INVALID_TXN)) {
						subStatusCode = INVALID_TXN;
					}
					else {
						subStatusCode = SUCCESS_SUBCODE;
					}
					serverResponse = getServerResponse(subStatusCode, subStatusDesc, ssPrefix, props);		
				}
				
			}
			if (null == cancelTransactionDTO) {
				cancelTransactionResponse = new CancelTransactionResponse();
				serverResponse = getServerResponse(subStatusCode, subStatusDesc, ssPrefix, props);

			} else if (null != cancelTransactionDTO) {

				if (reXPILockAPIFlag == 1) {

					log.info("Calling ReXPI LOCK API for TxnRefNO :" + cancelTransactionRequest.getTxnRefNo());

					LockTransactionRequest lockTransactionRequest = new LockTransactionRequest();

					lockTransactionRequest.setTxnRefNo(cancelTransactionDTO.getTxnRefNo());
					lockTransactionRequest.setLockUnlockFlag(1);
					lockTransactionRequest.setControlFlag(cancelTransactionRequest.getControlFlag());

					String xmlRequestInStringFormat = generateSOAPformatForLockTxn(lockTransactionRequest);

					serverResponse = callReXPIService(xmlRequestInStringFormat, props);
					serverResponse = RESPONSE_SUCCESS;
					log.info("Response Received from ReXPI LOCK API for TxnRefNO : "
							+ cancelTransactionRequest.getTxnRefNo() + " response : " + serverResponse);

					cancelTransactionDTO.setTxnRefNo(null);
				}

				if (RESPONSE_SUCCESS.equals(serverResponse)) {// Transaction lock Success in KDC -

					cancelTransactionDTO = cancelTransactionDAO.doCancellation(cancelTransactionRequest, agentCode,
							userID, statusFlag, agentStatus);

					log.info("Respone Received from cancellation API for AE Service Provicder TxnRefNo : "
							+ cancelTransactionRequest.getTxnRefNo() + LINE_SPACE + LINE_SPACE
							+ cancelTransactionResponse);

					if (null != cancelTransactionDTO.getReturnCode()
							&& cancelTransactionDTO.getReturnCode().equals(INVALID_TXN)) {
						subStatusCode = INVALID_TXN;
					}
					else {
						subStatusCode = SUCCESS_SUBCODE;
						triggerDataPush = true;
					}
					serverResponse = getServerResponse(subStatusCode, subStatusDesc, ssPrefix, props);

				}
				String jsonRequest = objectMapper.writerWithDefaultPrettyPrinter()
						.writeValueAsString(cancelTransactionDTO);
				cancelTransactionResponse = objectMapper.readValue(jsonRequest, CancelTransactionResponse.class);

				serverResponse = Optional.ofNullable(serverResponse).orElse(RESPONSE_INTERNAL_ERR);
				
				cancelTransactionResponse.setServerResponse(serverResponse);
				
				if(triggerDataPush) {
					
				dataPush(agentCode, cancelTransactionRequest.getProductType(),
						cancelTransactionResponse.getServiceProviderCode(), cancelTransactionRequest.getTxnRefNo(),
						CANCEL_TXN_QUEUE,"SC", jmsTemplate);
				}

				return new ResponseEntity<CancelTransactionResponse>(cancelTransactionResponse, HttpStatus.OK);
			}
			
			serverResponse = getServerResponse(subStatusCode, subStatusDesc, ssPrefix, props);
			System.out.println("serverResponse   " + serverResponse);
			cancelTransactionResponse.setServerResponse(serverResponse);
			return new ResponseEntity<CancelTransactionResponse>(cancelTransactionResponse,
					HttpStatus.INTERNAL_SERVER_ERROR);

		} catch (Exception ex) {

			System.out.println("ex ::" + ex);

			SQLException sqlEx = getSQLException(ex);
			if (null != getSQLException(ex)) {
				subStatusCode = getDBErrorCodeOrMsg(sqlEx, false);
				subStatusDesc = getDBErrorCodeOrMsg(sqlEx, true);
			} else {
				subStatusCode = "503";
				subStatusDesc = ex.getMessage();
			}
			serverResponse = getServerResponse(subStatusCode, subStatusDesc, ssPrefix, props);
			if (null == serverResponse) {
				serverResponse = RESPONSE_INTERNAL_ERR;
			}

			if (null == cancelTransactionResponse) {
				cancelTransactionResponse = new CancelTransactionResponse();
			}
			cancelTransactionResponse.setServerResponse(serverResponse);

			return new ResponseEntity<CancelTransactionResponse>(cancelTransactionResponse,
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		// return new
		// ResponseEntity<CancelTransactionResponse>(HttpStatus.NOT_IMPLEMENTED);
	}

}
