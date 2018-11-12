package com.paas.service;

import org.springframework.http.ResponseEntity;

import com.paas.model.CancelTransactionRequest;
import com.paas.model.CancelTransactionResponse;

public interface CancelTransactionService {
	
	public ResponseEntity<CancelTransactionResponse> doCancelTxn(CancelTransactionRequest cancelTransactionRequest ,String agentCode);
}
