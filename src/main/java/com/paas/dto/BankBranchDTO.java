package com.paas.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BankBranchDTO {

	private String bankCode;
	private String bankName;
	private String bankBranchCode;
	private String bankBranchName;
	private String bankBranchAddress;
	private String bankBranchCity;
	private String bankBranchState;
	private String bankBranchPOBox;
	private String bankBranchCountryCode;
	private String bankBranchAddressZip;
	private String bankBranchPhone;
	private String bankBranchFax;
	private String bankBranchEmail;
	private String bankBranchIdentifier1;
	private String bankBranchIdentifier2;
	private Integer bankStatus;
	private Integer bankBranchStatus;
	private Integer draweeBankBranchStatus;

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

	public String getBankBranchCode() {
		return bankBranchCode;
	}

	public void setBankBranchCode(String bankBranchCode) {
		this.bankBranchCode = bankBranchCode;
	}

	public String getBankBranchName() {
		return bankBranchName;
	}

	public void setBankBranchName(String bankBranchName) {
		this.bankBranchName = bankBranchName;
	}

	public String getBankBranchAddress() {
		return bankBranchAddress;
	}

	public void setBankBranchAddress(String bankBranchAddress) {
		this.bankBranchAddress = bankBranchAddress;
	}

	public String getBankBranchCity() {
		return bankBranchCity;
	}

	public void setBankBranchCity(String bankBranchCity) {
		this.bankBranchCity = bankBranchCity;
	}

	public String getBankBranchState() {
		return bankBranchState;
	}

	public void setBankBranchState(String bankBranchState) {
		this.bankBranchState = bankBranchState;
	}

	public String getBankBranchPOBox() {
		return bankBranchPOBox;
	}

	public void setBankBranchPOBox(String bankBranchPOBox) {
		this.bankBranchPOBox = bankBranchPOBox;
	}

	public String getBankBranchCountryCode() {
		return bankBranchCountryCode;
	}

	public void setBankBranchCountryCode(String bankBranchCountryCode) {
		this.bankBranchCountryCode = bankBranchCountryCode;
	}

	public String getBankBranchAddressZip() {
		return bankBranchAddressZip;
	}

	public void setBankBranchAddressZip(String bankBranchAddressZip) {
		this.bankBranchAddressZip = bankBranchAddressZip;
	}

	public String getBankBranchPhone() {
		return bankBranchPhone;
	}

	public void setBankBranchPhone(String bankBranchPhone) {
		this.bankBranchPhone = bankBranchPhone;
	}

	public String getBankBranchFax() {
		return bankBranchFax;
	}

	public void setBankBranchFax(String bankBranchFax) {
		this.bankBranchFax = bankBranchFax;
	}

	public String getBankBranchEmail() {
		return bankBranchEmail;
	}

	public void setBankBranchEmail(String bankBranchEmail) {
		this.bankBranchEmail = bankBranchEmail;
	}

	public String getBankBranchIdentifier1() {
		return bankBranchIdentifier1;
	}

	public void setBankBranchIdentifier1(String bankBranchIdentifier1) {
		this.bankBranchIdentifier1 = bankBranchIdentifier1;
	}

	public String getBankBranchIdentifier2() {
		return bankBranchIdentifier2;
	}

	public void setBankBranchIdentifier2(String bankBranchIdentifier2) {
		this.bankBranchIdentifier2 = bankBranchIdentifier2;
	}

	public Integer getBankStatus() {
		return bankStatus;
	}

	public void setBankStatus(Integer bankStatus) {
		this.bankStatus = bankStatus;
	}

	public Integer getBankBranchStatus() {
		return bankBranchStatus;
	}

	public void setBankBranchStatus(Integer bankBranchStatus) {
		this.bankBranchStatus = bankBranchStatus;
	}

	public Integer getDraweeBankBranchStatus() {
		return draweeBankBranchStatus;
	}

	public void setDraweeBankBranchStatus(Integer draweeBankBranchStatus) {
		this.draweeBankBranchStatus = draweeBankBranchStatus;
	}

	@Override
	public String toString() {
		return "{ bankCode : " + bankCode + "," + " bankName : " + bankName + "," + " bankBranchCode : "
				+ bankBranchCode + "," + " bankBranchName : " + bankBranchName + "," + " bankBranchAddress : "
				+ bankBranchAddress + "," + " bankBranchCity : " + bankBranchCity + "," + " bankBranchState : "
				+ bankBranchState + "," + " bankBranchPOBox : " + bankBranchPOBox + "," + " bankBranchCountryCode : "
				+ bankBranchCountryCode + "," + " bankBranchAddressZip : " + bankBranchAddressZip + ","
				+ " bankBranchPhone : " + bankBranchPhone + "," + " bankBranchFax : " + bankBranchFax + ","
				+ " bankBranchEmail : " + bankBranchEmail + "," + " bankBranchIdentifier1 : " + bankBranchIdentifier1
				+ "," + " bankBranchIdentifier2 : " + bankBranchIdentifier2 + "," + " bankStatus : " + bankStatus + ","
				+ " bankBranchStatus : " + bankBranchStatus + "," + " draweeBankBranchStatus : "
				+ draweeBankBranchStatus + " } ";
	}
}
