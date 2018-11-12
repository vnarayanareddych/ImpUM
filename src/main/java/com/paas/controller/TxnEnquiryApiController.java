package com.paas.controller;

import com.paas.model.TransactionEnquiryRequest;
import com.paas.model.TransactionEnquiryResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import com.paas.service.TxnEnquiryService;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-10T18:11:07.886+05:30")

@Controller
public class TxnEnquiryApiController implements TxnEnquiryApi {

    private static final Logger log = LoggerFactory.getLogger(TxnEnquiryApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    
    @Autowired
    private TxnEnquiryService txnEnquiryService;

    @org.springframework.beans.factory.annotation.Autowired
    public TxnEnquiryApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<TransactionEnquiryResponse> doTxnEnquiry(@ApiParam(value = "Enquiry Search request input parameters" ,required=true )  @Valid @RequestBody TransactionEnquiryRequest transactionEnquiryRequest) {
    	String accept = request.getHeader("Content-Type");
    	String agentCode = request.getHeader("AgentCode");
        
        if (accept != null && accept.contains("application/json")) {
            try {
            	return txnEnquiryService.doTxnEnquiry(transactionEnquiryRequest,agentCode);
            } catch (Exception e) {
                return new ResponseEntity<TransactionEnquiryResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<TransactionEnquiryResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
