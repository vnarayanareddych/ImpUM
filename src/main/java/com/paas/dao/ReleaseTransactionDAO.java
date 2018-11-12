package com.paas.dao;

import com.paas.model.ReleaseTransactionRequest;
import com.paas.model.ReleaseTransactionResponse;


public interface ReleaseTransactionDAO {

	public ReleaseTransactionResponse doReleaseTxn(String userID, String defaultAgent,Integer statusFlag, ReleaseTransactionRequest releaseTransactionRequest);
}
