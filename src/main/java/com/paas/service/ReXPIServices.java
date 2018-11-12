package com.paas.service;

import org.springframework.core.env.Environment;

import com.paas.model.ReleaseTransactionRequest;
import com.paas.model.ServerResponse;
import com.paas.model.TransactionEnquiryRequest;
import com.paas.model.TransactionEnquiryResponse;

public interface ReXPIServices {

	public ServerResponse doReleaseAETxn(ReleaseTransactionRequest releaseTransactionRequest, String agentCode, String serviceProviderCode, Environment props);
	
	public TransactionEnquiryResponse doTxnEnquiryReXPI(TransactionEnquiryRequest txnEnquiryRequest,Environment props , TransactionEnquiryResponse details);
}
