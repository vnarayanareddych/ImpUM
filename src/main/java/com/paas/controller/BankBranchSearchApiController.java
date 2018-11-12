package com.paas.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.paas.model.BankBranchSearchRequest;
import com.paas.model.BankBranchSearchResponse;
import com.paas.service.BankBranchSearchService;

import io.swagger.annotations.ApiParam;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-05T14:50:25.040+05:30")
@Controller
public class BankBranchSearchApiController implements BankBranchSearchApi {

    private static final Logger log = LoggerFactory.getLogger(BankBranchSearchApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    private BankBranchSearchService bankBranchSearchService;
    
    @org.springframework.beans.factory.annotation.Autowired
    public BankBranchSearchApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<BankBranchSearchResponse> doBankBranchSearch(@ApiParam(value = "Bank Branch Search request input parameters" ,required=true )  @Valid @RequestBody BankBranchSearchRequest bankBranchSearchRequest) throws Exception {
    	String accept = request.getHeader("Content-Type");
    	 String agentCode = request.getHeader("AgentCode");
		log.info("Entering Bank Branch Search Service");
        if (accept != null && accept.contains("application/json")) {
                return bankBranchSearchService.doBankBranchSearch(bankBranchSearchRequest,agentCode);
        }
        return new ResponseEntity<BankBranchSearchResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
