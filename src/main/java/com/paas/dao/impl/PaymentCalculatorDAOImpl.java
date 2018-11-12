package com.paas.dao.impl;

import static com.paas.constants.PaasConstants.JDBC_TEMPLATE_TR;
import static com.paas.constants.PaasConstants.SP_PAYMENT_CALC_CALL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.paas.dao.PaymentCalculatorDAO;
import com.paas.dto.PaymentCalculatorDTO;
import com.paas.model.PaymentCalculatorRequest;

@Component
public class PaymentCalculatorDAOImpl implements PaymentCalculatorDAO {

	
	@Autowired
	@Qualifier(JDBC_TEMPLATE_TR)
	private JdbcTemplate jdbcTemplateForTR;

	@Override
	public PaymentCalculatorDTO doPaymentCalculation(String instrumentType,
			PaymentCalculatorRequest request) {
		PaymentCalculatorDTO response = null;
		RowMapper<PaymentCalculatorDTO> rowMapper = null;

		String procedureCall = SP_PAYMENT_CALC_CALL;

		Object[] parameters = new Object[28];
		parameters[0] = request.getXchgRateDisplayFlag();
		parameters[1] = request.getPayinCcyCode();
		parameters[2] = request.getPayinAmount();
		parameters[3] = request.getPayoutCcyCode();
		parameters[4] = request.getPayoutAmount();
		parameters[5] = request.getSendingAgentCode();
		parameters[6] = request.getServiceProviderCode();
		parameters[7] = request.getSenderCountryCode();
		parameters[8] = request.getReceiverCountryCode();
		parameters[9] = request.getReceiverBankBranchCode();
		parameters[10] = request.getIncludeCharges();
		parameters[11] = request.getPaymentMode();
		parameters[12] = request.getSenderType();
		parameters[13] = request.getReceiverType();
		parameters[14] = request.getServiceType();
		parameters[15] = instrumentType;
		parameters[16] = request.getServiceFlag();
		parameters[17] = request.getControlFlag();
		parameters[18] = request.getReservedParam1();
		parameters[19] = request.getReservedParam2();
		parameters[20] = request.getReservedParam3();
		parameters[21] = request.getReservedParam4();
		parameters[22] = request.getReservedParam5();
		parameters[23] = request.getReservedParam6();
		parameters[24] = request.getReservedParam7();
		parameters[25] = request.getReservedParam8();
		parameters[26] = request.getReservedParam9();
		parameters[27] = request.getReservedParam10();

		rowMapper = new BeanPropertyRowMapper<PaymentCalculatorDTO>(PaymentCalculatorDTO.class);
		response = jdbcTemplateForTR.queryForObject(procedureCall, parameters, rowMapper);

		return response;
	}

}
