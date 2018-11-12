package com.paas.service.impl;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.paas.dao.CreateTxnDAO;
import com.paas.dto.AuthenticationDTO;
import com.paas.dto.DataPushDTO;
import com.paas.model.CreateTransactionRequest;
import com.paas.model.CreateTransactionResponse;
import com.paas.model.ServerResponse;
import com.paas.service.AuthenticationService;
import com.paas.service.CreateTxnService;
import static com.paas.utils.PaasUtils.getSQLException;
import static com.paas.utils.PaasUtils.getDBErrorCodeOrMsg;
import static com.paas.utils.PaasUtils.getServerResponse;
import static com.paas.utils.RequestValidator.validateCreateTxnRequest;

import static com.paas.constants.PaasConstants.SUCCESS_CODE;
import static com.paas.constants.PaasConstants.SUCCESS_VALIDATE_STATUSCODE;
import static com.paas.constants.PaasConstants.SUCCESS_SUBCODE;
import static com.paas.constants.PaasConstants.LINE_SPACE;
import static com.paas.constants.PaasConstants.SIGNATURE_SUBSTATUSCODE;
import static com.paas.constants.PaasConstants.RESPONSE_INTERNAL_ERR;
import static com.paas.constants.PaasConstants.AUTHENTICATE_SUBSTATUSCODE;
import static com.paas.constants.PaasConstants.AUTHENTICATE_DISABLE_SUBSTATUSCODE;
import static com.paas.constants.PaasConstants.AUTHORIZATION_STATUSCODE;
import static com.paas.constants.PaasConstants.CREATE_TXN_QUEUE;

@Service
public class CreateTxnServiceImpl implements CreateTxnService{

	@Autowired
	private CreateTxnDAO createTxnDAO;
	
	@Autowired
	private AuthenticationService authenticationService;
	
	private static final Logger log = LoggerFactory.getLogger(CreateTxnServiceImpl.class.getName());
	
	@Autowired
	JmsTemplate jmsTemplate;
	
	@Override
	public ResponseEntity<CreateTransactionResponse> doCreateTxn(CreateTransactionRequest request,Environment props,String agentCode) {

		CreateTransactionResponse createTxnResponse = null;
		ObjectMapper mapper = new ObjectMapper();
		ServerResponse serverResponse = null;
		//String agentCode = "";
		String userID = "";
		String subStatusCode = "";
		String subStatusDesc = "";
		String ssPrefix = "ssPrefixCreate";
		int agentStatus = 0;
		Boolean isVerified = true;
		String requestTime = "";
		String jsonResponse = "";
				
		try {
			
			AuthenticationDTO authenticationDTO = null;
			System.out.println("agentCode-->"+agentCode);
			authenticationDTO = authenticationService.validateAgentCode(agentCode);
			System.out.println("authenticationDTO-->"+authenticationDTO.toString());
			
			if (null == authenticationDTO) {
				subStatusCode = AUTHENTICATE_SUBSTATUSCODE; // Authentication Error
			}else if(((authenticationDTO.getAgentStatus() & 1073741824 ) == 1073741824 ) || ((authenticationDTO.getKeyStatus() & 1073741824 ) == 1073741824 )){
			    subStatusCode = AUTHENTICATE_DISABLE_SUBSTATUSCODE; // Authentication Error
		   }else if((authenticationDTO.getAgentStatus2() & 4) == 4){
			
				request.setSenderType(request.getSenderType() != 0 ? request.getSenderType() : 1);
				request.setReceiverType(request.getReceiverType() != 0 ? request.getReceiverType() : 1);
					
				subStatusCode = validateCreateTxnRequest(request);				  
				if(null != request.getSendingAgentCode() && request.getSendingAgentCode().length() == 12)
					agentCode = request.getSendingAgentCode();
				else
					agentCode = authenticationDTO.getAgentCode();
				  
				userID = authenticationDTO.getUserID();
				agentStatus  = authenticationDTO.getAgentStatus(); 
				
				if (SUCCESS_CODE.equals(subStatusCode)) {
					
					String jsonRequest = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);
					System.out.println("JsonInString : " + jsonRequest );
				     
					log.info( requestTime + " Request Sending to API to CreateTransactionEx for PartnerTxnRefNo : "+request.getPartnerTxnRefNo() + LINE_SPACE + LINE_SPACE
							+ jsonRequest + LINE_SPACE + LINE_SPACE
							+ "Request Completed to CreateTransactionEx");
					
					if(request.getOverrideRateFlag() == 1){
						request.setXchgRatePayin2Payout(0.0);
					}
					
					createTxnResponse = createTxnDAO.doCreateTxn(request,props,agentCode,userID,agentStatus);
					
					if (null != createTxnResponse) {
						if(request.getValidateOnlyFlag() == 1){
							subStatusCode = SUCCESS_VALIDATE_STATUSCODE;	// Validate Transaction
						}else{
							subStatusCode = SUCCESS_SUBCODE;	// Create Transaction
						}
					}
				}
		   }else{
				 subStatusCode = AUTHORIZATION_STATUSCODE;
			}
				  
				//start
				serverResponse = getServerResponse(subStatusCode, subStatusDesc, ssPrefix,props);
				if(null == serverResponse) {
					serverResponse = RESPONSE_INTERNAL_ERR;
				}	
				if (null == createTxnResponse) {
					createTxnResponse = new CreateTransactionResponse();
				}
				if(subStatusCode.equals("80032")){
					String arr[] =  subStatusDesc.split("-");
					String txnNo = arr[1];
					createTxnResponse.setTxnRefNo(txnNo);
					createTxnResponse.setPartnerTxnRefNo(request.getPartnerTxnRefNo());
				}
					
				createTxnResponse.setServerResponse(serverResponse);
				jsonResponse = mapper.writerWithDefaultPrettyPrinter()
						.writeValueAsString(createTxnResponse);


				log.info( requestTime + " Response Received from API to CreateTransactionEx for PartnerTxnRefNo : "+ request.getPartnerTxnRefNo() + LINE_SPACE + LINE_SPACE
							+ jsonResponse + LINE_SPACE + LINE_SPACE
							+ "Response Completed to CreateTransactionEx");
				 //end
				
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
				
				System.out.println("Before data push to queue in CreateTxn !");
				log.info("=======:: Before data push to queue in CreateTxn !");
				jmsTemplate.convertAndSend(CREATE_TXN_QUEUE, paasRequestDTO);
				System.out.println("After data push to queue in CreateTxn !");
				log.info("=======:: After data push to queue in CreateTxn !");
				
				return new ResponseEntity<CreateTransactionResponse>(createTxnResponse, HttpStatus.OK);
				 
		} catch (Exception ex) {
			log.info("exception--->"+ex.getMessage()+ex.getCause());
			SQLException sqlEx = getSQLException(ex);
			if (null != getSQLException(ex)) {
				subStatusCode = getDBErrorCodeOrMsg(sqlEx, false);
				subStatusDesc = getDBErrorCodeOrMsg(sqlEx, true);
			} else {
				subStatusCode = "503";
				subStatusDesc = ex.getMessage();
			}
			
			//start
			serverResponse = getServerResponse(subStatusCode, subStatusDesc, ssPrefix,props);
			if(null == serverResponse) {
				serverResponse = RESPONSE_INTERNAL_ERR;
			}	
			if (null == createTxnResponse) {
				createTxnResponse = new CreateTransactionResponse();
			}
			if(subStatusCode.equals("80032")){
				String arr[] =  subStatusDesc.split("-");
				String txnNo = arr[1];
				createTxnResponse.setTxnRefNo(txnNo);
				createTxnResponse.setPartnerTxnRefNo(request.getPartnerTxnRefNo());
			}
			
			createTxnResponse.setServerResponse(serverResponse);
			/*jsonResponse = mapper.writerWithDefaultPrettyPrinter()
					.writeValueAsString(createTxnResponse);*/


			log.info( requestTime + " Response Received from API to CreateTransactionEx for PartnerTxnRefNo : "+ request.getPartnerTxnRefNo() + LINE_SPACE + LINE_SPACE
					+ jsonResponse + LINE_SPACE + LINE_SPACE
					+ "Response Completed to CreateTransactionEx");
			
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
			//end
			
			return new ResponseEntity<CreateTransactionResponse>(createTxnResponse,
					HttpStatus.INTERNAL_SERVER_ERROR);
		}//catch
		
	}
	
}
