package com.paas.dto;

import java.io.Serializable;

public class DataPushDTO  implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String txnRefNo;
	private String instrumentType;
	private String paymentMode;
	private String sourceDC;
	private String serviceProviderCode;
	private String txnType;
	private String agentCode;
	private String dataPushMode;
	private int stageNo;
	private String sessionKey;
	
	
	public String getTxnRefNo() {
		return txnRefNo;
	}
	public void setTxnRefNo(String txnRefNo) {
		this.txnRefNo = txnRefNo;
	}
	public String getInstrumentType() {
		return instrumentType;
	}
	public void setInstrumentType(String instrumentType) {
		this.instrumentType = instrumentType;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public String getSourceDC() {
		return sourceDC;
	}
	public void setSourceDC(String sourceDC) {
		this.sourceDC = sourceDC;
	}
	public String getServiceProviderCode() {
		return serviceProviderCode;
	}
	public void setServiceProviderCode(String serviceProviderCode) {
		this.serviceProviderCode = serviceProviderCode;
	}
	public String getTxnType() {
		return txnType;
	}
	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}
	public String getAgentCode() {
		return agentCode;
	}
	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}
	public String getDataPushMode() {
		return dataPushMode;
	}
	public void setDataPushMode(String dataPushMode) {
		this.dataPushMode = dataPushMode;
	}
	public int getStageNo() {
		return stageNo;
	}
	public void setStageNo(int stageNo) {
		this.stageNo = stageNo;
	}
	public String getSessionKey() {
		return sessionKey;
	}
	public void setSessionKey(String sessionKey) {
		this.sessionKey = sessionKey;
	}
	
	@Override
	public String toString() {
		return "PAASxcqRequestDTO [txnRefNo=" + txnRefNo + ", instrumentType=" + instrumentType + ", paymentMode="
				+ paymentMode + ", sourceDC=" + sourceDC + ", serviceProviderCode=" + serviceProviderCode + ", txnType="
				+ txnType + ", agentCode=" + agentCode + ", dataPushMode=" + dataPushMode + ", stageNo=" + stageNo
				+ ", sessionKey=" + sessionKey + "]";
	}
	
	
	

}
