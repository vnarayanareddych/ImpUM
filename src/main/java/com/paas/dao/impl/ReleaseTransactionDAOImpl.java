package com.paas.dao.impl;

import static com.paas.constants.PaasConstants.JDBC_TEMPLATE_TR;
import static com.paas.constants.PaasConstants.RESPONSE_SUCCESS;
import static com.paas.constants.PaasConstants.SP_RELEASE_TXN_CALL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.paas.dao.ReleaseTransactionDAO;
import com.paas.model.ReleaseTransactionRequest;
import com.paas.model.ReleaseTransactionResponse;
import com.paas.model.ServerResponse;

@Component
public class ReleaseTransactionDAOImpl implements ReleaseTransactionDAO{

	@Autowired
	@Qualifier(JDBC_TEMPLATE_TR)
	private JdbcTemplate jdbcTemplateForTR;
	
	@Override
	public ReleaseTransactionResponse doReleaseTxn(String userID, String defaultAgent,Integer statusFlag, ReleaseTransactionRequest releaseTransactionRequest) {
		
		ReleaseTransactionResponse response = null;
		ServerResponse serverResponse = null;
		RowMapper<ServerResponse> rowMapper = null;
		int row = 0;
		String procedureCall = SP_RELEASE_TXN_CALL;

		/*prepare parameters for SP*/ 
		Object[] parameters = null;
		parameters = new Object[19];
		parameters[0] = userID;
		parameters[1] = defaultAgent;
		parameters[2] = releaseTransactionRequest.getTxnRefNo();
		parameters[3] = releaseTransactionRequest.getServiceType();
		parameters[4] = releaseTransactionRequest.getProductType();
		parameters[5] = releaseTransactionRequest.getReleaseFlag();
		parameters[6] = releaseTransactionRequest.getRevertCancelWithLock();
		parameters[7] = releaseTransactionRequest.getControlFlag();
		parameters[8] = releaseTransactionRequest.getReservedParam1();
		parameters[9] = releaseTransactionRequest.getReservedParam2();
		parameters[10] = releaseTransactionRequest.getReservedParam3();
		parameters[11] = releaseTransactionRequest.getReservedParam4();
		parameters[12] = releaseTransactionRequest.getReservedParam5();
		parameters[13] = releaseTransactionRequest.getReservedParam6();
		parameters[14] = releaseTransactionRequest.getReservedParam7();
		parameters[15] = releaseTransactionRequest.getReservedParam8();
		parameters[16] = releaseTransactionRequest.getReservedParam9();
		parameters[17] = releaseTransactionRequest.getReservedParam10();
		parameters[18] = statusFlag;
		
		rowMapper = new BeanPropertyRowMapper<ServerResponse>(ServerResponse.class);
		serverResponse = jdbcTemplateForTR.queryForObject(procedureCall, parameters, rowMapper);
		
		if(null != serverResponse) {
			response = new ReleaseTransactionResponse();
			response.setServerResponse(serverResponse);
		}
		
		return response;
		
	}

	
}
