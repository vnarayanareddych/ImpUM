package com.paas.utils;

import static com.paas.constants.PaasConstants.CPFL;
import static com.paas.constants.PaasConstants.SUCCESS_CODE;
import static com.paas.constants.PaasConstants.EMPTY_STRING;
import static com.paas.constants.PaasConstants.DEFAULT_XCHG_RATE_DISPLAY_FLAG;
import static com.paas.constants.PaasConstants.DEFAULT_INCLUDE_CHARGES;
import static com.paas.constants.PaasConstants.DEFAULT_PAYMENT_MODE;
import static com.paas.constants.PaasConstants.DEFAULT_SENDER_TYPE;
import static com.paas.constants.PaasConstants.DEFAULT_RECEIVER_TYPE;
import static com.paas.constants.PaasConstants.DEFAULT_SERVICE_TYPE;
import static com.paas.constants.PaasConstants.DEFAULT_PRODUCT_TYPE;
import static com.paas.constants.PaasConstants.DEFAULT_SERVICE_FLAG;		
import static com.paas.constants.PaasConstants.DEFAULT_CONTROL_FLAG;
import static com.paas.constants.PaasConstants.DEFAULT_PAYIN_AMOUNT;
import static com.paas.constants.PaasConstants.DEFAULT_PAYOUT_AMOUNT;
import static com.paas.constants.PaasConstants.DEFAULT_INTEGER;
import static com.paas.constants.PaasConstants.DEFAULT_DOUBLE;
import static com.paas.constants.PaasConstants.DEFAULT_CONTROL_FLAG;
import static com.paas.constants.PaasConstants.DEFAULT_INCLUDE_CHARGES;
import static com.paas.constants.PaasConstants.DEFAULT_INTEGER;
import static com.paas.constants.PaasConstants.DEFAULT_PAYIN_AMOUNT;
import static com.paas.constants.PaasConstants.DEFAULT_PAYMENT_MODE;
import static com.paas.constants.PaasConstants.DEFAULT_PAYOUT_AMOUNT;
import static com.paas.constants.PaasConstants.DEFAULT_PRODUCT_TYPE;
import static com.paas.constants.PaasConstants.DEFAULT_RECEIVER_TYPE;
import static com.paas.constants.PaasConstants.DEFAULT_SENDER_TYPE;
import static com.paas.constants.PaasConstants.DEFAULT_SERVICE_FLAG;
import static com.paas.constants.PaasConstants.DEFAULT_SERVICE_TYPE;
import static com.paas.constants.PaasConstants.DEFAULT_XCHG_RATE_DISPLAY_FLAG;
import static com.paas.constants.PaasConstants.EMPTY_SPACES;
import static com.paas.constants.PaasConstants.EMPTY_STRING;
import static com.paas.constants.PaasConstants.SUCCESS_CODE;
import static com.paas.constants.PaasConstants.VALID_RELEASE_FLAGS;
import static com.paas.constants.PaasConstants.VALID_REVERT_CANCEL_FLAGS;
import static com.paas.constants.PaasConstants.V0001;
import static com.paas.constants.PaasConstants.V0003;
import static com.paas.constants.PaasConstants.V0005;
import static com.paas.constants.PaasConstants.V0006;
import static com.paas.constants.PaasConstants.V0012;
import static com.paas.constants.PaasConstants.V0013;
import static com.paas.constants.PaasConstants.V0014;
import static com.paas.constants.PaasConstants.V0016;
import static com.paas.constants.PaasConstants.V0017;
import static com.paas.constants.PaasConstants.V0020;
import static com.paas.constants.PaasConstants.V0021;
import static com.paas.constants.PaasConstants.V0023;
import static com.paas.constants.PaasConstants.V0024;
import static com.paas.constants.PaasConstants.V0025;
import static com.paas.constants.PaasConstants.V0026;
import static com.paas.constants.PaasConstants.V0027;
import static com.paas.constants.PaasConstants.V5001;
import static com.paas.constants.PaasConstants.V5010;
import static com.paas.constants.PaasConstants.V5011;
import static com.paas.constants.PaasConstants.V5012;
import static com.paas.constants.PaasConstants.V5019;
import static com.paas.constants.PaasConstants.V5020;
import static com.paas.constants.PaasConstants.V5030;
import static com.paas.constants.PaasConstants.V5031;
import static com.paas.constants.PaasConstants.V5034;
import static com.paas.constants.PaasConstants.V5035;
import static com.paas.constants.PaasConstants.V5042;
import static com.paas.constants.PaasConstants.V5043;
import static com.paas.constants.PaasConstants.V5044;
import static com.paas.constants.PaasConstants.V5060;
import static com.paas.constants.PaasConstants.V5061;
import static com.paas.constants.PaasConstants.V5110;
import static com.paas.constants.PaasConstants.V5160;
import static com.paas.constants.PaasConstants.VALID_PAYMENT_MODES;
import static com.paas.constants.PaasConstants.VALID_RELEASE_FLAGS;
import static com.paas.constants.PaasConstants.VALID_REVERT_CANCEL_FLAGS;
import static com.paas.constants.PaasConstants.VALID_SERVICE_TYPES;
import static com.paas.utils.PaasUtils.getCSVfromPropsFile;
import static com.paas.constants.PaasConstants.XRFL;
import static com.paas.utils.PaasUtils.isAlphaNumeric;
import static com.paas.utils.PaasUtils.isAlphaNumericWithHash;
import static com.paas.utils.PaasUtils.isAlphabet;
import static com.paas.utils.PaasUtils.isDecimal;
import static com.paas.utils.PaasUtils.setDefaultValues;
import static com.paas.utils.PaasUtils.validateLength;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.core.env.Environment;

import com.paas.model.BankBranchSearchRequest;
import com.paas.model.BankBranchSearchResponse;
import com.paas.model.BankSearchRequest;
import com.paas.model.BankSearchResponse;
import com.paas.model.CancelTransactionRequest;
import com.paas.model.CancelTransactionResponse;
import com.paas.model.CreateTransactionRequest;
import com.paas.model.LockTransactionRequest;
import com.paas.model.PaymentCalculatorRequest;
import com.paas.model.PaymentCalculatorResponse;
import com.paas.model.ReleaseTransactionRequest;
import com.paas.model.TransactionEnquiryRequest;
import com.paas.model.TransactionEnquiryResponse;

public class RequestValidator {

	private static final Pattern amountPattern = Pattern.compile("^[0-9]+\\.*[0-9]*");
	private static final Pattern serProviderPattern = Pattern.compile("[A-Z#]+");
	private static final Pattern amountDecimal = Pattern.compile("[0-9]{1,12}+([.][0-9]{1,3})?");
	private static final Pattern rateDecimal = Pattern.compile("[0-9]{1,7}+([.][0-9]{1,8})?");
	private static final Pattern alphaNumPattern = Pattern.compile("[a-zA-Z0-9]+");
	private static final Pattern validateAddress = Pattern.compile("^[0-9a-zA-Z ,-@\\/]+$");
	private static final Pattern alphaNumericSpace = Pattern.compile("^[0-9a-zA-Z ]+$");
	private static final Pattern alphaPattern = Pattern.compile("[a-zA-Z]*");
	private static final Pattern phoneMobilepattern = Pattern.compile("(\\+[\\d]{2})-\\d+");
	private static final Pattern faxpattern = Pattern.compile("(\\+[\\d]{3})-\\d+");
	private static final Pattern validateEmail = Pattern
			.compile("^[a-zA-Z0-9\\.]+@[a-zA-Z0-9\\-\\_\\.]+\\.[a-zA-Z0-9]{2,3}$");
	private static final Pattern paymentMode = Pattern.compile("(CS)|(CQ)");
private static final Pattern alphaPatternWithSpace = Pattern.compile("[a-zA-Z ]*");
private static final Pattern NumPattern = Pattern.compile("[0-9]+");

	public static String validateBankSearchRequest(BankSearchRequest request) {
		if (Optional.ofNullable(request.getCountry()).orElse(EMPTY_STRING).isEmpty()) {
			return V0012;
		} else if (request.getCountry() != null
				&& (validateLength(request.getCountry().replaceAll(EMPTY_SPACES, ""), "2", true)
						|| !isAlphabet(request.getCountry()))) {
			return V0013;
		}
		if (request.getBankName() != null && request.getBankName().trim().length() > 0) {
			if (validateLength(request.getBankName().replaceAll(EMPTY_SPACES, ""), "60", false)) {
				return V0005;
			} else if (!isAlphabet(request.getBankName())) {
				return V0006;
			}
		}

		return SUCCESS_CODE;
	}

	public static String validateBankBranchSearchRequest(BankBranchSearchRequest request) {
		if (Optional.ofNullable(request.getCountry()).orElse(EMPTY_STRING).isEmpty()) {
			return V0012;
		} else if (request.getCountry() != null
				&& (validateLength(request.getCountry().replaceAll(EMPTY_SPACES, ""), "2", true)
						|| !isAlphabet(request.getCountry()))) {
			return V0013;
		}
		if ((Optional.ofNullable(request.getBankCode()).orElse(EMPTY_STRING).isEmpty())
				&& (Optional.ofNullable(request.getBankName()).orElse(EMPTY_STRING).isEmpty())
				&& (Optional.ofNullable(request.getBranchIdentifier()).orElse(EMPTY_STRING).isEmpty())) {
			return V0020;
		}
		if (request.getBankCode() != null && request.getBankCode().replaceAll(EMPTY_SPACES, "").trim().length() > 0) {
			if (validateLength(request.getBankCode().replaceAll(EMPTY_SPACES, ""),"12",true)) {
				return V0016;
			} else if (!isAlphaNumericWithHash(request.getBankCode())) {
				return V0023;
			}
		}
		if (request.getBankName() != null && request.getBankName().replaceAll(EMPTY_SPACES, "").trim().length() > 0) {
			if (validateLength(request.getBankName().replaceAll(EMPTY_SPACES, ""), "60", false)) {
				return V0005;
			} else if (!isAlphabet(request.getBankName())) {
				return V0006;
			}
		}
		if (request.getBankBranchName() != null && request.getBankBranchName().replaceAll(EMPTY_SPACES, "").trim().length() > 0) {
			if (validateLength(request.getBankBranchName().replaceAll(EMPTY_SPACES, ""), "60", false)) {
				return V0003;
			} else if (!isAlphaNumeric(request.getBankBranchName())) {
				return V0024;
			}
		}
		if (request.getBankBranchAddress() != null
				&& validateLength(request.getBankBranchAddress().replaceAll(EMPTY_SPACES, ""), "120", false)) {
			return V0001;
		}
		if (request.getBranchIdentifier() != null && request.getBranchIdentifier().trim().length() > 0) {
			if (validateLength(request.getBranchIdentifier().replaceAll(EMPTY_SPACES, ""), "25", false)) {
				return V0014;
			} else if (!isAlphaNumeric(request.getBranchIdentifier())) {
				return V0025;
			}

		}

		return SUCCESS_CODE;
	}

	public static String validateTxnEnquiryRequest(TransactionEnquiryRequest request) {
		
		if (null == isNullOrValue(request.getServiceType())) {
			return "VE009";
		}
		
		if (request.getStatusHistoryFlag() == null) {
			return "VE007";
		}
		if (request.getSendReceiveCancelFlag() == null) {
			return "VE008"; 
		}

		if (null == isNullOrValue(request.getProductType())) {
			return "VE010"; 
		}
		if (request.getControlFlag() == null) {
			return "VE011"; 
		}
		if (request.getStatusOnly() == null) {
			return "VE012"; 
		}
		if (request.getReservedParam1() == null) {
			return "VE013"; 
		}
		if (request.getReservedParam2() == null) {
			return "VE014"; 
		}
		if (request.getReservedParam3() == null) {
			return "VE015"; 
		}
		if (request.getReservedParam4() == null) {
			return "VE016"; 
		}
		if (request.getReservedParam5() == null) {
			return "VE017"; 
		}
		if (request.getReservedParam6() == null) {
			return "VE018"; 
		}
		if (request.getReservedParam7() == null) {
			return "VE019"; 
		}
		if (request.getReservedParam8() == null) {
			return "VE020"; 
		}
		if (request.getReservedParam9() == null) {
			return "VE021"; 
		}
		if (request.getReservedParam10() == null) {
			return "VE022"; 
		}

		if((request.getServiceType().trim().length() > 0) && (!validateSpecialCharcter(request.getServiceType(),alphaNumPattern))) {
			return "VE025";
		}
		
		if((request.getTxnRefNo().trim().length() > 0) && (!validateSpecialCharcter(request.getTxnRefNo(),NumPattern))) {
			return "VE002";
		}
		
		if((request.getPartnerTxnRefNo().trim().length() > 0) && (!validateSpecialCharcter(request.getPartnerTxnRefNo(),alphaNumPattern))) {
			return "VE024";
		}
		
		if((request.getProductType().trim().length() > 0) && (!validateSpecialCharcter(request.getProductType(),alphaNumPattern))) {
			return "VE026";
		}
		
		if ((null == request.getTxnRefNo().trim() || request.getTxnRefNo().trim().length() == 0) && (null == request.getPartnerTxnRefNo().trim() || request.getPartnerTxnRefNo().trim().length() == 0)) {
			return "VE001";
		}  
		if (request.getTxnRefNo().trim().length() > 0 && request.getTxnRefNo().trim().length() != 16) {
			return "VE027";
		}  
		
		if (request.getServiceType().trim().length() > 0 && request.getServiceType().trim().length() > 4) {
			return "VE028";
		}  
		
		if (request.getProductType().trim().length() > 0 && request.getProductType().trim().length() > 12) {
			return "VE029";
		}  
		
		if (request.getPartnerTxnRefNo().trim().length() > 0 && request.getPartnerTxnRefNo().trim().length() > 20) {
			return "VE003";
		}  
		
		if (request.getSendReceiveCancelFlag() != 1 && request.getSendReceiveCancelFlag() != 2 && request.getSendReceiveCancelFlag() != 3) {
			return "VE004";
		}  
		if (request.getStatusOnly() != 0 && request.getStatusOnly() != 1) { 
			return "VE005";
		}   
		if (request.getStatusHistoryFlag() != 1 && request.getStatusHistoryFlag() != 2) {
			return "VE006";
		} 
		return SUCCESS_CODE;
	}

	public static BankSearchResponse setDefaultValuesForReservedParams(BankSearchResponse bankSearchResponse) {
		bankSearchResponse.setReservedParam1(EMPTY_STRING);
		bankSearchResponse.setReservedParam2(EMPTY_STRING);
		bankSearchResponse.setReservedParam3(EMPTY_STRING);
		bankSearchResponse.setReservedParam4(EMPTY_STRING);
		bankSearchResponse.setReservedParam5(EMPTY_STRING);
		bankSearchResponse.setReservedParam6(EMPTY_STRING);
		bankSearchResponse.setReservedParam7(EMPTY_STRING);
		bankSearchResponse.setReservedParam8(EMPTY_STRING);
		bankSearchResponse.setReservedParam9(EMPTY_STRING);
		bankSearchResponse.setReservedParam10(EMPTY_STRING);
		return bankSearchResponse;
	}

	public static BankBranchSearchResponse setDefaultValuesForReservedParams(
			BankBranchSearchResponse bankBranchSearchResponse) {
		bankBranchSearchResponse.setReservedParam1(EMPTY_STRING);
		bankBranchSearchResponse.setReservedParam2(EMPTY_STRING);
		bankBranchSearchResponse.setReservedParam3(EMPTY_STRING);
		bankBranchSearchResponse.setReservedParam4(EMPTY_STRING);
		bankBranchSearchResponse.setReservedParam5(EMPTY_STRING);
		bankBranchSearchResponse.setReservedParam6(EMPTY_STRING);
		bankBranchSearchResponse.setReservedParam7(EMPTY_STRING);
		bankBranchSearchResponse.setReservedParam8(EMPTY_STRING);
		bankBranchSearchResponse.setReservedParam9(EMPTY_STRING);
		bankBranchSearchResponse.setReservedParam10(EMPTY_STRING);
		return bankBranchSearchResponse;
	}

	public static TransactionEnquiryResponse setDefaultValuesForReservedParams(
			TransactionEnquiryResponse txnEnquiryResponse) {

		txnEnquiryResponse.setPaymentMode(EMPTY_STRING);
		txnEnquiryResponse.setCommission(0.000);
		txnEnquiryResponse.setTax(0.000);
		txnEnquiryResponse.setCardCharges(0.000);
		txnEnquiryResponse.setAdditionalCharges(0.000);
		txnEnquiryResponse.setOtherCharges(0.000);
		txnEnquiryResponse.setReceiverBankFax(EMPTY_STRING);
		txnEnquiryResponse.setReceiverBankEmail(EMPTY_STRING);
		txnEnquiryResponse.setReceiverOtherInfo1(EMPTY_STRING);
		txnEnquiryResponse.setReceiverOtherInfo2(EMPTY_STRING);
		txnEnquiryResponse.setServiceProviderCode(EMPTY_STRING);
		txnEnquiryResponse.setThirdPartyRefNo(EMPTY_STRING);
		txnEnquiryResponse.setSenderZipCode(EMPTY_STRING);
		txnEnquiryResponse.setSenderPhone(EMPTY_STRING);
		txnEnquiryResponse.setSenderFax(EMPTY_STRING);
		txnEnquiryResponse.setSenderEmail(EMPTY_STRING);
		txnEnquiryResponse.setSenderOtherInfo(EMPTY_STRING);
		txnEnquiryResponse.setSenderMessageToBeneficiary(EMPTY_STRING);
		txnEnquiryResponse.setSenderGender(EMPTY_STRING);
		txnEnquiryResponse.setSenderDateOfBirth(EMPTY_STRING);
		txnEnquiryResponse.setSenderNationalityCode(EMPTY_STRING);
		txnEnquiryResponse.setSenderOccupation(EMPTY_STRING);
		txnEnquiryResponse.setSenderEmployerName(EMPTY_STRING);
		txnEnquiryResponse.setSenderEmployerPhone(EMPTY_STRING);
		txnEnquiryResponse.setSenderIDType(EMPTY_STRING);
		txnEnquiryResponse.setSenderIDOtherType(EMPTY_STRING);
		txnEnquiryResponse.setSenderID(EMPTY_STRING);
		txnEnquiryResponse.setSenderIDIssuedBy(EMPTY_STRING);
		txnEnquiryResponse.setSenderIDIssuedAt(EMPTY_STRING);
		txnEnquiryResponse.setSenderIDIssueDate(EMPTY_STRING);
		txnEnquiryResponse.setSenderIDValidThru(EMPTY_STRING);
		txnEnquiryResponse.setSenderIDIssuanceCountry(EMPTY_STRING);
		txnEnquiryResponse.setSenderOtherInfo1(EMPTY_STRING);
		txnEnquiryResponse.setSenderOtherInfo2(EMPTY_STRING);
		txnEnquiryResponse.setSenderOtherInfo3(EMPTY_STRING);
		txnEnquiryResponse.setSenderOtherInfo4(EMPTY_STRING);
		txnEnquiryResponse.setSenderOtherInfo5(EMPTY_STRING);
		txnEnquiryResponse.setReceiverType(0);
		txnEnquiryResponse.setReceiverRefNumber(EMPTY_STRING);
		txnEnquiryResponse.setReceiverOtherInfo3(EMPTY_STRING);
		txnEnquiryResponse.setReceiverOtherInfo4(EMPTY_STRING);
		txnEnquiryResponse.setReceiverOtherInfo5(EMPTY_STRING);
		txnEnquiryResponse.setReceiverPOBox(EMPTY_STRING);
		txnEnquiryResponse.setReceiverAddress1(EMPTY_STRING);
		txnEnquiryResponse.setReceiverAddress2(EMPTY_STRING);
		txnEnquiryResponse.setReceiverCity(EMPTY_STRING);
		txnEnquiryResponse.setReceiverDistrict(EMPTY_STRING);
		txnEnquiryResponse.setReceiverState(EMPTY_STRING);
		txnEnquiryResponse.setReceiverCountryCode(EMPTY_STRING);
		txnEnquiryResponse.setReceiverZipCode(EMPTY_STRING);
		txnEnquiryResponse.setReceiverPhone(EMPTY_STRING);
		txnEnquiryResponse.setReceiverMobile(EMPTY_STRING);
		txnEnquiryResponse.setReceiverFax(EMPTY_STRING);
		txnEnquiryResponse.setReceiverEmail(EMPTY_STRING);
		txnEnquiryResponse.setReceiverBankPOBox(EMPTY_STRING);
		txnEnquiryResponse.setReceiverBankAddress2(EMPTY_STRING);
		txnEnquiryResponse.setReceiverBankState(EMPTY_STRING);
		txnEnquiryResponse.setReceiverBankDistrict(EMPTY_STRING);
		txnEnquiryResponse.setReceiverBankZipCode(EMPTY_STRING);
		txnEnquiryResponse.setReceiverBankPhone(EMPTY_STRING);
		txnEnquiryResponse.setReceiverDateOfBirth(EMPTY_STRING);
		txnEnquiryResponse.setReceiverOccupation(EMPTY_STRING);
		txnEnquiryResponse.setReceiverCustomerRelationship(EMPTY_STRING);
		txnEnquiryResponse.setProductType(EMPTY_STRING);
		txnEnquiryResponse.setReceivingAgentCode(EMPTY_STRING);
		txnEnquiryResponse.setReceiverBankFax(EMPTY_STRING);
		txnEnquiryResponse.setReceiverBankEmail(EMPTY_STRING);
		txnEnquiryResponse.setReceiverOtherInfo1(EMPTY_STRING);
		txnEnquiryResponse.setReceiverOtherInfo2(EMPTY_STRING);
		txnEnquiryResponse.setReceiverOtherInfo3(EMPTY_STRING);
		txnEnquiryResponse.setReceiverOtherInfo4(EMPTY_STRING);
		txnEnquiryResponse.setReceiverOtherInfo5(EMPTY_STRING);
		txnEnquiryResponse.setSourceOfIncome(EMPTY_STRING);
		txnEnquiryResponse.setPurposeOfTxn(EMPTY_STRING);
		txnEnquiryResponse.setPurposeOfTxnDetails(EMPTY_STRING);
		txnEnquiryResponse.setXchgRatePayin2Payout(0.000);
		txnEnquiryResponse.setWalletCode(EMPTY_STRING);
		txnEnquiryResponse.setWalletNumber(EMPTY_STRING);
		txnEnquiryResponse.setCardNumber(EMPTY_STRING);
		txnEnquiryResponse.setCardType(EMPTY_STRING);
		txnEnquiryResponse.setSourceOfIncome(EMPTY_STRING);
		txnEnquiryResponse.setPurposeOfTxn(EMPTY_STRING);
		txnEnquiryResponse.setPurposeOfTxnDetails(EMPTY_STRING);
		txnEnquiryResponse.setXchgRatePayin2Payout(0.000);
		txnEnquiryResponse.setPartnerCommission(0.000);
		txnEnquiryResponse.setDisccount(0.000);
		txnEnquiryResponse.setCancellationAgentCode(EMPTY_STRING);
		txnEnquiryResponse.setCancellationGMTDateTime(EMPTY_STRING);
		txnEnquiryResponse.setCancelXchgRatePayin2Payout(0.000);
		txnEnquiryResponse.setCancelPayinAmount(0.000);
		txnEnquiryResponse.setCancelPayoutAmount(0.000);
		txnEnquiryResponse.setCancelCommission(0.000);
		txnEnquiryResponse.setCancelTax(0.000);
		txnEnquiryResponse.setCancelCardCharges(0.000);
		txnEnquiryResponse.setCancelAdditionalCharges(0.000);
		txnEnquiryResponse.setCancelOtherCharges(0.000);
		txnEnquiryResponse.setCancellationCharges(0.000);
		txnEnquiryResponse.setCancelTotalPayinAmount(0.000);
		txnEnquiryResponse.setSettlementCcyCode(EMPTY_STRING);
		txnEnquiryResponse.setXchgRateUSDToPayin(0.000);
		txnEnquiryResponse.setXchgRateUSDToPayout(0.000);
		txnEnquiryResponse.setXchgRateUSDToSettlement(0.000);
		txnEnquiryResponse.setXchgRateSettlementToPayin(0.000);
		txnEnquiryResponse.setXchgRateSettlementToPayout(0.000);
		txnEnquiryResponse.setCommissionInSCcy(0.000);
		txnEnquiryResponse.setTaxInSCcy(0.000);
		txnEnquiryResponse.setCardChargesInSCcy(0.000);
		txnEnquiryResponse.setAdditionalChargesInSCcy(0.000);
		txnEnquiryResponse.setOtherChargesInSCcy(0.000);
		txnEnquiryResponse.setPayinAmountInSCcy(0.000);
		txnEnquiryResponse.setTotalPayinAmountInSCcy(0.000);
		txnEnquiryResponse.setPayoutAmountInSCcy(0.000);
		txnEnquiryResponse.setTxnOtherInfo1(EMPTY_STRING);
		txnEnquiryResponse.setTxnOtherInfo2(EMPTY_STRING);
		txnEnquiryResponse.setTxnOtherInfo3(EMPTY_STRING);
		txnEnquiryResponse.setTxnOtherInfo4(EMPTY_STRING);
		txnEnquiryResponse.setTxnOtherInfo5(EMPTY_STRING);
		txnEnquiryResponse.setReservedParam1(EMPTY_STRING);
		txnEnquiryResponse.setReservedParam2(EMPTY_STRING);
		txnEnquiryResponse.setReservedParam3(EMPTY_STRING);
		txnEnquiryResponse.setReservedParam4(EMPTY_STRING);
		txnEnquiryResponse.setReservedParam5(EMPTY_STRING);
		txnEnquiryResponse.setReservedParam6(EMPTY_STRING);
		txnEnquiryResponse.setReservedParam7(EMPTY_STRING);
		txnEnquiryResponse.setReservedParam8(EMPTY_STRING);
		txnEnquiryResponse.setReservedParam9(EMPTY_STRING);
		txnEnquiryResponse.setReservedParam10(EMPTY_STRING);

		txnEnquiryResponse.setPayoutAmount(0.000);
		txnEnquiryResponse.setTotalPayinAmount(0.000);
		txnEnquiryResponse.setPayinAmount(0.000);
		txnEnquiryResponse.setTxnRefNo(EMPTY_STRING);
		txnEnquiryResponse.setPartnerTxnRefNo(EMPTY_STRING);
		txnEnquiryResponse.setTransactionGMTDateTime(EMPTY_STRING);
		txnEnquiryResponse.setSenderType(0);
		txnEnquiryResponse.setSenderRefNumber(EMPTY_STRING);
		txnEnquiryResponse.setSenderFirstName(EMPTY_STRING);
		txnEnquiryResponse.setSenderMiddleName(EMPTY_STRING);
		txnEnquiryResponse.setSenderLastName(EMPTY_STRING);
		txnEnquiryResponse.setSenderPOBox(EMPTY_STRING);
		txnEnquiryResponse.setSenderAddress1(EMPTY_STRING);
		txnEnquiryResponse.setSenderAddress2(EMPTY_STRING);
		txnEnquiryResponse.setSenderCity(EMPTY_STRING);
		txnEnquiryResponse.setSenderDistrict(EMPTY_STRING);
		txnEnquiryResponse.setSenderState(EMPTY_STRING);
		txnEnquiryResponse.setSenderCountryCode(EMPTY_STRING);
		txnEnquiryResponse.setSenderMobile(EMPTY_STRING);
		txnEnquiryResponse.setReceiverFirstName(EMPTY_STRING);
		txnEnquiryResponse.setReceiverMiddleName(EMPTY_STRING);
		txnEnquiryResponse.setReceiverLastName(EMPTY_STRING);
		txnEnquiryResponse.setReceiverNationalityCode(EMPTY_STRING);
		txnEnquiryResponse.setReceiverGender(EMPTY_STRING);
		txnEnquiryResponse.setReceiverBankAccountNo(EMPTY_STRING);
		txnEnquiryResponse.setReceiverBankAccountName(EMPTY_STRING);
		txnEnquiryResponse.setReceiverBankName(EMPTY_STRING);
		txnEnquiryResponse.setReceiverBankAddress1(EMPTY_STRING);
		txnEnquiryResponse.setReceiverBankCity(EMPTY_STRING);
		txnEnquiryResponse.setReceiverBankCountryCode(EMPTY_STRING);
		txnEnquiryResponse.setReceiverBankMobile(EMPTY_STRING);
		txnEnquiryResponse.setPayinCcyCode(EMPTY_STRING);
		txnEnquiryResponse.setPayoutCcyCode(EMPTY_STRING);

		return txnEnquiryResponse;
	}

	public static PaymentCalculatorRequest setDefaultValuesForPaymentCalculatorRequest(
			PaymentCalculatorRequest paymentCalculatorRequest, Environment props) {

		PaymentCalculatorRequest request = new PaymentCalculatorRequest();
		request.setXchgRateDisplayFlag(Optional.ofNullable(paymentCalculatorRequest.getXchgRateDisplayFlag())
				.orElse(Integer.valueOf(props.getProperty(DEFAULT_XCHG_RATE_DISPLAY_FLAG))));
		request.setPayinCcyCode(Optional.ofNullable(paymentCalculatorRequest.getPayinCcyCode()).orElse(EMPTY_STRING));
		request.setPayinAmount(Optional.ofNullable(paymentCalculatorRequest.getPayinAmount())
				.orElse(Double.valueOf(props.getProperty(DEFAULT_PAYIN_AMOUNT))));
		request.setPayoutCcyCode(Optional.ofNullable(paymentCalculatorRequest.getPayoutCcyCode()).orElse(EMPTY_STRING));
		request.setPayoutAmount(Optional.ofNullable(paymentCalculatorRequest.getPayoutAmount())
				.orElse(Double.valueOf(props.getProperty(DEFAULT_PAYOUT_AMOUNT))));
		request.setSendingAgentCode(
				Optional.ofNullable(paymentCalculatorRequest.getSendingAgentCode()).orElse(EMPTY_STRING));
		request.setServiceProviderCode(
				Optional.ofNullable(paymentCalculatorRequest.getServiceProviderCode()).orElse(EMPTY_STRING));
		request.setSenderCountryCode(
				Optional.ofNullable(paymentCalculatorRequest.getSenderCountryCode()).orElse(EMPTY_STRING));
		request.setReceiverCountryCode(
				Optional.ofNullable(paymentCalculatorRequest.getReceiverCountryCode()).orElse(EMPTY_STRING));
		request.setReceiverBankBranchCode(
				Optional.ofNullable(paymentCalculatorRequest.getReceiverBankBranchCode()).orElse(EMPTY_STRING));
		request.setIncludeCharges(Optional.ofNullable(paymentCalculatorRequest.getIncludeCharges())
				.orElse(Integer.valueOf(props.getProperty(DEFAULT_INCLUDE_CHARGES))));
		request.setPaymentMode(
				setDefaultValues(paymentCalculatorRequest.getPaymentMode(), DEFAULT_PAYMENT_MODE, props));
		request.setSenderType(Optional.ofNullable(paymentCalculatorRequest.getSenderType())
				.orElse(Integer.valueOf(props.getProperty(DEFAULT_SENDER_TYPE))));
		request.setReceiverType(Optional.ofNullable(paymentCalculatorRequest.getReceiverType())
				.orElse(Integer.valueOf(props.getProperty(DEFAULT_RECEIVER_TYPE))));
		/*request.setServiceType(
				setDefaultValues(paymentCalculatorRequest.getServiceType(), DEFAULT_SERVICE_TYPE, props));
		request.setProductType(
				setDefaultValues(paymentCalculatorRequest.getProductType(), DEFAULT_PRODUCT_TYPE, props));*/
		request.setServiceType(Optional.ofNullable(paymentCalculatorRequest.getServiceType()).orElse(EMPTY_STRING));
		request.setProductType(Optional.ofNullable(paymentCalculatorRequest.getProductType()).orElse(EMPTY_STRING));
		request.setServiceFlag(Optional.ofNullable(paymentCalculatorRequest.getServiceFlag())
				.orElse(Integer.valueOf(props.getProperty(DEFAULT_SERVICE_FLAG))));
		request.setControlFlag(Optional.ofNullable(paymentCalculatorRequest.getControlFlag())
				.orElse(Integer.valueOf(props.getProperty(DEFAULT_CONTROL_FLAG))));
		request.setReservedParam1(
				Optional.ofNullable(paymentCalculatorRequest.getReservedParam1()).orElse(EMPTY_STRING));
		request.setReservedParam2(
				Optional.ofNullable(paymentCalculatorRequest.getReservedParam2()).orElse(EMPTY_STRING));
		request.setReservedParam3(
				Optional.ofNullable(paymentCalculatorRequest.getReservedParam3()).orElse(EMPTY_STRING));
		request.setReservedParam4(
				Optional.ofNullable(paymentCalculatorRequest.getReservedParam4()).orElse(EMPTY_STRING));
		request.setReservedParam5(
				Optional.ofNullable(paymentCalculatorRequest.getReservedParam5()).orElse(EMPTY_STRING));
		request.setReservedParam6(
				Optional.ofNullable(paymentCalculatorRequest.getReservedParam6()).orElse(EMPTY_STRING));
		request.setReservedParam7(
				Optional.ofNullable(paymentCalculatorRequest.getReservedParam7()).orElse(EMPTY_STRING));
		request.setReservedParam8(
				Optional.ofNullable(paymentCalculatorRequest.getReservedParam8()).orElse(EMPTY_STRING));
		request.setReservedParam9(
				Optional.ofNullable(paymentCalculatorRequest.getReservedParam9()).orElse(EMPTY_STRING));
		request.setReservedParam10(
				Optional.ofNullable(paymentCalculatorRequest.getReservedParam10()).orElse(EMPTY_STRING));

		return request;
	}

	public static PaymentCalculatorResponse setDefaultValuesForReservedParams(
			PaymentCalculatorResponse paymentCalculatorResponse) {
		paymentCalculatorResponse.setRateOtherInfo1(EMPTY_STRING);
		paymentCalculatorResponse.setRateOtherInfo2(EMPTY_STRING);
		paymentCalculatorResponse.setRateOtherInfo3(EMPTY_STRING);
		paymentCalculatorResponse.setRateOtherInfo4(EMPTY_STRING);
		paymentCalculatorResponse.setRateOtherInfo5(EMPTY_STRING);
		paymentCalculatorResponse.setReservedParam1(EMPTY_STRING);
		paymentCalculatorResponse.setReservedParam2(EMPTY_STRING);
		paymentCalculatorResponse.setReservedParam3(EMPTY_STRING);
		paymentCalculatorResponse.setReservedParam4(EMPTY_STRING);
		paymentCalculatorResponse.setReservedParam5(EMPTY_STRING);
		paymentCalculatorResponse.setReservedParam6(EMPTY_STRING);
		paymentCalculatorResponse.setReservedParam7(EMPTY_STRING);
		paymentCalculatorResponse.setReservedParam8(EMPTY_STRING);
		paymentCalculatorResponse.setReservedParam9(EMPTY_STRING);
		paymentCalculatorResponse.setReservedParam10(EMPTY_STRING);
		return paymentCalculatorResponse;
	}

	public static String validatePaymentCalculatorRequest(PaymentCalculatorRequest request, Environment props) {
		if (request.getXchgRateDisplayFlag() != 0 && request.getXchgRateDisplayFlag() != 1) {
			return V0017;
		}
		if (validateLength(request.getPayinCcyCode(), "3", true) || !isAlphabet(request.getPayinCcyCode().trim())) {
			return V5010;
		}
		if (!isDecimal(String.valueOf(request.getPayinAmount()))
				|| !isDecimal(String.valueOf(request.getPayoutAmount()))) {
			return V5020;
		} else if (request.getPayinAmount() <= 0.00 && request.getPayoutAmount() <= 0.00) {
			return V5019;
		}
		if (validateLength(request.getPayoutCcyCode(), "3", true) || !isAlphabet(request.getPayoutCcyCode().trim())) {
			return V5012;
		}
		if (validateLength(request.getSendingAgentCode(), "12", true)
				|| !isAlphaNumericWithHash(request.getSendingAgentCode())) {
			return V5030;
		}
		if (request.getServiceProviderCode().trim().length() > 0
				&& validateLength(request.getServiceProviderCode(), "12", true)) {
			return V5031;
		}
		if (request.getSenderCountryCode().trim().length() > 0 && validateLength(request.getSenderCountryCode(), "2", true)) {
			return V5110;
		}
		if (request.getReceiverCountryCode().trim().length() > 0
				&& validateLength(request.getReceiverCountryCode(), "2", true)) {
			return V0013;
		}

		if (request.getReceiverBankBranchCode().trim().length() > 0
				&& validateLength(request.getReceiverBankBranchCode(), "12", false)) {
			return V5160;
		}

		if (request.getIncludeCharges() != 0 && request.getIncludeCharges() != 1) {
			return V5042;
		}

		if (request.getIncludeCharges() == 0) {
			if (validateLength(request.getPaymentMode(), "2", true)) {
				return V5011;
			}else if(request.getReceiverBankBranchCode().trim().length() == 0) {
				return V5160;
			}
		}
		
		if(!getCSVfromPropsFile(VALID_PAYMENT_MODES, props).contains(request.getPaymentMode().trim())) {
			return V5011;
		}
		
		if(request.getServiceType().trim().length() == 0) {
			return V0026;
		}else if (!getCSVfromPropsFile(VALID_SERVICE_TYPES, props).contains(request.getServiceType().trim())) {
			return V5061;
		}
		
		if(request.getProductType().trim().length() == 0) {
			return V0027;
		}else if (!validateProductType(request.getServiceType(), request.getProductType(), props)) {
			return V5060;
		}
		
		return SUCCESS_CODE;
	}

	public static String validateReleaseTxnRequest(ReleaseTransactionRequest request, Environment props) {
		if ((null == request.getTxnRefNo() || request.getTxnRefNo().trim().length() == 0)) {
			return V5034;
		}
		if (request.getTxnRefNo().trim().length() > 0 && validateLength(request.getTxnRefNo(), "16", true)) {
			return V5035;
		}
		
		if(null == request.getServiceType() || request.getServiceType().trim().length() == 0) {
			return V0026;
		}else if (!getCSVfromPropsFile(VALID_SERVICE_TYPES, props).contains(request.getServiceType().trim())) {
			return V5061;
		}
		
		if(null == request.getProductType() || request.getProductType().trim().length() == 0) {
			return V0027;
		}else if (!validateProductType(request.getServiceType(), request.getProductType(), props)) {
			return V5060;
		}
		
		if (request.getReleaseFlag() == null || !getCSVfromPropsFile(VALID_RELEASE_FLAGS, props).contains(String.valueOf(request.getReleaseFlag()))) {
			return V5044;
		}else if(request.getReleaseFlag() == 1 || request.getReleaseFlag() == 2) {
			if (null != request.getRevertCancelWithLock() && request.getRevertCancelWithLock() != 0) {
				return V5043;
			}
		}else if (request.getReleaseFlag() == 3) {
			if (request.getRevertCancelWithLock() == null || !getCSVfromPropsFile(VALID_REVERT_CANCEL_FLAGS, props).contains(String.valueOf(request.getRevertCancelWithLock()))) {
				return V5043;
			}
		}

		return SUCCESS_CODE;
	}
	public static String validateCancelTxnRequest(CancelTransactionRequest request,Environment props) {

		if ((null == request.getTxnRefNo() || request.getTxnRefNo().trim().length() == 0)) {
			if ((null == request.getPartnerTxnRefNo() || request.getPartnerTxnRefNo().trim().length() == 0))
			return  "V5034";
		}
		
		if (null != request.getTxnRefNo() && request.getTxnRefNo().trim().length() > 0 && request.getTxnRefNo().trim().length() != 16)
			return  "V5035";

		if(null== request.getCancelReasonCode() || request.getCancelReasonCode() == 0)
			return "V7002";
		
		if(request.getCancelReasonCode() > 3)
			return "V7002";

		
		if(null== request.getCancelReasonDescription() || request.getCancelReasonDescription().trim().length() == 0)
			return "V7003";
		
		if(request.getCancelReasonDescription().trim().length() > 0 && !validateSpecialCharcter(request.getCancelReasonDescription(),Pattern.compile("[a-zA-Z ]*")))
			return "V7003";
		
		if ((null == request.getServiceType() || request.getServiceType().trim().length() == 0))
			return  "V5161";
		
		if ((null == request.getProductType() || request.getProductType().trim().length() == 0))
			return  "V5162";
		
		if(request.getServiceType().length() > 0 && (validateLength(request.getServiceType(),"4",false) || 
				!getCSVfromPropsFile(VALID_SERVICE_TYPES,props).contains(request.getServiceType()))) {
			return "V5061";
		}
		if(request.getProductType().length() > 0 && (validateLength(request.getProductType(),"12",false)  ||
				(request.getServiceType().length() > 0 && 
						!validateProductType(request.getServiceType(),request.getProductType(),props)))) {
			return "V5060";
		}
		
		if ((null == request.getRequiresAuthorization() || request.getRequiresAuthorization() > 1 ))
			return  "E7076";
		
		return SUCCESS_CODE;
	}
	
	// create
	public static CreateTransactionRequest setDefaultValuesForCreate(CreateTransactionRequest request,
			Environment props) {

		CreateTransactionRequest requestParam = new CreateTransactionRequest();
		requestParam.setValidateOnlyFlag(Optional.ofNullable(request.getValidateOnlyFlag()).orElse(DEFAULT_INTEGER));
		requestParam.setOverrideRateFlag(Optional.ofNullable(request.getOverrideRateFlag()).orElse(DEFAULT_INTEGER));
		requestParam.setPartnerTxnRefNo(Optional.ofNullable(request.getPartnerTxnRefNo()).orElse(EMPTY_STRING));
		requestParam.setRequiresAuthorization(
				Optional.ofNullable(request.getRequiresAuthorization()).orElse(DEFAULT_INTEGER));
		requestParam.setCrmRefNumber(Optional.ofNullable(request.getCrmRefNumber()).orElse(EMPTY_STRING));
		requestParam.setCrmLeadRefNumber(Optional.ofNullable(request.getCrmLeadRefNumber()).orElse(EMPTY_STRING));
		requestParam
				.setSpecialDealRefNumber(Optional.ofNullable(request.getSpecialDealRefNumber()).orElse(EMPTY_STRING));
		requestParam.setSendingAgentCode(Optional.ofNullable(request.getSendingAgentCode()).orElse(EMPTY_STRING));
		requestParam.setServiceProviderCode(Optional.ofNullable(request.getServiceProviderCode()).orElse(EMPTY_STRING));
		requestParam.setSenderProfile(Optional.ofNullable(request.getSenderProfile()).orElse(DEFAULT_INTEGER));
		requestParam.setReceiverProfile(Optional.ofNullable(request.getReceiverProfile()).orElse(DEFAULT_INTEGER));
		requestParam.setSenderType(Optional.ofNullable(request.getSenderType()).orElse(DEFAULT_INTEGER));
		requestParam.setReceiverType(Optional.ofNullable(request.getReceiverType()).orElse(DEFAULT_INTEGER));
		requestParam.setSenderRefNumber(Optional.ofNullable(request.getSenderRefNumber()).orElse(EMPTY_STRING));
		requestParam.setSenderFirstName(Optional.ofNullable(request.getSenderFirstName()).orElse(EMPTY_STRING));
		requestParam.setSenderMiddleName(Optional.ofNullable(request.getSenderMiddleName()).orElse(EMPTY_STRING));
		requestParam.setSenderLastName(Optional.ofNullable(request.getSenderLastName()).orElse(EMPTY_STRING));
		requestParam.setSenderPOBox(Optional.ofNullable(request.getSenderPOBox()).orElse(EMPTY_STRING));
		requestParam.setSenderAddress1(Optional.ofNullable(request.getSenderAddress1()).orElse(EMPTY_STRING));
		requestParam.setSenderAddress2(Optional.ofNullable(request.getSenderAddress2()).orElse(EMPTY_STRING));
		requestParam.setSenderCity(Optional.ofNullable(request.getSenderCity()).orElse(EMPTY_STRING));
		requestParam.setSenderDistrict(Optional.ofNullable(request.getSenderDistrict()).orElse(EMPTY_STRING));
		requestParam.setSenderState(Optional.ofNullable(request.getSenderState()).orElse(EMPTY_STRING));
		requestParam.setSenderCountryCode(Optional.ofNullable(request.getSenderCountryCode()).orElse(EMPTY_STRING));
		requestParam.setSenderZipCode(Optional.ofNullable(request.getSenderZipCode()).orElse(EMPTY_STRING));
		requestParam.setSenderMobile(Optional.ofNullable(request.getSenderMobile()).orElse(EMPTY_STRING));
		requestParam.setSenderPhone(Optional.ofNullable(request.getSenderPhone()).orElse(EMPTY_STRING));
		requestParam.setSenderFax(Optional.ofNullable(request.getSenderFax()).orElse(EMPTY_STRING));
		requestParam.setSenderEmail(Optional.ofNullable(request.getSenderEmail()).orElse(EMPTY_STRING));
		requestParam.setSenderOtherInfo(Optional.ofNullable(request.getSenderOtherInfo()).orElse(EMPTY_STRING));
		requestParam.setSenderMessageToBeneficiary(
				Optional.ofNullable(request.getSenderMessageToBeneficiary()).orElse(EMPTY_STRING));
		requestParam.setSenderSelfDeclaration(
				Optional.ofNullable(request.getSenderSelfDeclaration()).orElse(DEFAULT_INTEGER));
		requestParam.setSenderGender(Optional.ofNullable(request.getSenderGender()).orElse(EMPTY_STRING));
		requestParam.setSenderDateOfBirth(Optional.ofNullable(request.getSenderDateOfBirth()).orElse(EMPTY_STRING));
		requestParam
				.setSenderNationalityCode(Optional.ofNullable(request.getSenderNationalityCode()).orElse(EMPTY_STRING));
		requestParam.setSenderOccupation(Optional.ofNullable(request.getSenderOccupation()).orElse(EMPTY_STRING));
		requestParam.setSenderPlaceOfBirth(Optional.ofNullable(request.getSenderPlaceOfBirth()).orElse(EMPTY_STRING));
		requestParam.setSenderEmployerName(Optional.ofNullable(request.getSenderEmployerName()).orElse(EMPTY_STRING));
		requestParam.setSenderEmployerPhone(Optional.ofNullable(request.getSenderEmployerPhone()).orElse(EMPTY_STRING));
		requestParam.setSenderID(Optional.ofNullable(request.getSenderID()).orElse(EMPTY_STRING));
		requestParam.setSenderIDType(Optional.ofNullable(request.getSenderIDType()).orElse(EMPTY_STRING));
		requestParam.setSenderIDOtherType(Optional.ofNullable(request.getSenderDateOfBirth()).orElse(EMPTY_STRING));
		requestParam.setSenderIDIssuedBy(Optional.ofNullable(request.getSenderIDIssuedBy()).orElse(EMPTY_STRING));
		requestParam.setSenderIDIssuedAt(Optional.ofNullable(request.getSenderIDIssuedAt()).orElse(EMPTY_STRING));
		requestParam.setSenderIDIssueDate(Optional.ofNullable(request.getSenderIDIssueDate()).orElse(EMPTY_STRING));
		requestParam.setSenderIDValidThru(Optional.ofNullable(request.getSenderIDValidThru()).orElse(EMPTY_STRING));
		requestParam.setSenderIDIssuanceCountry(
				Optional.ofNullable(request.getSenderIDIssuanceCountry()).orElse(EMPTY_STRING));
		requestParam.setSenderIDOtherInfo(Optional.ofNullable(request.getSenderIDOtherInfo()).orElse(EMPTY_STRING));
		requestParam.setSenderIDRemarks(Optional.ofNullable(request.getSenderIDRemarks()).orElse(EMPTY_STRING));
		requestParam
				.setSenderproofOfAddress(Optional.ofNullable(request.getSenderproofOfAddress()).orElse(EMPTY_STRING));
		requestParam.setSenderID2(Optional.ofNullable(request.getSenderID2()).orElse(EMPTY_STRING));
		requestParam.setSenderID2Type(Optional.ofNullable(request.getSenderID2Type()).orElse(EMPTY_STRING));
		requestParam.setSenderID2IssuedBy(Optional.ofNullable(request.getSenderID2IssuedBy()).orElse(EMPTY_STRING));
		requestParam.setSenderID2IssuedAt(Optional.ofNullable(request.getSenderID2IssuedAt()).orElse(EMPTY_STRING));
		requestParam.setSenderID2IssueDate(Optional.ofNullable(request.getSenderID2IssueDate()).orElse(EMPTY_STRING));
		requestParam.setSenderID2ValidThru(Optional.ofNullable(request.getSenderID2ValidThru()).orElse(EMPTY_STRING));
		requestParam.setSenderID2IssuanceCountry(
				Optional.ofNullable(request.getSenderID2IssuanceCountry()).orElse(EMPTY_STRING));
		requestParam.setSenderID2OtherInfo(Optional.ofNullable(request.getSenderID2OtherInfo()).orElse(EMPTY_STRING));
		requestParam.setSenderID2Remarks(Optional.ofNullable(request.getSenderID2Remarks()).orElse(EMPTY_STRING));
		requestParam.setTaxRegNo(Optional.ofNullable(request.getTaxRegNo()).orElse(EMPTY_STRING));
		requestParam
				.setTaxRegNoIssuedCountry(Optional.ofNullable(request.getTaxRegNoIssuedCountry()).orElse(EMPTY_STRING));
		requestParam.setEkycVerifiedSource(Optional.ofNullable(request.getEkycVerifiedSource()).orElse(EMPTY_STRING));
		requestParam.setEkycValidatedSource(Optional.ofNullable(request.getEkycValidatedSource()).orElse(EMPTY_STRING));
		requestParam.setEkycValidatedOn(Optional.ofNullable(request.getEkycValidatedOn()).orElse(EMPTY_STRING));
		requestParam.setSenderOtherInfo1(Optional.ofNullable(request.getSenderOtherInfo1()).orElse(EMPTY_STRING));
		requestParam.setSenderOtherInfo2(Optional.ofNullable(request.getSenderOtherInfo2()).orElse(EMPTY_STRING));
		requestParam.setSenderOtherInfo3(Optional.ofNullable(request.getSenderOtherInfo3()).orElse(EMPTY_STRING));
		requestParam.setSenderOtherInfo4(Optional.ofNullable(request.getSenderOtherInfo4()).orElse(EMPTY_STRING));
		requestParam.setSenderOtherInfo5(Optional.ofNullable(request.getSenderOtherInfo5()).orElse(EMPTY_STRING));
		requestParam.setReceiverRefNumber(Optional.ofNullable(request.getReceiverRefNumber()).orElse(EMPTY_STRING));
		requestParam.setReceiverFirstName(Optional.ofNullable(request.getReceiverFirstName()).orElse(EMPTY_STRING));
		requestParam.setReceiverMiddleName(Optional.ofNullable(request.getReceiverMiddleName()).orElse(EMPTY_STRING));
		requestParam.setReceiverLastName(Optional.ofNullable(request.getReceiverLastName()).orElse(EMPTY_STRING));
		requestParam.setDeliveryOption(Optional.ofNullable(request.getDeliveryOption()).orElse(DEFAULT_INTEGER));
		requestParam.setReceiverAddress1(Optional.ofNullable(request.getReceiverAddress1()).orElse(EMPTY_STRING));
		requestParam.setReceiverAddress2(Optional.ofNullable(request.getReceiverAddress2()).orElse(EMPTY_STRING));
		requestParam.setReceiverCity(Optional.ofNullable(request.getReceiverCity()).orElse(EMPTY_STRING));
		requestParam.setReceiverCountryCode(Optional.ofNullable(request.getReceiverCountryCode()).orElse(EMPTY_STRING));
		requestParam.setReceiverDistrict(Optional.ofNullable(request.getReceiverDistrict()).orElse(EMPTY_STRING));
		requestParam.setReceiverState(Optional.ofNullable(request.getReceiverState()).orElse(EMPTY_STRING));
		requestParam.setReceiverPOBox(Optional.ofNullable(request.getReceiverPOBox()).orElse(EMPTY_STRING));
		requestParam.setReceiverZipCode(Optional.ofNullable(request.getReceiverZipCode()).orElse(EMPTY_STRING));
		requestParam.setReceiverPhone(Optional.ofNullable(request.getReceiverPhone()).orElse(EMPTY_STRING));
		requestParam.setReceiverMobile(Optional.ofNullable(request.getReceiverMobile()).orElse(EMPTY_STRING));
		requestParam.setReceiverFax(Optional.ofNullable(request.getReceiverFax()).orElse(EMPTY_STRING));
		requestParam.setReceiverEmail(Optional.ofNullable(request.getReceiverEmail()).orElse(EMPTY_STRING));
		requestParam.setReceiverNationalityCode(
				Optional.ofNullable(request.getReceiverNationalityCode()).orElse(EMPTY_STRING));
		requestParam.setReceiverGender(Optional.ofNullable(request.getReceiverGender()).orElse(EMPTY_STRING));
		requestParam.setReceiverDateOfBirth(Optional.ofNullable(request.getReceiverDateOfBirth()).orElse(EMPTY_STRING));
		requestParam.setReceiverOccupation(Optional.ofNullable(request.getReceiverOccupation()).orElse(EMPTY_STRING));
		requestParam.setReceiverSenderRelationship(
				Optional.ofNullable(request.getReceiverSenderRelationship()).orElse(EMPTY_STRING));
		requestParam.setReceiverSmsNotify(Optional.ofNullable(request.getReceiverSmsNotify()).orElse(DEFAULT_INTEGER));
		requestParam.setReceiverID(Optional.ofNullable(request.getReceiverID()).orElse(EMPTY_STRING));
		requestParam.setReceiverIDType(Optional.ofNullable(request.getReceiverIDType()).orElse(EMPTY_STRING));
		requestParam.setReceiverIDOtherType(Optional.ofNullable(request.getReceiverIDOtherType()).orElse(EMPTY_STRING));
		requestParam.setReceiverIDIssuedBy(Optional.ofNullable(request.getReceiverIDIssuedBy()).orElse(EMPTY_STRING));
		requestParam.setReceiverIDIssuedAt(Optional.ofNullable(request.getReceiverIDIssuedAt()).orElse(EMPTY_STRING));
		requestParam.setReceiverIDIssueDate(Optional.ofNullable(request.getReceiverIDIssueDate()).orElse(EMPTY_STRING));
		requestParam.setReceiverIDValidThru(Optional.ofNullable(request.getReceiverIDValidThru()).orElse(EMPTY_STRING));
		requestParam.setReceiverIDIssuanceCountry(
				Optional.ofNullable(request.getReceiverIDIssuanceCountry()).orElse(EMPTY_STRING));
		requestParam.setReceiverOtherInfo1(Optional.ofNullable(request.getReceiverOtherInfo1()).orElse(EMPTY_STRING));
		requestParam.setReceiverOtherInfo2(Optional.ofNullable(request.getReceiverOtherInfo2()).orElse(EMPTY_STRING));
		requestParam.setReceiverOtherInfo3(Optional.ofNullable(request.getReceiverOtherInfo3()).orElse(EMPTY_STRING));
		requestParam.setReceiverOtherInfo4(Optional.ofNullable(request.getReceiverOtherInfo4()).orElse(EMPTY_STRING));
		requestParam.setReceiverOtherInfo5(Optional.ofNullable(request.getReceiverOtherInfo5()).orElse(EMPTY_STRING));
		requestParam
				.setReceiverBankAccountNo(Optional.ofNullable(request.getReceiverBankAccountNo()).orElse(EMPTY_STRING));
		requestParam.setReceiverBankIBANNo(Optional.ofNullable(request.getReceiverBankIBANNo()).orElse(EMPTY_STRING));
		requestParam.setReceiverCardNo(Optional.ofNullable(request.getReceiverCardNo()).orElse(EMPTY_STRING));
		requestParam.setReceiverCardType(Optional.ofNullable(request.getReceiverCardType()).orElse(DEFAULT_INTEGER));
		requestParam.setReceiverWalletPatrnerCode(
				Optional.ofNullable(request.getReceiverWalletPatrnerCode()).orElse(EMPTY_STRING));
		requestParam
				.setReceiverWalletNumber(Optional.ofNullable(request.getReceiverWalletNumber()).orElse(EMPTY_STRING));
		requestParam.setReceiverEnglishName(Optional.ofNullable(request.getReceiverEnglishName()).orElse(EMPTY_STRING));
		requestParam.setReceiverChineseNameInEnglish(
				Optional.ofNullable(request.getReceiverChineseNameInEnglish()).orElse(EMPTY_STRING));
		requestParam.setReceiverBankAccountName(
				Optional.ofNullable(request.getReceiverBankAccountName()).orElse(EMPTY_STRING));
		requestParam.setReceiverBankCode(Optional.ofNullable(request.getReceiverBankCode()).orElse(EMPTY_STRING));
		requestParam.setReceiverBankBranchCode(
				Optional.ofNullable(request.getReceiverBankBranchCode()).orElse(EMPTY_STRING));
		requestParam.setReceiverBranchIdentifier(
				Optional.ofNullable(request.getReceiverBranchIdentifier()).orElse(EMPTY_STRING));
		requestParam.setReceiverBankBranchName(
				Optional.ofNullable(request.getReceiverBankBranchName()).orElse(EMPTY_STRING));
		requestParam.setReceivingAgentCode(Optional.ofNullable(request.getReceivingAgentCode()).orElse(EMPTY_STRING));
		requestParam.setServiceType(Optional.ofNullable(request.getServiceType()).orElse(EMPTY_STRING));
		requestParam.setProductType(Optional.ofNullable(request.getProductType()).orElse(EMPTY_STRING));
		requestParam.setSourceOfIncome(Optional.ofNullable(request.getSourceOfIncome()).orElse(EMPTY_STRING));
		requestParam.setPurposeOfTxn(Optional.ofNullable(request.getPurposeOfTxn()).orElse(EMPTY_STRING));
		requestParam.setPurposeOfTxnDetails(Optional.ofNullable(request.getPurposeOfTxnDetails()).orElse(EMPTY_STRING));
		requestParam.setCalculationModel(Optional.ofNullable(request.getCalculationModel()).orElse(DEFAULT_INTEGER));
		requestParam.setTransactionMode(Optional.ofNullable(request.getTransactionMode()).orElse(DEFAULT_INTEGER));
		requestParam.setTxnOtherInfo1(Optional.ofNullable(request.getTxnOtherInfo1()).orElse(EMPTY_STRING));
		requestParam.setTxnOtherInfo2(Optional.ofNullable(request.getTxnOtherInfo2()).orElse(EMPTY_STRING));
		requestParam.setTxnOtherInfo3(Optional.ofNullable(request.getTxnOtherInfo3()).orElse(EMPTY_STRING));
		requestParam.setTxnOtherInfo4(Optional.ofNullable(request.getTxnOtherInfo4()).orElse(EMPTY_STRING));
		requestParam.setTxnOtherInfo5(Optional.ofNullable(request.getTxnOtherInfo5()).orElse(EMPTY_STRING));
		requestParam.setPaymentMode(Optional.ofNullable(request.getPaymentMode()).orElse(EMPTY_STRING));
		requestParam
				.setXchgRatePayin2Payout(Optional.ofNullable(request.getXchgRatePayin2Payout()).orElse(DEFAULT_DOUBLE));
		requestParam.setPayinCcyCode(Optional.ofNullable(request.getPayinCcyCode()).orElse(EMPTY_STRING));
		requestParam.setPayinAmount(Optional.ofNullable(request.getPayinAmount()).orElse(DEFAULT_DOUBLE));
		requestParam.setPayoutCcyCode(Optional.ofNullable(request.getPayoutCcyCode()).orElse(EMPTY_STRING));
		requestParam.setPayoutAmount(Optional.ofNullable(request.getPayoutAmount()).orElse(DEFAULT_DOUBLE));
		requestParam.setTax(Optional.ofNullable(request.getTax()).orElse(DEFAULT_DOUBLE));
		requestParam.setCardCharges(Optional.ofNullable(request.getCardCharges()).orElse(DEFAULT_DOUBLE));
		requestParam.setOtherCharges(Optional.ofNullable(request.getOtherCharges()).orElse(DEFAULT_DOUBLE));
		requestParam.setAdditionalCharges(Optional.ofNullable(request.getAdditionalCharges()).orElse(DEFAULT_DOUBLE));
		requestParam.setCommission(Optional.ofNullable(request.getCommission()).orElse(DEFAULT_DOUBLE));
		requestParam.setPartnerCommission(Optional.ofNullable(request.getPartnerCommission()).orElse(DEFAULT_DOUBLE));
		requestParam.setTotalPayinAmount(Optional.ofNullable(request.getTotalPayinAmount()).orElse(DEFAULT_DOUBLE));
		requestParam.setRateOtherInfo1(Optional.ofNullable(request.getRateOtherInfo1()).orElse(EMPTY_STRING));
		requestParam.setRateOtherInfo2(Optional.ofNullable(request.getRateOtherInfo2()).orElse(EMPTY_STRING));
		requestParam.setRateOtherInfo3(Optional.ofNullable(request.getRateOtherInfo3()).orElse(EMPTY_STRING));
		requestParam.setRateOtherInfo4(Optional.ofNullable(request.getRateOtherInfo4()).orElse(EMPTY_STRING));
		requestParam.setRateOtherInfo5(Optional.ofNullable(request.getRateOtherInfo5()).orElse(EMPTY_STRING));
		requestParam.setPaymentOtherInfo1(Optional.ofNullable(request.getPaymentOtherInfo1()).orElse(EMPTY_STRING));
		requestParam.setPaymentOtherInfo2(Optional.ofNullable(request.getPaymentOtherInfo2()).orElse(EMPTY_STRING));
		requestParam.setPaymentOtherInfo3(Optional.ofNullable(request.getPaymentOtherInfo3()).orElse(EMPTY_STRING));
		requestParam.setPaymentOtherInfo4(Optional.ofNullable(request.getPaymentOtherInfo4()).orElse(EMPTY_STRING));
		requestParam.setPaymentOtherInfo5(Optional.ofNullable(request.getPaymentOtherInfo5()).orElse(EMPTY_STRING));
		requestParam.setPromotionRefNumber(Optional.ofNullable(request.getPromotionRefNumber()).orElse(EMPTY_STRING));
		requestParam.setPromotionMessageDescription(
				Optional.ofNullable(request.getPromotionMessageDescription()).orElse(EMPTY_STRING));
		requestParam.setPromotionalData1(Optional.ofNullable(request.getPromotionalData1()).orElse(EMPTY_STRING));
		requestParam.setPromotionalData2(Optional.ofNullable(request.getPromotionalData2()).orElse(EMPTY_STRING));
		requestParam.setPromotionalData3(Optional.ofNullable(request.getPromotionalData3()).orElse(EMPTY_STRING));
		requestParam.setPromotionalData4(Optional.ofNullable(request.getPromotionalData4()).orElse(EMPTY_STRING));
		requestParam.setPromotionCcyCode(Optional.ofNullable(request.getPromotionCcyCode()).orElse(EMPTY_STRING));
		requestParam.setDiscountField(Optional.ofNullable(request.getDiscountField()).orElse(EMPTY_STRING));
		requestParam.setRuleFlag(Optional.ofNullable(request.getRuleFlag()).orElse(DEFAULT_INTEGER));
		requestParam.setControlFlag(Optional.ofNullable(request.getControlFlag()).orElse(DEFAULT_INTEGER));
		requestParam.setExternalFlag(Optional.ofNullable(request.getExternalFlag()).orElse(DEFAULT_INTEGER));
		requestParam.setReservedParam1(Optional.ofNullable(request.getReservedParam1()).orElse(EMPTY_STRING));
		requestParam.setReservedParam2(Optional.ofNullable(request.getReservedParam2()).orElse(EMPTY_STRING));
		requestParam.setReservedParam3(Optional.ofNullable(request.getReservedParam3()).orElse(EMPTY_STRING));
		requestParam.setReservedParam4(Optional.ofNullable(request.getReservedParam4()).orElse(EMPTY_STRING));
		requestParam.setReservedParam5(Optional.ofNullable(request.getReservedParam5()).orElse(EMPTY_STRING));
		requestParam.setReservedParam6(Optional.ofNullable(request.getReservedParam6()).orElse(EMPTY_STRING));
		requestParam.setReservedParam7(Optional.ofNullable(request.getReservedParam7()).orElse(EMPTY_STRING));
		requestParam.setReservedParam8(Optional.ofNullable(request.getReservedParam8()).orElse(EMPTY_STRING));
		requestParam.setReservedParam9(Optional.ofNullable(request.getReservedParam9()).orElse(EMPTY_STRING));
		requestParam.setReservedParam10(Optional.ofNullable(request.getReservedParam10()).orElse(EMPTY_STRING));
		return requestParam;

	}

	public static String validateCreateTxnRequest(CreateTransactionRequest request) {

		if (request.getValidateOnlyFlag() == 0)
			return "V5045";

		if (request.getValidateOnlyFlag() != 1 && request.getValidateOnlyFlag() != 2)
			return "V5045";

		if (2 == request.getValidateOnlyFlag()) {
			if (null == isNullOrValue(request.getPartnerTxnRefNo()))
				return "V5032";

			if (request.getPartnerTxnRefNo().trim().length() > 0 && request.getPartnerTxnRefNo().trim().length() > 20)
				return "V0010";
		}

		if (request.getOverrideRateFlag() == 0)
			return "V5046";

		if (request.getOverrideRateFlag() != 1 && request.getOverrideRateFlag() != 2)
			return "V5046";

		if (request.getOverrideRateFlag() == 2) {
			if (validateMinimumAmount(request.getXchgRatePayin2Payout()) == false) {
				return "V0015";
			}

			if (!validateSpecialCharcter(String.valueOf(request.getXchgRatePayin2Payout()), rateDecimal))
				return "V5112";
		}

		if (request.getRequiresAuthorization() != 0 && request.getRequiresAuthorization() != 1)
			return "V5089";

		if ((request.getCrmRefNumber().trim().length() > 0) && (request.getCrmRefNumber().length() > 16))
			return "VC0002";

		if ((request.getCrmLeadRefNumber().trim().length() > 0) && (request.getCrmLeadRefNumber().length() > 16))
			return "VC0003";

		if ((request.getSpecialDealRefNumber().trim().length() > 0)
				&& (request.getSpecialDealRefNumber().length() > 16))
			return "VC0005";

		if (null == isNullOrValue(request.getSendingAgentCode()))
			return "V8001";

		if (request.getSendingAgentCode().trim().length() > 0 && request.getSendingAgentCode().trim().length() < 12)
			return "V5030";

		if ((request.getServiceProviderCode().trim().length() > 0) && (request.getServiceProviderCode().length() < 12))
			return "V5031";

		if ((request.getServiceProviderCode().trim().length() > 0)
				&& (!validateSpecialCharcter(request.getServiceProviderCode(), serProviderPattern)))
			return "V5059";

		if ((request.getSenderProfile() != 1) && (request.getSenderProfile() != 2))
			return "VC0006";

		if ((request.getReceiverProfile() != 1) && (request.getReceiverProfile() != 2))
			return "VC0007";

		if (0 == request.getReceiverType())
			return "V5033";

		if (0 == request.getSenderType())
			return "V5069";

		if ((request.getSenderType() != 1) && (request.getSenderType() != 2))
			return "VC0103";

		if ((request.getReceiverType() != 1) && (request.getReceiverType() != 2))
			return "VC0104";

		if (request.getSenderRefNumber().trim().length() > 0 && request.getSenderRefNumber().trim().length() > 16)
			return "V5117";

		if (null == isNullOrValue(request.getSenderFirstName()))
			return "V5026";

		if (request.getSenderFirstName().trim().length() > 0 && request.getSenderFirstName().trim().length() > 60)
			return "VC0009";

		if (request.getSenderMiddleName().trim().length() > 0 && request.getSenderMiddleName().trim().length() > 60)
			return "VC0010";

		if (null == isNullOrValue(request.getSenderLastName()))
			return "V5027";

		if (request.getSenderLastName().trim().length() > 0 && request.getSenderLastName().trim().length() > 60)
			return "VC0011";

		if (null == isNullOrValue(request.getSenderPOBox()))
			return "V5029";

		if (request.getSenderPOBox().trim().length() > 0 && request.getSenderPOBox().trim().length() > 10)
			return "VC0012";

		if (null == isNullOrValue(request.getSenderAddress1()))
			return "V5024";

		if (request.getSenderAddress1().trim().length() > 0 && request.getSenderAddress1().length() > 60)
			return "VC0013";

		if ((request.getSenderAddress2().length() > 0) && (request.getSenderAddress2().length() > 60))
			return "VC0014";

		if (null == isNullOrValue(request.getSenderCity()))
			return "V5025";

		if (request.getSenderCity().trim().length() > 0 && request.getSenderCity().length() > 60)
			return "VC0015";

		if (null == isNullOrValue(request.getSenderDistrict()))
			return "VC0114";

		if (request.getSenderDistrict().trim().length() > 0 && request.getSenderDistrict().length() > 60)
			return "VC0016";

		if (request.getSenderState().trim().length() > 0 && request.getSenderState().length() > 60)
			return "VC0024";

		if (request.getSenderCountryCode().length() != 2)
			return "V0013";

		if (request.getSenderZipCode().length() > 0 && request.getSenderZipCode().length() > 25)
			return "VC0017";

		if (null == isNullOrValue(request.getSenderMobile()) || request.getSenderMobile().trim().length() < 4)
			return "V5028";

		if (request.getSenderMobile().trim().length() > 20)
			return "VC0018";

		if (request.getSenderPhone().length() > 0 && request.getSenderPhone().length() > 40)
			return "VC0019";

		if (request.getSenderFax().length() > 0 && request.getSenderFax().length() > 40)
			return "VC0020";

		if (request.getSenderEmail().length() > 0 && request.getSenderEmail().length() > 60)
			return "VC0021";

		if (request.getSenderOtherInfo().length() > 0 && request.getSenderOtherInfo().length() > 60)
			return "VC0022";

		if (request.getSenderMessageToBeneficiary().length() > 0
				&& request.getSenderMessageToBeneficiary().length() > 250)
			return "VC0023";

		if (request.getSenderSelfDeclaration() != 1 && request.getSenderSelfDeclaration() != 2) {
			request.setSenderSelfDeclaration(1);
		}

		if (request.getSenderSelfDeclaration() != 1 && request.getSenderSelfDeclaration() != 2)
			return "VC0025";

		if (null == isNullOrValue(request.getSenderGender()))
			return "VC0026";

		if (request.getSenderGender().trim().length() > 1)
			return "VC0026";

		if (request.getSenderDateOfBirth().length() >= 0) {
			if (false == isValidDate(request.getSenderDateOfBirth())) {
				return "V5006";
			}
		}

		if (request.getSenderNationalityCode().length() != 2)
			return "V5016";

		if (request.getSenderOccupation().length() > 0 && request.getSenderOccupation().length() > 40)
			return "VC0027";

		if (request.getSenderPlaceOfBirth().length() > 0 && request.getSenderPlaceOfBirth().length() > 60)
			return "VC0028";

		if (null == isNullOrValue(request.getSenderEmployerName()))
			return "VC0029";

		if (request.getSenderEmployerName().length() > 0 && request.getSenderEmployerName().length() > 60)
			return "VC0030";

		if (null == isNullOrValue(request.getSenderEmployerPhone()))
			return "VC0031";

		if (request.getSenderEmployerPhone().length() > 0 && request.getSenderEmployerPhone().length() > 40)
			return "VC0032";

		if (request.getSenderID().length() > 0 && request.getSenderID().length() > 25)
			return "VC0033";

		if (request.getSenderIDType().length() > 0 && request.getSenderIDType().length() > 60)
			return "VC0034";

		if (request.getSenderIDOtherType().length() > 0 && request.getSenderIDOtherType().length() > 60)
			return "VC0035";

		if (null == isNullOrValue(request.getSenderIDIssuedBy()))
			return "VC0036";

		if (request.getSenderIDIssuedBy().length() > 0 && request.getSenderIDIssuedBy().length() > 60)
			return "VC0037";

		if (null == isNullOrValue(request.getSenderIDIssuedAt()))
			return "VC0038";

		if (request.getSenderIDIssuedAt().length() > 0 && request.getSenderIDIssuedAt().length() > 60)
			return "VC0039";

		if (null == isNullOrValue(request.getSenderIDIssueDate()))
			return "VC0040";

		if (request.getSenderIDIssueDate().trim().length() > 0) {
			if (false == isValidDate(request.getSenderIDIssueDate())) {
				return "V5004";
			}
		}

		if (request.getSenderIDValidThru().trim().length() > 0) {
			if (false == isValidDate(request.getSenderIDValidThru())) {
				return "V5007";
			}
		}

		if (null == isNullOrValue(request.getSenderIDValidThru()))
			return "VC0042";

		if (request.getSenderIDIssuanceCountry().length() != 2)
			return "VC0044";

		if (null == isNullOrValue(request.getSenderIDOtherInfo()))
			return "VC0045";

		if (request.getSenderIDOtherInfo().length() > 0 && request.getSenderIDOtherInfo().length() > 60)
			return "VC0046";

		if (request.getSenderIDRemarks().length() > 0 && request.getSenderIDRemarks().length() > 60)
			return "VC0047";

		if (request.getSenderID2().length() > 0 && request.getSenderID2().length() > 25)
			return "VC0048";

		if (request.getSenderID2Type().length() > 0 && request.getSenderID2Type().length() > 60)
			return "VC0049";

		if (request.getSenderID2IssuedBy().length() > 0 && request.getSenderID2IssuedBy().length() > 60)
			return "VC0050";

		if (request.getSenderID2IssuedAt().length() > 0 && request.getSenderID2IssuedAt().length() > 60)
			return "VC0051";

		/*
		 * if(request.getSenderID2IssueDate().length() > 0 &&
		 * request.getSenderID2IssueDate().length() > 10) return "VC0052";
		 */

		/*
		 * if(request.getSenderID2ValidThru().length() > 0 &&
		 * request.getSenderID2ValidThru().length() > 10) return "VC0053";
		 */

		if (request.getSenderID2IssuanceCountry().length() > 0 && request.getSenderID2IssuanceCountry().length() != 2)
			return "VC0054";

		if (request.getSenderID2OtherInfo().length() > 0 && request.getSenderID2OtherInfo().length() > 60)
			return "VC0055";

		if (request.getSenderID2Remarks().length() > 0 && request.getSenderID2Remarks().length() > 60)
			return "VC0056";

		if (request.getTaxRegNo().length() > 0 && request.getTaxRegNo().length() > 60)
			return "VC0057";

		if (request.getTaxRegNoIssuedCountry().length() > 0 && request.getTaxRegNoIssuedCountry().length() > 60)
			return "VC0058";

		if (request.getEkycVerifiedSource().length() > 0 && request.getEkycVerifiedSource().length() > 60)
			return "VC0059";

		if (request.getEkycValidatedSource().length() > 0 && request.getEkycValidatedSource().length() > 60)
			return "VC0060";

		/*
		 * if(request.geteKycValidatedOn().length() > 0 &&
		 * request.geteKycValidatedOn().length() > 10) return "VC0061";
		 */

		if (request.getReceiverRefNumber().length() > 0 && request.getReceiverRefNumber().length() > 12)
			return "VC0062";

		if (null == isNullOrValue(request.getReceiverLastName()))
			return "V5054";

		if (null == isNullOrValue(request.getReceiverFirstName())
				|| (!validateSpecialCharcter(request.getReceiverFirstName(), alphaNumPattern)
						|| request.getReceiverFirstName().length() > 60))
			return "V5126";

		if (null != isNullOrValue(request.getReceiverLastName())
				&& (!validateSpecialCharcter(request.getReceiverLastName(), alphaNumPattern)
						|| request.getReceiverLastName().length() > 60))
			return "V5124";

		if (null != isNullOrValue(request.getReceiverMiddleName())
				&& (!validateSpecialCharcter(request.getReceiverMiddleName(), alphaNumPattern)
						|| request.getReceiverMiddleName().length() > 60))
			return "V5123";

		if (request.getDeliveryOption() != 0 && request.getDeliveryOption() != 1) {
			request.setDeliveryOption(DEFAULT_INTEGER);
		}

		if (request.getDeliveryOption() != 0 && request.getDeliveryOption() != 1)
			return "V5053";

		if (null == isNullOrValue(request.getReceiverAddress1()) && request.getDeliveryOption() == 1)
			return "V5022";

		if (null != isNullOrValue(request.getReceiverAddress1())
				&& (!validateSpecialCharcter(request.getReceiverAddress1(), validateAddress)
						|| request.getReceiverAddress1().length() > 60))
			return "V5125";

		if (null != isNullOrValue(request.getReceiverAddress2())
				&& (!validateSpecialCharcter(request.getReceiverAddress2(), validateAddress)
						|| request.getReceiverAddress2().length() > 60))
			return "V5127";

		if (null == isNullOrValue(request.getReceiverCity()) && request.getDeliveryOption() == 1)
			return "V5023";

		if (null != isNullOrValue(request.getReceiverCity())
				&& (!validateSpecialCharcter(request.getReceiverCity(), alphaNumPattern)
						|| request.getReceiverCity().length() > 60))
			return "V5128";

		if (null == isNullOrValue(request.getReceiverState()) && request.getDeliveryOption() == 1)
			return "V5052";

		if (null == isNullOrValue(request.getReceiverCountryCode())
				|| (!validateSpecialCharcter(request.getReceiverCountryCode(), alphaNumPattern)
						|| request.getReceiverCountryCode().length() != 2))
			return "V0013";

		if (null != isNullOrValue(request.getReceiverDistrict())
				&& (!validateSpecialCharcter(request.getReceiverDistrict(), alphaNumPattern)
						|| request.getReceiverDistrict().length() > 60))
			return "V5130";

		if (null == isNullOrValue(request.getReceiverState()) && request.getDeliveryOption() == 1)
			return "V5052";

		if (null != isNullOrValue(request.getReceiverState())
				&& (!validateSpecialCharcter(request.getReceiverState(), alphaNumericSpace)
						|| request.getReceiverState().length() > 60))
			return "V5129";

		if (null == isNullOrValue(request.getReceiverPOBox()) && null != isNullOrValue(request.getReceiverAddress1()))
			return "V5131";

		if (null != isNullOrValue(request.getReceiverPOBox())
				&& (!validateSpecialCharcter(request.getReceiverPOBox(), alphaNumPattern)
						|| request.getReceiverPOBox().length() > 10))
			return "V5131";

		if (null != isNullOrValue(request.getReceiverZipCode())
				&& (!validateSpecialCharcter(request.getReceiverZipCode(), alphaNumPattern)
						|| request.getReceiverZipCode().length() > 25))
			return "V5132";

		if (null != isNullOrValue(request.getReceiverMobile())
				&& (!validateSpecialCharcter(request.getReceiverMobile(), phoneMobilepattern)
						|| request.getReceiverMobile().length() > 20))
			return "V5133";

		if (null != isNullOrValue(request.getReceiverPhone())
				&& (!validateSpecialCharcter(request.getReceiverPhone(), phoneMobilepattern)
						|| request.getReceiverPhone().length() > 40))
			return "V5134";

		if (null != isNullOrValue(request.getReceiverFax())
				&& (!validateSpecialCharcter(request.getReceiverFax(), faxpattern)
						|| request.getReceiverFax().length() > 40))
			return "V5135";

		if (null != isNullOrValue(request.getReceiverEmail())
				&& (!validateSpecialCharcter(request.getReceiverEmail(), validateEmail)
						|| request.getReceiverEmail().length() > 60))
			return "V5136";

		if (request.getReceiverNationalityCode().length() != 2
				|| (!validateSpecialCharcter(request.getReceiverNationalityCode(), alphaNumPattern)))
			return "V5138";

		if (null != isNullOrValue(request.getReceiverGender())
				&& ((!validateSpecialCharcter(request.getReceiverGender(), alphaPattern))
						|| (request.getReceiverGender().length() > 1)))
			return "VC0100";

		if (request.getReceiverDateOfBirth().trim().length() > 0) {
			if (false == isValidDate(request.getReceiverDateOfBirth())) {
				return "V5005";
			}
		}

		if (null != isNullOrValue(request.getReceiverOccupation()) && request.getReceiverOccupation().length() > 40)
			return "VC0081";

		if (null != isNullOrValue(request.getReceiverSenderRelationship())
				&& (!validateSpecialCharcter(request.getReceiverSenderRelationship(), alphaNumPattern)
						|| request.getReceiverSenderRelationship().trim().length() > 25))
			return "V5139";

		if (null != isNullOrValue(request.getReceiverID()) && request.getReceiverID().length() > 25)
			return "VC0083";

		if (null != isNullOrValue(request.getReceiverIDType()) && request.getReceiverIDType().length() > 60)
			return "VC0084";

		if (null == isNullOrValue(request.getReceiverBankAccountNo())
				|| (!validateSpecialCharcter(request.getReceiverBankAccountNo(), alphaNumPattern)
						|| request.getReceiverBankAccountNo().length() > 60))
			return "V5155";

		if (null == isNullOrValue(request.getReceiverBankAccountName())
				|| (!validateSpecialCharcter(request.getReceiverBankAccountName(), alphaNumPattern)
						|| request.getReceiverBankAccountName().length() > 120))
			return "V5156";

		if (request.getReceiverBankCode().replaceAll("\\s", "").length() < 12)
			return "V0016";

		if ((!validateSpecialCharcter(request.getReceiverBankCode(), serProviderPattern)
				|| request.getReceiverBankCode().replaceAll("\\s", "").length() > 12))
			return "V5157";

		if (request.getReceiverBankBranchCode().replaceAll("\\s", "").length() < 6)
			return "V5001";

		if (request.getReceiverBankBranchCode().trim().length() > 12)
			return "VC0087";

		if (null != isNullOrValue(request.getReceiverBranchIdentifier())
				&& (!validateSpecialCharcter(request.getReceiverBranchIdentifier(), alphaNumPattern)
						|| request.getReceiverBranchIdentifier().length() > 25))
			return "V5149";

		if (null == isNullOrValue(request.getReceivingAgentCode()))
			return "E9104";

		if (request.getReceivingAgentCode().trim().length() > 0
				&& (!validateSpecialCharcter(request.getReceivingAgentCode(), serProviderPattern)))
			return "VC0105";

		if (request.getReceivingAgentCode().trim().length() > 0 && request.getReceivingAgentCode().trim().length() < 12)
			return "V5076";

		if (request.getSourceOfIncome().length() != 3)
			return "V5017";

		if (request.getPurposeOfTxn().length() != 3)
			return "V5013";

		if (request.getPurposeOfTxnDetails().trim().length() > 60)
			return "VC0092";

		if (null == isNullOrValue(request.getPaymentMode()))
			request.setPaymentMode("CQ");

		if (request.getPaymentMode().length() != 2)
			return "V5011";

		if (request.getPayinCcyCode().length() != 3)
			return "V5010";

		if (request.getPayoutCcyCode().length() != 3)
			return "V5012";

		if (validateMinimumAmount(request.getPayinAmount()) == false
				&& validateMinimumAmount(request.getPayoutAmount()) == false) {
			return "V5051";
		}

		if (request.getOverrideRateFlag() == 2) {
			if (validateMinimumAmount(request.getPayinAmount()) == false
					|| validateMinimumAmount(request.getPayoutAmount()) == false) {
				return "V5075";
			}
		}

		if (validateMinimumAmount(request.getPayinAmount())
				&& !validateSpecialCharcter(Double.toString(request.getPayinAmount()), amountDecimal))
			return "V5113";

		if (validateMinimumAmount(request.getPayoutAmount())
				&& !validateSpecialCharcter(Double.toString(request.getPayoutAmount()), amountDecimal))
			return "V5114";

		if (Double.toString(request.getTax()).trim().length() > 0) {
			if (!validateSpecialCharcter(Double.toString(request.getTax()), amountPattern)) {
				return "VC0093";
			}
		}

		if (Double.toString(request.getCardCharges()).trim().length() > 0) {
			if (!validateSpecialCharcter(Double.toString(request.getCardCharges()), amountPattern)) {
				return "VC0094";
			}
		}

		if (Double.toString(request.getOtherCharges()).trim().length() > 0) {
			if (!validateSpecialCharcter(Double.toString(request.getOtherCharges()), amountPattern)) {
				return "VC0095";
			}
		}

		if (Double.toString(request.getAdditionalCharges()).trim().length() > 0) {
			if (!validateSpecialCharcter(Double.toString(request.getAdditionalCharges()), amountPattern)) {
				return "VC0096";
			}
		}

		if (Double.toString(request.getCommission()).trim().length() > 0) {
			if (!validateSpecialCharcter(Double.toString(request.getCommission()), amountPattern)) {
				return "VC0097";
			}
		}

		if (Double.toString(request.getPartnerCommission()).trim().length() > 0) {
			if (!validateSpecialCharcter(Double.toString(request.getPartnerCommission()), amountPattern)) {
				return "VC0098";
			}
		}

		if (validateMinimumAmount(request.getTotalPayinAmount())
				&& !validateSpecialCharcter(Double.toString(request.getTotalPayinAmount()), amountDecimal))
			return "V5115";

		if (request.getPromotionCcyCode().trim().length() > 0 && request.getPromotionCcyCode().trim().length() > 3)
			return "VC0099";

		if (request.getSenderID2IssueDate().trim().length() > 0) {
			if (false == isValidDate(request.getSenderID2IssueDate()))
				return "V5004";
		}

		if (request.getSenderID2ValidThru().trim().length() > 0) {
			if (false == isValidDate(request.getSenderID2ValidThru()))
				return "V5007";
		}

		return SUCCESS_CODE;
	}

	public static String validateCreateTxnV2Request(CreateTransactionRequest request) {

		if (request.getValidateOnlyFlag() == 0)
			return "V5045";

		if (request.getValidateOnlyFlag() != 1 && request.getValidateOnlyFlag() != 2)
			return "V5045";

		if (2 == request.getValidateOnlyFlag()) {
			if (null == isNullOrValue(request.getPartnerTxnRefNo()))
				return "V5032";

			if (request.getPartnerTxnRefNo().trim().length() > 0 && request.getPartnerTxnRefNo().trim().length() > 20)
				return "V0010";
		}

		if (request.getOverrideRateFlag() == 0)
			return "V5046";

		if (request.getOverrideRateFlag() != 1 && request.getOverrideRateFlag() != 2)
			return "V5046";

		if (request.getOverrideRateFlag() == 2) {
			if (validateMinimumAmount(request.getXchgRatePayin2Payout()) == false) {
				return "V0015";
			}
		}

		if (request.getOverrideRateFlag() == 2) {
			if (validateMinimumAmount(request.getPayinAmount()) == false
					&& validateMinimumAmount(request.getPayoutAmount()) == false) {
				return "V5075";
			}
		}

		if (request.getRequiresAuthorization() != 0 && request.getRequiresAuthorization() != 1)
			return "V5150";

		if ((request.getCrmRefNumber().trim().length() > 0) && (request.getCrmRefNumber().length() > 16))
			return "VC0002";

		if ((request.getCrmLeadRefNumber().trim().length() > 0) && (request.getCrmLeadRefNumber().length() > 16))
			return "VC0003";

		if ((request.getSpecialDealRefNumber().trim().length() > 0)
				&& (request.getSpecialDealRefNumber().length() > 16))
			return "VC0005";

		if (null == isNullOrValue(request.getSendingAgentCode()))
			return "V5120";

		if (request.getSendingAgentCode().trim().length() > 0 && request.getSendingAgentCode().trim().length() < 12)
			return "V5030";

		if (null != isNullOrValue(request.getServiceProviderCode())
				&& (!validateSpecialCharcter(request.getServiceProviderCode(), serProviderPattern)
						|| request.getServiceProviderCode().replaceAll("\\s", "").length() > 12))
			return "V5059";

		if ((request.getSenderProfile() != 1) && (request.getSenderProfile() != 2))
			return "VC0006";

		if ((request.getReceiverProfile() != 1) && (request.getReceiverProfile() != 2))
			return "VC0007";

		if (0 == request.getReceiverType())
			return "V5033";

		if (0 == request.getSenderType())
			return "V5069";

		if ((request.getSenderType() != 1) && (request.getSenderType() != 2))
			return "VC0103";

		if ((request.getReceiverType() != 1) && (request.getReceiverType() != 2))
			return "VC0104";

		if (null == isNullOrValue(request.getSenderRefNumber()))
			return "V5116";

		if (request.getSenderRefNumber().trim().length() > 0 && request.getSenderRefNumber().trim().length() > 16)
			return "V5117";

		if (null != isNullOrValue(request.getSenderMessageToBeneficiary())
				&& (!validateSpecialCharcter(request.getSenderMessageToBeneficiary(), alphaNumPattern)
						|| request.getSenderMessageToBeneficiary().length() > 250))
			return "V5121";

		if (request.getSenderSelfDeclaration() != 1 && request.getSenderSelfDeclaration() != 2) {
			request.setSenderSelfDeclaration(1);
		}

		if (validateMinimumAmount(request.getPayinAmount()) == false
				&& validateMinimumAmount(request.getPayoutAmount()) == false) {
			return "V5051";
		}

		if (request.getDeliveryOption() != 0 && request.getDeliveryOption() != 1) {
			return "V5053";
		}

		if (request.getReceiverRefNumber().length() > 0 && request.getReceiverRefNumber().length() > 12)
			return "VC0062";

		if (request.getReceiverRefNumber().trim().length() == 0) {

			if (null == isNullOrValue(request.getReceiverFirstName())
					|| (!validateSpecialCharcter(request.getReceiverFirstName(), alphaNumPattern)
							|| request.getReceiverFirstName().length() > 60))
				return "V5126";

			if (null == isNullOrValue(request.getReceiverLastName())
					&& (!validateSpecialCharcter(request.getReceiverLastName(), alphaNumPattern)
							|| request.getReceiverLastName().length() > 60))
				return "V5124";

			if (null != isNullOrValue(request.getReceiverMiddleName())
					&& (!validateSpecialCharcter(request.getReceiverMiddleName(), alphaNumPattern)
							|| request.getReceiverMiddleName().length() > 60))
				return "V5123";

			if (null == isNullOrValue(request.getReceiverAddress1()) && request.getDeliveryOption() == 1)
				return "V5022";

			if (null != isNullOrValue(request.getReceiverAddress1())
					&& (!validateSpecialCharcter(request.getReceiverAddress1(), validateAddress)
							|| request.getReceiverAddress1().length() > 60))
				return "V5125";

			if (null != isNullOrValue(request.getReceiverAddress2())
					&& (!validateSpecialCharcter(request.getReceiverAddress2(), validateAddress)
							|| request.getReceiverAddress2().length() > 60))
				return "V5127";

			if (null == isNullOrValue(request.getReceiverCity()) && request.getDeliveryOption() == 1)
				return "V5023";

			if (null != isNullOrValue(request.getReceiverCity())
					&& (!validateSpecialCharcter(request.getReceiverCity(), alphaNumPattern)
							|| request.getReceiverCity().length() > 60))
				return "V5128";

			if (null == isNullOrValue(request.getReceiverCountryCode())
					|| (!validateSpecialCharcter(request.getReceiverCountryCode(), alphaNumPattern)
							|| request.getReceiverCountryCode().length() != 2))
				return "V0013";

			if (request.getReceiverCountryCode().equalsIgnoreCase("IN")) {
				if (null == request.getReceiverState() || request.getReceiverState().trim().length() == 0)
					return "V5052";
			}

			if (null != isNullOrValue(request.getReceiverDistrict())
					&& (!validateSpecialCharcter(request.getReceiverDistrict(), alphaNumPattern)
							|| request.getReceiverDistrict().length() > 60))
				return "V5130";

			if (null == isNullOrValue(request.getReceiverState()) && request.getDeliveryOption() == 1)
				return "V5052";

			if (null != isNullOrValue(request.getReceiverState())
					&& (!validateSpecialCharcter(request.getReceiverState(), alphaNumericSpace)
							|| request.getReceiverState().length() > 60))
				return "V5129";

			if (null == isNullOrValue(request.getReceiverPOBox())
					&& null != isNullOrValue(request.getReceiverAddress1()))
				return "V5131";

			if (null != isNullOrValue(request.getReceiverPOBox())
					&& (!validateSpecialCharcter(request.getReceiverPOBox(), alphaNumPattern)
							|| request.getReceiverPOBox().length() > 10))
				return "V5131";

			if (null != isNullOrValue(request.getReceiverZipCode())
					&& (!validateSpecialCharcter(request.getReceiverZipCode(), alphaNumPattern)
							|| request.getReceiverZipCode().length() > 25))
				return "V5131";

			if (validateMobilePhone(request.getReceiverMobile()) == false
					&& validateMobilePhone(request.getReceiverPhone()) == false)
				return "V5152";

			if (null != isNullOrValue(request.getReceiverMobile())
					&& (!validateSpecialCharcter(request.getReceiverMobile(), phoneMobilepattern)
							|| request.getReceiverMobile().length() > 20))
				return "V5133";

			if (null != isNullOrValue(request.getReceiverPhone())
					&& (!validateSpecialCharcter(request.getReceiverPhone(), phoneMobilepattern)
							|| request.getReceiverPhone().length() > 40))
				return "V5134";

			if (null != isNullOrValue(request.getReceiverFax())
					&& (!validateSpecialCharcter(request.getReceiverFax(), faxpattern)
							|| request.getReceiverFax().length() > 40))
				return "V5135";

			if (null != isNullOrValue(request.getReceiverEmail())
					&& (!validateSpecialCharcter(request.getReceiverEmail(), validateEmail)
							|| request.getReceiverEmail().length() > 60))
				return "V5136";

			if (request.getReceiverNationalityCode().length() != 2
					|| (!validateSpecialCharcter(request.getReceiverNationalityCode(), alphaNumPattern)))
				return "V5138";

			if (null != isNullOrValue(request.getReceiverGender())
					&& ((!validateSpecialCharcter(request.getReceiverGender(), alphaPattern))
							|| (request.getReceiverGender().length() > 1)))
				return "VC0100";

			if (request.getReceiverDateOfBirth().trim().length() > 0) {
				if (false == isValidDate(request.getReceiverDateOfBirth())) {
					return "V5005";
				}
			}

			if (null != isNullOrValue(request.getReceiverOccupation()) && request.getReceiverOccupation().length() > 40)
				return "VC0081";

			if (null != isNullOrValue(request.getReceiverSenderRelationship())
					&& (!validateSpecialCharcter(request.getReceiverSenderRelationship(), alphaNumPattern)
							|| request.getReceiverSenderRelationship().trim().length() > 2))
				return "V5139";

			if (null != isNullOrValue(request.getReceiverID()) && request.getReceiverID().length() > 25)
				return "VC0083";

			if (null != isNullOrValue(request.getReceiverIDType()) && request.getReceiverIDType().length() > 60)
				return "VC0084";

			if (null == isNullOrValue(request.getReceiverBankAccountNo())
					|| (!validateSpecialCharcter(request.getReceiverBankAccountNo(), alphaNumPattern)
							|| request.getReceiverBankAccountNo().length() > 60))
				return "V5155";

			if (null == isNullOrValue(request.getReceiverBankAccountName())
					|| (!validateSpecialCharcter(request.getReceiverBankAccountName(), alphaNumPattern)
							|| request.getReceiverBankAccountName().length() > 120))
				return "V5156";

			if (request.getReceiverBankCode().replaceAll("\\s", "").length() < 12)
				return "V0016";

			if ((!validateSpecialCharcter(request.getReceiverBankCode(), serProviderPattern)
					|| request.getReceiverBankCode().replaceAll("\\s", "").length() > 12))
				return "V5157";

			if (request.getReceiverBankBranchCode().replaceAll("\\s", "").length() < 6)
				return "V5001";

			if (null != isNullOrValue(request.getReceiverBranchIdentifier())
					&& (!validateSpecialCharcter(request.getReceiverBranchIdentifier(), alphaNumPattern)
							|| request.getReceiverBranchIdentifier().length() > 25))
				return "V5148";

			if (request.getReceivingAgentCode().trim().length() == 0)
				return "V5076";

			if (request.getReceivingAgentCode().trim().length() > 0
					&& (!validateSpecialCharcter(request.getReceivingAgentCode(), serProviderPattern)
							|| request.getReceivingAgentCode().replaceAll("\\s", "").length() > 12))
				return "V5076";

			if (null != isNullOrValue(request.getReceiverIDIssuedAt())
					&& (!validateSpecialCharcter(request.getReceiverIDIssuedAt(), alphaNumPattern)
							|| request.getReceiverIDIssuedAt().length() > 60))
				return "V5145";

			if (request.getReceiverIDIssueDate().trim().length() > 0) {
				if (false == isValidDate(request.getReceiverIDIssueDate())) {
					return "V5086";
				}
			}

			if (request.getReceiverIDValidThru().trim().length() > 0) {
				if (false == isValidDate(request.getReceiverIDValidThru())) {
					return "V5087";
				}
			}

			if (null != isNullOrValue(request.getReceiverIDIssuanceCountry())
					&& (!validateSpecialCharcter(request.getReceiverIDIssuanceCountry(), alphaNumPattern)
							|| request.getReceiverIDIssuanceCountry().length() != 2))
				return "V5148";

			/*
			 * if (null != isNullOrValue(request.getReceiverDescription()) &&
			 * (!validateSpecialCharcter(request.getReceiverDescription(),alphaNumPattern)
			 * ||request.getReceiverDescription().length() > 60 )) return "V5137"; not
			 * present in paas as ip param in api
			 */

		}

		if (request.getSourceOfIncome().length() != 3)
			return "V5017";

		if (request.getPurposeOfTxn().length() != 3)
			return "V5013";

		if (null != isNullOrValue(request.getPurposeOfTxnDetails())
				&& (!validateSpecialCharcter(request.getPurposeOfTxnDetails(), alphaNumPattern)
						|| request.getPurposeOfTxnDetails().length() > 60))
			return "V5122";

		if (request.getPaymentMode().length() != 2
				|| !validateSpecialCharcter(request.getPaymentMode().toUpperCase(), paymentMode))
			return "V5151";

		if (request.getOverrideRateFlag() == 2) {
			if (validateMinimumAmount(request.getXchgRatePayin2Payout()) == false) {
				return "V0015";
			}

			if (!validateSpecialCharcter(String.valueOf(request.getXchgRatePayin2Payout()), rateDecimal))
				return "V5112";
		}

		if (request.getPayinCcyCode().length() != 3)
			return "V5010";

		if (request.getPayoutCcyCode().length() != 3)
			return "V5012";

		if (validateMinimumAmount(request.getPayinAmount()) == false
				&& validateMinimumAmount(request.getPayoutAmount()) == false) {
			return "V5051";
		}

		if (validateMinimumAmount(request.getPayinAmount())
				&& !validateSpecialCharcter(String.valueOf(request.getPayinAmount()), amountDecimal))
			return "V5113";

		if (validateMinimumAmount(request.getPayoutAmount())
				&& !validateSpecialCharcter(String.valueOf(request.getPayoutAmount()), amountDecimal))
			return "V5114";

		if (validateMinimumAmount(request.getTotalPayinAmount())
				&& !validateSpecialCharcter(String.valueOf(request.getTotalPayinAmount()), amountDecimal))
			return "V5115";

		if (request.getPromotionCcyCode().trim().length() > 0 && request.getPromotionCcyCode().trim().length() > 3)
			return "VC0099";

		return SUCCESS_CODE;
	}

	public static String isNullOrValue(String value) {
		if (null == value || value.trim().length() == 0)
			return null;
		return value.trim();
	}

	public static boolean validateMinimumAmount(Double value) {
		if (null == value || value <= 0)
			return false;
		return true;
	}

	public static boolean isValidDate(String value) {
		// Oct 27 2016 10:32:30:020PM
		String space = " ";
		String colon = ":";

		if (value.trim().length() < 26)
			return false;
		if (value.substring(0, 3).replaceAll("\\s", "").length() < 3)
			return false;
		if (!value.substring(3, 4).equals(space))
			return false;
		if (false == isNumeric(value.substring(4, 6).trim()))
			return false;
		if (Integer.parseInt(value.substring(4, 6).trim()) > 31)
			return false;
		if (!value.substring(6, 7).equals(space))
			return false;
		if (false == isNumeric(value.substring(7, 11)))
			return false;
		if (Integer.parseInt(value.substring(7, 11)) < Calendar.getInstance().get(Calendar.YEAR) % 100)
			return false;
		if (!value.substring(11, 12).equals(space))
			return false;
		if (false == isNumeric(value.substring(12, 14).trim()))
			return false;
		if (Integer.parseInt(value.substring(12, 14).trim()) > 23)
			return false;
		if (!value.substring(14, 15).equals(colon))
			return false;
		if (false == isNumeric(value.substring(15, 17)))
			return false;
		if (Integer.parseInt(value.substring(15, 17)) > 59)
			return false;
		if (!value.substring(17, 18).equals(colon))
			return false;
		if (false == isNumeric(value.substring(18, 20)))
			return false;
		if (Integer.parseInt(value.substring(18, 20)) > 59)
			return false;
		if (!value.substring(20, 21).equals(colon))
			return false;
		if (false == isNumeric(value.substring(21, 24)))
			return false;
		if (Integer.parseInt(value.substring(21, 24)) > 999)
			return false;
		if (!(value.substring(24, 26).equals("AM") || value.substring(24, 26).equals("PM")))
			return false;
		return true;
	}

	public static boolean validateSpecialCharcter(String value, Pattern pattern) {
		Matcher matcher = pattern.matcher(value);
		return matcher.matches();
	}

	public static boolean isNumeric(String value) {

		try {
			NumberFormat.getInstance().parse(value.trim());
		} catch (java.text.ParseException e) {
			return false;
		}

		return true;
	}

	public static boolean validateMobilePhone(String value) {
		if (null != value && value.trim().length() != 0) {
			if (value.length() <= 0)
				return false;
			else
				return true;
		} else
			return false;
	}

	public static String validateCreate(CreateTransactionRequest request) {
		if (null == isNullOrValue(request.getServiceType()))
			return "VC0088";

		if (null == isNullOrValue(request.getProductType()))
			return "VC0089";

		if (request.getServiceType().trim().length() != 4)
			return "VC0090";

		if (request.getProductType().trim().length() > 12)
			return "VC0091";

		return SUCCESS_CODE;
	}

	/**
	 * 
	 * @param serviceType
	 * @param productType
	 * @param props
	 * @return
	 */
	public static boolean validateProductType(String serviceType, String productType, Environment props) {
		return getCSVfromPropsFile(serviceType + ".PRODUCT_TYPES", props).contains(productType);
	}
/*
	public static CancelTransactionResponse setNullValuesforCancellationResponse(
			CancelTransactionResponse cancelTransactionResponse) {

		cancelTransactionResponse.setInstrumentType(null);
		cancelTransactionResponse.setTxnType(null);
		cancelTransactionResponse.setDeliveryChannel(null);
		cancelTransactionResponse.setDeliveryOption(null);
		cancelTransactionResponse.setCancelReasonCode(null);
		cancelTransactionResponse.setBaseCcyCode(null);
		cancelTransactionResponse.setXchgRatePayinToPayout(null);
		cancelTransactionResponse.setXchgRateUSDToSettlementBuy(null);
		cancelTransactionResponse.setXchgRateSettlementToSPCcy(null);
		cancelTransactionResponse.setXmCancellationChargesInLC(null);
		cancelTransactionResponse.setXmRefundPayinAmount(null);
		cancelTransactionResponse.setXmRefundCommission(null);
		cancelTransactionResponse.setXmRefundTax(null);
		cancelTransactionResponse.setXmRefundOtherCharges(null);
		cancelTransactionResponse.setXmCancellationCharges(null);
		cancelTransactionResponse.setXmRefundCardCharges(null);
		cancelTransactionResponse.setXmRefundAdditionalCharges(null);
		cancelTransactionResponse.setXmRefundPayinAmountInSCcy(null);
		cancelTransactionResponse.setXmCancellationChargesInSCcy(null);
		cancelTransactionResponse.setXmRefundCardChargesInSCcy(null);
		cancelTransactionResponse.setXmRefundAddlChargesInSCcy(null);
		cancelTransactionResponse.setPayin2BaseCcyRate(null);
		cancelTransactionResponse.setRefundPayinAmountInBaseCcy(null);
		cancelTransactionResponse.setSpCcyCode(null);
		cancelTransactionResponse.setRefundPayinAmountInSPCcy(null);
		cancelTransactionResponse.setRefundCommissionInSPCcy(null);
		cancelTransactionResponse.setRefundTaxInSPCcy(null);
		cancelTransactionResponse.setRefundOtherChargesInSPCcy(null);
		cancelTransactionResponse.setCancellationChargesInSPCcy(null);
		cancelTransactionResponse.setRefundCardChargesInSPCcy(null);
		cancelTransactionResponse.setRefundAddlChargesInSPCcy(null);
		cancelTransactionResponse.setDraweeBankBranchCode(null);
		cancelTransactionResponse.setCreatedBy(null);
		cancelTransactionResponse.setInstrumentNo(null);
		cancelTransactionResponse.setReturnCode(null);
		cancelTransactionResponse.setReturnMessage(null);

		return cancelTransactionResponse;
	}*/

	/* Request generated for ReXPI API call Starts Here */
	
	/* ReXPI - Release API Request */
	public static String generateSOAPformatForRelease(ReleaseTransactionRequest releaseTransactionRequest) {

		String releaseTxnRequest = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:rem=\"http://rexpi.uaex.com/messages/remit\">"
				+ "<soapenv:Header/>" + "<soapenv:Body>" + "<rem:releaseTransactionRequest>" + "<rem:txnRefNo>"
				+ releaseTransactionRequest.getTxnRefNo() + "</rem:txnRefNo>" + "<rem:releaseFlag>"
				+ releaseTransactionRequest.getReleaseFlag() + "</rem:releaseFlag>" + "<rem:revertCancelWithLock>"
				+ releaseTransactionRequest.getRevertCancelWithLock() + "</rem:revertCancelWithLock>"
				+ "<rem:controlFlag>" + releaseTransactionRequest.getControlFlag() + "</rem:controlFlag>"
				+ "<rem:reservedParam1>" + releaseTransactionRequest.getReservedParam1() + "</rem:reservedParam1>"
				+ "<rem:reservedParam2>" + releaseTransactionRequest.getReservedParam2() + "</rem:reservedParam2>"
				+ "<rem:reservedParam3>" + releaseTransactionRequest.getReservedParam3() + "</rem:reservedParam3>"
				+ "<rem:reservedParam4>" + releaseTransactionRequest.getReservedParam4() + "</rem:reservedParam4>"
				+ "<rem:reservedParam5>" + releaseTransactionRequest.getReservedParam5() + "</rem:reservedParam5>"
				+ "<rem:reservedParam6>" + releaseTransactionRequest.getReservedParam6() + "</rem:reservedParam6>"
				+ "<rem:reservedParam7>" + releaseTransactionRequest.getReservedParam7() + "</rem:reservedParam7>"
				+ "<rem:reservedParam8>" + releaseTransactionRequest.getReservedParam8() + "</rem:reservedParam8>"
				+ "<rem:reservedParam9>" + releaseTransactionRequest.getReservedParam9() + "</rem:reservedParam9>"
				+ "<rem:reservedParam10>" + releaseTransactionRequest.getReservedParam10() + "</rem:reservedParam10>"
				+ "</rem:releaseTransactionRequest>" + "</soapenv:Body>" + "</soapenv:Envelope>";

		System.out.println("releaseTxnRequest : " + releaseTxnRequest);

		return releaseTxnRequest;
	}

	/* ReXPI - Lock API Request */
	public static String generateSOAPformatForLockTxn(LockTransactionRequest lockTransactionRequest) {

		String lockRequestxml = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:rem=\"http://rexpi.uaex.com/messages/remit\">"
				+ "<soapenv:Header/>" 
				+ "<soapenv:Body>" 
				+ "<rem:lockUnlockTransactionRequest>" 
				+ "<rem:txnRefNo>"+ lockTransactionRequest.getTxnRefNo() + "</rem:txnRefNo>" 
				+ "<rem:lockUnlockFlag>"+ lockTransactionRequest.getLockUnlockFlag() + "</rem:lockUnlockFlag>" 
				+ "<rem:controlFlag>"+ lockTransactionRequest.getControlFlag() + "</rem:controlFlag>" 
				+ "<rem:reservedParam1>" + lockTransactionRequest.getReservedParam1() + "</rem:reservedParam1>" 
				+ "<rem:reservedParam2>"+ lockTransactionRequest.getReservedParam2() + "</rem:reservedParam2>" 
				+ "<rem:reservedParam3>" + lockTransactionRequest.getReservedParam3() + "</rem:reservedParam3>" 
				+ "<rem:reservedParam4>"+ lockTransactionRequest.getReservedParam4() + "</rem:reservedParam4>" 
				+ "<rem:reservedParam5>" + lockTransactionRequest.getReservedParam5() + "</rem:reservedParam5>" 
				+ "<rem:reservedParam6>"+ lockTransactionRequest.getReservedParam6() + "</rem:reservedParam6>" 
				+ "<rem:reservedParam7>"+ lockTransactionRequest.getReservedParam7() + "</rem:reservedParam7>" 
				+ "<rem:reservedParam8>"+ lockTransactionRequest.getReservedParam8() + "</rem:reservedParam8>" 
				+ "<rem:reservedParam9>"+ lockTransactionRequest.getReservedParam9() + "</rem:reservedParam9>" 
				+ "<rem:reservedParam10>"+ lockTransactionRequest.getReservedParam10() + "</rem:reservedParam10>"
				+ "</rem:lockUnlockTransactionRequest>" 
				+ "</soapenv:Body>" 
				+ "</soapenv:Envelope>";

		return lockRequestxml;
	}
	
	/* ReXPI - Txn Enquiry Request */
	 public static String generateSOAPformatForTxnEnquiry(TransactionEnquiryRequest request) {
			
	      String reqxml = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:rem=\"http://rexpi.uaex.com/messages/remit\">"+
		    	   "<soapenv:Header/>"
		    	   +"<soapenv:Body>"
		    	      +"<rem:transactionEnquiryRequest>"
		    	         +"<rem:txnRefNo>"+request.getTxnRefNo()+"</rem:txnRefNo>"
		    	         +"<rem:partnerTxnRefNo></rem:partnerTxnRefNo>"
		    	         +"<rem:CRMRefNumber></rem:CRMRefNumber>"
		    	         +"<rem:CRMLeadRefNumber></rem:CRMLeadRefNumber>"
		    	         +"<rem:sendCancelFlag>"+request.getSendReceiveCancelFlag()+"</rem:sendCancelFlag>"
		    	         +"<rem:statusHistoryFlag>"+request.getStatusHistoryFlag()+"</rem:statusHistoryFlag>"
		    	         +"<rem:controlFlag></rem:controlFlag>"
		    	         +"<rem:reservedParam1></rem:reservedParam1>"
		    	         +"<rem:reservedParam2></rem:reservedParam2>"
		    	         +"<rem:reservedParam3></rem:reservedParam3>"
		    	         +"<rem:reservedParam4></rem:reservedParam4>"
		    	         +"<rem:reservedParam5></rem:reservedParam5>"
		    	         +"<rem:reservedParam6></rem:reservedParam6>"
		    	         +"<rem:reservedParam7></rem:reservedParam7>"
		    	         +"<rem:reservedParam8></rem:reservedParam8>"
		    	         +"<rem:reservedParam9></rem:reservedParam9>"
		    	         +"<rem:reservedParam10></rem:reservedParam10>"
		    	      +"</rem:transactionEnquiryRequest>"
		    	      +"</soapenv:Body>"
		    	      +"</soapenv:Envelope>" ;  
		
		return reqxml;
		
	  }
	
	/* Request generated for ReXPI API call Ends Here */
}
