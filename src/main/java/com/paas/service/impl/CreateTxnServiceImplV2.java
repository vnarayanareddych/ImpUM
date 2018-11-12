package com.paas.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.paas.dao.CreateTxnDAOV2;
import com.paas.dto.AuthenticationDTO;
import com.paas.dto.DataPushDTO;
import com.paas.model.CreateTransactionRequest;
import com.paas.model.CreateTransactionResponse;
import com.paas.model.PaymentCalculatorResponse;
import com.paas.model.ServerResponse;
import com.paas.service.AuthenticationService;
import com.paas.service.CreateTxnService;
import com.paas.service.CreateTxnServiceV2;

import static com.paas.constants.PaasConstants.SUCCESS_CODE;
import static com.paas.constants.PaasConstants.SUCCESS_VALIDATE_STATUSCODE;
import static com.paas.constants.PaasConstants.SUCCESS_SUBCODE;
import static com.paas.constants.PaasConstants.LINE_SPACE;
import static com.paas.constants.PaasConstants.RESPONSE_INTERNAL_ERR;
import static com.paas.constants.PaasConstants.AUTHENTICATE_SUBSTATUSCODE;
import static com.paas.constants.PaasConstants.AUTHENTICATE_DISABLE_SUBSTATUSCODE;
import static com.paas.constants.PaasConstants.AUTHORIZATION_STATUSCODE;
import static com.paas.constants.PaasConstants.CREATE_TXN_V2_QUEUE;

import static com.paas.utils.PaasUtils.getSQLException;
import static com.paas.utils.PaasUtils.getDBErrorCodeOrMsg;
import static com.paas.utils.PaasUtils.getServerResponse;

import static com.paas.utils.RequestValidator.validateCreateTxnV2Request;

import java.sql.SQLException;
import java.util.Map;


@Service
public class CreateTxnServiceImplV2 implements CreateTxnServiceV2{
	
	@Autowired
	private CreateTxnDAOV2 createTxnDAOV2;
	
	@Autowired
	private AuthenticationService authenticationService;
	
	@Autowired
	JmsTemplate jmsTemplate;
	
	private static Logger log = LoggerFactory.getLogger(CreateTxnServiceImplV2.class
			.getName());
	
	private String requestTime = null;
	private final String LINE_SPACE = "\t";
	
	@Override
	public ResponseEntity<CreateTransactionResponse> doCreateTxnV2(CreateTransactionRequest request,Environment props,String agentCode) {
		log.info("Entered in to CreateTxnV2ServiceImpl:doCreateTxn");
		CreateTransactionResponse createTxnResponse = null;
		ObjectMapper mapper = new ObjectMapper();
		String authenticationKey = null;
		ServerResponse serverResponse = null;
		String subStatusCode = "";
		String subStatusDesc = "";
		String userID = "";
		int agentStatus = 0;
		
		String ssPrefix = "ssPrefixCreate";
		String apiAgentCode = ""; //20180524:1
		int agentStatus2 = 0; //20180524:1
		String jsonResponse = "";
		
		try {
			
			AuthenticationDTO authenticationDTO = null;
			authenticationDTO = authenticationService.validateAgentCode(agentCode);
			
			if (null == authenticationDTO) {
				subStatusCode = AUTHENTICATE_SUBSTATUSCODE; // Authentication
															// Error
			}else if (((authenticationDTO.getAgentStatus() & 1073741824 ) == 1073741824 ) || ((authenticationDTO.getKeyStatus() & 1073741824 ) == 1073741824 )) {
			    subStatusCode = AUTHENTICATE_DISABLE_SUBSTATUSCODE; // Authentication Error
				
		   }else if ((authenticationDTO.getAgentStatus2() & 262144) == 262144) {
			
			log.info("authenticationKey--->" + authenticationKey);
			
				subStatusCode = validateCreateTxnV2Request(request);
				if (null != request.getSendingAgentCode()&& request.getSendingAgentCode().length() == 12) agentCode = request.getSendingAgentCode();
				else
					agentCode = authenticationDTO.getAgentCode();
				
				userID = authenticationDTO.getUserID();
				agentStatus = authenticationDTO.getAgentStatus();
				apiAgentCode = authenticationDTO.getAgentCode(); 
				agentStatus2  = authenticationDTO.getAgentStatus2();
					
				if (SUCCESS_CODE.equals(subStatusCode)) {
					String jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);
					System.out.println("JsonInString : " + jsonInString );

					log.info(requestTime+ " Request Sending to API to CreateTransaction for PartnerTxnRefNo : "+ request.getPartnerTxnRefNo() + LINE_SPACE+ LINE_SPACE + jsonInString + LINE_SPACE+ LINE_SPACE+ "Request Completed to CreateTransaction");

					if (request.getOverrideRateFlag() == 1) {
						request.setXchgRatePayin2Payout(0.0);
					}
						
					createTxnResponse = createTxnDAOV2.doCreateTxnV2(request, props, agentCode, userID,
							agentStatus,agentStatus2,apiAgentCode);
					if (null != createTxnResponse) {
						if (request.getValidateOnlyFlag() == 1) {
							subStatusCode = SUCCESS_VALIDATE_STATUSCODE; // Validate
																				// Transaction
							} else {
								subStatusCode = SUCCESS_SUBCODE; // Create
																	// Transaction
								createTxnResponse
										.setTaxInvoiceNumber(createTxnResponse.getTaxInvoiceNumber());
							}
						}
					}
		   }else {
				subStatusCode = AUTHORIZATION_STATUSCODE;
			}
				
				serverResponse = getServerResponse(subStatusCode, subStatusDesc, ssPrefix,props);
				if (null == serverResponse) {
					serverResponse = RESPONSE_INTERNAL_ERR;
				}
				if (null == createTxnResponse) {
					createTxnResponse = new CreateTransactionResponse();
				}
				createTxnResponse.setServerResponse(serverResponse);

				jsonResponse = mapper.writerWithDefaultPrettyPrinter()
						.writeValueAsString(createTxnResponse);


				log.info( requestTime + " Response Received from API to CreateTransactionEx for PartnerTxnRefNo : "+ request.getPartnerTxnRefNo() + LINE_SPACE + LINE_SPACE
							+ jsonResponse + LINE_SPACE + LINE_SPACE
							+ "Response Completed to CreateTransactionEx");
				
				DataPushDTO paasRequestDTO = new DataPushDTO();
				paasRequestDTO.setAgentCode("MDARTUSRX001"); // Which AgentCode
				paasRequestDTO.setDataPushMode("SD");
				paasRequestDTO.setInstrumentType(request.getProductType().substring(0, 2));
				paasRequestDTO.setPaymentMode(createTxnResponse.getPaymentMode());
				paasRequestDTO.setServiceProviderCode(createTxnResponse.getServiceProviderCode());
				paasRequestDTO.setSessionKey("");
				paasRequestDTO.setSourceDC("KDC");
				paasRequestDTO.setStageNo(0);
				paasRequestDTO.setTxnRefNo(createTxnResponse.getTxnRefNo());
				paasRequestDTO.setTxnType("SD");
				
				jmsTemplate.convertAndSend(CREATE_TXN_V2_QUEUE, paasRequestDTO);
				System.out.println("After data push to queue in CreateTxnV2 !");
				log.info("=======:: After data push to queue in CreateTxnV2 !");
				
				return new ResponseEntity<CreateTransactionResponse>(createTxnResponse, HttpStatus.OK);
				
		} catch (Exception ex) {
			//log.info(xml.getCurrentTime() + " Fatal Error - for LogTrackNo : "+ xml.getLogTrackNo() + LINE_SPACE + LINE_SPACE+ ex.getMessage());
			SQLException sqlEx = getSQLException(ex);
			if (null != getSQLException(ex)) {
				subStatusCode = getDBErrorCodeOrMsg(sqlEx, false);
				subStatusDesc = getDBErrorCodeOrMsg(sqlEx, true);
			} else {
				subStatusCode = "503";
				subStatusDesc = ex.getMessage();
			}
			
			serverResponse = getServerResponse(subStatusCode, subStatusDesc, ssPrefix,props);
			if (null == serverResponse) {
				serverResponse = RESPONSE_INTERNAL_ERR;
			}
			if (null == createTxnResponse) {
				createTxnResponse = new CreateTransactionResponse();
			}
			createTxnResponse.setServerResponse(serverResponse);

			String JSONResponse = "";
			log.info(requestTime+ " Response Received from API to CreateTransactionEx for PartnerTxnRefNo : "+ request.getPartnerTxnRefNo() + LINE_SPACE + LINE_SPACE+ JSONResponse + LINE_SPACE + LINE_SPACE+ "Response Completed to CreateTransactionEx");

			/*if(!createTxnResponse.getServerResponse().getResponseCode().equalsIgnoreCase("S0000")) {
				createTxnResponse.setTxnRefNo("");
				createTxnResponse.setPartnerTxnRefNo("");
				createTxnResponse.setTaxInvoiceNumber("");
				createTxnResponse.setPayinCcyCode("");
				createTxnResponse.setPayoutCcyCode("");
				createTxnResponse.setPaymentMode("");
				createTxnResponse.setSendingAgentCode("");
				createTxnResponse.setServiceProviderCode("");
				createTxnResponse.setReceivingAgentCode("");
				createTxnResponse.setSourceOfIncome("");
				createTxnResponse.setPurposeOfTxn("");
				createTxnResponse.setTransactionGMTDateTime("");
				createTxnResponse.setSettlementCcyCode("");
				createTxnResponse.setReservedParam1("");
				createTxnResponse.setReservedParam2("");
				createTxnResponse.setReservedParam3("");
				createTxnResponse.setReservedParam4("");
				createTxnResponse.setReservedParam5("");
				createTxnResponse.setReservedParam6("");
				createTxnResponse.setReservedParam7("");
				createTxnResponse.setReservedParam8("");
				createTxnResponse.setReservedParam9("");
				createTxnResponse.setReservedParam10("");
			}*/
			
			return new ResponseEntity<CreateTransactionResponse>(createTxnResponse,
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
