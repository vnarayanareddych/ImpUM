package com.paas.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Cancellation Request Object .
 */
@ApiModel(description = "Cancellation Request Object .")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-16T19:16:16.423+05:30")

public class CreateTransactionRequest   {
  @JsonProperty("validateOnlyFlag")
  private Integer validateOnlyFlag = null;

  @JsonProperty("overrideRateFlag")
  private Integer overrideRateFlag = null;

  @JsonProperty("partnerTxnRefNo")
  private String partnerTxnRefNo = null;

  @JsonProperty("requiresAuthorization")
  private Integer requiresAuthorization = null;

  @JsonProperty("crmRefNumber")
  private String crmRefNumber = null;

  @JsonProperty("crmLeadRefNumber")
  private String crmLeadRefNumber = null;

  @JsonProperty("specialDealRefNumber")
  private String specialDealRefNumber = null;

  @JsonProperty("sendingAgentCode")
  private String sendingAgentCode = null;

  @JsonProperty("serviceProviderCode")
  private String serviceProviderCode = null;

  @JsonProperty("senderProfile")
  private Integer senderProfile = null;

  @JsonProperty("receiverProfile")
  private Integer receiverProfile = null;

  @JsonProperty("senderType")
  private Integer senderType = null;

  @JsonProperty("receiverType")
  private Integer receiverType = null;

  @JsonProperty("senderRefNumber")
  private String senderRefNumber = null;

  @JsonProperty("senderFirstName")
  private String senderFirstName = null;

  @JsonProperty("senderMiddleName")
  private String senderMiddleName = null;

  @JsonProperty("senderLastName")
  private String senderLastName = null;

  @JsonProperty("senderPOBox")
  private String senderPOBox = null;

  @JsonProperty("senderAddress1")
  private String senderAddress1 = null;

  @JsonProperty("senderAddress2")
  private String senderAddress2 = null;

  @JsonProperty("senderCity")
  private String senderCity = null;

  @JsonProperty("senderDistrict")
  private String senderDistrict = null;

  @JsonProperty("senderState")
  private String senderState = null;

  @JsonProperty("senderCountryCode")
  private String senderCountryCode = null;

  @JsonProperty("senderZipCode")
  private String senderZipCode = null;

  @JsonProperty("senderMobile")
  private String senderMobile = null;

  @JsonProperty("senderPhone")
  private String senderPhone = null;

  @JsonProperty("senderFax")
  private String senderFax = null;

  @JsonProperty("senderEmail")
  private String senderEmail = null;

  @JsonProperty("senderOtherInfo")
  private String senderOtherInfo = null;

  @JsonProperty("senderMessageToBeneficiary")
  private String senderMessageToBeneficiary = null;

  @JsonProperty("senderSelfDeclaration")
  private Integer senderSelfDeclaration = null;

  @JsonProperty("senderGender")
  private String senderGender = null;

  @JsonProperty("senderDateOfBirth")
  private String senderDateOfBirth = null;

  @JsonProperty("senderNationalityCode")
  private String senderNationalityCode = null;

  @JsonProperty("senderOccupation")
  private String senderOccupation = null;

  @JsonProperty("senderPlaceOfBirth")
  private String senderPlaceOfBirth = null;

  @JsonProperty("senderEmployerName")
  private String senderEmployerName = null;

  @JsonProperty("senderEmployerPhone")
  private String senderEmployerPhone = null;

  @JsonProperty("senderID")
  private String senderID = null;

  @JsonProperty("senderIDType")
  private String senderIDType = null;

  @JsonProperty("senderIDOtherType")
  private String senderIDOtherType = null;

  @JsonProperty("senderIDIssuedBy")
  private String senderIDIssuedBy = null;

  @JsonProperty("senderIDIssuedAt")
  private String senderIDIssuedAt = null;

  @JsonProperty("senderIDIssueDate")
  private String senderIDIssueDate = null;

  @JsonProperty("senderIDValidThru")
  private String senderIDValidThru = null;

  @JsonProperty("senderIDIssuanceCountry")
  private String senderIDIssuanceCountry = null;

  @JsonProperty("senderIDOtherInfo")
  private String senderIDOtherInfo = null;

  @JsonProperty("senderIDRemarks")
  private String senderIDRemarks = null;

  @JsonProperty("senderproofOfAddress")
  private String senderproofOfAddress = null;

  @JsonProperty("senderID2")
  private String senderID2 = null;

  @JsonProperty("senderID2Type")
  private String senderID2Type = null;

  @JsonProperty("senderID2IssuedBy")
  private String senderID2IssuedBy = null;

  @JsonProperty("senderID2IssuedAt")
  private String senderID2IssuedAt = null;

  @JsonProperty("senderID2IssueDate")
  private String senderID2IssueDate = null;

  @JsonProperty("senderID2ValidThru")
  private String senderID2ValidThru = null;

  @JsonProperty("senderID2IssuanceCountry")
  private String senderID2IssuanceCountry = null;

  @JsonProperty("senderID2OtherInfo")
  private String senderID2OtherInfo = null;

  @JsonProperty("senderID2Remarks")
  private String senderID2Remarks = null;

  @JsonProperty("taxRegNo")
  private String taxRegNo = null;

  @JsonProperty("taxRegNoIssuedCountry")
  private String taxRegNoIssuedCountry = null;

  @JsonProperty("ekycVerifiedSource")
  private String ekycVerifiedSource = null;

  @JsonProperty("ekycValidatedSource")
  private String ekycValidatedSource = null;

  @JsonProperty("ekycValidatedOn")
  private String ekycValidatedOn = null;

  @JsonProperty("senderOtherInfo1")
  private String senderOtherInfo1 = null;

  @JsonProperty("senderOtherInfo2")
  private String senderOtherInfo2 = null;

  @JsonProperty("senderOtherInfo3")
  private String senderOtherInfo3 = null;

  @JsonProperty("senderOtherInfo4")
  private String senderOtherInfo4 = null;

  @JsonProperty("senderOtherInfo5")
  private String senderOtherInfo5 = null;

  @JsonProperty("receiverRefNumber")
  private String receiverRefNumber = null;

  @JsonProperty("receiverFirstName")
  private String receiverFirstName = null;

  @JsonProperty("receiverMiddleName")
  private String receiverMiddleName = null;

  @JsonProperty("receiverLastName")
  private String receiverLastName = null;

  @JsonProperty("deliveryOption")
  private Integer deliveryOption = null;

  @JsonProperty("receiverAddress1")
  private String receiverAddress1 = null;

  @JsonProperty("receiverAddress2")
  private String receiverAddress2 = null;

  @JsonProperty("receiverCity")
  private String receiverCity = null;

  @JsonProperty("receiverCountryCode")
  private String receiverCountryCode = null;

  @JsonProperty("receiverDistrict")
  private String receiverDistrict = null;

  @JsonProperty("receiverState")
  private String receiverState = null;

  @JsonProperty("receiverPOBox")
  private String receiverPOBox = null;

  @JsonProperty("receiverZipCode")
  private String receiverZipCode = null;

  @JsonProperty("receiverPhone")
  private String receiverPhone = null;

  @JsonProperty("receiverMobile")
  private String receiverMobile = null;

  @JsonProperty("receiverFax")
  private String receiverFax = null;

  @JsonProperty("receiverEmail")
  private String receiverEmail = null;

  @JsonProperty("receiverNationalityCode")
  private String receiverNationalityCode = null;

  @JsonProperty("receiverGender")
  private String receiverGender = null;

  @JsonProperty("receiverDateOfBirth")
  private String receiverDateOfBirth = null;

  @JsonProperty("receiverOccupation")
  private String receiverOccupation = null;

  @JsonProperty("receiverSenderRelationship")
  private String receiverSenderRelationship = null;

  @JsonProperty("receiverSmsNotify")
  private Integer receiverSmsNotify = null;

  @JsonProperty("receiverID")
  private String receiverID = null;

  @JsonProperty("receiverIDType")
  private String receiverIDType = null;

  @JsonProperty("receiverIDOtherType")
  private String receiverIDOtherType = null;

  @JsonProperty("receiverIDIssuedBy")
  private String receiverIDIssuedBy = null;

  @JsonProperty("receiverIDIssuedAt")
  private String receiverIDIssuedAt = null;

  @JsonProperty("receiverIDIssueDate")
  private String receiverIDIssueDate = null;

  @JsonProperty("receiverIDValidThru")
  private String receiverIDValidThru = null;

  @JsonProperty("receiverIDIssuanceCountry")
  private String receiverIDIssuanceCountry = null;

  @JsonProperty("receiverOtherInfo1")
  private String receiverOtherInfo1 = null;

  @JsonProperty("receiverOtherInfo2")
  private String receiverOtherInfo2 = null;

  @JsonProperty("receiverOtherInfo3")
  private String receiverOtherInfo3 = null;

  @JsonProperty("receiverOtherInfo4")
  private String receiverOtherInfo4 = null;

  @JsonProperty("receiverOtherInfo5")
  private String receiverOtherInfo5 = null;

  @JsonProperty("receiverBankAccountNo")
  private String receiverBankAccountNo = null;

  @JsonProperty("receiverBankIBANNo")
  private String receiverBankIBANNo = null;

  @JsonProperty("receiverCardNo")
  private String receiverCardNo = null;

  @JsonProperty("receiverCardType")
  private Integer receiverCardType = null;

  @JsonProperty("receiverWalletPatrnerCode")
  private String receiverWalletPatrnerCode = null;

  @JsonProperty("receiverWalletNumber")
  private String receiverWalletNumber = null;

  @JsonProperty("receiverEnglishName")
  private String receiverEnglishName = null;

  @JsonProperty("receiverChineseNameInEnglish")
  private String receiverChineseNameInEnglish = null;

  @JsonProperty("receiverBankAccountName")
  private String receiverBankAccountName = null;

  @JsonProperty("receiverBankCode")
  private String receiverBankCode = null;

  @JsonProperty("receiverBankBranchCode")
  private String receiverBankBranchCode = null;

  @JsonProperty("receiverBranchIdentifier")
  private String receiverBranchIdentifier = null;

  @JsonProperty("receiverBankBranchName")
  private String receiverBankBranchName = null;

  @JsonProperty("receivingAgentCode")
  private String receivingAgentCode = null;

  @JsonProperty("serviceType")
  private String serviceType = null;

  @JsonProperty("productType")
  private String productType = null;

  @JsonProperty("sourceOfIncome")
  private String sourceOfIncome = null;

  @JsonProperty("purposeOfTxn")
  private String purposeOfTxn = null;

  @JsonProperty("purposeOfTxnDetails")
  private String purposeOfTxnDetails = null;

  @JsonProperty("calculationModel")
  private Integer calculationModel = null;

  @JsonProperty("transactionMode")
  private Integer transactionMode = null;

  @JsonProperty("txnOtherInfo1")
  private String txnOtherInfo1 = null;

  @JsonProperty("txnOtherInfo2")
  private String txnOtherInfo2 = null;

  @JsonProperty("txnOtherInfo3")
  private String txnOtherInfo3 = null;

  @JsonProperty("txnOtherInfo4")
  private String txnOtherInfo4 = null;

  @JsonProperty("txnOtherInfo5")
  private String txnOtherInfo5 = null;

  @JsonProperty("paymentMode")
  private String paymentMode = null;

  @JsonProperty("xchgRatePayin2Payout")
  private Double xchgRatePayin2Payout = null;

  @JsonProperty("payinCcyCode")
  private String payinCcyCode = null;

  @JsonProperty("payinAmount")
  private Double payinAmount = null;

  @JsonProperty("payoutCcyCode")
  private String payoutCcyCode = null;

  @JsonProperty("payoutAmount")
  private Double payoutAmount = null;

  @JsonProperty("tax")
  private Double tax = null;

  @JsonProperty("cardCharges")
  private Double cardCharges = null;

  @JsonProperty("otherCharges")
  private Double otherCharges = null;

  @JsonProperty("additionalCharges")
  private Double additionalCharges = null;

  @JsonProperty("commission")
  private Double commission = null;

  @JsonProperty("partnerCommission")
  private Double partnerCommission = null;

  @JsonProperty("totalPayinAmount")
  private Double totalPayinAmount = null;

  @JsonProperty("rateOtherInfo1")
  private String rateOtherInfo1 = null;

  @JsonProperty("rateOtherInfo2")
  private String rateOtherInfo2 = null;

  @JsonProperty("rateOtherInfo3")
  private String rateOtherInfo3 = null;

  @JsonProperty("rateOtherInfo4")
  private String rateOtherInfo4 = null;

  @JsonProperty("rateOtherInfo5")
  private String rateOtherInfo5 = null;

  @JsonProperty("paymentOtherInfo1")
  private String paymentOtherInfo1 = null;

  @JsonProperty("paymentOtherInfo2")
  private String paymentOtherInfo2 = null;

  @JsonProperty("paymentOtherInfo3")
  private String paymentOtherInfo3 = null;

  @JsonProperty("paymentOtherInfo4")
  private String paymentOtherInfo4 = null;

  @JsonProperty("paymentOtherInfo5")
  private String paymentOtherInfo5 = null;

  @JsonProperty("promotionRefNumber")
  private String promotionRefNumber = null;

  @JsonProperty("promotionMessageDescription")
  private String promotionMessageDescription = null;

  @JsonProperty("promotionalData1")
  private String promotionalData1 = null;

  @JsonProperty("promotionalData2")
  private String promotionalData2 = null;

  @JsonProperty("promotionalData3")
  private String promotionalData3 = null;

  @JsonProperty("promotionalData4")
  private String promotionalData4 = null;

  @JsonProperty("promotionCcyCode")
  private String promotionCcyCode = null;

  @JsonProperty("discountField")
  private String discountField = null;

  @JsonProperty("ruleFlag")
  private Integer ruleFlag = null;

  @JsonProperty("controlFlag")
  private Integer controlFlag = null;

  @JsonProperty("externalFlag")
  private Integer externalFlag = null;

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

  public CreateTransactionRequest validateOnlyFlag(Integer validateOnlyFlag) {
    this.validateOnlyFlag = validateOnlyFlag;
    return this;
  }

  /**
   * Get validateOnlyFlag
   * @return validateOnlyFlag
  **/
  @ApiModelProperty(value = "")


  public Integer getValidateOnlyFlag() {
    return validateOnlyFlag;
  }

  public void setValidateOnlyFlag(Integer validateOnlyFlag) {
    this.validateOnlyFlag = validateOnlyFlag;
  }

  public CreateTransactionRequest overrideRateFlag(Integer overrideRateFlag) {
    this.overrideRateFlag = overrideRateFlag;
    return this;
  }

  /**
   * Get overrideRateFlag
   * @return overrideRateFlag
  **/
  @ApiModelProperty(value = "")


  public Integer getOverrideRateFlag() {
    return overrideRateFlag;
  }

  public void setOverrideRateFlag(Integer overrideRateFlag) {
    this.overrideRateFlag = overrideRateFlag;
  }

  public CreateTransactionRequest partnerTxnRefNo(String partnerTxnRefNo) {
    this.partnerTxnRefNo = partnerTxnRefNo;
    return this;
  }

  /**
   * Get partnerTxnRefNo
   * @return partnerTxnRefNo
  **/
  @ApiModelProperty(value = "")


  public String getPartnerTxnRefNo() {
    return partnerTxnRefNo;
  }

  public void setPartnerTxnRefNo(String partnerTxnRefNo) {
    this.partnerTxnRefNo = partnerTxnRefNo;
  }

  public CreateTransactionRequest requiresAuthorization(Integer requiresAuthorization) {
    this.requiresAuthorization = requiresAuthorization;
    return this;
  }

  /**
   * Get requiresAuthorization
   * @return requiresAuthorization
  **/
  @ApiModelProperty(value = "")


  public Integer getRequiresAuthorization() {
    return requiresAuthorization;
  }

  public void setRequiresAuthorization(Integer requiresAuthorization) {
    this.requiresAuthorization = requiresAuthorization;
  }

  public CreateTransactionRequest crmRefNumber(String crmRefNumber) {
    this.crmRefNumber = crmRefNumber;
    return this;
  }

  /**
   * Get crmRefNumber
   * @return crmRefNumber
  **/
  @ApiModelProperty(value = "")


  public String getCrmRefNumber() {
    return crmRefNumber;
  }

  public void setCrmRefNumber(String crmRefNumber) {
    this.crmRefNumber = crmRefNumber;
  }

  public CreateTransactionRequest crmLeadRefNumber(String crmLeadRefNumber) {
    this.crmLeadRefNumber = crmLeadRefNumber;
    return this;
  }

  /**
   * Get crmLeadRefNumber
   * @return crmLeadRefNumber
  **/
  @ApiModelProperty(value = "")


  public String getCrmLeadRefNumber() {
    return crmLeadRefNumber;
  }

  public void setCrmLeadRefNumber(String crmLeadRefNumber) {
    this.crmLeadRefNumber = crmLeadRefNumber;
  }

  public CreateTransactionRequest specialDealRefNumber(String specialDealRefNumber) {
    this.specialDealRefNumber = specialDealRefNumber;
    return this;
  }

  /**
   * Get specialDealRefNumber
   * @return specialDealRefNumber
  **/
  @ApiModelProperty(value = "")


  public String getSpecialDealRefNumber() {
    return specialDealRefNumber;
  }

  public void setSpecialDealRefNumber(String specialDealRefNumber) {
    this.specialDealRefNumber = specialDealRefNumber;
  }

  public CreateTransactionRequest sendingAgentCode(String sendingAgentCode) {
    this.sendingAgentCode = sendingAgentCode;
    return this;
  }

  /**
   * Get sendingAgentCode
   * @return sendingAgentCode
  **/
  @ApiModelProperty(value = "")


  public String getSendingAgentCode() {
    return sendingAgentCode;
  }

  public void setSendingAgentCode(String sendingAgentCode) {
    this.sendingAgentCode = sendingAgentCode;
  }

  public CreateTransactionRequest serviceProviderCode(String serviceProviderCode) {
    this.serviceProviderCode = serviceProviderCode;
    return this;
  }

  /**
   * Get serviceProviderCode
   * @return serviceProviderCode
  **/
  @ApiModelProperty(value = "")


  public String getServiceProviderCode() {
    return serviceProviderCode;
  }

  public void setServiceProviderCode(String serviceProviderCode) {
    this.serviceProviderCode = serviceProviderCode;
  }

  public CreateTransactionRequest senderProfile(Integer senderProfile) {
    this.senderProfile = senderProfile;
    return this;
  }

  /**
   * Get senderProfile
   * @return senderProfile
  **/
  @ApiModelProperty(value = "")


  public Integer getSenderProfile() {
    return senderProfile;
  }

  public void setSenderProfile(Integer senderProfile) {
    this.senderProfile = senderProfile;
  }

  public CreateTransactionRequest receiverProfile(Integer receiverProfile) {
    this.receiverProfile = receiverProfile;
    return this;
  }

  /**
   * Get receiverProfile
   * @return receiverProfile
  **/
  @ApiModelProperty(value = "")


  public Integer getReceiverProfile() {
    return receiverProfile;
  }

  public void setReceiverProfile(Integer receiverProfile) {
    this.receiverProfile = receiverProfile;
  }

  public CreateTransactionRequest senderType(Integer senderType) {
    this.senderType = senderType;
    return this;
  }

  /**
   * Get senderType
   * @return senderType
  **/
  @ApiModelProperty(value = "")


  public Integer getSenderType() {
    return senderType;
  }

  public void setSenderType(Integer senderType) {
    this.senderType = senderType;
  }

  public CreateTransactionRequest receiverType(Integer receiverType) {
    this.receiverType = receiverType;
    return this;
  }

  /**
   * Get receiverType
   * @return receiverType
  **/
  @ApiModelProperty(value = "")


  public Integer getReceiverType() {
    return receiverType;
  }

  public void setReceiverType(Integer receiverType) {
    this.receiverType = receiverType;
  }

  public CreateTransactionRequest senderRefNumber(String senderRefNumber) {
    this.senderRefNumber = senderRefNumber;
    return this;
  }

  /**
   * Get senderRefNumber
   * @return senderRefNumber
  **/
  @ApiModelProperty(value = "")


  public String getSenderRefNumber() {
    return senderRefNumber;
  }

  public void setSenderRefNumber(String senderRefNumber) {
    this.senderRefNumber = senderRefNumber;
  }

  public CreateTransactionRequest senderFirstName(String senderFirstName) {
    this.senderFirstName = senderFirstName;
    return this;
  }

  /**
   * Get senderFirstName
   * @return senderFirstName
  **/
  @ApiModelProperty(value = "")


  public String getSenderFirstName() {
    return senderFirstName;
  }

  public void setSenderFirstName(String senderFirstName) {
    this.senderFirstName = senderFirstName;
  }

  public CreateTransactionRequest senderMiddleName(String senderMiddleName) {
    this.senderMiddleName = senderMiddleName;
    return this;
  }

  /**
   * Get senderMiddleName
   * @return senderMiddleName
  **/
  @ApiModelProperty(value = "")


  public String getSenderMiddleName() {
    return senderMiddleName;
  }

  public void setSenderMiddleName(String senderMiddleName) {
    this.senderMiddleName = senderMiddleName;
  }

  public CreateTransactionRequest senderLastName(String senderLastName) {
    this.senderLastName = senderLastName;
    return this;
  }

  /**
   * Get senderLastName
   * @return senderLastName
  **/
  @ApiModelProperty(value = "")


  public String getSenderLastName() {
    return senderLastName;
  }

  public void setSenderLastName(String senderLastName) {
    this.senderLastName = senderLastName;
  }

  public CreateTransactionRequest senderPOBox(String senderPOBox) {
    this.senderPOBox = senderPOBox;
    return this;
  }

  /**
   * Get senderPOBox
   * @return senderPOBox
  **/
  @ApiModelProperty(value = "")


  public String getSenderPOBox() {
    return senderPOBox;
  }

  public void setSenderPOBox(String senderPOBox) {
    this.senderPOBox = senderPOBox;
  }

  public CreateTransactionRequest senderAddress1(String senderAddress1) {
    this.senderAddress1 = senderAddress1;
    return this;
  }

  /**
   * Get senderAddress1
   * @return senderAddress1
  **/
  @ApiModelProperty(value = "")


  public String getSenderAddress1() {
    return senderAddress1;
  }

  public void setSenderAddress1(String senderAddress1) {
    this.senderAddress1 = senderAddress1;
  }

  public CreateTransactionRequest senderAddress2(String senderAddress2) {
    this.senderAddress2 = senderAddress2;
    return this;
  }

  /**
   * Get senderAddress2
   * @return senderAddress2
  **/
  @ApiModelProperty(value = "")


  public String getSenderAddress2() {
    return senderAddress2;
  }

  public void setSenderAddress2(String senderAddress2) {
    this.senderAddress2 = senderAddress2;
  }

  public CreateTransactionRequest senderCity(String senderCity) {
    this.senderCity = senderCity;
    return this;
  }

  /**
   * Get senderCity
   * @return senderCity
  **/
  @ApiModelProperty(value = "")


  public String getSenderCity() {
    return senderCity;
  }

  public void setSenderCity(String senderCity) {
    this.senderCity = senderCity;
  }

  public CreateTransactionRequest senderDistrict(String senderDistrict) {
    this.senderDistrict = senderDistrict;
    return this;
  }

  /**
   * Get senderDistrict
   * @return senderDistrict
  **/
  @ApiModelProperty(value = "")


  public String getSenderDistrict() {
    return senderDistrict;
  }

  public void setSenderDistrict(String senderDistrict) {
    this.senderDistrict = senderDistrict;
  }

  public CreateTransactionRequest senderState(String senderState) {
    this.senderState = senderState;
    return this;
  }

  /**
   * Get senderState
   * @return senderState
  **/
  @ApiModelProperty(value = "")


  public String getSenderState() {
    return senderState;
  }

  public void setSenderState(String senderState) {
    this.senderState = senderState;
  }

  public CreateTransactionRequest senderCountryCode(String senderCountryCode) {
    this.senderCountryCode = senderCountryCode;
    return this;
  }

  /**
   * Get senderCountryCode
   * @return senderCountryCode
  **/
  @ApiModelProperty(value = "")


  public String getSenderCountryCode() {
    return senderCountryCode;
  }

  public void setSenderCountryCode(String senderCountryCode) {
    this.senderCountryCode = senderCountryCode;
  }

  public CreateTransactionRequest senderZipCode(String senderZipCode) {
    this.senderZipCode = senderZipCode;
    return this;
  }

  /**
   * Get senderZipCode
   * @return senderZipCode
  **/
  @ApiModelProperty(value = "")


  public String getSenderZipCode() {
    return senderZipCode;
  }

  public void setSenderZipCode(String senderZipCode) {
    this.senderZipCode = senderZipCode;
  }

  public CreateTransactionRequest senderMobile(String senderMobile) {
    this.senderMobile = senderMobile;
    return this;
  }

  /**
   * Get senderMobile
   * @return senderMobile
  **/
  @ApiModelProperty(value = "")


  public String getSenderMobile() {
    return senderMobile;
  }

  public void setSenderMobile(String senderMobile) {
    this.senderMobile = senderMobile;
  }

  public CreateTransactionRequest senderPhone(String senderPhone) {
    this.senderPhone = senderPhone;
    return this;
  }

  /**
   * Get senderPhone
   * @return senderPhone
  **/
  @ApiModelProperty(value = "")


  public String getSenderPhone() {
    return senderPhone;
  }

  public void setSenderPhone(String senderPhone) {
    this.senderPhone = senderPhone;
  }

  public CreateTransactionRequest senderFax(String senderFax) {
    this.senderFax = senderFax;
    return this;
  }

  /**
   * Get senderFax
   * @return senderFax
  **/
  @ApiModelProperty(value = "")


  public String getSenderFax() {
    return senderFax;
  }

  public void setSenderFax(String senderFax) {
    this.senderFax = senderFax;
  }

  public CreateTransactionRequest senderEmail(String senderEmail) {
    this.senderEmail = senderEmail;
    return this;
  }

  /**
   * Get senderEmail
   * @return senderEmail
  **/
  @ApiModelProperty(value = "")


  public String getSenderEmail() {
    return senderEmail;
  }

  public void setSenderEmail(String senderEmail) {
    this.senderEmail = senderEmail;
  }

  public CreateTransactionRequest senderOtherInfo(String senderOtherInfo) {
    this.senderOtherInfo = senderOtherInfo;
    return this;
  }

  /**
   * Get senderOtherInfo
   * @return senderOtherInfo
  **/
  @ApiModelProperty(value = "")


  public String getSenderOtherInfo() {
    return senderOtherInfo;
  }

  public void setSenderOtherInfo(String senderOtherInfo) {
    this.senderOtherInfo = senderOtherInfo;
  }

  public CreateTransactionRequest senderMessageToBeneficiary(String senderMessageToBeneficiary) {
    this.senderMessageToBeneficiary = senderMessageToBeneficiary;
    return this;
  }

  /**
   * Get senderMessageToBeneficiary
   * @return senderMessageToBeneficiary
  **/
  @ApiModelProperty(value = "")


  public String getSenderMessageToBeneficiary() {
    return senderMessageToBeneficiary;
  }

  public void setSenderMessageToBeneficiary(String senderMessageToBeneficiary) {
    this.senderMessageToBeneficiary = senderMessageToBeneficiary;
  }

  public CreateTransactionRequest senderSelfDeclaration(Integer senderSelfDeclaration) {
    this.senderSelfDeclaration = senderSelfDeclaration;
    return this;
  }

  /**
   * Get senderSelfDeclaration
   * @return senderSelfDeclaration
  **/
  @ApiModelProperty(value = "")


  public Integer getSenderSelfDeclaration() {
    return senderSelfDeclaration;
  }

  public void setSenderSelfDeclaration(Integer senderSelfDeclaration) {
    this.senderSelfDeclaration = senderSelfDeclaration;
  }

  public CreateTransactionRequest senderGender(String senderGender) {
    this.senderGender = senderGender;
    return this;
  }

  /**
   * Get senderGender
   * @return senderGender
  **/
  @ApiModelProperty(value = "")


  public String getSenderGender() {
    return senderGender;
  }

  public void setSenderGender(String senderGender) {
    this.senderGender = senderGender;
  }

  public CreateTransactionRequest senderDateOfBirth(String senderDateOfBirth) {
    this.senderDateOfBirth = senderDateOfBirth;
    return this;
  }

  /**
   * Get senderDateOfBirth
   * @return senderDateOfBirth
  **/
  @ApiModelProperty(value = "")


  public String getSenderDateOfBirth() {
    return senderDateOfBirth;
  }

  public void setSenderDateOfBirth(String senderDateOfBirth) {
    this.senderDateOfBirth = senderDateOfBirth;
  }

  public CreateTransactionRequest senderNationalityCode(String senderNationalityCode) {
    this.senderNationalityCode = senderNationalityCode;
    return this;
  }

  /**
   * Get senderNationalityCode
   * @return senderNationalityCode
  **/
  @ApiModelProperty(value = "")


  public String getSenderNationalityCode() {
    return senderNationalityCode;
  }

  public void setSenderNationalityCode(String senderNationalityCode) {
    this.senderNationalityCode = senderNationalityCode;
  }

  public CreateTransactionRequest senderOccupation(String senderOccupation) {
    this.senderOccupation = senderOccupation;
    return this;
  }

  /**
   * Get senderOccupation
   * @return senderOccupation
  **/
  @ApiModelProperty(value = "")


  public String getSenderOccupation() {
    return senderOccupation;
  }

  public void setSenderOccupation(String senderOccupation) {
    this.senderOccupation = senderOccupation;
  }

  public CreateTransactionRequest senderPlaceOfBirth(String senderPlaceOfBirth) {
    this.senderPlaceOfBirth = senderPlaceOfBirth;
    return this;
  }

  /**
   * Get senderPlaceOfBirth
   * @return senderPlaceOfBirth
  **/
  @ApiModelProperty(value = "")


  public String getSenderPlaceOfBirth() {
    return senderPlaceOfBirth;
  }

  public void setSenderPlaceOfBirth(String senderPlaceOfBirth) {
    this.senderPlaceOfBirth = senderPlaceOfBirth;
  }

  public CreateTransactionRequest senderEmployerName(String senderEmployerName) {
    this.senderEmployerName = senderEmployerName;
    return this;
  }

  /**
   * Get senderEmployerName
   * @return senderEmployerName
  **/
  @ApiModelProperty(value = "")


  public String getSenderEmployerName() {
    return senderEmployerName;
  }

  public void setSenderEmployerName(String senderEmployerName) {
    this.senderEmployerName = senderEmployerName;
  }

  public CreateTransactionRequest senderEmployerPhone(String senderEmployerPhone) {
    this.senderEmployerPhone = senderEmployerPhone;
    return this;
  }

  /**
   * Get senderEmployerPhone
   * @return senderEmployerPhone
  **/
  @ApiModelProperty(value = "")


  public String getSenderEmployerPhone() {
    return senderEmployerPhone;
  }

  public void setSenderEmployerPhone(String senderEmployerPhone) {
    this.senderEmployerPhone = senderEmployerPhone;
  }

  public CreateTransactionRequest senderID(String senderID) {
    this.senderID = senderID;
    return this;
  }

  /**
   * Get senderID
   * @return senderID
  **/
  @ApiModelProperty(value = "")


  public String getSenderID() {
    return senderID;
  }

  public void setSenderID(String senderID) {
    this.senderID = senderID;
  }

  public CreateTransactionRequest senderIDType(String senderIDType) {
    this.senderIDType = senderIDType;
    return this;
  }

  /**
   * Get senderIDType
   * @return senderIDType
  **/
  @ApiModelProperty(value = "")


  public String getSenderIDType() {
    return senderIDType;
  }

  public void setSenderIDType(String senderIDType) {
    this.senderIDType = senderIDType;
  }

  public CreateTransactionRequest senderIDOtherType(String senderIDOtherType) {
    this.senderIDOtherType = senderIDOtherType;
    return this;
  }

  /**
   * Get senderIDOtherType
   * @return senderIDOtherType
  **/
  @ApiModelProperty(value = "")


  public String getSenderIDOtherType() {
    return senderIDOtherType;
  }

  public void setSenderIDOtherType(String senderIDOtherType) {
    this.senderIDOtherType = senderIDOtherType;
  }

  public CreateTransactionRequest senderIDIssuedBy(String senderIDIssuedBy) {
    this.senderIDIssuedBy = senderIDIssuedBy;
    return this;
  }

  /**
   * Get senderIDIssuedBy
   * @return senderIDIssuedBy
  **/
  @ApiModelProperty(value = "")


  public String getSenderIDIssuedBy() {
    return senderIDIssuedBy;
  }

  public void setSenderIDIssuedBy(String senderIDIssuedBy) {
    this.senderIDIssuedBy = senderIDIssuedBy;
  }

  public CreateTransactionRequest senderIDIssuedAt(String senderIDIssuedAt) {
    this.senderIDIssuedAt = senderIDIssuedAt;
    return this;
  }

  /**
   * Get senderIDIssuedAt
   * @return senderIDIssuedAt
  **/
  @ApiModelProperty(value = "")


  public String getSenderIDIssuedAt() {
    return senderIDIssuedAt;
  }

  public void setSenderIDIssuedAt(String senderIDIssuedAt) {
    this.senderIDIssuedAt = senderIDIssuedAt;
  }

  public CreateTransactionRequest senderIDIssueDate(String senderIDIssueDate) {
    this.senderIDIssueDate = senderIDIssueDate;
    return this;
  }

  /**
   * Get senderIDIssueDate
   * @return senderIDIssueDate
  **/
  @ApiModelProperty(value = "")


  public String getSenderIDIssueDate() {
    return senderIDIssueDate;
  }

  public void setSenderIDIssueDate(String senderIDIssueDate) {
    this.senderIDIssueDate = senderIDIssueDate;
  }

  public CreateTransactionRequest senderIDValidThru(String senderIDValidThru) {
    this.senderIDValidThru = senderIDValidThru;
    return this;
  }

  /**
   * Get senderIDValidThru
   * @return senderIDValidThru
  **/
  @ApiModelProperty(value = "")


  public String getSenderIDValidThru() {
    return senderIDValidThru;
  }

  public void setSenderIDValidThru(String senderIDValidThru) {
    this.senderIDValidThru = senderIDValidThru;
  }

  public CreateTransactionRequest senderIDIssuanceCountry(String senderIDIssuanceCountry) {
    this.senderIDIssuanceCountry = senderIDIssuanceCountry;
    return this;
  }

  /**
   * Get senderIDIssuanceCountry
   * @return senderIDIssuanceCountry
  **/
  @ApiModelProperty(value = "")


  public String getSenderIDIssuanceCountry() {
    return senderIDIssuanceCountry;
  }

  public void setSenderIDIssuanceCountry(String senderIDIssuanceCountry) {
    this.senderIDIssuanceCountry = senderIDIssuanceCountry;
  }

  public CreateTransactionRequest senderIDOtherInfo(String senderIDOtherInfo) {
    this.senderIDOtherInfo = senderIDOtherInfo;
    return this;
  }

  /**
   * Get senderIDOtherInfo
   * @return senderIDOtherInfo
  **/
  @ApiModelProperty(value = "")


  public String getSenderIDOtherInfo() {
    return senderIDOtherInfo;
  }

  public void setSenderIDOtherInfo(String senderIDOtherInfo) {
    this.senderIDOtherInfo = senderIDOtherInfo;
  }

  public CreateTransactionRequest senderIDRemarks(String senderIDRemarks) {
    this.senderIDRemarks = senderIDRemarks;
    return this;
  }

  /**
   * Get senderIDRemarks
   * @return senderIDRemarks
  **/
  @ApiModelProperty(value = "")


  public String getSenderIDRemarks() {
    return senderIDRemarks;
  }

  public void setSenderIDRemarks(String senderIDRemarks) {
    this.senderIDRemarks = senderIDRemarks;
  }

  public CreateTransactionRequest senderproofOfAddress(String senderproofOfAddress) {
    this.senderproofOfAddress = senderproofOfAddress;
    return this;
  }

  /**
   * Get senderproofOfAddress
   * @return senderproofOfAddress
  **/
  @ApiModelProperty(value = "")


  public String getSenderproofOfAddress() {
    return senderproofOfAddress;
  }

  public void setSenderproofOfAddress(String senderproofOfAddress) {
    this.senderproofOfAddress = senderproofOfAddress;
  }

  public CreateTransactionRequest senderID2(String senderID2) {
    this.senderID2 = senderID2;
    return this;
  }

  /**
   * Get senderID2
   * @return senderID2
  **/
  @ApiModelProperty(value = "")


  public String getSenderID2() {
    return senderID2;
  }

  public void setSenderID2(String senderID2) {
    this.senderID2 = senderID2;
  }

  public CreateTransactionRequest senderID2Type(String senderID2Type) {
    this.senderID2Type = senderID2Type;
    return this;
  }

  /**
   * Get senderID2Type
   * @return senderID2Type
  **/
  @ApiModelProperty(value = "")


  public String getSenderID2Type() {
    return senderID2Type;
  }

  public void setSenderID2Type(String senderID2Type) {
    this.senderID2Type = senderID2Type;
  }

  public CreateTransactionRequest senderID2IssuedBy(String senderID2IssuedBy) {
    this.senderID2IssuedBy = senderID2IssuedBy;
    return this;
  }

  /**
   * Get senderID2IssuedBy
   * @return senderID2IssuedBy
  **/
  @ApiModelProperty(value = "")


  public String getSenderID2IssuedBy() {
    return senderID2IssuedBy;
  }

  public void setSenderID2IssuedBy(String senderID2IssuedBy) {
    this.senderID2IssuedBy = senderID2IssuedBy;
  }

  public CreateTransactionRequest senderID2IssuedAt(String senderID2IssuedAt) {
    this.senderID2IssuedAt = senderID2IssuedAt;
    return this;
  }

  /**
   * Get senderID2IssuedAt
   * @return senderID2IssuedAt
  **/
  @ApiModelProperty(value = "")


  public String getSenderID2IssuedAt() {
    return senderID2IssuedAt;
  }

  public void setSenderID2IssuedAt(String senderID2IssuedAt) {
    this.senderID2IssuedAt = senderID2IssuedAt;
  }

  public CreateTransactionRequest senderID2IssueDate(String senderID2IssueDate) {
    this.senderID2IssueDate = senderID2IssueDate;
    return this;
  }

  /**
   * Get senderID2IssueDate
   * @return senderID2IssueDate
  **/
  @ApiModelProperty(value = "")


  public String getSenderID2IssueDate() {
    return senderID2IssueDate;
  }

  public void setSenderID2IssueDate(String senderID2IssueDate) {
    this.senderID2IssueDate = senderID2IssueDate;
  }

  public CreateTransactionRequest senderID2ValidThru(String senderID2ValidThru) {
    this.senderID2ValidThru = senderID2ValidThru;
    return this;
  }

  /**
   * Get senderID2ValidThru
   * @return senderID2ValidThru
  **/
  @ApiModelProperty(value = "")


  public String getSenderID2ValidThru() {
    return senderID2ValidThru;
  }

  public void setSenderID2ValidThru(String senderID2ValidThru) {
    this.senderID2ValidThru = senderID2ValidThru;
  }

  public CreateTransactionRequest senderID2IssuanceCountry(String senderID2IssuanceCountry) {
    this.senderID2IssuanceCountry = senderID2IssuanceCountry;
    return this;
  }

  /**
   * Get senderID2IssuanceCountry
   * @return senderID2IssuanceCountry
  **/
  @ApiModelProperty(value = "")


  public String getSenderID2IssuanceCountry() {
    return senderID2IssuanceCountry;
  }

  public void setSenderID2IssuanceCountry(String senderID2IssuanceCountry) {
    this.senderID2IssuanceCountry = senderID2IssuanceCountry;
  }

  public CreateTransactionRequest senderID2OtherInfo(String senderID2OtherInfo) {
    this.senderID2OtherInfo = senderID2OtherInfo;
    return this;
  }

  /**
   * Get senderID2OtherInfo
   * @return senderID2OtherInfo
  **/
  @ApiModelProperty(value = "")


  public String getSenderID2OtherInfo() {
    return senderID2OtherInfo;
  }

  public void setSenderID2OtherInfo(String senderID2OtherInfo) {
    this.senderID2OtherInfo = senderID2OtherInfo;
  }

  public CreateTransactionRequest senderID2Remarks(String senderID2Remarks) {
    this.senderID2Remarks = senderID2Remarks;
    return this;
  }

  /**
   * Get senderID2Remarks
   * @return senderID2Remarks
  **/
  @ApiModelProperty(value = "")


  public String getSenderID2Remarks() {
    return senderID2Remarks;
  }

  public void setSenderID2Remarks(String senderID2Remarks) {
    this.senderID2Remarks = senderID2Remarks;
  }

  public CreateTransactionRequest taxRegNo(String taxRegNo) {
    this.taxRegNo = taxRegNo;
    return this;
  }

  /**
   * Get taxRegNo
   * @return taxRegNo
  **/
  @ApiModelProperty(value = "")


  public String getTaxRegNo() {
    return taxRegNo;
  }

  public void setTaxRegNo(String taxRegNo) {
    this.taxRegNo = taxRegNo;
  }

  public CreateTransactionRequest taxRegNoIssuedCountry(String taxRegNoIssuedCountry) {
    this.taxRegNoIssuedCountry = taxRegNoIssuedCountry;
    return this;
  }

  /**
   * Get taxRegNoIssuedCountry
   * @return taxRegNoIssuedCountry
  **/
  @ApiModelProperty(value = "")


  public String getTaxRegNoIssuedCountry() {
    return taxRegNoIssuedCountry;
  }

  public void setTaxRegNoIssuedCountry(String taxRegNoIssuedCountry) {
    this.taxRegNoIssuedCountry = taxRegNoIssuedCountry;
  }

  public CreateTransactionRequest ekycVerifiedSource(String ekycVerifiedSource) {
    this.ekycVerifiedSource = ekycVerifiedSource;
    return this;
  }

  /**
   * Get ekycVerifiedSource
   * @return ekycVerifiedSource
  **/
  @ApiModelProperty(value = "")


  public String getEkycVerifiedSource() {
    return ekycVerifiedSource;
  }

  public void setEkycVerifiedSource(String ekycVerifiedSource) {
    this.ekycVerifiedSource = ekycVerifiedSource;
  }

  public CreateTransactionRequest ekycValidatedSource(String ekycValidatedSource) {
    this.ekycValidatedSource = ekycValidatedSource;
    return this;
  }

  /**
   * Get ekycValidatedSource
   * @return ekycValidatedSource
  **/
  @ApiModelProperty(value = "")


  public String getEkycValidatedSource() {
    return ekycValidatedSource;
  }

  public void setEkycValidatedSource(String ekycValidatedSource) {
    this.ekycValidatedSource = ekycValidatedSource;
  }

  public CreateTransactionRequest ekycValidatedOn(String ekycValidatedOn) {
    this.ekycValidatedOn = ekycValidatedOn;
    return this;
  }

  /**
   * Get ekycValidatedOn
   * @return ekycValidatedOn
  **/
  @ApiModelProperty(value = "")


  public String getEkycValidatedOn() {
    return ekycValidatedOn;
  }

  public void setEkycValidatedOn(String ekycValidatedOn) {
    this.ekycValidatedOn = ekycValidatedOn;
  }

  public CreateTransactionRequest senderOtherInfo1(String senderOtherInfo1) {
    this.senderOtherInfo1 = senderOtherInfo1;
    return this;
  }

  /**
   * Get senderOtherInfo1
   * @return senderOtherInfo1
  **/
  @ApiModelProperty(value = "")


  public String getSenderOtherInfo1() {
    return senderOtherInfo1;
  }

  public void setSenderOtherInfo1(String senderOtherInfo1) {
    this.senderOtherInfo1 = senderOtherInfo1;
  }

  public CreateTransactionRequest senderOtherInfo2(String senderOtherInfo2) {
    this.senderOtherInfo2 = senderOtherInfo2;
    return this;
  }

  /**
   * Get senderOtherInfo2
   * @return senderOtherInfo2
  **/
  @ApiModelProperty(value = "")


  public String getSenderOtherInfo2() {
    return senderOtherInfo2;
  }

  public void setSenderOtherInfo2(String senderOtherInfo2) {
    this.senderOtherInfo2 = senderOtherInfo2;
  }

  public CreateTransactionRequest senderOtherInfo3(String senderOtherInfo3) {
    this.senderOtherInfo3 = senderOtherInfo3;
    return this;
  }

  /**
   * Get senderOtherInfo3
   * @return senderOtherInfo3
  **/
  @ApiModelProperty(value = "")


  public String getSenderOtherInfo3() {
    return senderOtherInfo3;
  }

  public void setSenderOtherInfo3(String senderOtherInfo3) {
    this.senderOtherInfo3 = senderOtherInfo3;
  }

  public CreateTransactionRequest senderOtherInfo4(String senderOtherInfo4) {
    this.senderOtherInfo4 = senderOtherInfo4;
    return this;
  }

  /**
   * Get senderOtherInfo4
   * @return senderOtherInfo4
  **/
  @ApiModelProperty(value = "")


  public String getSenderOtherInfo4() {
    return senderOtherInfo4;
  }

  public void setSenderOtherInfo4(String senderOtherInfo4) {
    this.senderOtherInfo4 = senderOtherInfo4;
  }

  public CreateTransactionRequest senderOtherInfo5(String senderOtherInfo5) {
    this.senderOtherInfo5 = senderOtherInfo5;
    return this;
  }

  /**
   * Get senderOtherInfo5
   * @return senderOtherInfo5
  **/
  @ApiModelProperty(value = "")


  public String getSenderOtherInfo5() {
    return senderOtherInfo5;
  }

  public void setSenderOtherInfo5(String senderOtherInfo5) {
    this.senderOtherInfo5 = senderOtherInfo5;
  }

  public CreateTransactionRequest receiverRefNumber(String receiverRefNumber) {
    this.receiverRefNumber = receiverRefNumber;
    return this;
  }

  /**
   * Get receiverRefNumber
   * @return receiverRefNumber
  **/
  @ApiModelProperty(value = "")


  public String getReceiverRefNumber() {
    return receiverRefNumber;
  }

  public void setReceiverRefNumber(String receiverRefNumber) {
    this.receiverRefNumber = receiverRefNumber;
  }

  public CreateTransactionRequest receiverFirstName(String receiverFirstName) {
    this.receiverFirstName = receiverFirstName;
    return this;
  }

  /**
   * Get receiverFirstName
   * @return receiverFirstName
  **/
  @ApiModelProperty(value = "")


  public String getReceiverFirstName() {
    return receiverFirstName;
  }

  public void setReceiverFirstName(String receiverFirstName) {
    this.receiverFirstName = receiverFirstName;
  }

  public CreateTransactionRequest receiverMiddleName(String receiverMiddleName) {
    this.receiverMiddleName = receiverMiddleName;
    return this;
  }

  /**
   * Get receiverMiddleName
   * @return receiverMiddleName
  **/
  @ApiModelProperty(value = "")


  public String getReceiverMiddleName() {
    return receiverMiddleName;
  }

  public void setReceiverMiddleName(String receiverMiddleName) {
    this.receiverMiddleName = receiverMiddleName;
  }

  public CreateTransactionRequest receiverLastName(String receiverLastName) {
    this.receiverLastName = receiverLastName;
    return this;
  }

  /**
   * Get receiverLastName
   * @return receiverLastName
  **/
  @ApiModelProperty(value = "")


  public String getReceiverLastName() {
    return receiverLastName;
  }

  public void setReceiverLastName(String receiverLastName) {
    this.receiverLastName = receiverLastName;
  }

  public CreateTransactionRequest deliveryOption(Integer deliveryOption) {
    this.deliveryOption = deliveryOption;
    return this;
  }

  /**
   * Get deliveryOption
   * @return deliveryOption
  **/
  @ApiModelProperty(value = "")


  public Integer getDeliveryOption() {
    return deliveryOption;
  }

  public void setDeliveryOption(Integer deliveryOption) {
    this.deliveryOption = deliveryOption;
  }

  public CreateTransactionRequest receiverAddress1(String receiverAddress1) {
    this.receiverAddress1 = receiverAddress1;
    return this;
  }

  /**
   * Get receiverAddress1
   * @return receiverAddress1
  **/
  @ApiModelProperty(value = "")


  public String getReceiverAddress1() {
    return receiverAddress1;
  }

  public void setReceiverAddress1(String receiverAddress1) {
    this.receiverAddress1 = receiverAddress1;
  }

  public CreateTransactionRequest receiverAddress2(String receiverAddress2) {
    this.receiverAddress2 = receiverAddress2;
    return this;
  }

  /**
   * Get receiverAddress2
   * @return receiverAddress2
  **/
  @ApiModelProperty(value = "")


  public String getReceiverAddress2() {
    return receiverAddress2;
  }

  public void setReceiverAddress2(String receiverAddress2) {
    this.receiverAddress2 = receiverAddress2;
  }

  public CreateTransactionRequest receiverCity(String receiverCity) {
    this.receiverCity = receiverCity;
    return this;
  }

  /**
   * Get receiverCity
   * @return receiverCity
  **/
  @ApiModelProperty(value = "")


  public String getReceiverCity() {
    return receiverCity;
  }

  public void setReceiverCity(String receiverCity) {
    this.receiverCity = receiverCity;
  }

  public CreateTransactionRequest receiverCountryCode(String receiverCountryCode) {
    this.receiverCountryCode = receiverCountryCode;
    return this;
  }

  /**
   * Get receiverCountryCode
   * @return receiverCountryCode
  **/
  @ApiModelProperty(value = "")


  public String getReceiverCountryCode() {
    return receiverCountryCode;
  }

  public void setReceiverCountryCode(String receiverCountryCode) {
    this.receiverCountryCode = receiverCountryCode;
  }

  public CreateTransactionRequest receiverDistrict(String receiverDistrict) {
    this.receiverDistrict = receiverDistrict;
    return this;
  }

  /**
   * Get receiverDistrict
   * @return receiverDistrict
  **/
  @ApiModelProperty(value = "")


  public String getReceiverDistrict() {
    return receiverDistrict;
  }

  public void setReceiverDistrict(String receiverDistrict) {
    this.receiverDistrict = receiverDistrict;
  }

  public CreateTransactionRequest receiverState(String receiverState) {
    this.receiverState = receiverState;
    return this;
  }

  /**
   * Get receiverState
   * @return receiverState
  **/
  @ApiModelProperty(value = "")


  public String getReceiverState() {
    return receiverState;
  }

  public void setReceiverState(String receiverState) {
    this.receiverState = receiverState;
  }

  public CreateTransactionRequest receiverPOBox(String receiverPOBox) {
    this.receiverPOBox = receiverPOBox;
    return this;
  }

  /**
   * Get receiverPOBox
   * @return receiverPOBox
  **/
  @ApiModelProperty(value = "")


  public String getReceiverPOBox() {
    return receiverPOBox;
  }

  public void setReceiverPOBox(String receiverPOBox) {
    this.receiverPOBox = receiverPOBox;
  }

  public CreateTransactionRequest receiverZipCode(String receiverZipCode) {
    this.receiverZipCode = receiverZipCode;
    return this;
  }

  /**
   * Get receiverZipCode
   * @return receiverZipCode
  **/
  @ApiModelProperty(value = "")


  public String getReceiverZipCode() {
    return receiverZipCode;
  }

  public void setReceiverZipCode(String receiverZipCode) {
    this.receiverZipCode = receiverZipCode;
  }

  public CreateTransactionRequest receiverPhone(String receiverPhone) {
    this.receiverPhone = receiverPhone;
    return this;
  }

  /**
   * Get receiverPhone
   * @return receiverPhone
  **/
  @ApiModelProperty(value = "")


  public String getReceiverPhone() {
    return receiverPhone;
  }

  public void setReceiverPhone(String receiverPhone) {
    this.receiverPhone = receiverPhone;
  }

  public CreateTransactionRequest receiverMobile(String receiverMobile) {
    this.receiverMobile = receiverMobile;
    return this;
  }

  /**
   * Get receiverMobile
   * @return receiverMobile
  **/
  @ApiModelProperty(value = "")


  public String getReceiverMobile() {
    return receiverMobile;
  }

  public void setReceiverMobile(String receiverMobile) {
    this.receiverMobile = receiverMobile;
  }

  public CreateTransactionRequest receiverFax(String receiverFax) {
    this.receiverFax = receiverFax;
    return this;
  }

  /**
   * Get receiverFax
   * @return receiverFax
  **/
  @ApiModelProperty(value = "")


  public String getReceiverFax() {
    return receiverFax;
  }

  public void setReceiverFax(String receiverFax) {
    this.receiverFax = receiverFax;
  }

  public CreateTransactionRequest receiverEmail(String receiverEmail) {
    this.receiverEmail = receiverEmail;
    return this;
  }

  /**
   * Get receiverEmail
   * @return receiverEmail
  **/
  @ApiModelProperty(value = "")


  public String getReceiverEmail() {
    return receiverEmail;
  }

  public void setReceiverEmail(String receiverEmail) {
    this.receiverEmail = receiverEmail;
  }

  public CreateTransactionRequest receiverNationalityCode(String receiverNationalityCode) {
    this.receiverNationalityCode = receiverNationalityCode;
    return this;
  }

  /**
   * Get receiverNationalityCode
   * @return receiverNationalityCode
  **/
  @ApiModelProperty(value = "")


  public String getReceiverNationalityCode() {
    return receiverNationalityCode;
  }

  public void setReceiverNationalityCode(String receiverNationalityCode) {
    this.receiverNationalityCode = receiverNationalityCode;
  }

  public CreateTransactionRequest receiverGender(String receiverGender) {
    this.receiverGender = receiverGender;
    return this;
  }

  /**
   * Get receiverGender
   * @return receiverGender
  **/
  @ApiModelProperty(value = "")


  public String getReceiverGender() {
    return receiverGender;
  }

  public void setReceiverGender(String receiverGender) {
    this.receiverGender = receiverGender;
  }

  public CreateTransactionRequest receiverDateOfBirth(String receiverDateOfBirth) {
    this.receiverDateOfBirth = receiverDateOfBirth;
    return this;
  }

  /**
   * Get receiverDateOfBirth
   * @return receiverDateOfBirth
  **/
  @ApiModelProperty(value = "")


  public String getReceiverDateOfBirth() {
    return receiverDateOfBirth;
  }

  public void setReceiverDateOfBirth(String receiverDateOfBirth) {
    this.receiverDateOfBirth = receiverDateOfBirth;
  }

  public CreateTransactionRequest receiverOccupation(String receiverOccupation) {
    this.receiverOccupation = receiverOccupation;
    return this;
  }

  /**
   * Get receiverOccupation
   * @return receiverOccupation
  **/
  @ApiModelProperty(value = "")


  public String getReceiverOccupation() {
    return receiverOccupation;
  }

  public void setReceiverOccupation(String receiverOccupation) {
    this.receiverOccupation = receiverOccupation;
  }

  public CreateTransactionRequest receiverSenderRelationship(String receiverSenderRelationship) {
    this.receiverSenderRelationship = receiverSenderRelationship;
    return this;
  }

  /**
   * Get receiverSenderRelationship
   * @return receiverSenderRelationship
  **/
  @ApiModelProperty(value = "")


  public String getReceiverSenderRelationship() {
    return receiverSenderRelationship;
  }

  public void setReceiverSenderRelationship(String receiverSenderRelationship) {
    this.receiverSenderRelationship = receiverSenderRelationship;
  }

  public CreateTransactionRequest receiverSmsNotify(Integer receiverSmsNotify) {
    this.receiverSmsNotify = receiverSmsNotify;
    return this;
  }

  /**
   * Get receiverSmsNotify
   * @return receiverSmsNotify
  **/
  @ApiModelProperty(value = "")


  public Integer getReceiverSmsNotify() {
    return receiverSmsNotify;
  }

  public void setReceiverSmsNotify(Integer receiverSmsNotify) {
    this.receiverSmsNotify = receiverSmsNotify;
  }

  public CreateTransactionRequest receiverID(String receiverID) {
    this.receiverID = receiverID;
    return this;
  }

  /**
   * Get receiverID
   * @return receiverID
  **/
  @ApiModelProperty(value = "")


  public String getReceiverID() {
    return receiverID;
  }

  public void setReceiverID(String receiverID) {
    this.receiverID = receiverID;
  }

  public CreateTransactionRequest receiverIDType(String receiverIDType) {
    this.receiverIDType = receiverIDType;
    return this;
  }

  /**
   * Get receiverIDType
   * @return receiverIDType
  **/
  @ApiModelProperty(value = "")


  public String getReceiverIDType() {
    return receiverIDType;
  }

  public void setReceiverIDType(String receiverIDType) {
    this.receiverIDType = receiverIDType;
  }

  public CreateTransactionRequest receiverIDOtherType(String receiverIDOtherType) {
    this.receiverIDOtherType = receiverIDOtherType;
    return this;
  }

  /**
   * Get receiverIDOtherType
   * @return receiverIDOtherType
  **/
  @ApiModelProperty(value = "")


  public String getReceiverIDOtherType() {
    return receiverIDOtherType;
  }

  public void setReceiverIDOtherType(String receiverIDOtherType) {
    this.receiverIDOtherType = receiverIDOtherType;
  }

  public CreateTransactionRequest receiverIDIssuedBy(String receiverIDIssuedBy) {
    this.receiverIDIssuedBy = receiverIDIssuedBy;
    return this;
  }

  /**
   * Get receiverIDIssuedBy
   * @return receiverIDIssuedBy
  **/
  @ApiModelProperty(value = "")


  public String getReceiverIDIssuedBy() {
    return receiverIDIssuedBy;
  }

  public void setReceiverIDIssuedBy(String receiverIDIssuedBy) {
    this.receiverIDIssuedBy = receiverIDIssuedBy;
  }

  public CreateTransactionRequest receiverIDIssuedAt(String receiverIDIssuedAt) {
    this.receiverIDIssuedAt = receiverIDIssuedAt;
    return this;
  }

  /**
   * Get receiverIDIssuedAt
   * @return receiverIDIssuedAt
  **/
  @ApiModelProperty(value = "")


  public String getReceiverIDIssuedAt() {
    return receiverIDIssuedAt;
  }

  public void setReceiverIDIssuedAt(String receiverIDIssuedAt) {
    this.receiverIDIssuedAt = receiverIDIssuedAt;
  }

  public CreateTransactionRequest receiverIDIssueDate(String receiverIDIssueDate) {
    this.receiverIDIssueDate = receiverIDIssueDate;
    return this;
  }

  /**
   * Get receiverIDIssueDate
   * @return receiverIDIssueDate
  **/
  @ApiModelProperty(value = "")


  public String getReceiverIDIssueDate() {
    return receiverIDIssueDate;
  }

  public void setReceiverIDIssueDate(String receiverIDIssueDate) {
    this.receiverIDIssueDate = receiverIDIssueDate;
  }

  public CreateTransactionRequest receiverIDValidThru(String receiverIDValidThru) {
    this.receiverIDValidThru = receiverIDValidThru;
    return this;
  }

  /**
   * Get receiverIDValidThru
   * @return receiverIDValidThru
  **/
  @ApiModelProperty(value = "")


  public String getReceiverIDValidThru() {
    return receiverIDValidThru;
  }

  public void setReceiverIDValidThru(String receiverIDValidThru) {
    this.receiverIDValidThru = receiverIDValidThru;
  }

  public CreateTransactionRequest receiverIDIssuanceCountry(String receiverIDIssuanceCountry) {
    this.receiverIDIssuanceCountry = receiverIDIssuanceCountry;
    return this;
  }

  /**
   * Get receiverIDIssuanceCountry
   * @return receiverIDIssuanceCountry
  **/
  @ApiModelProperty(value = "")


  public String getReceiverIDIssuanceCountry() {
    return receiverIDIssuanceCountry;
  }

  public void setReceiverIDIssuanceCountry(String receiverIDIssuanceCountry) {
    this.receiverIDIssuanceCountry = receiverIDIssuanceCountry;
  }

  public CreateTransactionRequest receiverOtherInfo1(String receiverOtherInfo1) {
    this.receiverOtherInfo1 = receiverOtherInfo1;
    return this;
  }

  /**
   * Get receiverOtherInfo1
   * @return receiverOtherInfo1
  **/
  @ApiModelProperty(value = "")


  public String getReceiverOtherInfo1() {
    return receiverOtherInfo1;
  }

  public void setReceiverOtherInfo1(String receiverOtherInfo1) {
    this.receiverOtherInfo1 = receiverOtherInfo1;
  }

  public CreateTransactionRequest receiverOtherInfo2(String receiverOtherInfo2) {
    this.receiverOtherInfo2 = receiverOtherInfo2;
    return this;
  }

  /**
   * Get receiverOtherInfo2
   * @return receiverOtherInfo2
  **/
  @ApiModelProperty(value = "")


  public String getReceiverOtherInfo2() {
    return receiverOtherInfo2;
  }

  public void setReceiverOtherInfo2(String receiverOtherInfo2) {
    this.receiverOtherInfo2 = receiverOtherInfo2;
  }

  public CreateTransactionRequest receiverOtherInfo3(String receiverOtherInfo3) {
    this.receiverOtherInfo3 = receiverOtherInfo3;
    return this;
  }

  /**
   * Get receiverOtherInfo3
   * @return receiverOtherInfo3
  **/
  @ApiModelProperty(value = "")


  public String getReceiverOtherInfo3() {
    return receiverOtherInfo3;
  }

  public void setReceiverOtherInfo3(String receiverOtherInfo3) {
    this.receiverOtherInfo3 = receiverOtherInfo3;
  }

  public CreateTransactionRequest receiverOtherInfo4(String receiverOtherInfo4) {
    this.receiverOtherInfo4 = receiverOtherInfo4;
    return this;
  }

  /**
   * Get receiverOtherInfo4
   * @return receiverOtherInfo4
  **/
  @ApiModelProperty(value = "")


  public String getReceiverOtherInfo4() {
    return receiverOtherInfo4;
  }

  public void setReceiverOtherInfo4(String receiverOtherInfo4) {
    this.receiverOtherInfo4 = receiverOtherInfo4;
  }

  public CreateTransactionRequest receiverOtherInfo5(String receiverOtherInfo5) {
    this.receiverOtherInfo5 = receiverOtherInfo5;
    return this;
  }

  /**
   * Get receiverOtherInfo5
   * @return receiverOtherInfo5
  **/
  @ApiModelProperty(value = "")


  public String getReceiverOtherInfo5() {
    return receiverOtherInfo5;
  }

  public void setReceiverOtherInfo5(String receiverOtherInfo5) {
    this.receiverOtherInfo5 = receiverOtherInfo5;
  }

  public CreateTransactionRequest receiverBankAccountNo(String receiverBankAccountNo) {
    this.receiverBankAccountNo = receiverBankAccountNo;
    return this;
  }

  /**
   * Get receiverBankAccountNo
   * @return receiverBankAccountNo
  **/
  @ApiModelProperty(value = "")


  public String getReceiverBankAccountNo() {
    return receiverBankAccountNo;
  }

  public void setReceiverBankAccountNo(String receiverBankAccountNo) {
    this.receiverBankAccountNo = receiverBankAccountNo;
  }

  public CreateTransactionRequest receiverBankIBANNo(String receiverBankIBANNo) {
    this.receiverBankIBANNo = receiverBankIBANNo;
    return this;
  }

  /**
   * Get receiverBankIBANNo
   * @return receiverBankIBANNo
  **/
  @ApiModelProperty(value = "")


  public String getReceiverBankIBANNo() {
    return receiverBankIBANNo;
  }

  public void setReceiverBankIBANNo(String receiverBankIBANNo) {
    this.receiverBankIBANNo = receiverBankIBANNo;
  }

  public CreateTransactionRequest receiverCardNo(String receiverCardNo) {
    this.receiverCardNo = receiverCardNo;
    return this;
  }

  /**
   * Get receiverCardNo
   * @return receiverCardNo
  **/
  @ApiModelProperty(value = "")


  public String getReceiverCardNo() {
    return receiverCardNo;
  }

  public void setReceiverCardNo(String receiverCardNo) {
    this.receiverCardNo = receiverCardNo;
  }

  public CreateTransactionRequest receiverCardType(Integer receiverCardType) {
    this.receiverCardType = receiverCardType;
    return this;
  }

  /**
   * Get receiverCardType
   * @return receiverCardType
  **/
  @ApiModelProperty(value = "")


  public Integer getReceiverCardType() {
    return receiverCardType;
  }

  public void setReceiverCardType(Integer receiverCardType) {
    this.receiverCardType = receiverCardType;
  }

  public CreateTransactionRequest receiverWalletPatrnerCode(String receiverWalletPatrnerCode) {
    this.receiverWalletPatrnerCode = receiverWalletPatrnerCode;
    return this;
  }

  /**
   * Get receiverWalletPatrnerCode
   * @return receiverWalletPatrnerCode
  **/
  @ApiModelProperty(value = "")


  public String getReceiverWalletPatrnerCode() {
    return receiverWalletPatrnerCode;
  }

  public void setReceiverWalletPatrnerCode(String receiverWalletPatrnerCode) {
    this.receiverWalletPatrnerCode = receiverWalletPatrnerCode;
  }

  public CreateTransactionRequest receiverWalletNumber(String receiverWalletNumber) {
    this.receiverWalletNumber = receiverWalletNumber;
    return this;
  }

  /**
   * Get receiverWalletNumber
   * @return receiverWalletNumber
  **/
  @ApiModelProperty(value = "")


  public String getReceiverWalletNumber() {
    return receiverWalletNumber;
  }

  public void setReceiverWalletNumber(String receiverWalletNumber) {
    this.receiverWalletNumber = receiverWalletNumber;
  }

  public CreateTransactionRequest receiverEnglishName(String receiverEnglishName) {
    this.receiverEnglishName = receiverEnglishName;
    return this;
  }

  /**
   * Get receiverEnglishName
   * @return receiverEnglishName
  **/
  @ApiModelProperty(value = "")


  public String getReceiverEnglishName() {
    return receiverEnglishName;
  }

  public void setReceiverEnglishName(String receiverEnglishName) {
    this.receiverEnglishName = receiverEnglishName;
  }

  public CreateTransactionRequest receiverChineseNameInEnglish(String receiverChineseNameInEnglish) {
    this.receiverChineseNameInEnglish = receiverChineseNameInEnglish;
    return this;
  }

  /**
   * Get receiverChineseNameInEnglish
   * @return receiverChineseNameInEnglish
  **/
  @ApiModelProperty(value = "")


  public String getReceiverChineseNameInEnglish() {
    return receiverChineseNameInEnglish;
  }

  public void setReceiverChineseNameInEnglish(String receiverChineseNameInEnglish) {
    this.receiverChineseNameInEnglish = receiverChineseNameInEnglish;
  }

  public CreateTransactionRequest receiverBankAccountName(String receiverBankAccountName) {
    this.receiverBankAccountName = receiverBankAccountName;
    return this;
  }

  /**
   * Get receiverBankAccountName
   * @return receiverBankAccountName
  **/
  @ApiModelProperty(value = "")


  public String getReceiverBankAccountName() {
    return receiverBankAccountName;
  }

  public void setReceiverBankAccountName(String receiverBankAccountName) {
    this.receiverBankAccountName = receiverBankAccountName;
  }

  public CreateTransactionRequest receiverBankCode(String receiverBankCode) {
    this.receiverBankCode = receiverBankCode;
    return this;
  }

  /**
   * Get receiverBankCode
   * @return receiverBankCode
  **/
  @ApiModelProperty(value = "")


  public String getReceiverBankCode() {
    return receiverBankCode;
  }

  public void setReceiverBankCode(String receiverBankCode) {
    this.receiverBankCode = receiverBankCode;
  }

  public CreateTransactionRequest receiverBankBranchCode(String receiverBankBranchCode) {
    this.receiverBankBranchCode = receiverBankBranchCode;
    return this;
  }

  /**
   * Get receiverBankBranchCode
   * @return receiverBankBranchCode
  **/
  @ApiModelProperty(value = "")


  public String getReceiverBankBranchCode() {
    return receiverBankBranchCode;
  }

  public void setReceiverBankBranchCode(String receiverBankBranchCode) {
    this.receiverBankBranchCode = receiverBankBranchCode;
  }

  public CreateTransactionRequest receiverBranchIdentifier(String receiverBranchIdentifier) {
    this.receiverBranchIdentifier = receiverBranchIdentifier;
    return this;
  }

  /**
   * Get receiverBranchIdentifier
   * @return receiverBranchIdentifier
  **/
  @ApiModelProperty(value = "")


  public String getReceiverBranchIdentifier() {
    return receiverBranchIdentifier;
  }

  public void setReceiverBranchIdentifier(String receiverBranchIdentifier) {
    this.receiverBranchIdentifier = receiverBranchIdentifier;
  }

  public CreateTransactionRequest receiverBankBranchName(String receiverBankBranchName) {
    this.receiverBankBranchName = receiverBankBranchName;
    return this;
  }

  /**
   * Get receiverBankBranchName
   * @return receiverBankBranchName
  **/
  @ApiModelProperty(value = "")


  public String getReceiverBankBranchName() {
    return receiverBankBranchName;
  }

  public void setReceiverBankBranchName(String receiverBankBranchName) {
    this.receiverBankBranchName = receiverBankBranchName;
  }

  public CreateTransactionRequest receivingAgentCode(String receivingAgentCode) {
    this.receivingAgentCode = receivingAgentCode;
    return this;
  }

  /**
   * Get receivingAgentCode
   * @return receivingAgentCode
  **/
  @ApiModelProperty(value = "")


  public String getReceivingAgentCode() {
    return receivingAgentCode;
  }

  public void setReceivingAgentCode(String receivingAgentCode) {
    this.receivingAgentCode = receivingAgentCode;
  }

  public CreateTransactionRequest serviceType(String serviceType) {
    this.serviceType = serviceType;
    return this;
  }

  /**
   * Get serviceType
   * @return serviceType
  **/
  @ApiModelProperty(value = "")


  public String getServiceType() {
    return serviceType;
  }

  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }

  public CreateTransactionRequest productType(String productType) {
    this.productType = productType;
    return this;
  }

  /**
   * Get productType
   * @return productType
  **/
  @ApiModelProperty(value = "")


  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public CreateTransactionRequest sourceOfIncome(String sourceOfIncome) {
    this.sourceOfIncome = sourceOfIncome;
    return this;
  }

  /**
   * Get sourceOfIncome
   * @return sourceOfIncome
  **/
  @ApiModelProperty(value = "")


  public String getSourceOfIncome() {
    return sourceOfIncome;
  }

  public void setSourceOfIncome(String sourceOfIncome) {
    this.sourceOfIncome = sourceOfIncome;
  }

  public CreateTransactionRequest purposeOfTxn(String purposeOfTxn) {
    this.purposeOfTxn = purposeOfTxn;
    return this;
  }

  /**
   * Get purposeOfTxn
   * @return purposeOfTxn
  **/
  @ApiModelProperty(value = "")


  public String getPurposeOfTxn() {
    return purposeOfTxn;
  }

  public void setPurposeOfTxn(String purposeOfTxn) {
    this.purposeOfTxn = purposeOfTxn;
  }

  public CreateTransactionRequest purposeOfTxnDetails(String purposeOfTxnDetails) {
    this.purposeOfTxnDetails = purposeOfTxnDetails;
    return this;
  }

  /**
   * Get purposeOfTxnDetails
   * @return purposeOfTxnDetails
  **/
  @ApiModelProperty(value = "")


  public String getPurposeOfTxnDetails() {
    return purposeOfTxnDetails;
  }

  public void setPurposeOfTxnDetails(String purposeOfTxnDetails) {
    this.purposeOfTxnDetails = purposeOfTxnDetails;
  }

  public CreateTransactionRequest calculationModel(Integer calculationModel) {
    this.calculationModel = calculationModel;
    return this;
  }

  /**
   * Get calculationModel
   * @return calculationModel
  **/
  @ApiModelProperty(value = "")


  public Integer getCalculationModel() {
    return calculationModel;
  }

  public void setCalculationModel(Integer calculationModel) {
    this.calculationModel = calculationModel;
  }

  public CreateTransactionRequest transactionMode(Integer transactionMode) {
    this.transactionMode = transactionMode;
    return this;
  }

  /**
   * Get transactionMode
   * @return transactionMode
  **/
  @ApiModelProperty(value = "")


  public Integer getTransactionMode() {
    return transactionMode;
  }

  public void setTransactionMode(Integer transactionMode) {
    this.transactionMode = transactionMode;
  }

  public CreateTransactionRequest txnOtherInfo1(String txnOtherInfo1) {
    this.txnOtherInfo1 = txnOtherInfo1;
    return this;
  }

  /**
   * Get txnOtherInfo1
   * @return txnOtherInfo1
  **/
  @ApiModelProperty(value = "")


  public String getTxnOtherInfo1() {
    return txnOtherInfo1;
  }

  public void setTxnOtherInfo1(String txnOtherInfo1) {
    this.txnOtherInfo1 = txnOtherInfo1;
  }

  public CreateTransactionRequest txnOtherInfo2(String txnOtherInfo2) {
    this.txnOtherInfo2 = txnOtherInfo2;
    return this;
  }

  /**
   * Get txnOtherInfo2
   * @return txnOtherInfo2
  **/
  @ApiModelProperty(value = "")


  public String getTxnOtherInfo2() {
    return txnOtherInfo2;
  }

  public void setTxnOtherInfo2(String txnOtherInfo2) {
    this.txnOtherInfo2 = txnOtherInfo2;
  }

  public CreateTransactionRequest txnOtherInfo3(String txnOtherInfo3) {
    this.txnOtherInfo3 = txnOtherInfo3;
    return this;
  }

  /**
   * Get txnOtherInfo3
   * @return txnOtherInfo3
  **/
  @ApiModelProperty(value = "")


  public String getTxnOtherInfo3() {
    return txnOtherInfo3;
  }

  public void setTxnOtherInfo3(String txnOtherInfo3) {
    this.txnOtherInfo3 = txnOtherInfo3;
  }

  
  /**
   * Get txnOtherInfo4
   * @return txnOtherInfo4
  **/
  @ApiModelProperty(value = "")


  public CreateTransactionRequest txnOtherInfo5(String txnOtherInfo5) {
    this.txnOtherInfo5 = txnOtherInfo5;
    return this;
  }

  public String getTxnOtherInfo4() {
	return txnOtherInfo4;
}

public void setTxnOtherInfo4(String txnOtherInfo4) {
	this.txnOtherInfo4 = txnOtherInfo4;
}

/**
   * Get txnOtherInfo5
   * @return txnOtherInfo5
  **/
  @ApiModelProperty(value = "")


  public String getTxnOtherInfo5() {
    return txnOtherInfo5;
  }

  public void setTxnOtherInfo5(String txnOtherInfo5) {
    this.txnOtherInfo5 = txnOtherInfo5;
  }

  public CreateTransactionRequest paymentMode(String paymentMode) {
    this.paymentMode = paymentMode;
    return this;
  }

  /**
   * Get paymentMode
   * @return paymentMode
  **/
  @ApiModelProperty(value = "")


  public String getPaymentMode() {
    return paymentMode;
  }

  public void setPaymentMode(String paymentMode) {
    this.paymentMode = paymentMode;
  }

  public CreateTransactionRequest xchgRatePayin2Payout(Double xchgRatePayin2Payout) {
    this.xchgRatePayin2Payout = xchgRatePayin2Payout;
    return this;
  }

  /**
   * Get xchgRatePayin2Payout
   * @return xchgRatePayin2Payout
  **/
  @ApiModelProperty(value = "")


  public Double getXchgRatePayin2Payout() {
    return xchgRatePayin2Payout;
  }

  public void setXchgRatePayin2Payout(Double xchgRatePayin2Payout) {
    this.xchgRatePayin2Payout = xchgRatePayin2Payout;
  }

  public CreateTransactionRequest payinCcyCode(String payinCcyCode) {
    this.payinCcyCode = payinCcyCode;
    return this;
  }

  /**
   * Get payinCcyCode
   * @return payinCcyCode
  **/
  @ApiModelProperty(value = "")


  public String getPayinCcyCode() {
    return payinCcyCode;
  }

  public void setPayinCcyCode(String payinCcyCode) {
    this.payinCcyCode = payinCcyCode;
  }

  public CreateTransactionRequest payinAmount(Double payinAmount) {
    this.payinAmount = payinAmount;
    return this;
  }

  /**
   * Get payinAmount
   * @return payinAmount
  **/
  @ApiModelProperty(value = "")


  public Double getPayinAmount() {
    return payinAmount;
  }

  public void setPayinAmount(Double payinAmount) {
    this.payinAmount = payinAmount;
  }

  public CreateTransactionRequest payoutCcyCode(String payoutCcyCode) {
    this.payoutCcyCode = payoutCcyCode;
    return this;
  }

  /**
   * Get payoutCcyCode
   * @return payoutCcyCode
  **/
  @ApiModelProperty(value = "")


  public String getPayoutCcyCode() {
    return payoutCcyCode;
  }

  public void setPayoutCcyCode(String payoutCcyCode) {
    this.payoutCcyCode = payoutCcyCode;
  }

  public CreateTransactionRequest payoutAmount(Double payoutAmount) {
    this.payoutAmount = payoutAmount;
    return this;
  }

  /**
   * Get payoutAmount
   * @return payoutAmount
  **/
  @ApiModelProperty(value = "")


  public Double getPayoutAmount() {
    return payoutAmount;
  }

  public void setPayoutAmount(Double payoutAmount) {
    this.payoutAmount = payoutAmount;
  }

  public CreateTransactionRequest tax(Double tax) {
    this.tax = tax;
    return this;
  }

  /**
   * Get tax
   * @return tax
  **/
  @ApiModelProperty(value = "")


  public Double getTax() {
    return tax;
  }

  public void setTax(Double tax) {
    this.tax = tax;
  }

  public CreateTransactionRequest cardCharges(Double cardCharges) {
    this.cardCharges = cardCharges;
    return this;
  }

  /**
   * Get cardCharges
   * @return cardCharges
  **/
  @ApiModelProperty(value = "")


  public Double getCardCharges() {
    return cardCharges;
  }

  public void setCardCharges(Double cardCharges) {
    this.cardCharges = cardCharges;
  }

  public CreateTransactionRequest otherCharges(Double otherCharges) {
    this.otherCharges = otherCharges;
    return this;
  }

  /**
   * Get otherCharges
   * @return otherCharges
  **/
  @ApiModelProperty(value = "")


  public Double getOtherCharges() {
    return otherCharges;
  }

  public void setOtherCharges(Double otherCharges) {
    this.otherCharges = otherCharges;
  }

  public CreateTransactionRequest additionalCharges(Double additionalCharges) {
    this.additionalCharges = additionalCharges;
    return this;
  }

  /**
   * Get additionalCharges
   * @return additionalCharges
  **/
  @ApiModelProperty(value = "")


  public Double getAdditionalCharges() {
    return additionalCharges;
  }

  public void setAdditionalCharges(Double additionalCharges) {
    this.additionalCharges = additionalCharges;
  }

  public CreateTransactionRequest commission(Double commission) {
    this.commission = commission;
    return this;
  }

  /**
   * Get commission
   * @return commission
  **/
  @ApiModelProperty(value = "")


  public Double getCommission() {
    return commission;
  }

  public void setCommission(Double commission) {
    this.commission = commission;
  }

  public CreateTransactionRequest partnerCommission(Double partnerCommission) {
    this.partnerCommission = partnerCommission;
    return this;
  }

  /**
   * Get partnerCommission
   * @return partnerCommission
  **/
  @ApiModelProperty(value = "")


  public Double getPartnerCommission() {
    return partnerCommission;
  }

  public void setPartnerCommission(Double partnerCommission) {
    this.partnerCommission = partnerCommission;
  }

  public CreateTransactionRequest totalPayinAmount(Double totalPayinAmount) {
    this.totalPayinAmount = totalPayinAmount;
    return this;
  }

  /**
   * Get totalPayinAmount
   * @return totalPayinAmount
  **/
  @ApiModelProperty(value = "")


  public Double getTotalPayinAmount() {
    return totalPayinAmount;
  }

  public void setTotalPayinAmount(Double totalPayinAmount) {
    this.totalPayinAmount = totalPayinAmount;
  }

  public CreateTransactionRequest rateOtherInfo1(String rateOtherInfo1) {
    this.rateOtherInfo1 = rateOtherInfo1;
    return this;
  }

  /**
   * Get rateOtherInfo1
   * @return rateOtherInfo1
  **/
  @ApiModelProperty(value = "")


  public String getRateOtherInfo1() {
    return rateOtherInfo1;
  }

  public void setRateOtherInfo1(String rateOtherInfo1) {
    this.rateOtherInfo1 = rateOtherInfo1;
  }

  public CreateTransactionRequest rateOtherInfo2(String rateOtherInfo2) {
    this.rateOtherInfo2 = rateOtherInfo2;
    return this;
  }

  /**
   * Get rateOtherInfo2
   * @return rateOtherInfo2
  **/
  @ApiModelProperty(value = "")


  public String getRateOtherInfo2() {
    return rateOtherInfo2;
  }

  public void setRateOtherInfo2(String rateOtherInfo2) {
    this.rateOtherInfo2 = rateOtherInfo2;
  }

  public CreateTransactionRequest rateOtherInfo3(String rateOtherInfo3) {
    this.rateOtherInfo3 = rateOtherInfo3;
    return this;
  }

  /**
   * Get rateOtherInfo3
   * @return rateOtherInfo3
  **/
  @ApiModelProperty(value = "")


  public String getRateOtherInfo3() {
    return rateOtherInfo3;
  }

  public void setRateOtherInfo3(String rateOtherInfo3) {
    this.rateOtherInfo3 = rateOtherInfo3;
  }

  public CreateTransactionRequest rateOtherInfo4(String rateOtherInfo4) {
    this.rateOtherInfo4 = rateOtherInfo4;
    return this;
  }

  /**
   * Get rateOtherInfo4
   * @return rateOtherInfo4
  **/
  @ApiModelProperty(value = "")


  public String getRateOtherInfo4() {
    return rateOtherInfo4;
  }

  public void setRateOtherInfo4(String rateOtherInfo4) {
    this.rateOtherInfo4 = rateOtherInfo4;
  }

  public CreateTransactionRequest rateOtherInfo5(String rateOtherInfo5) {
    this.rateOtherInfo5 = rateOtherInfo5;
    return this;
  }

  /**
   * Get rateOtherInfo5
   * @return rateOtherInfo5
  **/
  @ApiModelProperty(value = "")


  public String getRateOtherInfo5() {
    return rateOtherInfo5;
  }

  public void setRateOtherInfo5(String rateOtherInfo5) {
    this.rateOtherInfo5 = rateOtherInfo5;
  }

  public CreateTransactionRequest paymentOtherInfo1(String paymentOtherInfo1) {
    this.paymentOtherInfo1 = paymentOtherInfo1;
    return this;
  }

  /**
   * Get paymentOtherInfo1
   * @return paymentOtherInfo1
  **/
  @ApiModelProperty(value = "")


  public String getPaymentOtherInfo1() {
    return paymentOtherInfo1;
  }

  public void setPaymentOtherInfo1(String paymentOtherInfo1) {
    this.paymentOtherInfo1 = paymentOtherInfo1;
  }

  public CreateTransactionRequest paymentOtherInfo2(String paymentOtherInfo2) {
    this.paymentOtherInfo2 = paymentOtherInfo2;
    return this;
  }

  /**
   * Get paymentOtherInfo2
   * @return paymentOtherInfo2
  **/
  @ApiModelProperty(value = "")


  public String getPaymentOtherInfo2() {
    return paymentOtherInfo2;
  }

  public void setPaymentOtherInfo2(String paymentOtherInfo2) {
    this.paymentOtherInfo2 = paymentOtherInfo2;
  }

  public CreateTransactionRequest paymentOtherInfo3(String paymentOtherInfo3) {
    this.paymentOtherInfo3 = paymentOtherInfo3;
    return this;
  }

  /**
   * Get paymentOtherInfo3
   * @return paymentOtherInfo3
  **/
  @ApiModelProperty(value = "")


  public String getPaymentOtherInfo3() {
    return paymentOtherInfo3;
  }

  public void setPaymentOtherInfo3(String paymentOtherInfo3) {
    this.paymentOtherInfo3 = paymentOtherInfo3;
  }

  public CreateTransactionRequest paymentOtherInfo4(String paymentOtherInfo4) {
    this.paymentOtherInfo4 = paymentOtherInfo4;
    return this;
  }

  /**
   * Get paymentOtherInfo4
   * @return paymentOtherInfo4
  **/
  @ApiModelProperty(value = "")


  public String getPaymentOtherInfo4() {
    return paymentOtherInfo4;
  }

  public void setPaymentOtherInfo4(String paymentOtherInfo4) {
    this.paymentOtherInfo4 = paymentOtherInfo4;
  }

  public CreateTransactionRequest paymentOtherInfo5(String paymentOtherInfo5) {
    this.paymentOtherInfo5 = paymentOtherInfo5;
    return this;
  }

  /**
   * Get paymentOtherInfo5
   * @return paymentOtherInfo5
  **/
  @ApiModelProperty(value = "")


  public String getPaymentOtherInfo5() {
    return paymentOtherInfo5;
  }

  public void setPaymentOtherInfo5(String paymentOtherInfo5) {
    this.paymentOtherInfo5 = paymentOtherInfo5;
  }

  public CreateTransactionRequest promotionRefNumber(String promotionRefNumber) {
    this.promotionRefNumber = promotionRefNumber;
    return this;
  }

  /**
   * Get promotionRefNumber
   * @return promotionRefNumber
  **/
  @ApiModelProperty(value = "")


  public String getPromotionRefNumber() {
    return promotionRefNumber;
  }

  public void setPromotionRefNumber(String promotionRefNumber) {
    this.promotionRefNumber = promotionRefNumber;
  }

  public CreateTransactionRequest promotionMessageDescription(String promotionMessageDescription) {
    this.promotionMessageDescription = promotionMessageDescription;
    return this;
  }

  /**
   * Get promotionMessageDescription
   * @return promotionMessageDescription
  **/
  @ApiModelProperty(value = "")


  public String getPromotionMessageDescription() {
    return promotionMessageDescription;
  }

  public void setPromotionMessageDescription(String promotionMessageDescription) {
    this.promotionMessageDescription = promotionMessageDescription;
  }

  public CreateTransactionRequest promotionalData1(String promotionalData1) {
    this.promotionalData1 = promotionalData1;
    return this;
  }

  /**
   * Get promotionalData1
   * @return promotionalData1
  **/
  @ApiModelProperty(value = "")


  public String getPromotionalData1() {
    return promotionalData1;
  }

  public void setPromotionalData1(String promotionalData1) {
    this.promotionalData1 = promotionalData1;
  }

  public CreateTransactionRequest promotionalData2(String promotionalData2) {
    this.promotionalData2 = promotionalData2;
    return this;
  }

  /**
   * Get promotionalData2
   * @return promotionalData2
  **/
  @ApiModelProperty(value = "")


  public String getPromotionalData2() {
    return promotionalData2;
  }

  public void setPromotionalData2(String promotionalData2) {
    this.promotionalData2 = promotionalData2;
  }

  public CreateTransactionRequest promotionalData3(String promotionalData3) {
    this.promotionalData3 = promotionalData3;
    return this;
  }

  /**
   * Get promotionalData3
   * @return promotionalData3
  **/
  @ApiModelProperty(value = "")


  public String getPromotionalData3() {
    return promotionalData3;
  }

  public void setPromotionalData3(String promotionalData3) {
    this.promotionalData3 = promotionalData3;
  }

  public CreateTransactionRequest promotionalData4(String promotionalData4) {
    this.promotionalData4 = promotionalData4;
    return this;
  }

  /**
   * Get promotionalData4
   * @return promotionalData4
  **/
  @ApiModelProperty(value = "")


  public String getPromotionalData4() {
    return promotionalData4;
  }

  public void setPromotionalData4(String promotionalData4) {
    this.promotionalData4 = promotionalData4;
  }

  public CreateTransactionRequest promotionCcyCode(String promotionCcyCode) {
    this.promotionCcyCode = promotionCcyCode;
    return this;
  }

  /**
   * Get promotionCcyCode
   * @return promotionCcyCode
  **/
  @ApiModelProperty(value = "")


  public String getPromotionCcyCode() {
    return promotionCcyCode;
  }

  public void setPromotionCcyCode(String promotionCcyCode) {
    this.promotionCcyCode = promotionCcyCode;
  }

  public CreateTransactionRequest discountField(String discountField) {
    this.discountField = discountField;
    return this;
  }

  /**
   * Get discountField
   * @return discountField
  **/
  @ApiModelProperty(value = "")


  public String getDiscountField() {
    return discountField;
  }

  public void setDiscountField(String discountField) {
    this.discountField = discountField;
  }

  public CreateTransactionRequest ruleFlag(Integer ruleFlag) {
    this.ruleFlag = ruleFlag;
    return this;
  }

  /**
   * Get ruleFlag
   * @return ruleFlag
  **/
  @ApiModelProperty(value = "")


  public Integer getRuleFlag() {
    return ruleFlag;
  }

  public void setRuleFlag(Integer ruleFlag) {
    this.ruleFlag = ruleFlag;
  }

  public CreateTransactionRequest controlFlag(Integer controlFlag) {
    this.controlFlag = controlFlag;
    return this;
  }

  /**
   * Get controlFlag
   * @return controlFlag
  **/
  @ApiModelProperty(value = "")


  public Integer getControlFlag() {
    return controlFlag;
  }

  public void setControlFlag(Integer controlFlag) {
    this.controlFlag = controlFlag;
  }

  public CreateTransactionRequest externalFlag(Integer externalFlag) {
    this.externalFlag = externalFlag;
    return this;
  }

  /**
   * Get externalFlag
   * @return externalFlag
  **/
  @ApiModelProperty(value = "")


  public Integer getExternalFlag() {
    return externalFlag;
  }

  public void setExternalFlag(Integer externalFlag) {
    this.externalFlag = externalFlag;
  }

  public CreateTransactionRequest reservedParam1(String reservedParam1) {
    this.reservedParam1 = reservedParam1;
    return this;
  }

  /**
   * Get reservedParam1
   * @return reservedParam1
  **/
  @ApiModelProperty(value = "")


  public String getReservedParam1() {
    return reservedParam1;
  }

  public void setReservedParam1(String reservedParam1) {
    this.reservedParam1 = reservedParam1;
  }

  public CreateTransactionRequest reservedParam2(String reservedParam2) {
    this.reservedParam2 = reservedParam2;
    return this;
  }

  /**
   * Get reservedParam2
   * @return reservedParam2
  **/
  @ApiModelProperty(value = "")


  public String getReservedParam2() {
    return reservedParam2;
  }

  public void setReservedParam2(String reservedParam2) {
    this.reservedParam2 = reservedParam2;
  }

  public CreateTransactionRequest reservedParam3(String reservedParam3) {
    this.reservedParam3 = reservedParam3;
    return this;
  }

  /**
   * Get reservedParam3
   * @return reservedParam3
  **/
  @ApiModelProperty(value = "")


  public String getReservedParam3() {
    return reservedParam3;
  }

  public void setReservedParam3(String reservedParam3) {
    this.reservedParam3 = reservedParam3;
  }

  public CreateTransactionRequest reservedParam4(String reservedParam4) {
    this.reservedParam4 = reservedParam4;
    return this;
  }

  /**
   * Get reservedParam4
   * @return reservedParam4
  **/
  @ApiModelProperty(value = "")


  public String getReservedParam4() {
    return reservedParam4;
  }

  public void setReservedParam4(String reservedParam4) {
    this.reservedParam4 = reservedParam4;
  }

  public CreateTransactionRequest reservedParam5(String reservedParam5) {
    this.reservedParam5 = reservedParam5;
    return this;
  }

  /**
   * Get reservedParam5
   * @return reservedParam5
  **/
  @ApiModelProperty(value = "")


  public String getReservedParam5() {
    return reservedParam5;
  }

  public void setReservedParam5(String reservedParam5) {
    this.reservedParam5 = reservedParam5;
  }

  public CreateTransactionRequest reservedParam6(String reservedParam6) {
    this.reservedParam6 = reservedParam6;
    return this;
  }

  /**
   * Get reservedParam6
   * @return reservedParam6
  **/
  @ApiModelProperty(value = "")


  public String getReservedParam6() {
    return reservedParam6;
  }

  public void setReservedParam6(String reservedParam6) {
    this.reservedParam6 = reservedParam6;
  }

  public CreateTransactionRequest reservedParam7(String reservedParam7) {
    this.reservedParam7 = reservedParam7;
    return this;
  }

  /**
   * Get reservedParam7
   * @return reservedParam7
  **/
  @ApiModelProperty(value = "")


  public String getReservedParam7() {
    return reservedParam7;
  }

  public void setReservedParam7(String reservedParam7) {
    this.reservedParam7 = reservedParam7;
  }

  public CreateTransactionRequest reservedParam8(String reservedParam8) {
    this.reservedParam8 = reservedParam8;
    return this;
  }

  /**
   * Get reservedParam8
   * @return reservedParam8
  **/
  @ApiModelProperty(value = "")


  public String getReservedParam8() {
    return reservedParam8;
  }

  public void setReservedParam8(String reservedParam8) {
    this.reservedParam8 = reservedParam8;
  }

  public CreateTransactionRequest reservedParam9(String reservedParam9) {
    this.reservedParam9 = reservedParam9;
    return this;
  }

  /**
   * Get reservedParam9
   * @return reservedParam9
  **/
  @ApiModelProperty(value = "")


  public String getReservedParam9() {
    return reservedParam9;
  }

  public void setReservedParam9(String reservedParam9) {
    this.reservedParam9 = reservedParam9;
  }

  public CreateTransactionRequest reservedParam10(String reservedParam10) {
    this.reservedParam10 = reservedParam10;
    return this;
  }

  /**
   * Get reservedParam10
   * @return reservedParam10
  **/
  @ApiModelProperty(value = "")


  public String getReservedParam10() {
    return reservedParam10;
  }

  public void setReservedParam10(String reservedParam10) {
    this.reservedParam10 = reservedParam10;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTransactionRequest createTransactionRequest = (CreateTransactionRequest) o;
    return Objects.equals(this.validateOnlyFlag, createTransactionRequest.validateOnlyFlag) &&
        Objects.equals(this.overrideRateFlag, createTransactionRequest.overrideRateFlag) &&
        Objects.equals(this.partnerTxnRefNo, createTransactionRequest.partnerTxnRefNo) &&
        Objects.equals(this.requiresAuthorization, createTransactionRequest.requiresAuthorization) &&
        Objects.equals(this.crmRefNumber, createTransactionRequest.crmRefNumber) &&
        Objects.equals(this.crmLeadRefNumber, createTransactionRequest.crmLeadRefNumber) &&
        Objects.equals(this.specialDealRefNumber, createTransactionRequest.specialDealRefNumber) &&
        Objects.equals(this.sendingAgentCode, createTransactionRequest.sendingAgentCode) &&
        Objects.equals(this.serviceProviderCode, createTransactionRequest.serviceProviderCode) &&
        Objects.equals(this.senderProfile, createTransactionRequest.senderProfile) &&
        Objects.equals(this.receiverProfile, createTransactionRequest.receiverProfile) &&
        Objects.equals(this.senderType, createTransactionRequest.senderType) &&
        Objects.equals(this.receiverType, createTransactionRequest.receiverType) &&
        Objects.equals(this.senderRefNumber, createTransactionRequest.senderRefNumber) &&
        Objects.equals(this.senderFirstName, createTransactionRequest.senderFirstName) &&
        Objects.equals(this.senderMiddleName, createTransactionRequest.senderMiddleName) &&
        Objects.equals(this.senderLastName, createTransactionRequest.senderLastName) &&
        Objects.equals(this.senderPOBox, createTransactionRequest.senderPOBox) &&
        Objects.equals(this.senderAddress1, createTransactionRequest.senderAddress1) &&
        Objects.equals(this.senderAddress2, createTransactionRequest.senderAddress2) &&
        Objects.equals(this.senderCity, createTransactionRequest.senderCity) &&
        Objects.equals(this.senderDistrict, createTransactionRequest.senderDistrict) &&
        Objects.equals(this.senderState, createTransactionRequest.senderState) &&
        Objects.equals(this.senderCountryCode, createTransactionRequest.senderCountryCode) &&
        Objects.equals(this.senderZipCode, createTransactionRequest.senderZipCode) &&
        Objects.equals(this.senderMobile, createTransactionRequest.senderMobile) &&
        Objects.equals(this.senderPhone, createTransactionRequest.senderPhone) &&
        Objects.equals(this.senderFax, createTransactionRequest.senderFax) &&
        Objects.equals(this.senderEmail, createTransactionRequest.senderEmail) &&
        Objects.equals(this.senderOtherInfo, createTransactionRequest.senderOtherInfo) &&
        Objects.equals(this.senderMessageToBeneficiary, createTransactionRequest.senderMessageToBeneficiary) &&
        Objects.equals(this.senderSelfDeclaration, createTransactionRequest.senderSelfDeclaration) &&
        Objects.equals(this.senderGender, createTransactionRequest.senderGender) &&
        Objects.equals(this.senderDateOfBirth, createTransactionRequest.senderDateOfBirth) &&
        Objects.equals(this.senderNationalityCode, createTransactionRequest.senderNationalityCode) &&
        Objects.equals(this.senderOccupation, createTransactionRequest.senderOccupation) &&
        Objects.equals(this.senderPlaceOfBirth, createTransactionRequest.senderPlaceOfBirth) &&
        Objects.equals(this.senderEmployerName, createTransactionRequest.senderEmployerName) &&
        Objects.equals(this.senderEmployerPhone, createTransactionRequest.senderEmployerPhone) &&
        Objects.equals(this.senderID, createTransactionRequest.senderID) &&
        Objects.equals(this.senderIDType, createTransactionRequest.senderIDType) &&
        Objects.equals(this.senderIDOtherType, createTransactionRequest.senderIDOtherType) &&
        Objects.equals(this.senderIDIssuedBy, createTransactionRequest.senderIDIssuedBy) &&
        Objects.equals(this.senderIDIssuedAt, createTransactionRequest.senderIDIssuedAt) &&
        Objects.equals(this.senderIDIssueDate, createTransactionRequest.senderIDIssueDate) &&
        Objects.equals(this.senderIDValidThru, createTransactionRequest.senderIDValidThru) &&
        Objects.equals(this.senderIDIssuanceCountry, createTransactionRequest.senderIDIssuanceCountry) &&
        Objects.equals(this.senderIDOtherInfo, createTransactionRequest.senderIDOtherInfo) &&
        Objects.equals(this.senderIDRemarks, createTransactionRequest.senderIDRemarks) &&
        Objects.equals(this.senderproofOfAddress, createTransactionRequest.senderproofOfAddress) &&
        Objects.equals(this.senderID2, createTransactionRequest.senderID2) &&
        Objects.equals(this.senderID2Type, createTransactionRequest.senderID2Type) &&
        Objects.equals(this.senderID2IssuedBy, createTransactionRequest.senderID2IssuedBy) &&
        Objects.equals(this.senderID2IssuedAt, createTransactionRequest.senderID2IssuedAt) &&
        Objects.equals(this.senderID2IssueDate, createTransactionRequest.senderID2IssueDate) &&
        Objects.equals(this.senderID2ValidThru, createTransactionRequest.senderID2ValidThru) &&
        Objects.equals(this.senderID2IssuanceCountry, createTransactionRequest.senderID2IssuanceCountry) &&
        Objects.equals(this.senderID2OtherInfo, createTransactionRequest.senderID2OtherInfo) &&
        Objects.equals(this.senderID2Remarks, createTransactionRequest.senderID2Remarks) &&
        Objects.equals(this.taxRegNo, createTransactionRequest.taxRegNo) &&
        Objects.equals(this.taxRegNoIssuedCountry, createTransactionRequest.taxRegNoIssuedCountry) &&
        Objects.equals(this.ekycVerifiedSource, createTransactionRequest.ekycVerifiedSource) &&
        Objects.equals(this.ekycValidatedSource, createTransactionRequest.ekycValidatedSource) &&
        Objects.equals(this.ekycValidatedOn, createTransactionRequest.ekycValidatedOn) &&
        Objects.equals(this.senderOtherInfo1, createTransactionRequest.senderOtherInfo1) &&
        Objects.equals(this.senderOtherInfo2, createTransactionRequest.senderOtherInfo2) &&
        Objects.equals(this.senderOtherInfo3, createTransactionRequest.senderOtherInfo3) &&
        Objects.equals(this.senderOtherInfo4, createTransactionRequest.senderOtherInfo4) &&
        Objects.equals(this.senderOtherInfo5, createTransactionRequest.senderOtherInfo5) &&
        Objects.equals(this.receiverRefNumber, createTransactionRequest.receiverRefNumber) &&
        Objects.equals(this.receiverFirstName, createTransactionRequest.receiverFirstName) &&
        Objects.equals(this.receiverMiddleName, createTransactionRequest.receiverMiddleName) &&
        Objects.equals(this.receiverLastName, createTransactionRequest.receiverLastName) &&
        Objects.equals(this.deliveryOption, createTransactionRequest.deliveryOption) &&
        Objects.equals(this.receiverAddress1, createTransactionRequest.receiverAddress1) &&
        Objects.equals(this.receiverAddress2, createTransactionRequest.receiverAddress2) &&
        Objects.equals(this.receiverCity, createTransactionRequest.receiverCity) &&
        Objects.equals(this.receiverCountryCode, createTransactionRequest.receiverCountryCode) &&
        Objects.equals(this.receiverDistrict, createTransactionRequest.receiverDistrict) &&
        Objects.equals(this.receiverState, createTransactionRequest.receiverState) &&
        Objects.equals(this.receiverPOBox, createTransactionRequest.receiverPOBox) &&
        Objects.equals(this.receiverZipCode, createTransactionRequest.receiverZipCode) &&
        Objects.equals(this.receiverPhone, createTransactionRequest.receiverPhone) &&
        Objects.equals(this.receiverMobile, createTransactionRequest.receiverMobile) &&
        Objects.equals(this.receiverFax, createTransactionRequest.receiverFax) &&
        Objects.equals(this.receiverEmail, createTransactionRequest.receiverEmail) &&
        Objects.equals(this.receiverNationalityCode, createTransactionRequest.receiverNationalityCode) &&
        Objects.equals(this.receiverGender, createTransactionRequest.receiverGender) &&
        Objects.equals(this.receiverDateOfBirth, createTransactionRequest.receiverDateOfBirth) &&
        Objects.equals(this.receiverOccupation, createTransactionRequest.receiverOccupation) &&
        Objects.equals(this.receiverSenderRelationship, createTransactionRequest.receiverSenderRelationship) &&
        Objects.equals(this.receiverSmsNotify, createTransactionRequest.receiverSmsNotify) &&
        Objects.equals(this.receiverID, createTransactionRequest.receiverID) &&
        Objects.equals(this.receiverIDType, createTransactionRequest.receiverIDType) &&
        Objects.equals(this.receiverIDOtherType, createTransactionRequest.receiverIDOtherType) &&
        Objects.equals(this.receiverIDIssuedBy, createTransactionRequest.receiverIDIssuedBy) &&
        Objects.equals(this.receiverIDIssuedAt, createTransactionRequest.receiverIDIssuedAt) &&
        Objects.equals(this.receiverIDIssueDate, createTransactionRequest.receiverIDIssueDate) &&
        Objects.equals(this.receiverIDValidThru, createTransactionRequest.receiverIDValidThru) &&
        Objects.equals(this.receiverIDIssuanceCountry, createTransactionRequest.receiverIDIssuanceCountry) &&
        Objects.equals(this.receiverOtherInfo1, createTransactionRequest.receiverOtherInfo1) &&
        Objects.equals(this.receiverOtherInfo2, createTransactionRequest.receiverOtherInfo2) &&
        Objects.equals(this.receiverOtherInfo3, createTransactionRequest.receiverOtherInfo3) &&
        Objects.equals(this.receiverOtherInfo4, createTransactionRequest.receiverOtherInfo4) &&
        Objects.equals(this.receiverOtherInfo5, createTransactionRequest.receiverOtherInfo5) &&
        Objects.equals(this.receiverBankAccountNo, createTransactionRequest.receiverBankAccountNo) &&
        Objects.equals(this.receiverBankIBANNo, createTransactionRequest.receiverBankIBANNo) &&
        Objects.equals(this.receiverCardNo, createTransactionRequest.receiverCardNo) &&
        Objects.equals(this.receiverCardType, createTransactionRequest.receiverCardType) &&
        Objects.equals(this.receiverWalletPatrnerCode, createTransactionRequest.receiverWalletPatrnerCode) &&
        Objects.equals(this.receiverWalletNumber, createTransactionRequest.receiverWalletNumber) &&
        Objects.equals(this.receiverEnglishName, createTransactionRequest.receiverEnglishName) &&
        Objects.equals(this.receiverChineseNameInEnglish, createTransactionRequest.receiverChineseNameInEnglish) &&
        Objects.equals(this.receiverBankAccountName, createTransactionRequest.receiverBankAccountName) &&
        Objects.equals(this.receiverBankCode, createTransactionRequest.receiverBankCode) &&
        Objects.equals(this.receiverBankBranchCode, createTransactionRequest.receiverBankBranchCode) &&
        Objects.equals(this.receiverBranchIdentifier, createTransactionRequest.receiverBranchIdentifier) &&
        Objects.equals(this.receiverBankBranchName, createTransactionRequest.receiverBankBranchName) &&
        Objects.equals(this.receivingAgentCode, createTransactionRequest.receivingAgentCode) &&
        Objects.equals(this.serviceType, createTransactionRequest.serviceType) &&
        Objects.equals(this.productType, createTransactionRequest.productType) &&
        Objects.equals(this.sourceOfIncome, createTransactionRequest.sourceOfIncome) &&
        Objects.equals(this.purposeOfTxn, createTransactionRequest.purposeOfTxn) &&
        Objects.equals(this.purposeOfTxnDetails, createTransactionRequest.purposeOfTxnDetails) &&
        Objects.equals(this.calculationModel, createTransactionRequest.calculationModel) &&
        Objects.equals(this.transactionMode, createTransactionRequest.transactionMode) &&
        Objects.equals(this.txnOtherInfo1, createTransactionRequest.txnOtherInfo1) &&
        Objects.equals(this.txnOtherInfo2, createTransactionRequest.txnOtherInfo2) &&
        Objects.equals(this.txnOtherInfo3, createTransactionRequest.txnOtherInfo3) &&
        Objects.equals(this.txnOtherInfo4, createTransactionRequest.txnOtherInfo4) &&
        Objects.equals(this.txnOtherInfo5, createTransactionRequest.txnOtherInfo5) &&
        Objects.equals(this.paymentMode, createTransactionRequest.paymentMode) &&
        Objects.equals(this.xchgRatePayin2Payout, createTransactionRequest.xchgRatePayin2Payout) &&
        Objects.equals(this.payinCcyCode, createTransactionRequest.payinCcyCode) &&
        Objects.equals(this.payinAmount, createTransactionRequest.payinAmount) &&
        Objects.equals(this.payoutCcyCode, createTransactionRequest.payoutCcyCode) &&
        Objects.equals(this.payoutAmount, createTransactionRequest.payoutAmount) &&
        Objects.equals(this.tax, createTransactionRequest.tax) &&
        Objects.equals(this.cardCharges, createTransactionRequest.cardCharges) &&
        Objects.equals(this.otherCharges, createTransactionRequest.otherCharges) &&
        Objects.equals(this.additionalCharges, createTransactionRequest.additionalCharges) &&
        Objects.equals(this.commission, createTransactionRequest.commission) &&
        Objects.equals(this.partnerCommission, createTransactionRequest.partnerCommission) &&
        Objects.equals(this.totalPayinAmount, createTransactionRequest.totalPayinAmount) &&
        Objects.equals(this.rateOtherInfo1, createTransactionRequest.rateOtherInfo1) &&
        Objects.equals(this.rateOtherInfo2, createTransactionRequest.rateOtherInfo2) &&
        Objects.equals(this.rateOtherInfo3, createTransactionRequest.rateOtherInfo3) &&
        Objects.equals(this.rateOtherInfo4, createTransactionRequest.rateOtherInfo4) &&
        Objects.equals(this.rateOtherInfo5, createTransactionRequest.rateOtherInfo5) &&
        Objects.equals(this.paymentOtherInfo1, createTransactionRequest.paymentOtherInfo1) &&
        Objects.equals(this.paymentOtherInfo2, createTransactionRequest.paymentOtherInfo2) &&
        Objects.equals(this.paymentOtherInfo3, createTransactionRequest.paymentOtherInfo3) &&
        Objects.equals(this.paymentOtherInfo4, createTransactionRequest.paymentOtherInfo4) &&
        Objects.equals(this.paymentOtherInfo5, createTransactionRequest.paymentOtherInfo5) &&
        Objects.equals(this.promotionRefNumber, createTransactionRequest.promotionRefNumber) &&
        Objects.equals(this.promotionMessageDescription, createTransactionRequest.promotionMessageDescription) &&
        Objects.equals(this.promotionalData1, createTransactionRequest.promotionalData1) &&
        Objects.equals(this.promotionalData2, createTransactionRequest.promotionalData2) &&
        Objects.equals(this.promotionalData3, createTransactionRequest.promotionalData3) &&
        Objects.equals(this.promotionalData4, createTransactionRequest.promotionalData4) &&
        Objects.equals(this.promotionCcyCode, createTransactionRequest.promotionCcyCode) &&
        Objects.equals(this.discountField, createTransactionRequest.discountField) &&
        Objects.equals(this.ruleFlag, createTransactionRequest.ruleFlag) &&
        Objects.equals(this.controlFlag, createTransactionRequest.controlFlag) &&
        Objects.equals(this.externalFlag, createTransactionRequest.externalFlag) &&
        Objects.equals(this.reservedParam1, createTransactionRequest.reservedParam1) &&
        Objects.equals(this.reservedParam2, createTransactionRequest.reservedParam2) &&
        Objects.equals(this.reservedParam3, createTransactionRequest.reservedParam3) &&
        Objects.equals(this.reservedParam4, createTransactionRequest.reservedParam4) &&
        Objects.equals(this.reservedParam5, createTransactionRequest.reservedParam5) &&
        Objects.equals(this.reservedParam6, createTransactionRequest.reservedParam6) &&
        Objects.equals(this.reservedParam7, createTransactionRequest.reservedParam7) &&
        Objects.equals(this.reservedParam8, createTransactionRequest.reservedParam8) &&
        Objects.equals(this.reservedParam9, createTransactionRequest.reservedParam9) &&
        Objects.equals(this.reservedParam10, createTransactionRequest.reservedParam10);
  }

  @Override
  public int hashCode() {
    return Objects.hash(validateOnlyFlag, overrideRateFlag, partnerTxnRefNo, requiresAuthorization, crmRefNumber, crmLeadRefNumber, specialDealRefNumber, sendingAgentCode, serviceProviderCode, senderProfile, receiverProfile, senderType, receiverType, senderRefNumber, senderFirstName, senderMiddleName, senderLastName, senderPOBox, senderAddress1, senderAddress2, senderCity, senderDistrict, senderState, senderCountryCode, senderZipCode, senderMobile, senderPhone, senderFax, senderEmail, senderOtherInfo, senderMessageToBeneficiary, senderSelfDeclaration, senderGender, senderDateOfBirth, senderNationalityCode, senderOccupation, senderPlaceOfBirth, senderEmployerName, senderEmployerPhone, senderID, senderIDType, senderIDOtherType, senderIDIssuedBy, senderIDIssuedAt, senderIDIssueDate, senderIDValidThru, senderIDIssuanceCountry, senderIDOtherInfo, senderIDRemarks, senderproofOfAddress, senderID2, senderID2Type, senderID2IssuedBy, senderID2IssuedAt, senderID2IssueDate, senderID2ValidThru, senderID2IssuanceCountry, senderID2OtherInfo, senderID2Remarks, taxRegNo, taxRegNoIssuedCountry, ekycVerifiedSource, ekycValidatedSource, ekycValidatedOn, senderOtherInfo1, senderOtherInfo2, senderOtherInfo3, senderOtherInfo4, senderOtherInfo5, receiverRefNumber, receiverFirstName, receiverMiddleName, receiverLastName, deliveryOption, receiverAddress1, receiverAddress2, receiverCity, receiverCountryCode, receiverDistrict, receiverState, receiverPOBox, receiverZipCode, receiverPhone, receiverMobile, receiverFax, receiverEmail, receiverNationalityCode, receiverGender, receiverDateOfBirth, receiverOccupation, receiverSenderRelationship, receiverSmsNotify, receiverID, receiverIDType, receiverIDOtherType, receiverIDIssuedBy, receiverIDIssuedAt, receiverIDIssueDate, receiverIDValidThru, receiverIDIssuanceCountry, receiverOtherInfo1, receiverOtherInfo2, receiverOtherInfo3, receiverOtherInfo4, receiverOtherInfo5, receiverBankAccountNo, receiverBankIBANNo, receiverCardNo, receiverCardType, receiverWalletPatrnerCode, receiverWalletNumber, receiverEnglishName, receiverChineseNameInEnglish, receiverBankAccountName, receiverBankCode, receiverBankBranchCode, receiverBranchIdentifier, receiverBankBranchName, receivingAgentCode, serviceType, productType, sourceOfIncome, purposeOfTxn, purposeOfTxnDetails, calculationModel, transactionMode, txnOtherInfo1, txnOtherInfo2, txnOtherInfo3, txnOtherInfo4, txnOtherInfo5, paymentMode, xchgRatePayin2Payout, payinCcyCode, payinAmount, payoutCcyCode, payoutAmount, tax, cardCharges, otherCharges, additionalCharges, commission, partnerCommission, totalPayinAmount, rateOtherInfo1, rateOtherInfo2, rateOtherInfo3, rateOtherInfo4, rateOtherInfo5, paymentOtherInfo1, paymentOtherInfo2, paymentOtherInfo3, paymentOtherInfo4, paymentOtherInfo5, promotionRefNumber, promotionMessageDescription, promotionalData1, promotionalData2, promotionalData3, promotionalData4, promotionCcyCode, discountField, ruleFlag, controlFlag, externalFlag, reservedParam1, reservedParam2, reservedParam3, reservedParam4, reservedParam5, reservedParam6, reservedParam7, reservedParam8, reservedParam9, reservedParam10);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTransactionRequest {\n");
    
    sb.append("    validateOnlyFlag: ").append(toIndentedString(validateOnlyFlag)).append("\n");
    sb.append("    overrideRateFlag: ").append(toIndentedString(overrideRateFlag)).append("\n");
    sb.append("    partnerTxnRefNo: ").append(toIndentedString(partnerTxnRefNo)).append("\n");
    sb.append("    requiresAuthorization: ").append(toIndentedString(requiresAuthorization)).append("\n");
    sb.append("    crmRefNumber: ").append(toIndentedString(crmRefNumber)).append("\n");
    sb.append("    crmLeadRefNumber: ").append(toIndentedString(crmLeadRefNumber)).append("\n");
    sb.append("    specialDealRefNumber: ").append(toIndentedString(specialDealRefNumber)).append("\n");
    sb.append("    sendingAgentCode: ").append(toIndentedString(sendingAgentCode)).append("\n");
    sb.append("    serviceProviderCode: ").append(toIndentedString(serviceProviderCode)).append("\n");
    sb.append("    senderProfile: ").append(toIndentedString(senderProfile)).append("\n");
    sb.append("    receiverProfile: ").append(toIndentedString(receiverProfile)).append("\n");
    sb.append("    senderType: ").append(toIndentedString(senderType)).append("\n");
    sb.append("    receiverType: ").append(toIndentedString(receiverType)).append("\n");
    sb.append("    senderRefNumber: ").append(toIndentedString(senderRefNumber)).append("\n");
    sb.append("    senderFirstName: ").append(toIndentedString(senderFirstName)).append("\n");
    sb.append("    senderMiddleName: ").append(toIndentedString(senderMiddleName)).append("\n");
    sb.append("    senderLastName: ").append(toIndentedString(senderLastName)).append("\n");
    sb.append("    senderPOBox: ").append(toIndentedString(senderPOBox)).append("\n");
    sb.append("    senderAddress1: ").append(toIndentedString(senderAddress1)).append("\n");
    sb.append("    senderAddress2: ").append(toIndentedString(senderAddress2)).append("\n");
    sb.append("    senderCity: ").append(toIndentedString(senderCity)).append("\n");
    sb.append("    senderDistrict: ").append(toIndentedString(senderDistrict)).append("\n");
    sb.append("    senderState: ").append(toIndentedString(senderState)).append("\n");
    sb.append("    senderCountryCode: ").append(toIndentedString(senderCountryCode)).append("\n");
    sb.append("    senderZipCode: ").append(toIndentedString(senderZipCode)).append("\n");
    sb.append("    senderMobile: ").append(toIndentedString(senderMobile)).append("\n");
    sb.append("    senderPhone: ").append(toIndentedString(senderPhone)).append("\n");
    sb.append("    senderFax: ").append(toIndentedString(senderFax)).append("\n");
    sb.append("    senderEmail: ").append(toIndentedString(senderEmail)).append("\n");
    sb.append("    senderOtherInfo: ").append(toIndentedString(senderOtherInfo)).append("\n");
    sb.append("    senderMessageToBeneficiary: ").append(toIndentedString(senderMessageToBeneficiary)).append("\n");
    sb.append("    senderSelfDeclaration: ").append(toIndentedString(senderSelfDeclaration)).append("\n");
    sb.append("    senderGender: ").append(toIndentedString(senderGender)).append("\n");
    sb.append("    senderDateOfBirth: ").append(toIndentedString(senderDateOfBirth)).append("\n");
    sb.append("    senderNationalityCode: ").append(toIndentedString(senderNationalityCode)).append("\n");
    sb.append("    senderOccupation: ").append(toIndentedString(senderOccupation)).append("\n");
    sb.append("    senderPlaceOfBirth: ").append(toIndentedString(senderPlaceOfBirth)).append("\n");
    sb.append("    senderEmployerName: ").append(toIndentedString(senderEmployerName)).append("\n");
    sb.append("    senderEmployerPhone: ").append(toIndentedString(senderEmployerPhone)).append("\n");
    sb.append("    senderID: ").append(toIndentedString(senderID)).append("\n");
    sb.append("    senderIDType: ").append(toIndentedString(senderIDType)).append("\n");
    sb.append("    senderIDOtherType: ").append(toIndentedString(senderIDOtherType)).append("\n");
    sb.append("    senderIDIssuedBy: ").append(toIndentedString(senderIDIssuedBy)).append("\n");
    sb.append("    senderIDIssuedAt: ").append(toIndentedString(senderIDIssuedAt)).append("\n");
    sb.append("    senderIDIssueDate: ").append(toIndentedString(senderIDIssueDate)).append("\n");
    sb.append("    senderIDValidThru: ").append(toIndentedString(senderIDValidThru)).append("\n");
    sb.append("    senderIDIssuanceCountry: ").append(toIndentedString(senderIDIssuanceCountry)).append("\n");
    sb.append("    senderIDOtherInfo: ").append(toIndentedString(senderIDOtherInfo)).append("\n");
    sb.append("    senderIDRemarks: ").append(toIndentedString(senderIDRemarks)).append("\n");
    sb.append("    senderproofOfAddress: ").append(toIndentedString(senderproofOfAddress)).append("\n");
    sb.append("    senderID2: ").append(toIndentedString(senderID2)).append("\n");
    sb.append("    senderID2Type: ").append(toIndentedString(senderID2Type)).append("\n");
    sb.append("    senderID2IssuedBy: ").append(toIndentedString(senderID2IssuedBy)).append("\n");
    sb.append("    senderID2IssuedAt: ").append(toIndentedString(senderID2IssuedAt)).append("\n");
    sb.append("    senderID2IssueDate: ").append(toIndentedString(senderID2IssueDate)).append("\n");
    sb.append("    senderID2ValidThru: ").append(toIndentedString(senderID2ValidThru)).append("\n");
    sb.append("    senderID2IssuanceCountry: ").append(toIndentedString(senderID2IssuanceCountry)).append("\n");
    sb.append("    senderID2OtherInfo: ").append(toIndentedString(senderID2OtherInfo)).append("\n");
    sb.append("    senderID2Remarks: ").append(toIndentedString(senderID2Remarks)).append("\n");
    sb.append("    taxRegNo: ").append(toIndentedString(taxRegNo)).append("\n");
    sb.append("    taxRegNoIssuedCountry: ").append(toIndentedString(taxRegNoIssuedCountry)).append("\n");
    sb.append("    ekycVerifiedSource: ").append(toIndentedString(ekycVerifiedSource)).append("\n");
    sb.append("    ekycValidatedSource: ").append(toIndentedString(ekycValidatedSource)).append("\n");
    sb.append("    ekycValidatedOn: ").append(toIndentedString(ekycValidatedOn)).append("\n");
    sb.append("    senderOtherInfo1: ").append(toIndentedString(senderOtherInfo1)).append("\n");
    sb.append("    senderOtherInfo2: ").append(toIndentedString(senderOtherInfo2)).append("\n");
    sb.append("    senderOtherInfo3: ").append(toIndentedString(senderOtherInfo3)).append("\n");
    sb.append("    senderOtherInfo4: ").append(toIndentedString(senderOtherInfo4)).append("\n");
    sb.append("    senderOtherInfo5: ").append(toIndentedString(senderOtherInfo5)).append("\n");
    sb.append("    receiverRefNumber: ").append(toIndentedString(receiverRefNumber)).append("\n");
    sb.append("    receiverFirstName: ").append(toIndentedString(receiverFirstName)).append("\n");
    sb.append("    receiverMiddleName: ").append(toIndentedString(receiverMiddleName)).append("\n");
    sb.append("    receiverLastName: ").append(toIndentedString(receiverLastName)).append("\n");
    sb.append("    deliveryOption: ").append(toIndentedString(deliveryOption)).append("\n");
    sb.append("    receiverAddress1: ").append(toIndentedString(receiverAddress1)).append("\n");
    sb.append("    receiverAddress2: ").append(toIndentedString(receiverAddress2)).append("\n");
    sb.append("    receiverCity: ").append(toIndentedString(receiverCity)).append("\n");
    sb.append("    receiverCountryCode: ").append(toIndentedString(receiverCountryCode)).append("\n");
    sb.append("    receiverDistrict: ").append(toIndentedString(receiverDistrict)).append("\n");
    sb.append("    receiverState: ").append(toIndentedString(receiverState)).append("\n");
    sb.append("    receiverPOBox: ").append(toIndentedString(receiverPOBox)).append("\n");
    sb.append("    receiverZipCode: ").append(toIndentedString(receiverZipCode)).append("\n");
    sb.append("    receiverPhone: ").append(toIndentedString(receiverPhone)).append("\n");
    sb.append("    receiverMobile: ").append(toIndentedString(receiverMobile)).append("\n");
    sb.append("    receiverFax: ").append(toIndentedString(receiverFax)).append("\n");
    sb.append("    receiverEmail: ").append(toIndentedString(receiverEmail)).append("\n");
    sb.append("    receiverNationalityCode: ").append(toIndentedString(receiverNationalityCode)).append("\n");
    sb.append("    receiverGender: ").append(toIndentedString(receiverGender)).append("\n");
    sb.append("    receiverDateOfBirth: ").append(toIndentedString(receiverDateOfBirth)).append("\n");
    sb.append("    receiverOccupation: ").append(toIndentedString(receiverOccupation)).append("\n");
    sb.append("    receiverSenderRelationship: ").append(toIndentedString(receiverSenderRelationship)).append("\n");
    sb.append("    receiverSmsNotify: ").append(toIndentedString(receiverSmsNotify)).append("\n");
    sb.append("    receiverID: ").append(toIndentedString(receiverID)).append("\n");
    sb.append("    receiverIDType: ").append(toIndentedString(receiverIDType)).append("\n");
    sb.append("    receiverIDOtherType: ").append(toIndentedString(receiverIDOtherType)).append("\n");
    sb.append("    receiverIDIssuedBy: ").append(toIndentedString(receiverIDIssuedBy)).append("\n");
    sb.append("    receiverIDIssuedAt: ").append(toIndentedString(receiverIDIssuedAt)).append("\n");
    sb.append("    receiverIDIssueDate: ").append(toIndentedString(receiverIDIssueDate)).append("\n");
    sb.append("    receiverIDValidThru: ").append(toIndentedString(receiverIDValidThru)).append("\n");
    sb.append("    receiverIDIssuanceCountry: ").append(toIndentedString(receiverIDIssuanceCountry)).append("\n");
    sb.append("    receiverOtherInfo1: ").append(toIndentedString(receiverOtherInfo1)).append("\n");
    sb.append("    receiverOtherInfo2: ").append(toIndentedString(receiverOtherInfo2)).append("\n");
    sb.append("    receiverOtherInfo3: ").append(toIndentedString(receiverOtherInfo3)).append("\n");
    sb.append("    receiverOtherInfo4: ").append(toIndentedString(receiverOtherInfo4)).append("\n");
    sb.append("    receiverOtherInfo5: ").append(toIndentedString(receiverOtherInfo5)).append("\n");
    sb.append("    receiverBankAccountNo: ").append(toIndentedString(receiverBankAccountNo)).append("\n");
    sb.append("    receiverBankIBANNo: ").append(toIndentedString(receiverBankIBANNo)).append("\n");
    sb.append("    receiverCardNo: ").append(toIndentedString(receiverCardNo)).append("\n");
    sb.append("    receiverCardType: ").append(toIndentedString(receiverCardType)).append("\n");
    sb.append("    receiverWalletPatrnerCode: ").append(toIndentedString(receiverWalletPatrnerCode)).append("\n");
    sb.append("    receiverWalletNumber: ").append(toIndentedString(receiverWalletNumber)).append("\n");
    sb.append("    receiverEnglishName: ").append(toIndentedString(receiverEnglishName)).append("\n");
    sb.append("    receiverChineseNameInEnglish: ").append(toIndentedString(receiverChineseNameInEnglish)).append("\n");
    sb.append("    receiverBankAccountName: ").append(toIndentedString(receiverBankAccountName)).append("\n");
    sb.append("    receiverBankCode: ").append(toIndentedString(receiverBankCode)).append("\n");
    sb.append("    receiverBankBranchCode: ").append(toIndentedString(receiverBankBranchCode)).append("\n");
    sb.append("    receiverBranchIdentifier: ").append(toIndentedString(receiverBranchIdentifier)).append("\n");
    sb.append("    receiverBankBranchName: ").append(toIndentedString(receiverBankBranchName)).append("\n");
    sb.append("    receivingAgentCode: ").append(toIndentedString(receivingAgentCode)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    sourceOfIncome: ").append(toIndentedString(sourceOfIncome)).append("\n");
    sb.append("    purposeOfTxn: ").append(toIndentedString(purposeOfTxn)).append("\n");
    sb.append("    purposeOfTxnDetails: ").append(toIndentedString(purposeOfTxnDetails)).append("\n");
    sb.append("    calculationModel: ").append(toIndentedString(calculationModel)).append("\n");
    sb.append("    transactionMode: ").append(toIndentedString(transactionMode)).append("\n");
    sb.append("    txnOtherInfo1: ").append(toIndentedString(txnOtherInfo1)).append("\n");
    sb.append("    txnOtherInfo2: ").append(toIndentedString(txnOtherInfo2)).append("\n");
    sb.append("    txnOtherInfo3: ").append(toIndentedString(txnOtherInfo3)).append("\n");
    sb.append("    txnOtherInfo4: ").append(toIndentedString(txnOtherInfo4)).append("\n");
    sb.append("    txnOtherInfo5: ").append(toIndentedString(txnOtherInfo5)).append("\n");
    sb.append("    paymentMode: ").append(toIndentedString(paymentMode)).append("\n");
    sb.append("    xchgRatePayin2Payout: ").append(toIndentedString(xchgRatePayin2Payout)).append("\n");
    sb.append("    payinCcyCode: ").append(toIndentedString(payinCcyCode)).append("\n");
    sb.append("    payinAmount: ").append(toIndentedString(payinAmount)).append("\n");
    sb.append("    payoutCcyCode: ").append(toIndentedString(payoutCcyCode)).append("\n");
    sb.append("    payoutAmount: ").append(toIndentedString(payoutAmount)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    cardCharges: ").append(toIndentedString(cardCharges)).append("\n");
    sb.append("    otherCharges: ").append(toIndentedString(otherCharges)).append("\n");
    sb.append("    additionalCharges: ").append(toIndentedString(additionalCharges)).append("\n");
    sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
    sb.append("    partnerCommission: ").append(toIndentedString(partnerCommission)).append("\n");
    sb.append("    totalPayinAmount: ").append(toIndentedString(totalPayinAmount)).append("\n");
    sb.append("    rateOtherInfo1: ").append(toIndentedString(rateOtherInfo1)).append("\n");
    sb.append("    rateOtherInfo2: ").append(toIndentedString(rateOtherInfo2)).append("\n");
    sb.append("    rateOtherInfo3: ").append(toIndentedString(rateOtherInfo3)).append("\n");
    sb.append("    rateOtherInfo4: ").append(toIndentedString(rateOtherInfo4)).append("\n");
    sb.append("    rateOtherInfo5: ").append(toIndentedString(rateOtherInfo5)).append("\n");
    sb.append("    paymentOtherInfo1: ").append(toIndentedString(paymentOtherInfo1)).append("\n");
    sb.append("    paymentOtherInfo2: ").append(toIndentedString(paymentOtherInfo2)).append("\n");
    sb.append("    paymentOtherInfo3: ").append(toIndentedString(paymentOtherInfo3)).append("\n");
    sb.append("    paymentOtherInfo4: ").append(toIndentedString(paymentOtherInfo4)).append("\n");
    sb.append("    paymentOtherInfo5: ").append(toIndentedString(paymentOtherInfo5)).append("\n");
    sb.append("    promotionRefNumber: ").append(toIndentedString(promotionRefNumber)).append("\n");
    sb.append("    promotionMessageDescription: ").append(toIndentedString(promotionMessageDescription)).append("\n");
    sb.append("    promotionalData1: ").append(toIndentedString(promotionalData1)).append("\n");
    sb.append("    promotionalData2: ").append(toIndentedString(promotionalData2)).append("\n");
    sb.append("    promotionalData3: ").append(toIndentedString(promotionalData3)).append("\n");
    sb.append("    promotionalData4: ").append(toIndentedString(promotionalData4)).append("\n");
    sb.append("    promotionCcyCode: ").append(toIndentedString(promotionCcyCode)).append("\n");
    sb.append("    discountField: ").append(toIndentedString(discountField)).append("\n");
    sb.append("    ruleFlag: ").append(toIndentedString(ruleFlag)).append("\n");
    sb.append("    controlFlag: ").append(toIndentedString(controlFlag)).append("\n");
    sb.append("    externalFlag: ").append(toIndentedString(externalFlag)).append("\n");
    sb.append("    reservedParam1: ").append(toIndentedString(reservedParam1)).append("\n");
    sb.append("    reservedParam2: ").append(toIndentedString(reservedParam2)).append("\n");
    sb.append("    reservedParam3: ").append(toIndentedString(reservedParam3)).append("\n");
    sb.append("    reservedParam4: ").append(toIndentedString(reservedParam4)).append("\n");
    sb.append("    reservedParam5: ").append(toIndentedString(reservedParam5)).append("\n");
    sb.append("    reservedParam6: ").append(toIndentedString(reservedParam6)).append("\n");
    sb.append("    reservedParam7: ").append(toIndentedString(reservedParam7)).append("\n");
    sb.append("    reservedParam8: ").append(toIndentedString(reservedParam8)).append("\n");
    sb.append("    reservedParam9: ").append(toIndentedString(reservedParam9)).append("\n");
    sb.append("    reservedParam10: ").append(toIndentedString(reservedParam10)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

