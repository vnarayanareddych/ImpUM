package com.paas.model;

import javax.validation.constraints.Size;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated
public class LockTransactionRequest {

	@JsonProperty("txnRefNo")
	private String txnRefNo = null;

	@JsonProperty("lockUnlockFlag")
	private Integer lockUnlockFlag = null;

	@JsonProperty("controlFlag")
	private Integer controlFlag = null;

	@JsonProperty("reservedParam1")
	private String reservedParam1 = null;

	@JsonProperty("reservedParam2")
	private String reservedParam2 = null;

	@JsonProperty("reservedParam3")
	private String reservedParam3 = null;

	@JsonProperty("reservedParam4")
	private String reservedParam4 = null;

	@JsonProperty("reservedParam5")
	private String reservedParam5 = null;

	@JsonProperty("reservedParam6")
	private String reservedParam6 = null;

	@JsonProperty("reservedParam7")
	private String reservedParam7 = null;

	@JsonProperty("reservedParam8")
	private String reservedParam8 = null;

	@JsonProperty("reservedParam9")
	private String reservedParam9 = null;

	@JsonProperty("reservedParam10")
	private String reservedParam10 = null;

	
	@Size(min=16,max=16) 
	public String getTxnRefNo() {
		return txnRefNo;
	}

	public void setTxnRefNo(String txnRefNo) {
		this.txnRefNo = txnRefNo;
	}

	public Integer getLockUnlockFlag() {
		return lockUnlockFlag;
	}

	public void setLockUnlockFlag(Integer lockUnlockFlag) {
		this.lockUnlockFlag = lockUnlockFlag;
	}

	public Integer getControlFlag() {
		return controlFlag;
	}

	public void setControlFlag(Integer controlFlag) {
		this.controlFlag = controlFlag;
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
