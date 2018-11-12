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
import com.paas.model.ReleaseTransactionRequest;
import com.paas.model.ReleaseTransactionResponse;
import com.paas.service.ReleaseTransactionService;

import io.swagger.annotations.ApiParam;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-10T20:19:53.951+05:30")

@Controller
public class ReleaseTransactionApiController implements ReleaseTransactionApi {

    private static final Logger log = LoggerFactory.getLogger(ReleaseTransactionApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    
    @Autowired
    private ReleaseTransactionService releaseTransactionService;

    @org.springframework.beans.factory.annotation.Autowired
    public ReleaseTransactionApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ReleaseTransactionResponse> doReleaseTxn(@ApiParam(value = "Details of release requested transactions" ,required=true )  @Valid @RequestBody ReleaseTransactionRequest releaseTransactionRequest) {
        String accept = request.getHeader("Content-Type");
        String agentCode = request.getHeader("AgentCode");
        if (accept != null && accept.contains("application/json")) {
            try {
                return releaseTransactionService.doReleaseTxn(releaseTransactionRequest,agentCode);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ReleaseTransactionResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ReleaseTransactionResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
