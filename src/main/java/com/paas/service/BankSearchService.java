package com.paas.service;


import org.springframework.http.ResponseEntity;
import com.paas.model.BankSearchRequest;
import com.paas.model.BankSearchResponse;

public interface BankSearchService {

	public ResponseEntity<BankSearchResponse> doBankSearch(BankSearchRequest bankSearchRequest, String agentCode) throws Exception;
}
