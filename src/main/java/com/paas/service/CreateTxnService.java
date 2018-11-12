package com.paas.service;


import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;

import com.paas.model.CreateTransactionRequest;
import com.paas.model.CreateTransactionResponse;

public interface CreateTxnService {

	public ResponseEntity<CreateTransactionResponse> doCreateTxn(CreateTransactionRequest requestParams,Environment props,String agentCode);
	
	
	
}
