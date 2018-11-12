package com.paas.dao;

import com.paas.model.CancelTransactionRequest;
import com.paas.dto.CancelTxnDTO;

public interface CancelTransactionDAO {
	
	CancelTxnDTO doCancellation(CancelTransactionRequest request,String agentCode, String userID, int statusFlag, int agentStatus) throws Exception;

}
