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
import org.springframework.web.bind.annotation.RequestMapping;

import com.paas.model.CancelTransactionRequest;
import com.paas.model.CancelTransactionResponse;
import com.paas.service.CancelTransactionService;

import io.swagger.annotations.ApiParam;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-10T17:06:02.753+05:30")

@Controller
public class CancelApiController implements CancelApi {

	private static final Logger log = LoggerFactory.getLogger(CancelApiController.class);

	private final HttpServletRequest request;

	@Autowired
	private CancelTransactionService cancelTransactionService;
	

	@org.springframework.beans.factory.annotation.Autowired
	public CancelApiController(HttpServletRequest request) {
		this.request = request;
	}

	public ResponseEntity<CancelTransactionResponse> doCancelTxn(
			@ApiParam(value = "Bank Search request input parameters", required = true) @Valid @RequestBody CancelTransactionRequest cancelTransactionRequest) {
		String accept = request.getHeader("Content-Type");
		String agentCode = request.getHeader("AgentCode");

		if (accept != null && accept.contains("application/json")) {
			try {
				return cancelTransactionService.doCancelTxn(cancelTransactionRequest,agentCode);
			} catch (Exception ex) {
				log.error("Couldn't serialize response for content type application/json", ex);
				return new ResponseEntity<CancelTransactionResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		return new ResponseEntity<CancelTransactionResponse>(HttpStatus.NOT_IMPLEMENTED);
	}

}
