package com.paas.dao;

import org.springframework.core.env.Environment;

import com.paas.model.CreateTransactionRequest;
import com.paas.model.CreateTransactionResponse;

public interface CreateTxnDAOForMR {
	public CreateTransactionResponse doCreateTxnForMR(CreateTransactionRequest requestParams,Environment props,String agentCode,String userID,int agentStatus);
}