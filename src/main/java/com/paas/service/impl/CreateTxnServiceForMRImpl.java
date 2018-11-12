package com.paas.service.impl;
import static com.paas.constants.PaasConstants.AUTHENTICATE_DISABLE_SUBSTATUSCODE;
import static com.paas.constants.PaasConstants.AUTHENTICATE_STATUSCODE;
import static com.paas.constants.PaasConstants.AUTHORIZATION_STATUSCODE;
import static com.paas.constants.PaasConstants.LINE_SPACE;
import static com.paas.constants.PaasConstants.RESPONSE_INTERNAL_ERR;
import static com.paas.constants.PaasConstants.SUCCESS_CODE;
import static com.paas.constants.PaasConstants.SUCCESS_SUBCODE;
import static com.paas.constants.PaasConstants.SUCCESS_VALIDATE_STATUSCODE;
import static com.paas.utils.PaasUtils.getDBErrorCodeOrMsg;
import static com.paas.utils.PaasUtils.getSQLException;
import static com.paas.utils.PaasUtils.getServerResponse;
import static com.paas.utils.RequestValidator.validateCreateTxnRequest;
import static com.paas.utils.RequestValidator.validateCreateTxnV2Request;

import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.net.URL;
import org.springframework.stereotype.Service;

import com.paas.service.AuthenticationService;
import com.paas.service.CreateTxnServiceForMR;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.paas.dao.CreateTxnDAOForMR;
import com.paas.dto.AuthenticationDTO;
import com.paas.model.CreateTransactionRequest;
import com.paas.model.CreateTransactionResponse;
import com.paas.model.ServerResponse;

@Service
public class CreateTxnServiceForMRImpl implements CreateTxnServiceForMR{
	
	@Autowired
	private AuthenticationService authenticationService;
	
	@Autowired
	private CreateTxnDAOForMR createTxnDAOForMR;
	
	private static Logger log = LoggerFactory.getLogger(CreateTxnServiceForMRImpl.class.getName());

	private static String URL_PATH = null;
	private static String UserID = null;
	private static String Password = null;

	@Override
	public ResponseEntity<CreateTransactionResponse> doCreateTxnForMR(CreateTransactionRequest request,Environment props,String agentCode) {
		
		ServerResponse serverResponse = null;
		CreateTransactionResponse createTxnResponse = null;
		AuthenticationDTO authenticationDTO = null;
		ObjectMapper mapper = new ObjectMapper();
		String userID = "";
		String subStatusCode = "";
		String subStatusDesc = "";
		String ssPrefix = "ssPrefixCreate";
		int agentStatus = 0;
		Boolean isVerified = true;
		String requestTime = "";
		String jsonResponse = ""; 
		String PayoutAmount = "";
		Integer payoutAmountInt = 0;
		
		try {
			authenticationDTO = authenticationService.validateAgentCode(agentCode);
			
			if (null == authenticationDTO) {
				subStatusCode = AUTHENTICATE_STATUSCODE;
			} else if(((authenticationDTO.getAgentStatus() & 1073741824 ) == 1073741824 ) || ((authenticationDTO.getKeyStatus() & 1073741824 ) == 1073741824 )){
			    subStatusCode = AUTHENTICATE_DISABLE_SUBSTATUSCODE; 
		    } else if((authenticationDTO.getAgentStatus2() & 4) == 4){
			   
		    	if(request.getSenderProfile() == 2 && request.getReceiverProfile() == 2) {
		    		subStatusCode = validateCreateTxnRequest(request);	
		    	} else {
		    		subStatusCode = validateCreateTxnV2Request(request);
		    	}

				if(null != request.getSendingAgentCode() && request.getSendingAgentCode().length() == 12)
					agentCode = request.getSendingAgentCode();
				else
					agentCode = authenticationDTO.getAgentCode();
				  
				userID = authenticationDTO.getUserID();
				agentStatus  = authenticationDTO.getAgentStatus(); 
			   
			   if (SUCCESS_CODE.equals(subStatusCode)) {
				   
					String jsonRequest = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(request);

					log.info( requestTime + " Request Sending to API to CreateTransactionEx for PartnerTxnRefNo : "+request.getPartnerTxnRefNo() + LINE_SPACE + LINE_SPACE
							+ jsonRequest + LINE_SPACE + LINE_SPACE
							+ "Request Completed to CreateTransaction for OtherRemittance");
					
					createTxnResponse = createTxnDAOForMR.doCreateTxnForMR(request,props,agentCode,userID,agentStatus);
					
					if (null != createTxnResponse) {
						
						if(request.getValidateOnlyFlag() == 1) {
							subStatusCode = SUCCESS_VALIDATE_STATUSCODE;	// Validate Transaction
						} else{
							subStatusCode = SUCCESS_SUBCODE;	// Create Transaction
						}
					}
			   }
		   } else{
				 subStatusCode = AUTHORIZATION_STATUSCODE;
		   }

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
			jsonResponse = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(createTxnResponse);


			log.info( requestTime + " Response Received from API to CreateTransaction for OtherRemittance of this PartnerTxnRefNo : "+ request.getPartnerTxnRefNo() + LINE_SPACE + LINE_SPACE
						+ jsonResponse + LINE_SPACE + LINE_SPACE
						+ "Response Completed to CreateTransaction");

			return new ResponseEntity<CreateTransactionResponse>(createTxnResponse, HttpStatus.OK);
			
		} catch (Exception ex) {
			log.info("Exception--->"+ex.getMessage()+ex.getCause());
			
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
			
			return new ResponseEntity<CreateTransactionResponse>(createTxnResponse,
					HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

}
