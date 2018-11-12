package com.paas.service;

import org.springframework.http.ResponseEntity;
import com.paas.model.BankBranchSearchRequest;
import com.paas.model.BankBranchSearchResponse;

public interface BankBranchSearchService {

	public ResponseEntity<BankBranchSearchResponse> doBankBranchSearch(BankBranchSearchRequest bankBranchSearchRequest, String agentCode) throws Exception;
}
