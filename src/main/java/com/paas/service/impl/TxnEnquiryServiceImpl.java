package com.paas.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.paas.service.TxnEnquiryService;
import com.paas.model.ServerResponse;
import com.paas.model.TransactionEnquiryRequest;
import com.paas.model.TransactionEnquiryResponse;
import com.paas.model.TransactionStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;

import static com.paas.constants.PaasConstants.SUCCESS_CODE;
import static com.paas.constants.PaasConstants.SUCCESS_SUBCODE;
import static com.paas.constants.PaasConstants.AGENT_CODE_EMPTY;
import static com.paas.constants.PaasConstants.AGENT_DISABLE_SUBSTATUSCODE;
import static com.paas.constants.PaasConstants.AGENT_SUBSTATUSCODE;
import static com.paas.constants.PaasConstants.AUTHORIZATION_STATUSCODE;
import static com.paas.constants.PaasConstants.EMPTY_STRING;
import static com.paas.constants.PaasConstants.LINE_SPACE;
import static com.paas.constants.PaasConstants.RESPONSE_INTERNAL_ERR;
import static com.paas.utils.PaasUtils.getDBErrorCodeOrMsg;
import static com.paas.utils.PaasUtils.getSQLException;
import static com.paas.utils.PaasUtils.getServerResponse;
import static com.paas.utils.RequestValidator.setDefaultValuesForReservedParams;
import static com.paas.utils.RequestValidator.validateTxnEnquiryRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.paas.dao.TxnEnquiryDAO;
import com.paas.dto.AuthenticationDTO;
import com.paas.service.AuthenticationService;
import com.paas.service.ReXPIServices;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class TxnEnquiryServiceImpl implements TxnEnquiryService{
	
	private static final Logger log = LoggerFactory.getLogger(TxnEnquiryServiceImpl.class);
	
	@Autowired
	private Environment props;
	
	@Autowired
	private TxnEnquiryDAO txnEnquiryDAO;

	@Autowired
	private ReXPIServices reXPIServices;
	
	@Autowired
	private AuthenticationService authenticationService;
	
	@Override
	public ResponseEntity<TransactionEnquiryResponse> doTxnEnquiry(
			TransactionEnquiryRequest transactionEnquiryRequest,String agentCode) {
		
		TransactionEnquiryResponse txnEnqiryResponse = null;
		AuthenticationDTO authenticationDTO = null;
		ServerResponse serverResponse = null;
		String ssPrefix = "ssPrefixEnquiry";
		String subStatusCode = "";
		String subStatusDesc = "";

		ObjectMapper objectMapper = new ObjectMapper();
		txnEnqiryResponse = new TransactionEnquiryResponse();

		String txnRefNo = "";
		String partnerTxnRefNo = "";
		String serviceType = "";
		String productType = "";
		int sendReceiveCancelFlag = 0;
		int statusHistoryFlag = 0;
		int controlFlag = 0;
		int statusOnly = 0;

		try {
			if (!Optional.ofNullable(agentCode).orElse(EMPTY_STRING).isEmpty()) {
				
			authenticationDTO = authenticationService.validateAgentCode(agentCode);

			if (null == authenticationDTO) {
				subStatusCode = AGENT_SUBSTATUSCODE; // Authentication Error
				log.info(" Fatal Error - for  : " + LINE_SPACE + props.getProperty(subStatusCode));
			}  else if (((authenticationDTO.getAgentStatus()
					& 1073741824) == 1073741824)) {
				subStatusCode = AGENT_DISABLE_SUBSTATUSCODE; // Authentication Error
				log.info(" Fatal Error - for  : " + LINE_SPACE + props.getProperty(subStatusCode));
			} else if ((authenticationDTO.getAgentStatus2() & 32) == 32) {
				
				subStatusCode = validateTxnEnquiryRequest(transactionEnquiryRequest);
				
						 if (SUCCESS_CODE.equals(subStatusCode)) {
							 
								txnRefNo = transactionEnquiryRequest.getTxnRefNo();
								partnerTxnRefNo = transactionEnquiryRequest.getPartnerTxnRefNo();
								serviceType = transactionEnquiryRequest.getServiceType();
								productType = transactionEnquiryRequest.getProductType();
								sendReceiveCancelFlag = transactionEnquiryRequest.getSendReceiveCancelFlag();
								statusHistoryFlag = transactionEnquiryRequest.getStatusHistoryFlag();
								controlFlag = transactionEnquiryRequest.getControlFlag();
								statusOnly = transactionEnquiryRequest.getStatusOnly(); 
								
								System.out.println(" **AgentCode**-- "+agentCode);
								
								log.info("Request for TransactionEnquiry 000  for this Txn Ref No " + txnRefNo + " of this Partner Ref No " + partnerTxnRefNo + 
										" [ serviceType -> " + serviceType + " productType -> " + productType + " sendReceiveCancelFlag -> " + sendReceiveCancelFlag + 
										  " statusHistoryFlag -> " + statusHistoryFlag + " controlFlag -> " + controlFlag +  " statusOnly -> " + statusOnly + 
										    " ]");
								
								String jsonRequest = objectMapper.writerWithDefaultPrettyPrinter()
										.writeValueAsString(transactionEnquiryRequest);
			
				 				log.info( " Request Sending to API to TransactionEnquiry for PartnerTxnRefNo : "+ partnerTxnRefNo  + " and TxnRefNo " + txnRefNo  + LINE_SPACE + LINE_SPACE
											+ jsonRequest + LINE_SPACE + LINE_SPACE
											+ "Request Completed to TransactionEnquiry");
				 				
				 				String instrumentType = transactionEnquiryRequest.getProductType().substring(0, 2);
			
				 				txnEnqiryResponse = txnEnquiryDAO.doTxnEnquiry(instrumentType, transactionEnquiryRequest, props); 
			
				 				if (null != txnEnqiryResponse) {
				 					
				 					String serviceProviderCode = txnEnqiryResponse.getServiceProviderCode().substring(5, 7);
				 					
				 					System.out.println(serviceProviderCode);	 
			
				 					txnRefNo = txnEnqiryResponse.getTxnRefNo();
				 					
				 					if(serviceProviderCode.equals("UK")) {
				 						
				 						txnEnqiryResponse = txnEnquiryDAO.doTxnEnquiryStatus(txnRefNo,statusHistoryFlag,txnEnqiryResponse); 
			
				 					}
				 					
				 					transactionEnquiryRequest.setTxnRefNo(txnRefNo);
				 					
				 					if(serviceProviderCode.equals("AE")) {
				 						
				 						txnEnqiryResponse = reXPIServices.doTxnEnquiryReXPI(transactionEnquiryRequest, props , txnEnqiryResponse);
				 					}
				 					
									subStatusCode = SUCCESS_SUBCODE;
									serverResponse = getServerResponse(subStatusCode, subStatusDesc, ssPrefix, props);
									
									txnEnqiryResponse.setServiceProviderCode(null); 
									
									if (null == serverResponse) {
										serverResponse = RESPONSE_INTERNAL_ERR;
									}
									
									txnEnqiryResponse.setServerResponse(serverResponse);
				 				}
						 }
			    } else {
					subStatusCode = AUTHORIZATION_STATUSCODE; // Authorization failure
					log.info(" Fatal Error - for : " + LINE_SPACE + props.getProperty(subStatusCode));
				}
			} else {
				subStatusCode = AGENT_CODE_EMPTY;  // Agent code is not provided in the request header
				log.info(" Fatal Error - for : " + LINE_SPACE + props.getProperty(subStatusCode));
			 }
		} catch (Exception ex)  {
			log.info("Exception in Txn Enquiry - Service. Ex Msg:\t" + ex.getMessage() + "\tEx Cause:\t"
					+ ex.getCause() + "\n" + transactionEnquiryRequest, ex);

			SQLException sqlEx = getSQLException(ex);
			if (null != getSQLException(ex)) {
				subStatusCode = getDBErrorCodeOrMsg(sqlEx, false);
				subStatusDesc = getDBErrorCodeOrMsg(sqlEx, true);
			} else {
				subStatusDesc = ex.getMessage();
				subStatusCode = "88888";
				serverResponse = RESPONSE_INTERNAL_ERR;
			}
			
		}

		 serverResponse = getServerResponse(subStatusCode, subStatusDesc, ssPrefix, props);
		 
		if (null == serverResponse) {
			System.out.println("Inside if(null == serverResponse)");
			serverResponse = RESPONSE_INTERNAL_ERR;
		}

		if (null == txnEnqiryResponse) {
			txnEnqiryResponse = new TransactionEnquiryResponse();
			txnEnqiryResponse.setTransactionStatusList(new ArrayList<TransactionStatus>());
		}
		
		if(subStatusCode.equals("75807")){
			txnEnqiryResponse.setPartnerTxnRefNo(transactionEnquiryRequest.getPartnerTxnRefNo());
		}
		
		if(subStatusCode.equals("75813")){
			txnEnqiryResponse.setTxnRefNo(transactionEnquiryRequest.getTxnRefNo());
		}
		
		System.out.println(" TxnRefNo -->  " + txnEnqiryResponse.getTxnRefNo());
		System.out.println(" PartnerTxnRefNo -->  " + txnEnqiryResponse.getPartnerTxnRefNo());

		txnEnqiryResponse.setServerResponse(serverResponse);

        //if(txnEnqiryResponse.getTxnRefNo() == null && txnEnqiryResponse.getPartnerTxnRefNo()  == null) {
        //	txnEnqiryResponse = setDefaultValuesForReservedParams(txnEnqiryResponse);	
        //}

		return new ResponseEntity<TransactionEnquiryResponse>(txnEnqiryResponse , HttpStatus.OK);		
	}

}
