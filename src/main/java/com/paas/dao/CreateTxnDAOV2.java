package com.paas.dao;

import org.springframework.core.env.Environment;

import com.paas.model.CreateTransactionRequest;
import com.paas.model.CreateTransactionResponse;

public interface CreateTxnDAOV2 {
	public CreateTransactionResponse doCreateTxnV2(CreateTransactionRequest requestParams,Environment props, String agentCode, String userID, int agentStatus,int agentStatus2, String apiAgentCode);
}
