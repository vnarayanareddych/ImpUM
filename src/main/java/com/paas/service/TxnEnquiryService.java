package com.paas.service;

import org.springframework.http.ResponseEntity;
import com.paas.model.TransactionEnquiryRequest;
import com.paas.model.TransactionEnquiryResponse;

public interface TxnEnquiryService {

	public ResponseEntity<TransactionEnquiryResponse> doTxnEnquiry(TransactionEnquiryRequest transactionEnquiryRequest,String agentCode);
	
}
