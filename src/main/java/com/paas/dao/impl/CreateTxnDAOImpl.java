package com.paas.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;


import com.paas.dao.CreateTxnDAO;
import com.paas.model.CreateTransactionRequest;
import com.paas.model.CreateTransactionResponse;
import static com.paas.constants.PaasConstants.EMPTY_STRING;
import static com.paas.constants.PaasConstants.DEFAULT_INTEGER;
import static com.paas.constants.PaasConstants.DEFAULT_DOUBLE;
import static com.paas.constants.PaasConstants.SERVICEFLAG_TT;
import static com.paas.constants.PaasConstants.SERVICEFLAG_FL;

import static com.paas.utils.PaasDataMapping.getDeliveryOption;

import java.util.Optional;

@Component
public class CreateTxnDAOImpl implements CreateTxnDAO{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final Logger log = LoggerFactory.getLogger(CreateTxnDAOImpl.class);
	
	@Override
	public CreateTransactionResponse doCreateTxn(CreateTransactionRequest requestDTO,Environment props,String agentCode,String userID,int agentStatus) {
		
		CreateTransactionResponse response = null;
		String query = null;
		Object[] parameters = null;
		parameters = new Object[179];
		
		parameters[0] = requestDTO.getValidateOnlyFlag();
		parameters[1] = requestDTO.getOverrideRateFlag();
		parameters[2] = requestDTO.getPartnerTxnRefNo();
		parameters[3] = requestDTO.getRequiresAuthorization();
		parameters[4] = requestDTO.getCrmRefNumber();
		parameters[5] = requestDTO.getCrmLeadRefNumber();
		parameters[6] = requestDTO.getSpecialDealRefNumber();
		parameters[7] = agentCode; //requestDTO.getSendingAgentCode();
		parameters[8] = requestDTO.getServiceProviderCode();
		parameters[9] = requestDTO.getSenderProfile();
		parameters[10] = requestDTO.getReceiverProfile(); 
		parameters[11] = requestDTO.getSenderType(); 
		parameters[12] = requestDTO.getReceiverType(); 
		parameters[13] = requestDTO.getSenderRefNumber(); 
		parameters[14] = requestDTO.getSenderFirstName(); 
		parameters[15] = requestDTO.getSenderMiddleName(); 
		parameters[16] = requestDTO.getSenderLastName(); 
		parameters[17] = requestDTO.getSenderPOBox(); 
		parameters[18] = requestDTO.getSenderAddress1(); 
		parameters[19] = requestDTO.getSenderAddress2(); 
		parameters[20] = requestDTO.getSenderCity(); 
		parameters[21] = requestDTO.getSenderDistrict(); 
		parameters[22] = requestDTO.getSenderState(); 
		parameters[23] = requestDTO.getSenderCountryCode(); 
		parameters[24] = requestDTO.getSenderZipCode(); 
		parameters[25] = requestDTO.getSenderMobile(); 
		parameters[26] = requestDTO.getSenderPhone(); 
		parameters[27] = requestDTO.getSenderFax(); 
		parameters[28] = requestDTO.getSenderEmail(); 
		parameters[29] = requestDTO.getSenderOtherInfo(); 
		parameters[30] = requestDTO.getSenderMessageToBeneficiary(); 
		parameters[31] = requestDTO.getSenderSelfDeclaration(); 
		parameters[32] = requestDTO.getSenderGender(); 
		parameters[33] = requestDTO.getSenderDateOfBirth(); 
		parameters[34] = requestDTO.getSenderNationalityCode(); 
		parameters[35] = requestDTO.getSenderOccupation(); 
		parameters[36] = requestDTO.getSenderPlaceOfBirth(); // oasis
		parameters[37] = requestDTO.getSenderEmployerName(); 
		parameters[38] = requestDTO.getSenderEmployerPhone(); 
		parameters[39] = requestDTO.getSenderID(); 
		parameters[40] = Integer.parseInt(requestDTO.getSenderIDType()); 
		parameters[41] = requestDTO.getSenderIDOtherType(); 
		parameters[42] = requestDTO.getSenderIDIssuedBy(); 
		parameters[43] = requestDTO.getSenderIDIssuedAt(); 
		parameters[44] = requestDTO.getSenderIDIssueDate(); 
		parameters[45] = requestDTO.getSenderIDValidThru(); 
		parameters[46] = requestDTO.getSenderIDIssuanceCountry(); 
		parameters[47] = requestDTO.getSenderIDOtherInfo(); 
		parameters[48] = requestDTO.getSenderIDRemarks(); 
		parameters[49] = requestDTO.getSenderproofOfAddress();  //oasis
		parameters[50] = requestDTO.getSenderID2();
		parameters[51] = Integer.parseInt(requestDTO.getSenderID2Type());
		parameters[52] = requestDTO.getSenderID2IssuedBy();
		parameters[53] = requestDTO.getSenderID2IssuedAt();
		parameters[54] = requestDTO.getSenderID2IssueDate();
		parameters[55] = requestDTO.getSenderID2ValidThru();
		parameters[56] = requestDTO.getSenderID2IssuanceCountry();
		parameters[57] = requestDTO.getSenderID2OtherInfo();
		parameters[58] = requestDTO.getSenderID2Remarks();
		parameters[59] = requestDTO.getTaxRegNo();
		parameters[60] = requestDTO.getTaxRegNoIssuedCountry();
		parameters[61] = requestDTO.getEkycVerifiedSource();
		parameters[62] = requestDTO.getEkycValidatedSource();
		parameters[63] = requestDTO.getEkycValidatedOn();
		parameters[64] = requestDTO.getSenderOtherInfo1() != null ? requestDTO.getSenderOtherInfo1() : EMPTY_STRING; // present in non- reg but not used, future use
		parameters[65] = requestDTO.getSenderOtherInfo2() != null ? requestDTO.getSenderOtherInfo2() : EMPTY_STRING; // present in non- reg but not used, future use
		parameters[66] = requestDTO.getSenderOtherInfo3() != null ? requestDTO.getSenderOtherInfo3() : EMPTY_STRING; // present in non- reg but not used, future use
		parameters[67] = requestDTO.getSenderOtherInfo4() != null ? requestDTO.getSenderOtherInfo4() : EMPTY_STRING; // present in non- reg but not used, future use
		parameters[68] = requestDTO.getSenderOtherInfo5() != null ? requestDTO.getSenderOtherInfo5() : EMPTY_STRING; // present in non- reg but not used, future use
		parameters[69] = Integer.parseInt(!requestDTO.getReceiverRefNumber().isEmpty() ? requestDTO.getReceiverRefNumber():"0");
		parameters[70] = requestDTO.getReceiverFirstName();
		parameters[71] = requestDTO.getReceiverMiddleName();
		parameters[72] = requestDTO.getReceiverLastName();
		parameters[73] = getDeliveryOption(String.valueOf(requestDTO.getDeliveryOption()),props); 
		parameters[74] = requestDTO.getReceiverAddress1();
		parameters[75] = requestDTO.getReceiverAddress2();
		parameters[76] = requestDTO.getReceiverCity();
		parameters[77] = requestDTO.getReceiverCountryCode();
		parameters[78] = requestDTO.getReceiverDistrict();
		parameters[79] = requestDTO.getReceiverState();
		parameters[80] = requestDTO.getReceiverPOBox();
		parameters[81] = requestDTO.getReceiverZipCode();
		parameters[82] = requestDTO.getReceiverPhone();
		parameters[83] = requestDTO.getReceiverMobile();
		parameters[84] = requestDTO.getReceiverFax();
		parameters[85] = requestDTO.getReceiverEmail();
		parameters[86] = requestDTO.getReceiverNationalityCode();
		parameters[87] = requestDTO.getReceiverGender();
		parameters[88] = requestDTO.getReceiverDateOfBirth();
		parameters[89] = requestDTO.getReceiverOccupation();
		parameters[90] = requestDTO.getReceiverSenderRelationship();
		parameters[91] = requestDTO.getReceiverSmsNotify() != DEFAULT_INTEGER ? requestDTO.getReceiverSmsNotify() : DEFAULT_INTEGER; // future use
		parameters[92] = requestDTO.getReceiverID();
		parameters[93] = Integer.parseInt(requestDTO.getReceiverIDType());
		parameters[94] = requestDTO.getReceiverIDOtherType(); //  present in non- reg but not used
		parameters[95] = requestDTO.getReceiverIDIssuedBy(); // present in non- reg but not used
		parameters[96] = requestDTO.getReceiverIDIssuedAt(); // present in non- reg but not used
		parameters[97] = requestDTO.getReceiverIDIssueDate(); // present in non- reg but not used
		parameters[98] = requestDTO.getReceiverIDValidThru(); // present in non- reg but not used
		parameters[99] = requestDTO.getReceiverIDIssuanceCountry(); // present in non- reg but not used
		parameters[100] = requestDTO.getReceiverOtherInfo1() != null ? requestDTO.getReceiverOtherInfo1() : ""; // present in non- reg but not used, future use
		parameters[101] = requestDTO.getReceiverOtherInfo2() != null ? requestDTO.getReceiverOtherInfo2() : ""; // present in non- reg but not used, future use
		parameters[102] = requestDTO.getReceiverOtherInfo3() != null ? requestDTO.getReceiverOtherInfo3() : ""; // present in non- reg but not used, future use
		parameters[103] = requestDTO.getReceiverOtherInfo4() != null ? requestDTO.getReceiverOtherInfo4() : ""; // present in non- reg but not used, future use
		parameters[104] = requestDTO.getReceiverOtherInfo5() != null ? requestDTO.getReceiverOtherInfo5() : ""; // present in non- reg but not used, future use
		parameters[105] = requestDTO.getReceiverBankAccountNo();
		parameters[106] = requestDTO.getReceiverBankIBANNo();
		parameters[107] = requestDTO.getReceiverCardNo(); //oasis
		parameters[108] = requestDTO.getReceiverCardType(); //oasis
		parameters[109]	= requestDTO.getReceiverWalletPatrnerCode(); //oasis
		parameters[110] = requestDTO.getReceiverWalletNumber(); //oasis
		parameters[111] = requestDTO.getReceiverEnglishName();
		parameters[112] = requestDTO.getReceiverChineseNameInEnglish();
		parameters[113]	= requestDTO.getReceiverBankAccountName();
		parameters[114] = requestDTO.getReceiverBankCode();
		parameters[115] = requestDTO.getReceiverBankBranchCode();
		parameters[116]	= requestDTO.getReceiverBranchIdentifier(); // present in non-reg not used
		parameters[117]	= requestDTO.getReceiverBankBranchName();
		parameters[118] = requestDTO.getReceivingAgentCode();
		parameters[119] = requestDTO.getServiceType();
		parameters[120] = requestDTO.getProductType();
		parameters[121] = requestDTO.getSourceOfIncome();
		parameters[122]	= requestDTO.getPurposeOfTxn();
		parameters[123] = requestDTO.getPurposeOfTxnDetails();
		parameters[124] = requestDTO.getCalculationModel();
		parameters[125] = requestDTO.getTransactionMode();
		parameters[126] = requestDTO.getTxnOtherInfo1() != null ? requestDTO.getTxnOtherInfo1() : ""; // present in non- reg but not used, future use
		parameters[127] = requestDTO.getTxnOtherInfo2() != null ? requestDTO.getTxnOtherInfo2() : ""; // present in non- reg but not used, future use
		parameters[128] = requestDTO.getTxnOtherInfo3() != null ? requestDTO.getTxnOtherInfo3() : ""; // present in non- reg but not used, future use
		parameters[129] = requestDTO.getTxnOtherInfo4() != null ? requestDTO.getTxnOtherInfo4() : ""; // present in non- reg but not used, future use passed in procedure side
		parameters[130] = requestDTO.getTxnOtherInfo5() != null ? requestDTO.getTxnOtherInfo5() : ""; // present in non- reg but not used, future use
		parameters[131]	= requestDTO.getPaymentMode();
		parameters[132] = requestDTO.getXchgRatePayin2Payout();
		parameters[133] = requestDTO.getPayinCcyCode();
		parameters[134] = requestDTO.getPayinAmount();
		parameters[135] = requestDTO.getPayoutCcyCode();
		parameters[136] = requestDTO.getPayoutAmount();
		parameters[137] = requestDTO.getTax();
		parameters[138] = requestDTO.getCardCharges();
		parameters[139] = requestDTO.getOtherCharges();
		parameters[140] = DEFAULT_DOUBLE; //requestDTO.getAdditionalCharges(); //registered only passed in ReXPI
		parameters[141] = requestDTO.getCommission();
		parameters[142] = requestDTO.getPartnerCommission();
		parameters[143] = requestDTO.getTotalPayinAmount();
		parameters[144]	= requestDTO.getRateOtherInfo1() != null ? requestDTO.getRateOtherInfo1() : EMPTY_STRING; // future use
		parameters[145] = requestDTO.getRateOtherInfo2() != null ? requestDTO.getRateOtherInfo2() : EMPTY_STRING; // future use
		parameters[146] = requestDTO.getRateOtherInfo3() != null ? requestDTO.getRateOtherInfo3() : EMPTY_STRING; // future use
		parameters[147] = requestDTO.getRateOtherInfo4() != null ? requestDTO.getRateOtherInfo4() : EMPTY_STRING; // future use
		parameters[148] = requestDTO.getRateOtherInfo5() != null ? requestDTO.getRateOtherInfo5() : EMPTY_STRING; // future use
		parameters[149] = requestDTO.getPaymentOtherInfo1() != null ? requestDTO.getPaymentOtherInfo1() : EMPTY_STRING; // future use
		parameters[150]	= requestDTO.getPaymentOtherInfo2() != null ? requestDTO.getPaymentOtherInfo2() : EMPTY_STRING; // future use
		parameters[151] = requestDTO.getPaymentOtherInfo3() != null ? requestDTO.getPaymentOtherInfo3() : EMPTY_STRING; // future use
		parameters[152]	= requestDTO.getPaymentOtherInfo4() != null ? requestDTO.getPaymentOtherInfo4() : EMPTY_STRING; // future use
		parameters[153]	= requestDTO.getPaymentOtherInfo5() != null ? requestDTO.getPaymentOtherInfo5() : EMPTY_STRING; // future use
		parameters[154]	= requestDTO.getPromotionRefNumber() != null ? requestDTO.getPromotionRefNumber() : EMPTY_STRING;
		parameters[155] = requestDTO.getPromotionMessageDescription() != null?requestDTO.getPromotionMessageDescription(): EMPTY_STRING; 
		parameters[156] = requestDTO.getPromotionalData1(); 
		parameters[157] = requestDTO.getPromotionalData2();
		parameters[158] = requestDTO.getPromotionalData3();
		parameters[159] = requestDTO.getPromotionalData4();
		parameters[160] = requestDTO.getPromotionCcyCode();
		parameters[161] = requestDTO.getDiscountField() != null ? requestDTO.getDiscountField() : EMPTY_STRING; // future use
		parameters[162] = requestDTO.getRuleFlag() != DEFAULT_INTEGER ? requestDTO.getRuleFlag() : DEFAULT_INTEGER; // future use
		parameters[163] = DEFAULT_INTEGER; //requestDTO.getControlFlag() != 0 ? requestDTO.getControlFlag() : 0; //registered only passed in ReXPI, future use
		parameters[164] = requestDTO.getExternalFlag() != DEFAULT_INTEGER ? requestDTO.getExternalFlag() : DEFAULT_INTEGER; // future use
		parameters[165] = requestDTO.getReservedParam1() != null ? requestDTO.getReservedParam1() : EMPTY_STRING; // future use
		parameters[166] = requestDTO.getReservedParam2() != null ? requestDTO.getReservedParam2() : EMPTY_STRING; // future use
		parameters[167] = requestDTO.getReservedParam3() != null ? requestDTO.getReservedParam3() : EMPTY_STRING; // future use
		parameters[168] = requestDTO.getReservedParam4() != null ? requestDTO.getReservedParam4() : EMPTY_STRING; // future use
		parameters[169] = requestDTO.getReservedParam5() != null ? requestDTO.getReservedParam5() : EMPTY_STRING; // future use
		parameters[170] = requestDTO.getReservedParam6() != null ? requestDTO.getReservedParam6() : EMPTY_STRING; // future use
		parameters[171] = requestDTO.getReservedParam7() != null ? requestDTO.getReservedParam7() : EMPTY_STRING; // future use
		parameters[172] = requestDTO.getReservedParam8() != null ? requestDTO.getReservedParam8() : EMPTY_STRING; // future use
		parameters[173] = requestDTO.getReservedParam9() != null ? requestDTO.getReservedParam9() : EMPTY_STRING; // future use
		parameters[174] = requestDTO.getReservedParam10() != null ? requestDTO.getReservedParam10() : EMPTY_STRING; // future use
		parameters[175] = agentStatus;//requestDTO.getAgentStatus();
		parameters[176] = userID;//requestDTO.getUserID();
		parameters[177] = EMPTY_STRING; //requestDTO.getApiAgentCode(); //registered only passed in ReXPI
		parameters[178] = DEFAULT_INTEGER; //requestDTO.getAgentStatus2(); //registered only passed in ReXPI

		query = "EXEC xremit.dbo.p_createPaasPaymentTxn(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?"
				+ ",?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?"
				+ ",?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?"
				+ ",?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?"
				+ ",?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"; // ,?,?,?,?,?,?,?,?,?,? 
		
		//CreateTxn response = null;
		RowMapper<CreateTransactionResponse> rowMapper = new BeanPropertyRowMapper<CreateTransactionResponse>(CreateTransactionResponse.class);
	
		System.out.println("rowMapper ::"+ rowMapper.toString() +"procedureCall "+ query +"parameters :: "+parameters.toString());
		response = jdbcTemplate.queryForObject(query, parameters, rowMapper);
		
		System.out.println("response-->"+response.toString());
	
		
		String instrumentType = requestDTO.getProductType().substring(0, 2);
		String serviceFlag = requestDTO.getProductType().substring(2, 4);
		int serviceType1 = DEFAULT_INTEGER;
		
		if(serviceFlag == SERVICEFLAG_TT) {
			serviceType1 = 1;
		}else if(serviceFlag == SERVICEFLAG_FL) {
			serviceType1 = 2;
		}
		
		if(response != null){
    		System.out.println( "Inside of Update sp" );
    		String spName1 = "EXEC xremit.dbo.p_updateReXPITxnStatus(?,?,?,?,?,?)";

			Object[] param = new Object[6];
			param[0] = response.getTxnRefNo();
			param[1] = instrumentType;
			param[2] = agentStatus;
			param[3] = requestDTO.getRequiresAuthorization();
			param[4] = serviceType1;
			param[5] = userID;	
			
			System.out.println("spName1 "+ spName1 +"param :: "+param.toString());
		    
		    log.info("TxnRefNo---->"+response.getTxnRefNo());
		    log.info("instrumentType---->"+instrumentType);
		    log.info("AgentStatus---->"+agentStatus);
		    log.info("RequiresAuthorization---->"+requestDTO.getRequiresAuthorization());
		    log.info("serviceType---->"+serviceType1);
		    log.info("UserID---->"+userID);
		    
		    jdbcTemplate.update(spName1, param);
		    
		}
		System.out.println("Response--->"+response.toString());
		log.info("Response--->"+response.toString());
		
		return response;
		
	}

}
