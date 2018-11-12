package com.paas.controller;

import com.paas.model.PaymentCalculatorRequest;
import com.paas.model.PaymentCalculatorResponse;
import com.paas.service.PaymentCalculatorService;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-05T19:34:51.520+05:30")
@Controller
public class PaymentCalculatorApiController implements PaymentCalculatorApi {

    private static final Logger log = LoggerFactory.getLogger(PaymentCalculatorApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    private PaymentCalculatorService paymentCalculatorService;
    
    @org.springframework.beans.factory.annotation.Autowired
    public PaymentCalculatorApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<PaymentCalculatorResponse> doPaymentCalculation(@ApiParam(value = "Bank Branch Search request input parameters" ,required=true )  @Valid @RequestBody PaymentCalculatorRequest paymentCalculatorRequest) 
    throws Exception{
    	String accept = request.getHeader("Content-Type");
    	String agentCode = request.getHeader("AgentCode");
    	log.info("Entering Payment calculator Service");
        if (accept != null && accept.contains("application/json")) {
            	return paymentCalculatorService.doPaymentCalculation(paymentCalculatorRequest,agentCode);
        }
        return new ResponseEntity<PaymentCalculatorResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
