package com.paas.dto;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentCalculatorDTO {

	private String senderCountryCode;
	private String receiverCountryCode;
	private String serviceType;
	private String productType;
	private String payinCcyCode;
	private String payoutCcyCode;
	private String payinAmount;
	private String payoutAmount;
	private String xchgRate;
	private String xchgRateFormatFlag;
	private Double commission;
	private Double tax;
	private Double cardCharges;
	private Double additionalCharges;
	private Double otherCharges;
	private Double totalPayinAmount;
	private String paymentMode;
	private String rateOtherInfo1;
	private String rateOtherInfo2;
	private String rateOtherInfo3;
	private String rateOtherInfo4;
	private String rateOtherInfo5;
	private String reservedParam1;
	private String reservedParam2;
	private String reservedParam3;
	private String reservedParam4;
	private String reservedParam5;
	private String reservedParam6;
	private String reservedParam7;
	private String reservedParam8;
	private String reservedParam9;
	private String reservedParam10;

	public String getSenderCountryCode() {
		return senderCountryCode;
	}

	public void setSenderCountryCode(String senderCountryCode) {
		this.senderCountryCode = senderCountryCode;
	}

	public String getReceiverCountryCode() {
		return receiverCountryCode;
	}

	public void setReceiverCountryCode(String receiverCountryCode) {
		this.receiverCountryCode = receiverCountryCode;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getPayinCcyCode() {
		return payinCcyCode;
	}

	public void setPayinCcyCode(String payinCcyCode) {
		this.payinCcyCode = payinCcyCode;
	}

	public String getPayoutCcyCode() {
		return payoutCcyCode;
	}

	public void setPayoutCcyCode(String payoutCcyCode) {
		this.payoutCcyCode = payoutCcyCode;
	}

	public String getPayinAmount() {
		return payinAmount;
	}

	public void setPayinAmount(String payinAmount) {
		this.payinAmount = payinAmount;
	}

	public String getPayoutAmount() {
		return payoutAmount;
	}

	public void setPayoutAmount(String payoutAmount) {
		this.payoutAmount = payoutAmount;
	}

	public String getXchgRate() {
		return xchgRate;
	}

	public void setXchgRate(String xchgRate) {
		this.xchgRate = xchgRate;
	}

	public String getXchgRateFormatFlag() {
		return xchgRateFormatFlag;
	}

	public void setXchgRateFormatFlag(String xchgRateFormatFlag) {
		this.xchgRateFormatFlag = xchgRateFormatFlag;
	}

	public Double getCommission() {
		return commission;
	}

	public void setCommission(Double commission) {
		this.commission = commission;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Double getCardCharges() {
		return cardCharges;
	}

	public void setCardCharges(Double cardCharges) {
		this.cardCharges = cardCharges;
	}

	public Double getAdditionalCharges() {
		return additionalCharges;
	}

	public void setAdditionalCharges(Double additionalCharges) {
		this.additionalCharges = additionalCharges;
	}

	public Double getOtherCharges() {
		return otherCharges;
	}

	public void setOtherCharges(Double otherCharges) {
		this.otherCharges = otherCharges;
	}

	public Double getTotalPayinAmount() {
		return totalPayinAmount;
	}

	public void setTotalPayinAmount(Double totalPayinAmount) {
		this.totalPayinAmount = totalPayinAmount;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getRateOtherInfo1() {
		return rateOtherInfo1;
	}

	public void setRateOtherInfo1(String rateOtherInfo1) {
		this.rateOtherInfo1 = rateOtherInfo1;
	}

	public String getRateOtherInfo2() {
		return rateOtherInfo2;
	}

	public void setRateOtherInfo2(String rateOtherInfo2) {
		this.rateOtherInfo2 = rateOtherInfo2;
	}

	public String getRateOtherInfo3() {
		return rateOtherInfo3;
	}

	public void setRateOtherInfo3(String rateOtherInfo3) {
		this.rateOtherInfo3 = rateOtherInfo3;
	}

	public String getRateOtherInfo4() {
		return rateOtherInfo4;
	}

	public void setRateOtherInfo4(String rateOtherInfo4) {
		this.rateOtherInfo4 = rateOtherInfo4;
	}

	public String getRateOtherInfo5() {
		return rateOtherInfo5;
	}

	public void setRateOtherInfo5(String rateOtherInfo5) {
		this.rateOtherInfo5 = rateOtherInfo5;
	}

	public String getReservedParam1() {
		return reservedParam1;
	}

	public void setReservedParam1(String reservedParam1) {
		this.reservedParam1 = reservedParam1;
	}

	public String getReservedParam2() {
		return reservedParam2;
	}

	public void setReservedParam2(String reservedParam2) {
		this.reservedParam2 = reservedParam2;
	}

	public String getReservedParam3() {
		return reservedParam3;
	}

	public void setReservedParam3(String reservedParam3) {
		this.reservedParam3 = reservedParam3;
	}

	public String getReservedParam4() {
		return reservedParam4;
	}

	public void setReservedParam4(String reservedParam4) {
		this.reservedParam4 = reservedParam4;
	}

	public String getReservedParam5() {
		return reservedParam5;
	}

	public void setReservedParam5(String reservedParam5) {
		this.reservedParam5 = reservedParam5;
	}

	public String getReservedParam6() {
		return reservedParam6;
	}

	public void setReservedParam6(String reservedParam6) {
		this.reservedParam6 = reservedParam6;
	}

	public String getReservedParam7() {
		return reservedParam7;
	}

	public void setReservedParam7(String reservedParam7) {
		this.reservedParam7 = reservedParam7;
	}

	public String getReservedParam8() {
		return reservedParam8;
	}

	public void setReservedParam8(String reservedParam8) {
		this.reservedParam8 = reservedParam8;
	}

	public String getReservedParam9() {
		return reservedParam9;
	}

	public void setReservedParam9(String reservedParam9) {
		this.reservedParam9 = reservedParam9;
	}

	public String getReservedParam10() {
		return reservedParam10;
	}

	public void setReservedParam10(String reservedParam10) {
		this.reservedParam10 = reservedParam10;
	}
	
}
