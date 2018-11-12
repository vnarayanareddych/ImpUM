package com.paas.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.paas.dao.CancelTransactionDAO;
import com.paas.model.CancelTransactionRequest;
import com.paas.dto.CancelTxnDTO;
import static com.paas.constants.PaasConstants.JDBC_TEMPLATE_TR;
import static com.paas.constants.PaasConstants.JDBC_TEMPLATE_PR;
import static com.paas.constants.PaasConstants.SP_CANCEL_TXN_CALL;

@Component
public class CancelTransactionDAOImpl implements CancelTransactionDAO {
	
	private static final Logger log = LoggerFactory.getLogger(CancelTransactionDAOImpl.class);

	@Autowired
	@Qualifier(JDBC_TEMPLATE_TR)
	private JdbcTemplate sybaseJDBCTemplateTR;
	
	@Autowired
	@Qualifier(JDBC_TEMPLATE_PR)
	private JdbcTemplate sybaseJDBCTemplatePR;

	@Override
	public CancelTxnDTO doCancellation(CancelTransactionRequest request, String agentCode, String userID,
			int statusFlag , int agentStatus) {

		CancelTxnDTO response = null;
		Object[] parameters = null;
		
		log.info("agentCode : " + agentCode + "userID : " + userID + "statusFlag " + statusFlag);

		parameters = new Object[23];
		parameters[0] = request.getTxnRefNo();
		parameters[1] = request.getPartnerTxnRefNo();
		parameters[2] = request.getRequiresAuthorization();
		parameters[3] = request.getServiceType();
		parameters[4] = request.getProductType();
		parameters[5] = request.getCancelReasonCode();
		parameters[6] = request.getCancelReasonDescription();
		parameters[7] = request.getCancelFlag();
		parameters[8] = request.getControlFlag();
		parameters[9] = request.getReservedParam1();
		parameters[10] = request.getReservedParam2();
		parameters[11] = request.getReservedParam3();
		parameters[12] = request.getReservedParam4();
		parameters[13] = request.getReservedParam5();
		parameters[14] = request.getReservedParam6();
		parameters[15] = request.getReservedParam7();
		parameters[16] = request.getReservedParam8();
		parameters[17] = request.getReservedParam9();
		parameters[18] = request.getReservedParam10();
		parameters[19] = agentCode;
		parameters[20] = userID;
		parameters[21] = statusFlag;
		parameters[22] = agentStatus;

		RowMapper<CancelTxnDTO> rowMapper = new BeanPropertyRowMapper<CancelTxnDTO>(
				CancelTxnDTO.class);

		if(statusFlag == 0 ||(statusFlag == 2)) {
			response = sybaseJDBCTemplateTR.queryForObject(SP_CANCEL_TXN_CALL, parameters, rowMapper);
		
		}else if(statusFlag == 1 ||(statusFlag == 3)) {
			response = sybaseJDBCTemplatePR.queryForObject(SP_CANCEL_TXN_CALL, parameters, rowMapper);
		
		}
		System.out.println("response ::"+ response);
		return response;
	}

}
