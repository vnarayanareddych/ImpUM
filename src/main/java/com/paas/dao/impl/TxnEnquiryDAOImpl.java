package com.paas.dao.impl;
import static com.paas.constants.PaasConstants.JDBC_TEMPLATE_PR;
import static com.paas.constants.PaasConstants.SP_ENQUIRY_TXN_STATUSLIST_CALL;
import static com.paas.constants.PaasConstants.SP_ENQUIRY_TXN_DATA_CALL;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.paas.dao.TxnEnquiryDAO;
import com.paas.model.TransactionEnquiryRequest;
import com.paas.model.TransactionEnquiryResponse;
import com.paas.model.TransactionStatus;


@Component
public class TxnEnquiryDAOImpl implements TxnEnquiryDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	@Qualifier(JDBC_TEMPLATE_PR)
	private JdbcTemplate sybaseJDBCTemplatePR;
	
	@Override
	public TransactionEnquiryResponse doTxnEnquiry(String InstrumentType, TransactionEnquiryRequest request, Environment props) {
		
		TransactionEnquiryResponse response = null;
		ObjectMapper mapper = null;
		RowMapper<TransactionEnquiryResponse> rowMapper = null;

		String enqDataCall = SP_ENQUIRY_TXN_DATA_CALL ;
		Object[] enqRequest = new Object[6];
		enqRequest[0] = request.getTxnRefNo();
		enqRequest[1] = request.getPartnerTxnRefNo();
		enqRequest[2] = InstrumentType;
		enqRequest[3] = request.getSendReceiveCancelFlag();
		enqRequest[4] = request.getStatusHistoryFlag();
		enqRequest[5] = request.getStatusOnly(); 
		
		rowMapper = new BeanPropertyRowMapper<TransactionEnquiryResponse>(TransactionEnquiryResponse.class);
		mapper = new ObjectMapper();
		response = sybaseJDBCTemplatePR.queryForObject(enqDataCall, enqRequest, rowMapper);
		return response;
	}
	
	@Override
	public TransactionEnquiryResponse doTxnEnquiryStatus(String txnRefNo, Integer statusHistoryFlag, TransactionEnquiryResponse details) {
		
		TransactionStatus enqStatusList = null;
		ObjectMapper mapper = null;
		RowMapper<TransactionStatus> rowMapper = null;
		List<TransactionStatus> transactionStatusList = new ArrayList<TransactionStatus>();

		TransactionEnquiryResponse enquiryResponse = null;

		
		String enqStatusListCall = SP_ENQUIRY_TXN_STATUSLIST_CALL ;

		RowMapper<TransactionStatus> rowMapperList = new BeanPropertyRowMapper<TransactionStatus>(TransactionStatus.class);
		
		List<TransactionStatus> statusInfoList = sybaseJDBCTemplatePR.query(enqStatusListCall, new Object[] { txnRefNo},
	              new RowMapper<TransactionStatus>() {

					@Override
					public TransactionStatus mapRow(ResultSet rs, int rowNum) throws SQLException {
						
						// TODO Auto-generated method stub
						TransactionStatus enquiryStatusResponseDTO = new TransactionStatus();
						enquiryStatusResponseDTO.setRecordGMTDate(rs.getString("recordGMTDate"));
						enquiryStatusResponseDTO.setTxnStatusCode(rs.getString("txnStatusCode"));
						enquiryStatusResponseDTO.setTxnStatusDescription(rs.getString("txnStatusDescription"));
						enquiryStatusResponseDTO.setUserID(rs.getString("userID"));
						return enquiryStatusResponseDTO;
						
					}
	              });
		
				if(statusHistoryFlag == 1 ) {
					int listSize = statusInfoList.size();
					enqStatusList = new TransactionStatus();
					enqStatusList = (TransactionStatus) statusInfoList.get((listSize - 1));
					transactionStatusList.add(enqStatusList);
					details.setTransactionStatusList(transactionStatusList);
				} else {
					details.setTransactionStatusList(statusInfoList);
				}
			
				
            return details;
	}
}
