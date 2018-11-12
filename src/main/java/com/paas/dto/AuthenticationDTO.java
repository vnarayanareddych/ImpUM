package com.paas.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthenticationDTO {

	private String authKey;
	private String agentCode;
	private String userID;
	private String ipAddress;
	private int agentStatus;
	private int agentStatus2;
	private int accessFlag;
	private int paymentModes;
	private int keyStatus;
	
	
	/**
	 * @return the authKey
	 */
	public String getAuthKey() {
		return authKey;
	}
	/**
	 * @param authKey the authKey to set
	 */
	public void setAuthKey(String authKey) {
		this.authKey = authKey;
	}
	/**
	 * @return the agentCode
	 */
	public String getAgentCode() {
		return agentCode;
	}
	/**
	 * @param agentCode the agentCode to set
	 */
	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}
	/**
	 * @return the userID
	 */
	public String getUserID() {
		return userID;
	}
	/**
	 * @param userID the userID to set
	 */
	public void setUserID(String userID) {
		this.userID = userID;
	}
	/**
	 * @return the ipAddress
	 */
	public String getIpAddress() {
		return ipAddress;
	}
	/**
	 * @param ipAddress the ipAddress to set
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	/**
	 * @return the agentStatus
	 */
	public int getAgentStatus() {
		return agentStatus;
	}
	/**
	 * @param agentStatus the agentStatus to set
	 */
	public void setAgentStatus(int agentStatus) {
		this.agentStatus = agentStatus;
	}
	/**
	 * @return the agentStatus2
	 */
	public int getAgentStatus2() {
		return agentStatus2;
	}
	/**
	 * @param agentStatus2 the agentStatus2 to set
	 */
	public void setAgentStatus2(int agentStatus2) {
		this.agentStatus2 = agentStatus2;
	}
	/**
	 * @return the accessFlag
	 */
	public int getAccessFlag() {
		return accessFlag;
	}
	/**
	 * @param accessFlag the accessFlag to set
	 */
	public void setAccessFlag(int accessFlag) {
		this.accessFlag = accessFlag;
	}
	/**
	 * @return the paymentModes
	 */
	public int getPaymentModes() {
		return paymentModes;
	}
	/**
	 * @param paymentModes the paymentModes to set
	 */
	public void setPaymentModes(int paymentModes) {
		this.paymentModes = paymentModes;
	}
	public int getKeyStatus() {
		return keyStatus;
	}
	public void setKeyStatus(int keyStatus) {
		this.keyStatus = keyStatus;
	}
	
	
}
