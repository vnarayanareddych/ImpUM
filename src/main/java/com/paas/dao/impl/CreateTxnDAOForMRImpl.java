package com.paas.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.paas.dao.CreateTxnDAOForMR;
import com.paas.model.CreateTransactionRequest;
import com.paas.model.CreateTransactionResponse;
import static com.paas.constants.PaasConstants.EMPTY_STRING;
import static com.paas.constants.PaasConstants.DEFAULT_INTEGER;
import static com.paas.constants.PaasConstants.DEFAULT_DOUBLE;
import static com.paas.utils.PaasDataMapping.getDeliveryOption;

@Component
public class CreateTxnDAOForMRImpl implements CreateTxnDAOForMR{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static Logger log = LoggerFactory.getLogger(CreateTxnDAOForMRImpl.class);
	
	@Override
	public CreateTransactionResponse doCreateTxnForMR(CreateTransactionRequest requestDTO,Environment props,String agentCode,String userID,int agentStatus) {
		
		CreateTransactionResponse response = null;
		String createMRTxn = null;
		Object[] MRSendparameters = null;
		MRSendparameters = new Object[179];
		
		MRSendparameters[0] = requestDTO.getValidateOnlyFlag();
		MRSendparameters[1] = requestDTO.getOverrideRateFlag();
		MRSendparameters[2] = requestDTO.getPartnerTxnRefNo();
		MRSendparameters[3] = requestDTO.getRequiresAuthorization();
		MRSendparameters[4] = requestDTO.getCrmRefNumber();
		MRSendparameters[5] = requestDTO.getCrmLeadRefNumber();
		MRSendparameters[6] = requestDTO.getSpecialDealRefNumber();
		MRSendparameters[7] = agentCode; //requestDTO.getSendingAgentCode();
		MRSendparameters[8] = requestDTO.getServiceProviderCode();
		MRSendparameters[9] = requestDTO.getSenderProfile();
		MRSendparameters[10] = requestDTO.getReceiverProfile(); 
		MRSendparameters[11] = requestDTO.getSenderType(); 
		MRSendparameters[12] = requestDTO.getReceiverType(); 
		MRSendparameters[13] = requestDTO.getSenderRefNumber(); 
		MRSendparameters[14] = requestDTO.getSenderFirstName(); 
		MRSendparameters[15] = requestDTO.getSenderMiddleName(); 
		MRSendparameters[16] = requestDTO.getSenderLastName(); 
		MRSendparameters[17] = requestDTO.getSenderPOBox(); 
		MRSendparameters[18] = requestDTO.getSenderAddress1(); 
		MRSendparameters[19] = requestDTO.getSenderAddress2(); 
		MRSendparameters[20] = requestDTO.getSenderCity(); 
		MRSendparameters[21] = requestDTO.getSenderDistrict(); 
		MRSendparameters[22] = requestDTO.getSenderState(); 
		MRSendparameters[23] = requestDTO.getSenderCountryCode(); 
		MRSendparameters[24] = requestDTO.getSenderZipCode(); 
		MRSendparameters[25] = requestDTO.getSenderMobile(); 
		MRSendparameters[26] = requestDTO.getSenderPhone(); 
		MRSendparameters[27] = requestDTO.getSenderFax(); 
		MRSendparameters[28] = requestDTO.getSenderEmail(); 
		MRSendparameters[29] = requestDTO.getSenderOtherInfo(); 
		MRSendparameters[30] = requestDTO.getSenderMessageToBeneficiary(); 
		MRSendparameters[31] = requestDTO.getSenderSelfDeclaration(); 
		MRSendparameters[32] = requestDTO.getSenderGender(); 
		MRSendparameters[33] = requestDTO.getSenderDateOfBirth(); 
		MRSendparameters[34] = requestDTO.getSenderNationalityCode(); 
		MRSendparameters[35] = requestDTO.getSenderOccupation(); 
		MRSendparameters[36] = requestDTO.getSenderPlaceOfBirth(); // oasis
		MRSendparameters[37] = requestDTO.getSenderEmployerName(); 
		MRSendparameters[38] = requestDTO.getSenderEmployerPhone(); 
		MRSendparameters[39] = requestDTO.getSenderID(); 
		MRSendparameters[40] = Integer.parseInt(requestDTO.getSenderIDType()); 
		MRSendparameters[41] = requestDTO.getSenderIDOtherType(); 
		MRSendparameters[42] = requestDTO.getSenderIDIssuedBy(); 
		MRSendparameters[43] = requestDTO.getSenderIDIssuedAt(); 
		MRSendparameters[44] = requestDTO.getSenderIDIssueDate(); 
		MRSendparameters[45] = requestDTO.getSenderIDValidThru(); 
		MRSendparameters[46] = requestDTO.getSenderIDIssuanceCountry(); 
		MRSendparameters[47] = requestDTO.getSenderIDOtherInfo(); 
		MRSendparameters[48] = requestDTO.getSenderIDRemarks(); 
		MRSendparameters[49] = requestDTO.getSenderproofOfAddress();  //oasis
		MRSendparameters[50] = requestDTO.getSenderID2();
		MRSendparameters[51] = Integer.parseInt(requestDTO.getSenderID2Type());
		MRSendparameters[52] = requestDTO.getSenderID2IssuedBy();
		MRSendparameters[53] = requestDTO.getSenderID2IssuedAt();
		MRSendparameters[54] = requestDTO.getSenderID2IssueDate();
		MRSendparameters[55] = requestDTO.getSenderID2ValidThru();
		MRSendparameters[56] = requestDTO.getSenderID2IssuanceCountry();
		MRSendparameters[57] = requestDTO.getSenderID2OtherInfo();
		MRSendparameters[58] = requestDTO.getSenderID2Remarks();
		MRSendparameters[59] = requestDTO.getTaxRegNo();
		MRSendparameters[60] = requestDTO.getTaxRegNoIssuedCountry();
		MRSendparameters[61] = requestDTO.getEkycVerifiedSource();
		MRSendparameters[62] = requestDTO.getEkycValidatedSource();
		MRSendparameters[63] = requestDTO.getEkycValidatedOn();
		MRSendparameters[64] = requestDTO.getSenderOtherInfo1() != null ? requestDTO.getSenderOtherInfo1() : EMPTY_STRING; // present in non- reg but not used, future use
		MRSendparameters[65] = requestDTO.getSenderOtherInfo2() != null ? requestDTO.getSenderOtherInfo2() : EMPTY_STRING; // present in non- reg but not used, future use
		MRSendparameters[66] = requestDTO.getSenderOtherInfo3() != null ? requestDTO.getSenderOtherInfo3() : EMPTY_STRING; // present in non- reg but not used, future use
		MRSendparameters[67] = requestDTO.getSenderOtherInfo4() != null ? requestDTO.getSenderOtherInfo4() : EMPTY_STRING; // present in non- reg but not used, future use
		MRSendparameters[68] = requestDTO.getSenderOtherInfo5() != null ? requestDTO.getSenderOtherInfo5() : EMPTY_STRING; // present in non- reg but not used, future use
		MRSendparameters[69] = Integer.parseInt(!requestDTO.getReceiverRefNumber().isEmpty() ? requestDTO.getReceiverRefNumber():"0");
		MRSendparameters[70] = requestDTO.getReceiverFirstName();
		MRSendparameters[71] = requestDTO.getReceiverMiddleName();
		MRSendparameters[72] = requestDTO.getReceiverLastName();
		MRSendparameters[73] = getDeliveryOption(String.valueOf(requestDTO.getDeliveryOption()),props); 
		MRSendparameters[74] = requestDTO.getReceiverAddress1();
		MRSendparameters[75] = requestDTO.getReceiverAddress2();
		MRSendparameters[76] = requestDTO.getReceiverCity();
		MRSendparameters[77] = requestDTO.getReceiverCountryCode();
		MRSendparameters[78] = requestDTO.getReceiverDistrict();
		MRSendparameters[79] = requestDTO.getReceiverState();
		MRSendparameters[80] = requestDTO.getReceiverPOBox();
		MRSendparameters[81] = requestDTO.getReceiverZipCode();
		MRSendparameters[82] = requestDTO.getReceiverPhone();
		MRSendparameters[83] = requestDTO.getReceiverMobile();
		MRSendparameters[84] = requestDTO.getReceiverFax();
		MRSendparameters[85] = requestDTO.getReceiverEmail();
		MRSendparameters[86] = requestDTO.getReceiverNationalityCode();
		MRSendparameters[87] = requestDTO.getReceiverGender();
		MRSendparameters[88] = requestDTO.getReceiverDateOfBirth();
		MRSendparameters[89] = requestDTO.getReceiverOccupation();
		MRSendparameters[90] = requestDTO.getReceiverSenderRelationship();
		MRSendparameters[91] = requestDTO.getReceiverSmsNotify() != DEFAULT_INTEGER ? requestDTO.getReceiverSmsNotify() : DEFAULT_INTEGER; // future use
		MRSendparameters[92] = requestDTO.getReceiverID();
		MRSendparameters[93] = Integer.parseInt(requestDTO.getReceiverIDType());
		MRSendparameters[94] = requestDTO.getReceiverIDOtherType(); //  present in non- reg but not used
		MRSendparameters[95] = requestDTO.getReceiverIDIssuedBy(); // present in non- reg but not used
		MRSendparameters[96] = requestDTO.getReceiverIDIssuedAt(); // present in non- reg but not used
		MRSendparameters[97] = requestDTO.getReceiverIDIssueDate(); // present in non- reg but not used
		MRSendparameters[98] = requestDTO.getReceiverIDValidThru(); // present in non- reg but not used
		MRSendparameters[99] = requestDTO.getReceiverIDIssuanceCountry(); // present in non- reg but not used
		MRSendparameters[100] = requestDTO.getReceiverOtherInfo1() != null ? requestDTO.getReceiverOtherInfo1() : ""; // present in non- reg but not used, future use
		MRSendparameters[101] = requestDTO.getReceiverOtherInfo2() != null ? requestDTO.getReceiverOtherInfo2() : ""; // present in non- reg but not used, future use
		MRSendparameters[102] = requestDTO.getReceiverOtherInfo3() != null ? requestDTO.getReceiverOtherInfo3() : ""; // present in non- reg but not used, future use
		MRSendparameters[103] = requestDTO.getReceiverOtherInfo4() != null ? requestDTO.getReceiverOtherInfo4() : ""; // present in non- reg but not used, future use
		MRSendparameters[104] = requestDTO.getReceiverOtherInfo5() != null ? requestDTO.getReceiverOtherInfo5() : ""; // present in non- reg but not used, future use
		MRSendparameters[105] = requestDTO.getReceiverBankAccountNo();
		MRSendparameters[106] = requestDTO.getReceiverBankIBANNo();
		MRSendparameters[107] = requestDTO.getReceiverCardNo(); //oasis
		MRSendparameters[108] = requestDTO.getReceiverCardType(); //oasis
		MRSendparameters[109]	= requestDTO.getReceiverWalletPatrnerCode(); //oasis
		MRSendparameters[110] = requestDTO.getReceiverWalletNumber(); //oasis
		MRSendparameters[111] = requestDTO.getReceiverEnglishName();
		MRSendparameters[112] = requestDTO.getReceiverChineseNameInEnglish();
		MRSendparameters[113]	= requestDTO.getReceiverBankAccountName();
		MRSendparameters[114] = requestDTO.getReceiverBankCode();
		MRSendparameters[115] = requestDTO.getReceiverBankBranchCode();
		MRSendparameters[116]	= requestDTO.getReceiverBranchIdentifier(); // present in non-reg not used
		MRSendparameters[117]	= requestDTO.getReceiverBankBranchName();
		MRSendparameters[118] = requestDTO.getReceivingAgentCode();
		MRSendparameters[119] = requestDTO.getServiceType();
		MRSendparameters[120] = requestDTO.getProductType();
		MRSendparameters[121] = requestDTO.getSourceOfIncome();
		MRSendparameters[122]	= requestDTO.getPurposeOfTxn();
		MRSendparameters[123] = requestDTO.getPurposeOfTxnDetails();
		MRSendparameters[124] = requestDTO.getCalculationModel();
		MRSendparameters[125] = requestDTO.getTransactionMode();
		MRSendparameters[126] = requestDTO.getTxnOtherInfo1() != null ? requestDTO.getTxnOtherInfo1() : ""; // present in non- reg but not used, future use
		MRSendparameters[127] = requestDTO.getTxnOtherInfo2() != null ? requestDTO.getTxnOtherInfo2() : ""; // present in non- reg but not used, future use
		MRSendparameters[128] = requestDTO.getTxnOtherInfo3() != null ? requestDTO.getTxnOtherInfo3() : ""; // present in non- reg but not used, future use
		MRSendparameters[129] = requestDTO.getTxnOtherInfo4() != null ? requestDTO.getTxnOtherInfo4() : ""; // present in non- reg but not used, future use passed in procedure side
		MRSendparameters[130] = requestDTO.getTxnOtherInfo5() != null ? requestDTO.getTxnOtherInfo5() : ""; // present in non- reg but not used, future use
		MRSendparameters[131]	= requestDTO.getPaymentMode();
		MRSendparameters[132] = requestDTO.getXchgRatePayin2Payout();
		MRSendparameters[133] = requestDTO.getPayinCcyCode();
		MRSendparameters[134] = requestDTO.getPayinAmount();
		MRSendparameters[135] = requestDTO.getPayoutCcyCode();
		MRSendparameters[136] = requestDTO.getPayoutAmount();
		MRSendparameters[137] = requestDTO.getTax();
		MRSendparameters[138] = requestDTO.getCardCharges();
		MRSendparameters[139] = requestDTO.getOtherCharges();
		MRSendparameters[140] = DEFAULT_DOUBLE; //requestDTO.getAdditionalCharges(); //registered only passed in ReXPI
		MRSendparameters[141] = requestDTO.getCommission();
		MRSendparameters[142] = requestDTO.getPartnerCommission();
		MRSendparameters[143] = requestDTO.getTotalPayinAmount();
		MRSendparameters[144]	= requestDTO.getRateOtherInfo1() != null ? requestDTO.getRateOtherInfo1() : EMPTY_STRING; // future use
		MRSendparameters[145] = requestDTO.getRateOtherInfo2() != null ? requestDTO.getRateOtherInfo2() : EMPTY_STRING; // future use
		MRSendparameters[146] = requestDTO.getRateOtherInfo3() != null ? requestDTO.getRateOtherInfo3() : EMPTY_STRING; // future use
		MRSendparameters[147] = requestDTO.getRateOtherInfo4() != null ? requestDTO.getRateOtherInfo4() : EMPTY_STRING; // future use
		MRSendparameters[148] = requestDTO.getRateOtherInfo5() != null ? requestDTO.getRateOtherInfo5() : EMPTY_STRING; // future use
		MRSendparameters[149] = requestDTO.getPaymentOtherInfo1() != null ? requestDTO.getPaymentOtherInfo1() : EMPTY_STRING; // future use
		MRSendparameters[150]	= requestDTO.getPaymentOtherInfo2() != null ? requestDTO.getPaymentOtherInfo2() : EMPTY_STRING; // future use
		MRSendparameters[151] = requestDTO.getPaymentOtherInfo3() != null ? requestDTO.getPaymentOtherInfo3() : EMPTY_STRING; // future use
		MRSendparameters[152]	= requestDTO.getPaymentOtherInfo4() != null ? requestDTO.getPaymentOtherInfo4() : EMPTY_STRING; // future use
		MRSendparameters[153]	= requestDTO.getPaymentOtherInfo5() != null ? requestDTO.getPaymentOtherInfo5() : EMPTY_STRING; // future use
		MRSendparameters[154]	= requestDTO.getPromotionRefNumber() != null ? requestDTO.getPromotionRefNumber() : EMPTY_STRING;
		MRSendparameters[155] = requestDTO.getPromotionMessageDescription() != null?requestDTO.getPromotionMessageDescription(): EMPTY_STRING; 
		MRSendparameters[156] = requestDTO.getPromotionalData1(); 
		MRSendparameters[157] = requestDTO.getPromotionalData2();
		MRSendparameters[158] = requestDTO.getPromotionalData3();
		MRSendparameters[159] = requestDTO.getPromotionalData4();
		MRSendparameters[160] = requestDTO.getPromotionCcyCode();
		MRSendparameters[161] = requestDTO.getDiscountField() != null ? requestDTO.getDiscountField() : EMPTY_STRING; // future use
		MRSendparameters[162] = requestDTO.getRuleFlag() != DEFAULT_INTEGER ? requestDTO.getRuleFlag() : DEFAULT_INTEGER; // future use
		MRSendparameters[163] = DEFAULT_INTEGER; //requestDTO.getControlFlag() != 0 ? requestDTO.getControlFlag() : 0; //registered only passed in ReXPI, future use
		MRSendparameters[164] = requestDTO.getExternalFlag() != DEFAULT_INTEGER ? requestDTO.getExternalFlag() : DEFAULT_INTEGER; // future use
		MRSendparameters[165] = requestDTO.getReservedParam1() != null ? requestDTO.getReservedParam1() : EMPTY_STRING; // future use
		MRSendparameters[166] = requestDTO.getReservedParam2() != null ? requestDTO.getReservedParam2() : EMPTY_STRING; // future use
		MRSendparameters[167] = requestDTO.getReservedParam3() != null ? requestDTO.getReservedParam3() : EMPTY_STRING; // future use
		MRSendparameters[168] = requestDTO.getReservedParam4() != null ? requestDTO.getReservedParam4() : EMPTY_STRING; // future use
		MRSendparameters[169] = requestDTO.getReservedParam5() != null ? requestDTO.getReservedParam5() : EMPTY_STRING; // future use
		MRSendparameters[170] = requestDTO.getReservedParam6() != null ? requestDTO.getReservedParam6() : EMPTY_STRING; // future use
		MRSendparameters[171] = requestDTO.getReservedParam7() != null ? requestDTO.getReservedParam7() : EMPTY_STRING; // future use
		MRSendparameters[172] = requestDTO.getReservedParam8() != null ? requestDTO.getReservedParam8() : EMPTY_STRING; // future use
		MRSendparameters[173] = requestDTO.getReservedParam9() != null ? requestDTO.getReservedParam9() : EMPTY_STRING; // future use
		MRSendparameters[174] = requestDTO.getReservedParam10() != null ? requestDTO.getReservedParam10() : EMPTY_STRING; // future use
		MRSendparameters[175] = agentStatus;//requestDTO.getAgentStatus();
		MRSendparameters[176] = userID;//requestDTO.getUserID();
		MRSendparameters[177] = EMPTY_STRING; //requestDTO.getApiAgentCode(); //registered only passed in ReXPI
		MRSendparameters[178] = DEFAULT_INTEGER; //requestDTO.getAgentStatus2(); //registered only passed in ReXPI
		
		createMRTxn = "EXEC xremit.dbo.p_createPaasPaymentTxn(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?"
				+ ",?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?"
				+ ",?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?"
				+ ",?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?"
				+ ",?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		RowMapper<CreateTransactionResponse> rowMapper = new BeanPropertyRowMapper<CreateTransactionResponse>(CreateTransactionResponse.class);
		
		System.out.println("CreateTxnDAOForMRImpl rowMapper ::"+ rowMapper.toString() +"procedureCall "+ createMRTxn +"parameters :: "+MRSendparameters.toString());
		response = jdbcTemplate.queryForObject(createMRTxn, MRSendparameters, rowMapper);
		
		System.out.println("CreateTxnDAOForMRImpl response-->"+response.toString());
		
		return response; 
	}


}
