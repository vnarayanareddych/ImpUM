package com.paas.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BankDTO {

	private String bankCode;
	private String bankName;
	private Integer bankStatus;

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public Integer getBankStatus() {
		return bankStatus;
	}

	public void setBankStatus(Integer bankStatus) {
		this.bankStatus = bankStatus;
	}

	@Override
	public String toString() {
		return "{ bankCode : " + bankCode + "," + " bankName : " + bankName + "," + " bankStatus : " + bankStatus
				+ " } ";

	}
}
