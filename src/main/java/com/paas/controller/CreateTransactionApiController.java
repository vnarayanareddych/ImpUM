package com.paas.controller;

import com.paas.model.CreateTransactionRequest;
import com.paas.model.CreateTransactionResponse;
import com.paas.model.ServerResponse;
import com.paas.service.CreateTxnService;
import com.paas.service.CreateTxnServiceV2;
import com.paas.service.CreateTxnServiceForMR;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import static com.paas.constants.PaasConstants.AUTHORIZATION_STATUSCODE;
import static com.paas.constants.PaasConstants.LINE_SPACE;
import static com.paas.constants.PaasConstants.RESPONSE_INTERNAL_ERR;
import static com.paas.constants.PaasConstants.SUCCESS_CODE;
import static com.paas.constants.PaasConstants.INSTRUMENTTYPE_CP;
import static com.paas.constants.PaasConstants.INSTRUMENTTYPE_XR;
import static com.paas.constants.PaasConstants.SERVICETYPE_C2BK;
import static com.paas.constants.PaasConstants.SERVICETYPE_C2WT;
import static com.paas.utils.PaasUtils.getServerResponse;
import static com.paas.utils.RequestValidator.setDefaultValuesForCreate;
import static com.paas.utils.RequestValidator.validateCreate;
import static com.paas.utils.RequestValidator.validateCreateTxnRequest;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-11T10:59:35.791+05:30")
@Controller
public class CreateTransactionApiController implements CreateTransactionApi {

    private static final Logger log = LoggerFactory.getLogger(CreateTransactionApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    
    @Autowired
	private Environment props;
    
    @Autowired
	private CreateTxnService createTxnService;
    
    @Autowired
	private CreateTxnServiceV2 createTxnServiceV2;
    @Autowired
	private CreateTxnServiceForMR createTxnServiceForMR;

    @org.springframework.beans.factory.annotation.Autowired
    public CreateTransactionApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<CreateTransactionResponse> doCreateTxn(
    		@ApiParam(value = "Create request input parameters" ,required=true )  @Valid @RequestBody CreateTransactionRequest createTransactionRequest) {
    	
        String accept = request.getHeader("Content-Type");
        String agentCode = request.getHeader("AgentCode");
        ServerResponse serverResponse = null;
        String subStatusCode = "";
		String subStatusDesc = "";
		String ssPrefix = "ssPrefixCreate";
		CreateTransactionResponse createTxnResponse = null;
		String jsonResponse = "";
		String requestTime = "";
		ObjectMapper mapper = new ObjectMapper();
        
        if (accept != null && accept.contains("application/json")) {
            try {
            	log.info("Entering CreateTxnService");
            	createTransactionRequest = setDefaultValuesForCreate(createTransactionRequest,props);
            	subStatusCode = validateCreate(createTransactionRequest);
	            	if (SUCCESS_CODE.equals(subStatusCode)) {
		        		String instrumentType = createTransactionRequest.getProductType().substring(0, 2);
		        		if(createTransactionRequest.getServiceType().equals(SERVICETYPE_C2BK)) {
		        			if(instrumentType.equals(INSTRUMENTTYPE_XR) || instrumentType.equals(INSTRUMENTTYPE_CP)) {
		        				if(createTransactionRequest.getSenderProfile() == 2 && createTransactionRequest.getReceiverProfile() == 2) {
		        					//non - registered
		        					return createTxnService.doCreateTxn(createTransactionRequest,props,agentCode);
		        				}else {
		        					//registered
		        					return createTxnServiceV2.doCreateTxnV2(createTransactionRequest,props,agentCode);
		        				}
		        			}
		        		}
		        		
		        		if(createTransactionRequest.getServiceType().equals(SERVICETYPE_C2WT)) { 
		        			if(createTransactionRequest.getProductType().equals("MPESKEMOB")) {

		        					return createTxnServiceForMR.doCreateTxnForMR(createTransactionRequest,props,agentCode);
		        			}
		        		}
		        		
	            	} else {
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
	    					createTxnResponse.setPartnerTxnRefNo(createTransactionRequest.getPartnerTxnRefNo());
	    				}
	    					
	    				createTxnResponse.setServerResponse(serverResponse);
	    				jsonResponse = mapper.writerWithDefaultPrettyPrinter()
	    						.writeValueAsString(createTxnResponse);


	    				log.info( requestTime + " Response Received from API to CreateTransactionEx for PartnerTxnRefNo : "+ createTransactionRequest.getPartnerTxnRefNo() + LINE_SPACE + LINE_SPACE
	    							+ jsonResponse + LINE_SPACE + LINE_SPACE
	    							+ "Response Completed to CreateTransactionEx");
	    				 return new ResponseEntity<CreateTransactionResponse>(createTxnResponse,HttpStatus.BAD_REQUEST);
	            	}
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<CreateTransactionResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<CreateTransactionResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
