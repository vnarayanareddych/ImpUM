package com.paas.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.paas.model.ReleaseTransactionRequest;
import com.paas.model.ReleaseTransactionResponse;

public interface ReleaseTransactionService {

	public ResponseEntity<ReleaseTransactionResponse> doReleaseTxn(@RequestBody ReleaseTransactionRequest releaseTransactionRequest, String agentCode); 
}
