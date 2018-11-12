package com.paas.dao;

import org.springframework.core.env.Environment;

import com.paas.model.TransactionEnquiryRequest;
import com.paas.model.TransactionEnquiryResponse;

public interface TxnEnquiryDAO {

	public TransactionEnquiryResponse doTxnEnquiry( String InstrumentType, TransactionEnquiryRequest request, Environment props);
	
	public TransactionEnquiryResponse doTxnEnquiryStatus( String txnRefNo, Integer statusHistoryFlag ,TransactionEnquiryResponse details);
}