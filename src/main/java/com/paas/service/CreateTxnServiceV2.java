package com.paas.service;

import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;

import com.paas.model.CreateTransactionRequest;
import com.paas.model.CreateTransactionResponse;

public interface CreateTxnServiceV2 {
	public ResponseEntity<CreateTransactionResponse> doCreateTxnV2(CreateTransactionRequest requestParams,Environment props,String agentCode);
}
