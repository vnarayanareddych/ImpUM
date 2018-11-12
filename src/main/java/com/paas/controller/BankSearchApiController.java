package com.paas.controller;

import com.paas.model.BankSearchRequest;
import com.paas.model.BankSearchResponse;
import com.paas.service.BankSearchService;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-05T14:50:25.040+05:30")
@Controller
public class BankSearchApiController implements BankSearchApi {

    private static final Logger log = LoggerFactory.getLogger(BankSearchApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
   	public BankSearchService bankSearchService;
    
    @Autowired
   	public Environment props;
    
    @org.springframework.beans.factory.annotation.Autowired
    public BankSearchApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<BankSearchResponse> doBankSearch(@ApiParam(value = "Bank Search request input parameters" ,required=true )  @Valid @RequestBody BankSearchRequest bankSearchRequest) throws Exception {
        String accept = request.getHeader("Content-Type");
        String agentCode = request.getHeader("AgentCode");
		log.info("Entering Bank Search Service");
        if (accept != null && accept.contains("application/json")) {
                return bankSearchService.doBankSearch(bankSearchRequest,agentCode);
        }
        return new ResponseEntity<BankSearchResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
