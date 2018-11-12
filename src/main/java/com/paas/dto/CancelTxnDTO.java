package com.paas.dto;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.paas.model.ServerResponse;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Cancellation Response Object .
 */
@ApiModel(description = "Cancellation Response Object .")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-22T14:55:36.210+05:30")

public class CancelTxnDTO   {
  @JsonProperty("serverResponse")
  private ServerResponse serverResponse = null;

  @JsonProperty("txnRefNo")
  private String txnRefNo = null;

  @JsonProperty("partnerTxnRefNo")
  private String partnerTxnRefNo = null;

  @JsonProperty("transactionGMTDateTime")
  private String transactionGMTDateTime = null;

  @JsonProperty("cancellationGMTDateTime")
  private String cancellationGMTDateTime = null;

  @JsonProperty("senderType")
  private Integer senderType = null;

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

  @JsonProperty("senderPhone")
  private String senderPhone = null;

  @JsonProperty("senderMobile")
  private String senderMobile = null;

  @JsonProperty("senderFax")
  private String senderFax = null;

  @JsonProperty("senderEmail")
  private String senderEmail = null;

  @JsonProperty("senderOtherInfo")
  private String senderOtherInfo = null;

  @JsonProperty("senderMessageToBeneficiary")
  private String senderMessageToBeneficiary = null;

  @JsonProperty("senderGender")
  private String senderGender = null;

  @JsonProperty("senderDateOfBirth")
  private String senderDateOfBirth = null;

  @JsonProperty("senderNationalityCode")
  private String senderNationalityCode = null;

  @JsonProperty("senderOccupation")
  private String senderOccupation = null;

  @JsonProperty("senderEmployerName")
  private String senderEmployerName = null;

  @JsonProperty("senderEmployerPhone")
  private String senderEmployerPhone = null;

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

  @JsonProperty("receiverType")
  private Integer receiverType = null;

  @JsonProperty("receiverRefNumber")
  private String receiverRefNumber = null;

  @JsonProperty("receiverFirstName")
  private String receiverFirstName = null;

  @JsonProperty("receiverMiddleName")
  private String receiverMiddleName = null;

  @JsonProperty("receiverLastName")
  private String receiverLastName = null;

  @JsonProperty("receiverPOBox")
  private String receiverPOBox = null;

  @JsonProperty("receiverAddress1")
  private String receiverAddress1 = null;

  @JsonProperty("receiverAddress2")
  private String receiverAddress2 = null;

  @JsonProperty("receiverCity")
  private String receiverCity = null;

  @JsonProperty("receiverDistrict")
  private String receiverDistrict = null;

  @JsonProperty("receiverState")
  private String receiverState = null;

  @JsonProperty("receiverCountryCode")
  private String receiverCountryCode = null;

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

  @JsonProperty("receiverCustomerRelationship")
  private String receiverCustomerRelationship = null;

  @JsonProperty("receiverBankAccountNo")
  private String receiverBankAccountNo = null;

  @JsonProperty("receiverBankAccountName")
  private String receiverBankAccountName = null;

  @JsonProperty("receiverBankName")
  private String receiverBankName = null;

  @JsonProperty("receivingAgentCode")
  private String receivingAgentCode = null;

  @JsonProperty("serviceFlag")
  private Integer serviceFlag = null;

  @JsonProperty("receiverBankPOBox")
  private String receiverBankPOBox = null;

  @JsonProperty("receiverBankAddress1")
  private String receiverBankAddress1 = null;

  @JsonProperty("receiverBankAddress2")
  private String receiverBankAddress2 = null;

  @JsonProperty("receiverBankCity")
  private String receiverBankCity = null;

  @JsonProperty("receiverBankDistrict")
  private String receiverBankDistrict = null;

  @JsonProperty("receiverBankState")
  private String receiverBankState = null;

  @JsonProperty("receiverBankCountryCode")
  private String receiverBankCountryCode = null;

  @JsonProperty("receiverBankZipCode")
  private String receiverBankZipCode = null;

  @JsonProperty("receiverBankPhone")
  private String receiverBankPhone = null;

  @JsonProperty("receiverBankMobile")
  private String receiverBankMobile = null;

  @JsonProperty("receiverBankFax")
  private String receiverBankFax = null;

  @JsonProperty("receiverBankEmail")
  private String receiverBankEmail = null;

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

  @JsonProperty("sourceOfIncome")
  private String sourceOfIncome = null;

  @JsonProperty("purposeOfTxn")
  private String purposeOfTxn = null;

  @JsonProperty("purposeOfTxnDetails")
  private String purposeOfTxnDetails = null;

  @JsonProperty("cancelReasonDesc")
  private String cancelReasonDesc = null;

  @JsonProperty("paymentMode")
  private String paymentMode = null;

  @JsonProperty("cancelXchgRatePayin2Payout")
  private Double cancelXchgRatePayin2Payout = null;

  @JsonProperty("payinCcyCode")
  private String payinCcyCode = null;

  @JsonProperty("cancelPayinAmount")
  private Double cancelPayinAmount = null;

  @JsonProperty("payoutCcyCode")
  private String payoutCcyCode = null;

  @JsonProperty("cancelPayoutAmount")
  private Double cancelPayoutAmount = null;

  @JsonProperty("cancelCommission")
  private Double cancelCommission = null;

  @JsonProperty("cancelTax")
  private Double cancelTax = null;

  @JsonProperty("cancelCardCharges")
  private Double cancelCardCharges = null;

  @JsonProperty("cancelAdditionalCharges")
  private Double cancelAdditionalCharges = null;

  @JsonProperty("cancelOtherCharges")
  private Double cancelOtherCharges = null;

  @JsonProperty("cancellationCharges")
  private Double cancellationCharges = null;

  @JsonProperty("cancelTotalPayinAmount")
  private Double cancelTotalPayinAmount = null;

  @JsonProperty("sendingAgentCode")
  private String sendingAgentCode = null;

  @JsonProperty("serviceProviderCode")
  private String serviceProviderCode = null;

  @JsonProperty("settlementCcyCode")
  private String settlementCcyCode = null;

  @JsonProperty("xchgRateUSDToPayin")
  private Double xchgRateUSDToPayin = null;

  @JsonProperty("xchgRateUSDToPayout")
  private Double xchgRateUSDToPayout = null;

  @JsonProperty("xchgRateUSDToSettlement")
  private Double xchgRateUSDToSettlement = null;

  @JsonProperty("xchgRateSettlementToPayin")
  private Double xchgRateSettlementToPayin = null;

  @JsonProperty("xchgRateSettlementToPayout")
  private Double xchgRateSettlementToPayout = null;

  @JsonProperty("commissionInSCcy")
  private Double commissionInSCcy = null;

  @JsonProperty("taxInSCcy")
  private Double taxInSCcy = null;

  @JsonProperty("cardChargesInSCcy")
  private String cardChargesInSCcy = null;

  @JsonProperty("additionalChargesInSCcy")
  private Double additionalChargesInSCcy = null;

  @JsonProperty("otherChargesInSCcy")
  private Double otherChargesInSCcy = null;

  @JsonProperty("payinAmountInSCcy")
  private Double payinAmountInSCcy = null;

  @JsonProperty("totalPayinAmountInSCcy")
  private Double totalPayinAmountInSCcy = null;

  @JsonProperty("payoutAmountInSCcy")
  private Double payoutAmountInSCcy = null;

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

  @JsonProperty("instrumentType")
  private String instrumentType = null;

  @JsonProperty("txnType")
  private String txnType = null;

  @JsonProperty("deliveryChannel")
  private String deliveryChannel = null;

  @JsonProperty("deliveryOption")
  private String deliveryOption = null;

  @JsonProperty("cancelReasonCode")
  private Integer cancelReasonCode = null;

  @JsonProperty("baseCcyCode")
  private String baseCcyCode = null;

  @JsonProperty("xchgRatePayinToPayout")
  private Double xchgRatePayinToPayout = null;

  @JsonProperty("xchgRateUSDToSettlementBuy")
  private Double xchgRateUSDToSettlementBuy = null;

  @JsonProperty("xchgRateSettlementToSPCcy")
  private Double xchgRateSettlementToSPCcy = null;

  @JsonProperty("xmCancellationChargesInLC")
  private Double xmCancellationChargesInLC = null;

  @JsonProperty("xmRefundPayinAmount")
  private Double xmRefundPayinAmount = null;

  @JsonProperty("xmRefundCommission")
  private Double xmRefundCommission = null;

  @JsonProperty("xmRefundTax")
  private Double xmRefundTax = null;

  @JsonProperty("xmRefundOtherCharges")
  private Double xmRefundOtherCharges = null;

  @JsonProperty("xmCancellationCharges")
  private Double xmCancellationCharges = null;

  @JsonProperty("xmRefundCardCharges")
  private Double xmRefundCardCharges = null;

  @JsonProperty("xmRefundAdditionalCharges")
  private Double xmRefundAdditionalCharges = null;

  @JsonProperty("xmRefundPayinAmountInSCcy")
  private Double xmRefundPayinAmountInSCcy = null;

  @JsonProperty("xmCancellationChargesInSCcy")
  private Double xmCancellationChargesInSCcy = null;

  @JsonProperty("xmRefundCardChargesInSCcy")
  private Double xmRefundCardChargesInSCcy = null;

  @JsonProperty("xmRefundAddlChargesInSCcy")
  private Double xmRefundAddlChargesInSCcy = null;

  @JsonProperty("payin2BaseCcyRate")
  private Double payin2BaseCcyRate = null;

  @JsonProperty("refundPayinAmountInBaseCcy")
  private Double refundPayinAmountInBaseCcy = null;

  @JsonProperty("spCcyCode")
  private String spCcyCode = null;

  @JsonProperty("refundPayinAmountInSPCcy")
  private Double refundPayinAmountInSPCcy = null;

  @JsonProperty("refundCommissionInSPCcy")
  private Double refundCommissionInSPCcy = null;

  @JsonProperty("refundTaxInSPCcy")
  private Double refundTaxInSPCcy = null;

  @JsonProperty("refundOtherChargesInSPCcy")
  private Double refundOtherChargesInSPCcy = null;

  @JsonProperty("cancellationChargesInSPCcy")
  private Double cancellationChargesInSPCcy = null;

  @JsonProperty("refundCardChargesInSPCcy")
  private Double refundCardChargesInSPCcy = null;

  @JsonProperty("refundAddlChargesInSPCcy")
  private Double refundAddlChargesInSPCcy = null;

  @JsonProperty("draweeBankBranchCode")
  private String draweeBankBranchCode = null;

  @JsonProperty("createdBy")
  private String createdBy = null;

  @JsonProperty("instrumentNo")
  private String instrumentNo = null;

  @JsonProperty("taxInvoiceNo")
  private String taxInvoiceNo = null;

  @JsonProperty("returnCode")
  private String returnCode = null;

  @JsonProperty("returnMessage")
  private String returnMessage = null;

  public CancelTxnDTO serverResponse(ServerResponse serverResponse) {
    this.serverResponse = serverResponse;
    return this;
  }

  /**
   * Get serverResponse
   * @return serverResponse
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ServerResponse getServerResponse() {
    return serverResponse;
  }

  public void setServerResponse(ServerResponse serverResponse) {
    this.serverResponse = serverResponse;
  }

  public CancelTxnDTO txnRefNo(String txnRefNo) {
    this.txnRefNo = txnRefNo;
    return this;
  }

  /**
   * Get txnRefNo
   * @return txnRefNo
  **/
  @ApiModelProperty(value = "")


  public String getTxnRefNo() {
    return txnRefNo;
  }

  public void setTxnRefNo(String txnRefNo) {
    this.txnRefNo = txnRefNo;
  }

  public CancelTxnDTO partnerTxnRefNo(String partnerTxnRefNo) {
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

  public CancelTxnDTO transactionGMTDateTime(String transactionGMTDateTime) {
    this.transactionGMTDateTime = transactionGMTDateTime;
    return this;
  }

  /**
   * Get transactionGMTDateTime
   * @return transactionGMTDateTime
  **/
  @ApiModelProperty(value = "")


  public String getTransactionGMTDateTime() {
    return transactionGMTDateTime;
  }

  public void setTransactionGMTDateTime(String transactionGMTDateTime) {
    this.transactionGMTDateTime = transactionGMTDateTime;
  }

  public CancelTxnDTO cancellationGMTDateTime(String cancellationGMTDateTime) {
    this.cancellationGMTDateTime = cancellationGMTDateTime;
    return this;
  }

  /**
   * Get cancellationGMTDateTime
   * @return cancellationGMTDateTime
  **/
  @ApiModelProperty(value = "")


  public String getCancellationGMTDateTime() {
    return cancellationGMTDateTime;
  }

  public void setCancellationGMTDateTime(String cancellationGMTDateTime) {
    this.cancellationGMTDateTime = cancellationGMTDateTime;
  }

  public CancelTxnDTO senderType(Integer senderType) {
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

  public CancelTxnDTO senderRefNumber(String senderRefNumber) {
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

  public CancelTxnDTO senderFirstName(String senderFirstName) {
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

  public CancelTxnDTO senderMiddleName(String senderMiddleName) {
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

  public CancelTxnDTO senderLastName(String senderLastName) {
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

  public CancelTxnDTO senderPOBox(String senderPOBox) {
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

  public CancelTxnDTO senderAddress1(String senderAddress1) {
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

  public CancelTxnDTO senderAddress2(String senderAddress2) {
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

  public CancelTxnDTO senderCity(String senderCity) {
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

  public CancelTxnDTO senderDistrict(String senderDistrict) {
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

  public CancelTxnDTO senderState(String senderState) {
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

  public CancelTxnDTO senderCountryCode(String senderCountryCode) {
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

  public CancelTxnDTO senderZipCode(String senderZipCode) {
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

  public CancelTxnDTO senderPhone(String senderPhone) {
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

  public CancelTxnDTO senderMobile(String senderMobile) {
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

  public CancelTxnDTO senderFax(String senderFax) {
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

  public CancelTxnDTO senderEmail(String senderEmail) {
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

  public CancelTxnDTO senderOtherInfo(String senderOtherInfo) {
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

  public CancelTxnDTO senderMessageToBeneficiary(String senderMessageToBeneficiary) {
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

  public CancelTxnDTO senderGender(String senderGender) {
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

  public CancelTxnDTO senderDateOfBirth(String senderDateOfBirth) {
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

  public CancelTxnDTO senderNationalityCode(String senderNationalityCode) {
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

  public CancelTxnDTO senderOccupation(String senderOccupation) {
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

  public CancelTxnDTO senderEmployerName(String senderEmployerName) {
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

  public CancelTxnDTO senderEmployerPhone(String senderEmployerPhone) {
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

  public CancelTxnDTO senderOtherInfo1(String senderOtherInfo1) {
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

  public CancelTxnDTO senderOtherInfo2(String senderOtherInfo2) {
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

  public CancelTxnDTO senderOtherInfo3(String senderOtherInfo3) {
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

  public CancelTxnDTO senderOtherInfo4(String senderOtherInfo4) {
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

  public CancelTxnDTO senderOtherInfo5(String senderOtherInfo5) {
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

  public CancelTxnDTO receiverType(Integer receiverType) {
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

  public CancelTxnDTO receiverRefNumber(String receiverRefNumber) {
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

  public CancelTxnDTO receiverFirstName(String receiverFirstName) {
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

  public CancelTxnDTO receiverMiddleName(String receiverMiddleName) {
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

  public CancelTxnDTO receiverLastName(String receiverLastName) {
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

  public CancelTxnDTO receiverPOBox(String receiverPOBox) {
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

  public CancelTxnDTO receiverAddress1(String receiverAddress1) {
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

  public CancelTxnDTO receiverAddress2(String receiverAddress2) {
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

  public CancelTxnDTO receiverCity(String receiverCity) {
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

  public CancelTxnDTO receiverDistrict(String receiverDistrict) {
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

  public CancelTxnDTO receiverState(String receiverState) {
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

  public CancelTxnDTO receiverCountryCode(String receiverCountryCode) {
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

  public CancelTxnDTO receiverZipCode(String receiverZipCode) {
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

  public CancelTxnDTO receiverPhone(String receiverPhone) {
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

  public CancelTxnDTO receiverMobile(String receiverMobile) {
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

  public CancelTxnDTO receiverFax(String receiverFax) {
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

  public CancelTxnDTO receiverEmail(String receiverEmail) {
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

  public CancelTxnDTO receiverNationalityCode(String receiverNationalityCode) {
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

  public CancelTxnDTO receiverGender(String receiverGender) {
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

  public CancelTxnDTO receiverDateOfBirth(String receiverDateOfBirth) {
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

  public CancelTxnDTO receiverOccupation(String receiverOccupation) {
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

  public CancelTxnDTO receiverCustomerRelationship(String receiverCustomerRelationship) {
    this.receiverCustomerRelationship = receiverCustomerRelationship;
    return this;
  }

  /**
   * Get receiverCustomerRelationship
   * @return receiverCustomerRelationship
  **/
  @ApiModelProperty(value = "")


  public String getReceiverCustomerRelationship() {
    return receiverCustomerRelationship;
  }

  public void setReceiverCustomerRelationship(String receiverCustomerRelationship) {
    this.receiverCustomerRelationship = receiverCustomerRelationship;
  }

  public CancelTxnDTO receiverBankAccountNo(String receiverBankAccountNo) {
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

  public CancelTxnDTO receiverBankAccountName(String receiverBankAccountName) {
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

  public CancelTxnDTO receiverBankName(String receiverBankName) {
    this.receiverBankName = receiverBankName;
    return this;
  }

  /**
   * Get receiverBankName
   * @return receiverBankName
  **/
  @ApiModelProperty(value = "")


  public String getReceiverBankName() {
    return receiverBankName;
  }

  public void setReceiverBankName(String receiverBankName) {
    this.receiverBankName = receiverBankName;
  }

  public CancelTxnDTO receivingAgentCode(String receivingAgentCode) {
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

  public CancelTxnDTO serviceFlag(Integer serviceFlag) {
    this.serviceFlag = serviceFlag;
    return this;
  }

  /**
   * Get serviceFlag
   * @return serviceFlag
  **/
  @ApiModelProperty(value = "")


  public Integer getServiceFlag() {
    return serviceFlag;
  }

  public void setServiceFlag(Integer serviceFlag) {
    this.serviceFlag = serviceFlag;
  }

  public CancelTxnDTO receiverBankPOBox(String receiverBankPOBox) {
    this.receiverBankPOBox = receiverBankPOBox;
    return this;
  }

  /**
   * Get receiverBankPOBox
   * @return receiverBankPOBox
  **/
  @ApiModelProperty(value = "")


  public String getReceiverBankPOBox() {
    return receiverBankPOBox;
  }

  public void setReceiverBankPOBox(String receiverBankPOBox) {
    this.receiverBankPOBox = receiverBankPOBox;
  }

  public CancelTxnDTO receiverBankAddress1(String receiverBankAddress1) {
    this.receiverBankAddress1 = receiverBankAddress1;
    return this;
  }

  /**
   * Get receiverBankAddress1
   * @return receiverBankAddress1
  **/
  @ApiModelProperty(value = "")


  public String getReceiverBankAddress1() {
    return receiverBankAddress1;
  }

  public void setReceiverBankAddress1(String receiverBankAddress1) {
    this.receiverBankAddress1 = receiverBankAddress1;
  }

  public CancelTxnDTO receiverBankAddress2(String receiverBankAddress2) {
    this.receiverBankAddress2 = receiverBankAddress2;
    return this;
  }

  /**
   * Get receiverBankAddress2
   * @return receiverBankAddress2
  **/
  @ApiModelProperty(value = "")


  public String getReceiverBankAddress2() {
    return receiverBankAddress2;
  }

  public void setReceiverBankAddress2(String receiverBankAddress2) {
    this.receiverBankAddress2 = receiverBankAddress2;
  }

  public CancelTxnDTO receiverBankCity(String receiverBankCity) {
    this.receiverBankCity = receiverBankCity;
    return this;
  }

  /**
   * Get receiverBankCity
   * @return receiverBankCity
  **/
  @ApiModelProperty(value = "")


  public String getReceiverBankCity() {
    return receiverBankCity;
  }

  public void setReceiverBankCity(String receiverBankCity) {
    this.receiverBankCity = receiverBankCity;
  }

  public CancelTxnDTO receiverBankDistrict(String receiverBankDistrict) {
    this.receiverBankDistrict = receiverBankDistrict;
    return this;
  }

  /**
   * Get receiverBankDistrict
   * @return receiverBankDistrict
  **/
  @ApiModelProperty(value = "")


  public String getReceiverBankDistrict() {
    return receiverBankDistrict;
  }

  public void setReceiverBankDistrict(String receiverBankDistrict) {
    this.receiverBankDistrict = receiverBankDistrict;
  }

  public CancelTxnDTO receiverBankState(String receiverBankState) {
    this.receiverBankState = receiverBankState;
    return this;
  }

  /**
   * Get receiverBankState
   * @return receiverBankState
  **/
  @ApiModelProperty(value = "")


  public String getReceiverBankState() {
    return receiverBankState;
  }

  public void setReceiverBankState(String receiverBankState) {
    this.receiverBankState = receiverBankState;
  }

  public CancelTxnDTO receiverBankCountryCode(String receiverBankCountryCode) {
    this.receiverBankCountryCode = receiverBankCountryCode;
    return this;
  }

  /**
   * Get receiverBankCountryCode
   * @return receiverBankCountryCode
  **/
  @ApiModelProperty(value = "")


  public String getReceiverBankCountryCode() {
    return receiverBankCountryCode;
  }

  public void setReceiverBankCountryCode(String receiverBankCountryCode) {
    this.receiverBankCountryCode = receiverBankCountryCode;
  }

  public CancelTxnDTO receiverBankZipCode(String receiverBankZipCode) {
    this.receiverBankZipCode = receiverBankZipCode;
    return this;
  }

  /**
   * Get receiverBankZipCode
   * @return receiverBankZipCode
  **/
  @ApiModelProperty(value = "")


  public String getReceiverBankZipCode() {
    return receiverBankZipCode;
  }

  public void setReceiverBankZipCode(String receiverBankZipCode) {
    this.receiverBankZipCode = receiverBankZipCode;
  }

  public CancelTxnDTO receiverBankPhone(String receiverBankPhone) {
    this.receiverBankPhone = receiverBankPhone;
    return this;
  }

  /**
   * Get receiverBankPhone
   * @return receiverBankPhone
  **/
  @ApiModelProperty(value = "")


  public String getReceiverBankPhone() {
    return receiverBankPhone;
  }

  public void setReceiverBankPhone(String receiverBankPhone) {
    this.receiverBankPhone = receiverBankPhone;
  }

  public CancelTxnDTO receiverBankMobile(String receiverBankMobile) {
    this.receiverBankMobile = receiverBankMobile;
    return this;
  }

  /**
   * Get receiverBankMobile
   * @return receiverBankMobile
  **/
  @ApiModelProperty(value = "")


  public String getReceiverBankMobile() {
    return receiverBankMobile;
  }

  public void setReceiverBankMobile(String receiverBankMobile) {
    this.receiverBankMobile = receiverBankMobile;
  }

  public CancelTxnDTO receiverBankFax(String receiverBankFax) {
    this.receiverBankFax = receiverBankFax;
    return this;
  }

  /**
   * Get receiverBankFax
   * @return receiverBankFax
  **/
  @ApiModelProperty(value = "")


  public String getReceiverBankFax() {
    return receiverBankFax;
  }

  public void setReceiverBankFax(String receiverBankFax) {
    this.receiverBankFax = receiverBankFax;
  }

  public CancelTxnDTO receiverBankEmail(String receiverBankEmail) {
    this.receiverBankEmail = receiverBankEmail;
    return this;
  }

  /**
   * Get receiverBankEmail
   * @return receiverBankEmail
  **/
  @ApiModelProperty(value = "")


  public String getReceiverBankEmail() {
    return receiverBankEmail;
  }

  public void setReceiverBankEmail(String receiverBankEmail) {
    this.receiverBankEmail = receiverBankEmail;
  }

  public CancelTxnDTO receiverOtherInfo1(String receiverOtherInfo1) {
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

  public CancelTxnDTO receiverOtherInfo2(String receiverOtherInfo2) {
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

  public CancelTxnDTO receiverOtherInfo3(String receiverOtherInfo3) {
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

  public CancelTxnDTO receiverOtherInfo4(String receiverOtherInfo4) {
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

  public CancelTxnDTO receiverOtherInfo5(String receiverOtherInfo5) {
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

  public CancelTxnDTO sourceOfIncome(String sourceOfIncome) {
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

  public CancelTxnDTO purposeOfTxn(String purposeOfTxn) {
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

  public CancelTxnDTO purposeOfTxnDetails(String purposeOfTxnDetails) {
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

  public CancelTxnDTO cancelReasonDesc(String cancelReasonDesc) {
    this.cancelReasonDesc = cancelReasonDesc;
    return this;
  }

  /**
   * Get cancelReasonDesc
   * @return cancelReasonDesc
  **/
  @ApiModelProperty(value = "")


  public String getCancelReasonDesc() {
    return cancelReasonDesc;
  }

  public void setCancelReasonDesc(String cancelReasonDesc) {
    this.cancelReasonDesc = cancelReasonDesc;
  }

  public CancelTxnDTO paymentMode(String paymentMode) {
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

  public CancelTxnDTO cancelXchgRatePayin2Payout(Double cancelXchgRatePayin2Payout) {
    this.cancelXchgRatePayin2Payout = cancelXchgRatePayin2Payout;
    return this;
  }

  /**
   * Get cancelXchgRatePayin2Payout
   * @return cancelXchgRatePayin2Payout
  **/
  @ApiModelProperty(value = "")


  public Double getCancelXchgRatePayin2Payout() {
    return cancelXchgRatePayin2Payout;
  }

  public void setCancelXchgRatePayin2Payout(Double cancelXchgRatePayin2Payout) {
    this.cancelXchgRatePayin2Payout = cancelXchgRatePayin2Payout;
  }

  public CancelTxnDTO payinCcyCode(String payinCcyCode) {
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

  public CancelTxnDTO cancelPayinAmount(Double cancelPayinAmount) {
    this.cancelPayinAmount = cancelPayinAmount;
    return this;
  }

  /**
   * Get cancelPayinAmount
   * @return cancelPayinAmount
  **/
  @ApiModelProperty(value = "")


  public Double getCancelPayinAmount() {
    return cancelPayinAmount;
  }

  public void setCancelPayinAmount(Double cancelPayinAmount) {
    this.cancelPayinAmount = cancelPayinAmount;
  }

  public CancelTxnDTO payoutCcyCode(String payoutCcyCode) {
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

  public CancelTxnDTO cancelPayoutAmount(Double cancelPayoutAmount) {
    this.cancelPayoutAmount = cancelPayoutAmount;
    return this;
  }

  /**
   * Get cancelPayoutAmount
   * @return cancelPayoutAmount
  **/
  @ApiModelProperty(value = "")


  public Double getCancelPayoutAmount() {
    return cancelPayoutAmount;
  }

  public void setCancelPayoutAmount(Double cancelPayoutAmount) {
    this.cancelPayoutAmount = cancelPayoutAmount;
  }

  public CancelTxnDTO cancelCommission(Double cancelCommission) {
    this.cancelCommission = cancelCommission;
    return this;
  }

  /**
   * Get cancelCommission
   * @return cancelCommission
  **/
  @ApiModelProperty(value = "")


  public Double getCancelCommission() {
    return cancelCommission;
  }

  public void setCancelCommission(Double cancelCommission) {
    this.cancelCommission = cancelCommission;
  }

  public CancelTxnDTO cancelTax(Double cancelTax) {
    this.cancelTax = cancelTax;
    return this;
  }

  /**
   * Get cancelTax
   * @return cancelTax
  **/
  @ApiModelProperty(value = "")


  public Double getCancelTax() {
    return cancelTax;
  }

  public void setCancelTax(Double cancelTax) {
    this.cancelTax = cancelTax;
  }

  public CancelTxnDTO cancelCardCharges(Double cancelCardCharges) {
    this.cancelCardCharges = cancelCardCharges;
    return this;
  }

  /**
   * Get cancelCardCharges
   * @return cancelCardCharges
  **/
  @ApiModelProperty(value = "")


  public Double getCancelCardCharges() {
    return cancelCardCharges;
  }

  public void setCancelCardCharges(Double cancelCardCharges) {
    this.cancelCardCharges = cancelCardCharges;
  }

  public CancelTxnDTO cancelAdditionalCharges(Double cancelAdditionalCharges) {
    this.cancelAdditionalCharges = cancelAdditionalCharges;
    return this;
  }

  /**
   * Get cancelAdditionalCharges
   * @return cancelAdditionalCharges
  **/
  @ApiModelProperty(value = "")


  public Double getCancelAdditionalCharges() {
    return cancelAdditionalCharges;
  }

  public void setCancelAdditionalCharges(Double cancelAdditionalCharges) {
    this.cancelAdditionalCharges = cancelAdditionalCharges;
  }

  public CancelTxnDTO cancelOtherCharges(Double cancelOtherCharges) {
    this.cancelOtherCharges = cancelOtherCharges;
    return this;
  }

  /**
   * Get cancelOtherCharges
   * @return cancelOtherCharges
  **/
  @ApiModelProperty(value = "")


  public Double getCancelOtherCharges() {
    return cancelOtherCharges;
  }

  public void setCancelOtherCharges(Double cancelOtherCharges) {
    this.cancelOtherCharges = cancelOtherCharges;
  }

  public CancelTxnDTO cancellationCharges(Double cancellationCharges) {
    this.cancellationCharges = cancellationCharges;
    return this;
  }

  /**
   * Get cancellationCharges
   * @return cancellationCharges
  **/
  @ApiModelProperty(value = "")


  public Double getCancellationCharges() {
    return cancellationCharges;
  }

  public void setCancellationCharges(Double cancellationCharges) {
    this.cancellationCharges = cancellationCharges;
  }

  public CancelTxnDTO cancelTotalPayinAmount(Double cancelTotalPayinAmount) {
    this.cancelTotalPayinAmount = cancelTotalPayinAmount;
    return this;
  }

  /**
   * Get cancelTotalPayinAmount
   * @return cancelTotalPayinAmount
  **/
  @ApiModelProperty(value = "")


  public Double getCancelTotalPayinAmount() {
    return cancelTotalPayinAmount;
  }

  public void setCancelTotalPayinAmount(Double cancelTotalPayinAmount) {
    this.cancelTotalPayinAmount = cancelTotalPayinAmount;
  }

  public CancelTxnDTO sendingAgentCode(String sendingAgentCode) {
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

  public CancelTxnDTO serviceProviderCode(String serviceProviderCode) {
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

  public CancelTxnDTO settlementCcyCode(String settlementCcyCode) {
    this.settlementCcyCode = settlementCcyCode;
    return this;
  }

  /**
   * Get settlementCcyCode
   * @return settlementCcyCode
  **/
  @ApiModelProperty(value = "")


  public String getSettlementCcyCode() {
    return settlementCcyCode;
  }

  public void setSettlementCcyCode(String settlementCcyCode) {
    this.settlementCcyCode = settlementCcyCode;
  }

  public CancelTxnDTO xchgRateUSDToPayin(Double xchgRateUSDToPayin) {
    this.xchgRateUSDToPayin = xchgRateUSDToPayin;
    return this;
  }

  /**
   * Get xchgRateUSDToPayin
   * @return xchgRateUSDToPayin
  **/
  @ApiModelProperty(value = "")


  public Double getXchgRateUSDToPayin() {
    return xchgRateUSDToPayin;
  }

  public void setXchgRateUSDToPayin(Double xchgRateUSDToPayin) {
    this.xchgRateUSDToPayin = xchgRateUSDToPayin;
  }

  public CancelTxnDTO xchgRateUSDToPayout(Double xchgRateUSDToPayout) {
    this.xchgRateUSDToPayout = xchgRateUSDToPayout;
    return this;
  }

  /**
   * Get xchgRateUSDToPayout
   * @return xchgRateUSDToPayout
  **/
  @ApiModelProperty(value = "")


  public Double getXchgRateUSDToPayout() {
    return xchgRateUSDToPayout;
  }

  public void setXchgRateUSDToPayout(Double xchgRateUSDToPayout) {
    this.xchgRateUSDToPayout = xchgRateUSDToPayout;
  }

  public CancelTxnDTO xchgRateUSDToSettlement(Double xchgRateUSDToSettlement) {
    this.xchgRateUSDToSettlement = xchgRateUSDToSettlement;
    return this;
  }

  /**
   * Get xchgRateUSDToSettlement
   * @return xchgRateUSDToSettlement
  **/
  @ApiModelProperty(value = "")


  public Double getXchgRateUSDToSettlement() {
    return xchgRateUSDToSettlement;
  }

  public void setXchgRateUSDToSettlement(Double xchgRateUSDToSettlement) {
    this.xchgRateUSDToSettlement = xchgRateUSDToSettlement;
  }

  public CancelTxnDTO xchgRateSettlementToPayin(Double xchgRateSettlementToPayin) {
    this.xchgRateSettlementToPayin = xchgRateSettlementToPayin;
    return this;
  }

  /**
   * Get xchgRateSettlementToPayin
   * @return xchgRateSettlementToPayin
  **/
  @ApiModelProperty(value = "")


  public Double getXchgRateSettlementToPayin() {
    return xchgRateSettlementToPayin;
  }

  public void setXchgRateSettlementToPayin(Double xchgRateSettlementToPayin) {
    this.xchgRateSettlementToPayin = xchgRateSettlementToPayin;
  }

  public CancelTxnDTO xchgRateSettlementToPayout(Double xchgRateSettlementToPayout) {
    this.xchgRateSettlementToPayout = xchgRateSettlementToPayout;
    return this;
  }

  /**
   * Get xchgRateSettlementToPayout
   * @return xchgRateSettlementToPayout
  **/
  @ApiModelProperty(value = "")


  public Double getXchgRateSettlementToPayout() {
    return xchgRateSettlementToPayout;
  }

  public void setXchgRateSettlementToPayout(Double xchgRateSettlementToPayout) {
    this.xchgRateSettlementToPayout = xchgRateSettlementToPayout;
  }

  public CancelTxnDTO commissionInSCcy(Double commissionInSCcy) {
    this.commissionInSCcy = commissionInSCcy;
    return this;
  }

  /**
   * Get commissionInSCcy
   * @return commissionInSCcy
  **/
  @ApiModelProperty(value = "")


  public Double getCommissionInSCcy() {
    return commissionInSCcy;
  }

  public void setCommissionInSCcy(Double commissionInSCcy) {
    this.commissionInSCcy = commissionInSCcy;
  }

  public CancelTxnDTO taxInSCcy(Double taxInSCcy) {
    this.taxInSCcy = taxInSCcy;
    return this;
  }

  /**
   * Get taxInSCcy
   * @return taxInSCcy
  **/
  @ApiModelProperty(value = "")


  public Double getTaxInSCcy() {
    return taxInSCcy;
  }

  public void setTaxInSCcy(Double taxInSCcy) {
    this.taxInSCcy = taxInSCcy;
  }

  public CancelTxnDTO cardChargesInSCcy(String cardChargesInSCcy) {
    this.cardChargesInSCcy = cardChargesInSCcy;
    return this;
  }

  /**
   * Get cardChargesInSCcy
   * @return cardChargesInSCcy
  **/
  @ApiModelProperty(value = "")


  public String getCardChargesInSCcy() {
    return cardChargesInSCcy;
  }

  public void setCardChargesInSCcy(String cardChargesInSCcy) {
    this.cardChargesInSCcy = cardChargesInSCcy;
  }

  public CancelTxnDTO additionalChargesInSCcy(Double additionalChargesInSCcy) {
    this.additionalChargesInSCcy = additionalChargesInSCcy;
    return this;
  }

  /**
   * Get additionalChargesInSCcy
   * @return additionalChargesInSCcy
  **/
  @ApiModelProperty(value = "")


  public Double getAdditionalChargesInSCcy() {
    return additionalChargesInSCcy;
  }

  public void setAdditionalChargesInSCcy(Double additionalChargesInSCcy) {
    this.additionalChargesInSCcy = additionalChargesInSCcy;
  }

  public CancelTxnDTO otherChargesInSCcy(Double otherChargesInSCcy) {
    this.otherChargesInSCcy = otherChargesInSCcy;
    return this;
  }

  /**
   * Get otherChargesInSCcy
   * @return otherChargesInSCcy
  **/
  @ApiModelProperty(value = "")


  public Double getOtherChargesInSCcy() {
    return otherChargesInSCcy;
  }

  public void setOtherChargesInSCcy(Double otherChargesInSCcy) {
    this.otherChargesInSCcy = otherChargesInSCcy;
  }

  public CancelTxnDTO payinAmountInSCcy(Double payinAmountInSCcy) {
    this.payinAmountInSCcy = payinAmountInSCcy;
    return this;
  }

  /**
   * Get payinAmountInSCcy
   * @return payinAmountInSCcy
  **/
  @ApiModelProperty(value = "")


  public Double getPayinAmountInSCcy() {
    return payinAmountInSCcy;
  }

  public void setPayinAmountInSCcy(Double payinAmountInSCcy) {
    this.payinAmountInSCcy = payinAmountInSCcy;
  }

  public CancelTxnDTO totalPayinAmountInSCcy(Double totalPayinAmountInSCcy) {
    this.totalPayinAmountInSCcy = totalPayinAmountInSCcy;
    return this;
  }

  /**
   * Get totalPayinAmountInSCcy
   * @return totalPayinAmountInSCcy
  **/
  @ApiModelProperty(value = "")


  public Double getTotalPayinAmountInSCcy() {
    return totalPayinAmountInSCcy;
  }

  public void setTotalPayinAmountInSCcy(Double totalPayinAmountInSCcy) {
    this.totalPayinAmountInSCcy = totalPayinAmountInSCcy;
  }

  public CancelTxnDTO payoutAmountInSCcy(Double payoutAmountInSCcy) {
    this.payoutAmountInSCcy = payoutAmountInSCcy;
    return this;
  }

  /**
   * Get payoutAmountInSCcy
   * @return payoutAmountInSCcy
  **/
  @ApiModelProperty(value = "")


  public Double getPayoutAmountInSCcy() {
    return payoutAmountInSCcy;
  }

  public void setPayoutAmountInSCcy(Double payoutAmountInSCcy) {
    this.payoutAmountInSCcy = payoutAmountInSCcy;
  }

  public CancelTxnDTO txnOtherInfo1(String txnOtherInfo1) {
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

  public CancelTxnDTO txnOtherInfo2(String txnOtherInfo2) {
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

  public CancelTxnDTO txnOtherInfo3(String txnOtherInfo3) {
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

  public CancelTxnDTO txnOtherInfo4(String txnOtherInfo4) {
    this.txnOtherInfo4 = txnOtherInfo4;
    return this;
  }

  /**
   * Get txnOtherInfo4
   * @return txnOtherInfo4
  **/
  @ApiModelProperty(value = "")


  public String getTxnOtherInfo4() {
    return txnOtherInfo4;
  }

  public void setTxnOtherInfo4(String txnOtherInfo4) {
    this.txnOtherInfo4 = txnOtherInfo4;
  }

  public CancelTxnDTO txnOtherInfo5(String txnOtherInfo5) {
    this.txnOtherInfo5 = txnOtherInfo5;
    return this;
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

  public CancelTxnDTO reservedParam1(String reservedParam1) {
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

  public CancelTxnDTO reservedParam2(String reservedParam2) {
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

  public CancelTxnDTO reservedParam3(String reservedParam3) {
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

  public CancelTxnDTO reservedParam4(String reservedParam4) {
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

  public CancelTxnDTO reservedParam5(String reservedParam5) {
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

  public CancelTxnDTO reservedParam6(String reservedParam6) {
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

  public CancelTxnDTO reservedParam7(String reservedParam7) {
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

  public CancelTxnDTO reservedParam8(String reservedParam8) {
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

  public CancelTxnDTO reservedParam9(String reservedParam9) {
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

  public CancelTxnDTO reservedParam10(String reservedParam10) {
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

  public CancelTxnDTO instrumentType(String instrumentType) {
    this.instrumentType = instrumentType;
    return this;
  }

  /**
   * Get instrumentType
   * @return instrumentType
  **/
  @ApiModelProperty(value = "")


  public String getInstrumentType() {
    return instrumentType;
  }

  public void setInstrumentType(String instrumentType) {
    this.instrumentType = instrumentType;
  }

  public CancelTxnDTO txnType(String txnType) {
    this.txnType = txnType;
    return this;
  }

  /**
   * Get txnType
   * @return txnType
  **/
  @ApiModelProperty(value = "")


  public String getTxnType() {
    return txnType;
  }

  public void setTxnType(String txnType) {
    this.txnType = txnType;
  }

  public CancelTxnDTO deliveryChannel(String deliveryChannel) {
    this.deliveryChannel = deliveryChannel;
    return this;
  }

  /**
   * Get deliveryChannel
   * @return deliveryChannel
  **/
  @ApiModelProperty(value = "")


  public String getDeliveryChannel() {
    return deliveryChannel;
  }

  public void setDeliveryChannel(String deliveryChannel) {
    this.deliveryChannel = deliveryChannel;
  }

  public CancelTxnDTO deliveryOption(String deliveryOption) {
    this.deliveryOption = deliveryOption;
    return this;
  }

  /**
   * Get deliveryOption
   * @return deliveryOption
  **/
  @ApiModelProperty(value = "")


  public String getDeliveryOption() {
    return deliveryOption;
  }

  public void setDeliveryOption(String deliveryOption) {
    this.deliveryOption = deliveryOption;
  }

  public CancelTxnDTO cancelReasonCode(Integer cancelReasonCode) {
    this.cancelReasonCode = cancelReasonCode;
    return this;
  }

  /**
   * Get cancelReasonCode
   * @return cancelReasonCode
  **/
  @ApiModelProperty(value = "")


  public Integer getCancelReasonCode() {
    return cancelReasonCode;
  }

  public void setCancelReasonCode(Integer cancelReasonCode) {
    this.cancelReasonCode = cancelReasonCode;
  }

  public CancelTxnDTO baseCcyCode(String baseCcyCode) {
    this.baseCcyCode = baseCcyCode;
    return this;
  }

  /**
   * Get baseCcyCode
   * @return baseCcyCode
  **/
  @ApiModelProperty(value = "")


  public String getBaseCcyCode() {
    return baseCcyCode;
  }

  public void setBaseCcyCode(String baseCcyCode) {
    this.baseCcyCode = baseCcyCode;
  }

  public CancelTxnDTO xchgRatePayinToPayout(Double xchgRatePayinToPayout) {
    this.xchgRatePayinToPayout = xchgRatePayinToPayout;
    return this;
  }

  /**
   * Get xchgRatePayinToPayout
   * @return xchgRatePayinToPayout
  **/
  @ApiModelProperty(value = "")


  public Double getXchgRatePayinToPayout() {
    return xchgRatePayinToPayout;
  }

  public void setXchgRatePayinToPayout(Double xchgRatePayinToPayout) {
    this.xchgRatePayinToPayout = xchgRatePayinToPayout;
  }

  public CancelTxnDTO xchgRateUSDToSettlementBuy(Double xchgRateUSDToSettlementBuy) {
    this.xchgRateUSDToSettlementBuy = xchgRateUSDToSettlementBuy;
    return this;
  }

  /**
   * Get xchgRateUSDToSettlementBuy
   * @return xchgRateUSDToSettlementBuy
  **/
  @ApiModelProperty(value = "")


  public Double getXchgRateUSDToSettlementBuy() {
    return xchgRateUSDToSettlementBuy;
  }

  public void setXchgRateUSDToSettlementBuy(Double xchgRateUSDToSettlementBuy) {
    this.xchgRateUSDToSettlementBuy = xchgRateUSDToSettlementBuy;
  }

  public CancelTxnDTO xchgRateSettlementToSPCcy(Double xchgRateSettlementToSPCcy) {
    this.xchgRateSettlementToSPCcy = xchgRateSettlementToSPCcy;
    return this;
  }

  /**
   * Get xchgRateSettlementToSPCcy
   * @return xchgRateSettlementToSPCcy
  **/
  @ApiModelProperty(value = "")


  public Double getXchgRateSettlementToSPCcy() {
    return xchgRateSettlementToSPCcy;
  }

  public void setXchgRateSettlementToSPCcy(Double xchgRateSettlementToSPCcy) {
    this.xchgRateSettlementToSPCcy = xchgRateSettlementToSPCcy;
  }

  public CancelTxnDTO xmCancellationChargesInLC(Double xmCancellationChargesInLC) {
    this.xmCancellationChargesInLC = xmCancellationChargesInLC;
    return this;
  }

  /**
   * Get xmCancellationChargesInLC
   * @return xmCancellationChargesInLC
  **/
  @ApiModelProperty(value = "")


  public Double getXmCancellationChargesInLC() {
    return xmCancellationChargesInLC;
  }

  public void setXmCancellationChargesInLC(Double xmCancellationChargesInLC) {
    this.xmCancellationChargesInLC = xmCancellationChargesInLC;
  }

  public CancelTxnDTO xmRefundPayinAmount(Double xmRefundPayinAmount) {
    this.xmRefundPayinAmount = xmRefundPayinAmount;
    return this;
  }

  /**
   * Get xmRefundPayinAmount
   * @return xmRefundPayinAmount
  **/
  @ApiModelProperty(value = "")


  public Double getXmRefundPayinAmount() {
    return xmRefundPayinAmount;
  }

  public void setXmRefundPayinAmount(Double xmRefundPayinAmount) {
    this.xmRefundPayinAmount = xmRefundPayinAmount;
  }

  public CancelTxnDTO xmRefundCommission(Double xmRefundCommission) {
    this.xmRefundCommission = xmRefundCommission;
    return this;
  }

  /**
   * Get xmRefundCommission
   * @return xmRefundCommission
  **/
  @ApiModelProperty(value = "")


  public Double getXmRefundCommission() {
    return xmRefundCommission;
  }

  public void setXmRefundCommission(Double xmRefundCommission) {
    this.xmRefundCommission = xmRefundCommission;
  }

  public CancelTxnDTO xmRefundTax(Double xmRefundTax) {
    this.xmRefundTax = xmRefundTax;
    return this;
  }

  /**
   * Get xmRefundTax
   * @return xmRefundTax
  **/
  @ApiModelProperty(value = "")


  public Double getXmRefundTax() {
    return xmRefundTax;
  }

  public void setXmRefundTax(Double xmRefundTax) {
    this.xmRefundTax = xmRefundTax;
  }

  public CancelTxnDTO xmRefundOtherCharges(Double xmRefundOtherCharges) {
    this.xmRefundOtherCharges = xmRefundOtherCharges;
    return this;
  }

  /**
   * Get xmRefundOtherCharges
   * @return xmRefundOtherCharges
  **/
  @ApiModelProperty(value = "")


  public Double getXmRefundOtherCharges() {
    return xmRefundOtherCharges;
  }

  public void setXmRefundOtherCharges(Double xmRefundOtherCharges) {
    this.xmRefundOtherCharges = xmRefundOtherCharges;
  }

  public CancelTxnDTO xmCancellationCharges(Double xmCancellationCharges) {
    this.xmCancellationCharges = xmCancellationCharges;
    return this;
  }

  /**
   * Get xmCancellationCharges
   * @return xmCancellationCharges
  **/
  @ApiModelProperty(value = "")


  public Double getXmCancellationCharges() {
    return xmCancellationCharges;
  }

  public void setXmCancellationCharges(Double xmCancellationCharges) {
    this.xmCancellationCharges = xmCancellationCharges;
  }

  public CancelTxnDTO xmRefundCardCharges(Double xmRefundCardCharges) {
    this.xmRefundCardCharges = xmRefundCardCharges;
    return this;
  }

  /**
   * Get xmRefundCardCharges
   * @return xmRefundCardCharges
  **/
  @ApiModelProperty(value = "")


  public Double getXmRefundCardCharges() {
    return xmRefundCardCharges;
  }

  public void setXmRefundCardCharges(Double xmRefundCardCharges) {
    this.xmRefundCardCharges = xmRefundCardCharges;
  }

  public CancelTxnDTO xmRefundAdditionalCharges(Double xmRefundAdditionalCharges) {
    this.xmRefundAdditionalCharges = xmRefundAdditionalCharges;
    return this;
  }

  /**
   * Get xmRefundAdditionalCharges
   * @return xmRefundAdditionalCharges
  **/
  @ApiModelProperty(value = "")


  public Double getXmRefundAdditionalCharges() {
    return xmRefundAdditionalCharges;
  }

  public void setXmRefundAdditionalCharges(Double xmRefundAdditionalCharges) {
    this.xmRefundAdditionalCharges = xmRefundAdditionalCharges;
  }

  public CancelTxnDTO xmRefundPayinAmountInSCcy(Double xmRefundPayinAmountInSCcy) {
    this.xmRefundPayinAmountInSCcy = xmRefundPayinAmountInSCcy;
    return this;
  }

  /**
   * Get xmRefundPayinAmountInSCcy
   * @return xmRefundPayinAmountInSCcy
  **/
  @ApiModelProperty(value = "")


  public Double getXmRefundPayinAmountInSCcy() {
    return xmRefundPayinAmountInSCcy;
  }

  public void setXmRefundPayinAmountInSCcy(Double xmRefundPayinAmountInSCcy) {
    this.xmRefundPayinAmountInSCcy = xmRefundPayinAmountInSCcy;
  }

  public CancelTxnDTO xmCancellationChargesInSCcy(Double xmCancellationChargesInSCcy) {
    this.xmCancellationChargesInSCcy = xmCancellationChargesInSCcy;
    return this;
  }

  /**
   * Get xmCancellationChargesInSCcy
   * @return xmCancellationChargesInSCcy
  **/
  @ApiModelProperty(value = "")


  public Double getXmCancellationChargesInSCcy() {
    return xmCancellationChargesInSCcy;
  }

  public void setXmCancellationChargesInSCcy(Double xmCancellationChargesInSCcy) {
    this.xmCancellationChargesInSCcy = xmCancellationChargesInSCcy;
  }

  public CancelTxnDTO xmRefundCardChargesInSCcy(Double xmRefundCardChargesInSCcy) {
    this.xmRefundCardChargesInSCcy = xmRefundCardChargesInSCcy;
    return this;
  }

  /**
   * Get xmRefundCardChargesInSCcy
   * @return xmRefundCardChargesInSCcy
  **/
  @ApiModelProperty(value = "")


  public Double getXmRefundCardChargesInSCcy() {
    return xmRefundCardChargesInSCcy;
  }

  public void setXmRefundCardChargesInSCcy(Double xmRefundCardChargesInSCcy) {
    this.xmRefundCardChargesInSCcy = xmRefundCardChargesInSCcy;
  }

  public CancelTxnDTO xmRefundAddlChargesInSCcy(Double xmRefundAddlChargesInSCcy) {
    this.xmRefundAddlChargesInSCcy = xmRefundAddlChargesInSCcy;
    return this;
  }

  /**
   * Get xmRefundAddlChargesInSCcy
   * @return xmRefundAddlChargesInSCcy
  **/
  @ApiModelProperty(value = "")


  public Double getXmRefundAddlChargesInSCcy() {
    return xmRefundAddlChargesInSCcy;
  }

  public void setXmRefundAddlChargesInSCcy(Double xmRefundAddlChargesInSCcy) {
    this.xmRefundAddlChargesInSCcy = xmRefundAddlChargesInSCcy;
  }

  public CancelTxnDTO payin2BaseCcyRate(Double payin2BaseCcyRate) {
    this.payin2BaseCcyRate = payin2BaseCcyRate;
    return this;
  }

  /**
   * Get payin2BaseCcyRate
   * @return payin2BaseCcyRate
  **/
  @ApiModelProperty(value = "")


  public Double getPayin2BaseCcyRate() {
    return payin2BaseCcyRate;
  }

  public void setPayin2BaseCcyRate(Double payin2BaseCcyRate) {
    this.payin2BaseCcyRate = payin2BaseCcyRate;
  }

  public CancelTxnDTO refundPayinAmountInBaseCcy(Double refundPayinAmountInBaseCcy) {
    this.refundPayinAmountInBaseCcy = refundPayinAmountInBaseCcy;
    return this;
  }

  /**
   * Get refundPayinAmountInBaseCcy
   * @return refundPayinAmountInBaseCcy
  **/
  @ApiModelProperty(value = "")


  public Double getRefundPayinAmountInBaseCcy() {
    return refundPayinAmountInBaseCcy;
  }

  public void setRefundPayinAmountInBaseCcy(Double refundPayinAmountInBaseCcy) {
    this.refundPayinAmountInBaseCcy = refundPayinAmountInBaseCcy;
  }

  public CancelTxnDTO spCcyCode(String spCcyCode) {
    this.spCcyCode = spCcyCode;
    return this;
  }

  /**
   * Get spCcyCode
   * @return spCcyCode
  **/
  @ApiModelProperty(value = "")


  public String getSpCcyCode() {
    return spCcyCode;
  }

  public void setSpCcyCode(String spCcyCode) {
    this.spCcyCode = spCcyCode;
  }

  public CancelTxnDTO refundPayinAmountInSPCcy(Double refundPayinAmountInSPCcy) {
    this.refundPayinAmountInSPCcy = refundPayinAmountInSPCcy;
    return this;
  }

  /**
   * Get refundPayinAmountInSPCcy
   * @return refundPayinAmountInSPCcy
  **/
  @ApiModelProperty(value = "")


  public Double getRefundPayinAmountInSPCcy() {
    return refundPayinAmountInSPCcy;
  }

  public void setRefundPayinAmountInSPCcy(Double refundPayinAmountInSPCcy) {
    this.refundPayinAmountInSPCcy = refundPayinAmountInSPCcy;
  }

  public CancelTxnDTO refundCommissionInSPCcy(Double refundCommissionInSPCcy) {
    this.refundCommissionInSPCcy = refundCommissionInSPCcy;
    return this;
  }

  /**
   * Get refundCommissionInSPCcy
   * @return refundCommissionInSPCcy
  **/
  @ApiModelProperty(value = "")


  public Double getRefundCommissionInSPCcy() {
    return refundCommissionInSPCcy;
  }

  public void setRefundCommissionInSPCcy(Double refundCommissionInSPCcy) {
    this.refundCommissionInSPCcy = refundCommissionInSPCcy;
  }

  public CancelTxnDTO refundTaxInSPCcy(Double refundTaxInSPCcy) {
    this.refundTaxInSPCcy = refundTaxInSPCcy;
    return this;
  }

  /**
   * Get refundTaxInSPCcy
   * @return refundTaxInSPCcy
  **/
  @ApiModelProperty(value = "")


  public Double getRefundTaxInSPCcy() {
    return refundTaxInSPCcy;
  }

  public void setRefundTaxInSPCcy(Double refundTaxInSPCcy) {
    this.refundTaxInSPCcy = refundTaxInSPCcy;
  }

  public CancelTxnDTO refundOtherChargesInSPCcy(Double refundOtherChargesInSPCcy) {
    this.refundOtherChargesInSPCcy = refundOtherChargesInSPCcy;
    return this;
  }

  /**
   * Get refundOtherChargesInSPCcy
   * @return refundOtherChargesInSPCcy
  **/
  @ApiModelProperty(value = "")


  public Double getRefundOtherChargesInSPCcy() {
    return refundOtherChargesInSPCcy;
  }

  public void setRefundOtherChargesInSPCcy(Double refundOtherChargesInSPCcy) {
    this.refundOtherChargesInSPCcy = refundOtherChargesInSPCcy;
  }

  public CancelTxnDTO cancellationChargesInSPCcy(Double cancellationChargesInSPCcy) {
    this.cancellationChargesInSPCcy = cancellationChargesInSPCcy;
    return this;
  }

  /**
   * Get cancellationChargesInSPCcy
   * @return cancellationChargesInSPCcy
  **/
  @ApiModelProperty(value = "")


  public Double getCancellationChargesInSPCcy() {
    return cancellationChargesInSPCcy;
  }

  public void setCancellationChargesInSPCcy(Double cancellationChargesInSPCcy) {
    this.cancellationChargesInSPCcy = cancellationChargesInSPCcy;
  }

  public CancelTxnDTO refundCardChargesInSPCcy(Double refundCardChargesInSPCcy) {
    this.refundCardChargesInSPCcy = refundCardChargesInSPCcy;
    return this;
  }

  /**
   * Get refundCardChargesInSPCcy
   * @return refundCardChargesInSPCcy
  **/
  @ApiModelProperty(value = "")


  public Double getRefundCardChargesInSPCcy() {
    return refundCardChargesInSPCcy;
  }

  public void setRefundCardChargesInSPCcy(Double refundCardChargesInSPCcy) {
    this.refundCardChargesInSPCcy = refundCardChargesInSPCcy;
  }

  public CancelTxnDTO refundAddlChargesInSPCcy(Double refundAddlChargesInSPCcy) {
    this.refundAddlChargesInSPCcy = refundAddlChargesInSPCcy;
    return this;
  }

  /**
   * Get refundAddlChargesInSPCcy
   * @return refundAddlChargesInSPCcy
  **/
  @ApiModelProperty(value = "")


  public Double getRefundAddlChargesInSPCcy() {
    return refundAddlChargesInSPCcy;
  }

  public void setRefundAddlChargesInSPCcy(Double refundAddlChargesInSPCcy) {
    this.refundAddlChargesInSPCcy = refundAddlChargesInSPCcy;
  }

  public CancelTxnDTO draweeBankBranchCode(String draweeBankBranchCode) {
    this.draweeBankBranchCode = draweeBankBranchCode;
    return this;
  }

  /**
   * Get draweeBankBranchCode
   * @return draweeBankBranchCode
  **/
  @ApiModelProperty(value = "")


  public String getDraweeBankBranchCode() {
    return draweeBankBranchCode;
  }

  public void setDraweeBankBranchCode(String draweeBankBranchCode) {
    this.draweeBankBranchCode = draweeBankBranchCode;
  }

  public CancelTxnDTO createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(value = "")


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public CancelTxnDTO instrumentNo(String instrumentNo) {
    this.instrumentNo = instrumentNo;
    return this;
  }

  /**
   * Get instrumentNo
   * @return instrumentNo
  **/
  @ApiModelProperty(value = "")


  public String getInstrumentNo() {
    return instrumentNo;
  }

  public void setInstrumentNo(String instrumentNo) {
    this.instrumentNo = instrumentNo;
  }

  public CancelTxnDTO taxInvoiceNo(String taxInvoiceNo) {
    this.taxInvoiceNo = taxInvoiceNo;
    return this;
  }

  /**
   * Get taxInvoiceNo
   * @return taxInvoiceNo
  **/
  @ApiModelProperty(value = "")


  public String getTaxInvoiceNo() {
    return taxInvoiceNo;
  }

  public void setTaxInvoiceNo(String taxInvoiceNo) {
    this.taxInvoiceNo = taxInvoiceNo;
  }

  public CancelTxnDTO returnCode(String returnCode) {
    this.returnCode = returnCode;
    return this;
  }

  /**
   * Get returnCode
   * @return returnCode
  **/
  @ApiModelProperty(value = "")


  public String getReturnCode() {
    return returnCode;
  }

  public void setReturnCode(String returnCode) {
    this.returnCode = returnCode;
  }

  public CancelTxnDTO returnMessage(String returnMessage) {
    this.returnMessage = returnMessage;
    return this;
  }

  /**
   * Get returnMessage
   * @return returnMessage
  **/
  @ApiModelProperty(value = "")


  public String getReturnMessage() {
    return returnMessage;
  }

  public void setReturnMessage(String returnMessage) {
    this.returnMessage = returnMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelTxnDTO cancelTransactionResponse = (CancelTxnDTO) o;
    return Objects.equals(this.serverResponse, cancelTransactionResponse.serverResponse) &&
        Objects.equals(this.txnRefNo, cancelTransactionResponse.txnRefNo) &&
        Objects.equals(this.partnerTxnRefNo, cancelTransactionResponse.partnerTxnRefNo) &&
        Objects.equals(this.transactionGMTDateTime, cancelTransactionResponse.transactionGMTDateTime) &&
        Objects.equals(this.cancellationGMTDateTime, cancelTransactionResponse.cancellationGMTDateTime) &&
        Objects.equals(this.senderType, cancelTransactionResponse.senderType) &&
        Objects.equals(this.senderRefNumber, cancelTransactionResponse.senderRefNumber) &&
        Objects.equals(this.senderFirstName, cancelTransactionResponse.senderFirstName) &&
        Objects.equals(this.senderMiddleName, cancelTransactionResponse.senderMiddleName) &&
        Objects.equals(this.senderLastName, cancelTransactionResponse.senderLastName) &&
        Objects.equals(this.senderPOBox, cancelTransactionResponse.senderPOBox) &&
        Objects.equals(this.senderAddress1, cancelTransactionResponse.senderAddress1) &&
        Objects.equals(this.senderAddress2, cancelTransactionResponse.senderAddress2) &&
        Objects.equals(this.senderCity, cancelTransactionResponse.senderCity) &&
        Objects.equals(this.senderDistrict, cancelTransactionResponse.senderDistrict) &&
        Objects.equals(this.senderState, cancelTransactionResponse.senderState) &&
        Objects.equals(this.senderCountryCode, cancelTransactionResponse.senderCountryCode) &&
        Objects.equals(this.senderZipCode, cancelTransactionResponse.senderZipCode) &&
        Objects.equals(this.senderPhone, cancelTransactionResponse.senderPhone) &&
        Objects.equals(this.senderMobile, cancelTransactionResponse.senderMobile) &&
        Objects.equals(this.senderFax, cancelTransactionResponse.senderFax) &&
        Objects.equals(this.senderEmail, cancelTransactionResponse.senderEmail) &&
        Objects.equals(this.senderOtherInfo, cancelTransactionResponse.senderOtherInfo) &&
        Objects.equals(this.senderMessageToBeneficiary, cancelTransactionResponse.senderMessageToBeneficiary) &&
        Objects.equals(this.senderGender, cancelTransactionResponse.senderGender) &&
        Objects.equals(this.senderDateOfBirth, cancelTransactionResponse.senderDateOfBirth) &&
        Objects.equals(this.senderNationalityCode, cancelTransactionResponse.senderNationalityCode) &&
        Objects.equals(this.senderOccupation, cancelTransactionResponse.senderOccupation) &&
        Objects.equals(this.senderEmployerName, cancelTransactionResponse.senderEmployerName) &&
        Objects.equals(this.senderEmployerPhone, cancelTransactionResponse.senderEmployerPhone) &&
        Objects.equals(this.senderOtherInfo1, cancelTransactionResponse.senderOtherInfo1) &&
        Objects.equals(this.senderOtherInfo2, cancelTransactionResponse.senderOtherInfo2) &&
        Objects.equals(this.senderOtherInfo3, cancelTransactionResponse.senderOtherInfo3) &&
        Objects.equals(this.senderOtherInfo4, cancelTransactionResponse.senderOtherInfo4) &&
        Objects.equals(this.senderOtherInfo5, cancelTransactionResponse.senderOtherInfo5) &&
        Objects.equals(this.receiverType, cancelTransactionResponse.receiverType) &&
        Objects.equals(this.receiverRefNumber, cancelTransactionResponse.receiverRefNumber) &&
        Objects.equals(this.receiverFirstName, cancelTransactionResponse.receiverFirstName) &&
        Objects.equals(this.receiverMiddleName, cancelTransactionResponse.receiverMiddleName) &&
        Objects.equals(this.receiverLastName, cancelTransactionResponse.receiverLastName) &&
        Objects.equals(this.receiverPOBox, cancelTransactionResponse.receiverPOBox) &&
        Objects.equals(this.receiverAddress1, cancelTransactionResponse.receiverAddress1) &&
        Objects.equals(this.receiverAddress2, cancelTransactionResponse.receiverAddress2) &&
        Objects.equals(this.receiverCity, cancelTransactionResponse.receiverCity) &&
        Objects.equals(this.receiverDistrict, cancelTransactionResponse.receiverDistrict) &&
        Objects.equals(this.receiverState, cancelTransactionResponse.receiverState) &&
        Objects.equals(this.receiverCountryCode, cancelTransactionResponse.receiverCountryCode) &&
        Objects.equals(this.receiverZipCode, cancelTransactionResponse.receiverZipCode) &&
        Objects.equals(this.receiverPhone, cancelTransactionResponse.receiverPhone) &&
        Objects.equals(this.receiverMobile, cancelTransactionResponse.receiverMobile) &&
        Objects.equals(this.receiverFax, cancelTransactionResponse.receiverFax) &&
        Objects.equals(this.receiverEmail, cancelTransactionResponse.receiverEmail) &&
        Objects.equals(this.receiverNationalityCode, cancelTransactionResponse.receiverNationalityCode) &&
        Objects.equals(this.receiverGender, cancelTransactionResponse.receiverGender) &&
        Objects.equals(this.receiverDateOfBirth, cancelTransactionResponse.receiverDateOfBirth) &&
        Objects.equals(this.receiverOccupation, cancelTransactionResponse.receiverOccupation) &&
        Objects.equals(this.receiverCustomerRelationship, cancelTransactionResponse.receiverCustomerRelationship) &&
        Objects.equals(this.receiverBankAccountNo, cancelTransactionResponse.receiverBankAccountNo) &&
        Objects.equals(this.receiverBankAccountName, cancelTransactionResponse.receiverBankAccountName) &&
        Objects.equals(this.receiverBankName, cancelTransactionResponse.receiverBankName) &&
        Objects.equals(this.receivingAgentCode, cancelTransactionResponse.receivingAgentCode) &&
        Objects.equals(this.serviceFlag, cancelTransactionResponse.serviceFlag) &&
        Objects.equals(this.receiverBankPOBox, cancelTransactionResponse.receiverBankPOBox) &&
        Objects.equals(this.receiverBankAddress1, cancelTransactionResponse.receiverBankAddress1) &&
        Objects.equals(this.receiverBankAddress2, cancelTransactionResponse.receiverBankAddress2) &&
        Objects.equals(this.receiverBankCity, cancelTransactionResponse.receiverBankCity) &&
        Objects.equals(this.receiverBankDistrict, cancelTransactionResponse.receiverBankDistrict) &&
        Objects.equals(this.receiverBankState, cancelTransactionResponse.receiverBankState) &&
        Objects.equals(this.receiverBankCountryCode, cancelTransactionResponse.receiverBankCountryCode) &&
        Objects.equals(this.receiverBankZipCode, cancelTransactionResponse.receiverBankZipCode) &&
        Objects.equals(this.receiverBankPhone, cancelTransactionResponse.receiverBankPhone) &&
        Objects.equals(this.receiverBankMobile, cancelTransactionResponse.receiverBankMobile) &&
        Objects.equals(this.receiverBankFax, cancelTransactionResponse.receiverBankFax) &&
        Objects.equals(this.receiverBankEmail, cancelTransactionResponse.receiverBankEmail) &&
        Objects.equals(this.receiverOtherInfo1, cancelTransactionResponse.receiverOtherInfo1) &&
        Objects.equals(this.receiverOtherInfo2, cancelTransactionResponse.receiverOtherInfo2) &&
        Objects.equals(this.receiverOtherInfo3, cancelTransactionResponse.receiverOtherInfo3) &&
        Objects.equals(this.receiverOtherInfo4, cancelTransactionResponse.receiverOtherInfo4) &&
        Objects.equals(this.receiverOtherInfo5, cancelTransactionResponse.receiverOtherInfo5) &&
        Objects.equals(this.sourceOfIncome, cancelTransactionResponse.sourceOfIncome) &&
        Objects.equals(this.purposeOfTxn, cancelTransactionResponse.purposeOfTxn) &&
        Objects.equals(this.purposeOfTxnDetails, cancelTransactionResponse.purposeOfTxnDetails) &&
        Objects.equals(this.cancelReasonDesc, cancelTransactionResponse.cancelReasonDesc) &&
        Objects.equals(this.paymentMode, cancelTransactionResponse.paymentMode) &&
        Objects.equals(this.cancelXchgRatePayin2Payout, cancelTransactionResponse.cancelXchgRatePayin2Payout) &&
        Objects.equals(this.payinCcyCode, cancelTransactionResponse.payinCcyCode) &&
        Objects.equals(this.cancelPayinAmount, cancelTransactionResponse.cancelPayinAmount) &&
        Objects.equals(this.payoutCcyCode, cancelTransactionResponse.payoutCcyCode) &&
        Objects.equals(this.cancelPayoutAmount, cancelTransactionResponse.cancelPayoutAmount) &&
        Objects.equals(this.cancelCommission, cancelTransactionResponse.cancelCommission) &&
        Objects.equals(this.cancelTax, cancelTransactionResponse.cancelTax) &&
        Objects.equals(this.cancelCardCharges, cancelTransactionResponse.cancelCardCharges) &&
        Objects.equals(this.cancelAdditionalCharges, cancelTransactionResponse.cancelAdditionalCharges) &&
        Objects.equals(this.cancelOtherCharges, cancelTransactionResponse.cancelOtherCharges) &&
        Objects.equals(this.cancellationCharges, cancelTransactionResponse.cancellationCharges) &&
        Objects.equals(this.cancelTotalPayinAmount, cancelTransactionResponse.cancelTotalPayinAmount) &&
        Objects.equals(this.sendingAgentCode, cancelTransactionResponse.sendingAgentCode) &&
        Objects.equals(this.serviceProviderCode, cancelTransactionResponse.serviceProviderCode) &&
        Objects.equals(this.settlementCcyCode, cancelTransactionResponse.settlementCcyCode) &&
        Objects.equals(this.xchgRateUSDToPayin, cancelTransactionResponse.xchgRateUSDToPayin) &&
        Objects.equals(this.xchgRateUSDToPayout, cancelTransactionResponse.xchgRateUSDToPayout) &&
        Objects.equals(this.xchgRateUSDToSettlement, cancelTransactionResponse.xchgRateUSDToSettlement) &&
        Objects.equals(this.xchgRateSettlementToPayin, cancelTransactionResponse.xchgRateSettlementToPayin) &&
        Objects.equals(this.xchgRateSettlementToPayout, cancelTransactionResponse.xchgRateSettlementToPayout) &&
        Objects.equals(this.commissionInSCcy, cancelTransactionResponse.commissionInSCcy) &&
        Objects.equals(this.taxInSCcy, cancelTransactionResponse.taxInSCcy) &&
        Objects.equals(this.cardChargesInSCcy, cancelTransactionResponse.cardChargesInSCcy) &&
        Objects.equals(this.additionalChargesInSCcy, cancelTransactionResponse.additionalChargesInSCcy) &&
        Objects.equals(this.otherChargesInSCcy, cancelTransactionResponse.otherChargesInSCcy) &&
        Objects.equals(this.payinAmountInSCcy, cancelTransactionResponse.payinAmountInSCcy) &&
        Objects.equals(this.totalPayinAmountInSCcy, cancelTransactionResponse.totalPayinAmountInSCcy) &&
        Objects.equals(this.payoutAmountInSCcy, cancelTransactionResponse.payoutAmountInSCcy) &&
        Objects.equals(this.txnOtherInfo1, cancelTransactionResponse.txnOtherInfo1) &&
        Objects.equals(this.txnOtherInfo2, cancelTransactionResponse.txnOtherInfo2) &&
        Objects.equals(this.txnOtherInfo3, cancelTransactionResponse.txnOtherInfo3) &&
        Objects.equals(this.txnOtherInfo4, cancelTransactionResponse.txnOtherInfo4) &&
        Objects.equals(this.txnOtherInfo5, cancelTransactionResponse.txnOtherInfo5) &&
        Objects.equals(this.reservedParam1, cancelTransactionResponse.reservedParam1) &&
        Objects.equals(this.reservedParam2, cancelTransactionResponse.reservedParam2) &&
        Objects.equals(this.reservedParam3, cancelTransactionResponse.reservedParam3) &&
        Objects.equals(this.reservedParam4, cancelTransactionResponse.reservedParam4) &&
        Objects.equals(this.reservedParam5, cancelTransactionResponse.reservedParam5) &&
        Objects.equals(this.reservedParam6, cancelTransactionResponse.reservedParam6) &&
        Objects.equals(this.reservedParam7, cancelTransactionResponse.reservedParam7) &&
        Objects.equals(this.reservedParam8, cancelTransactionResponse.reservedParam8) &&
        Objects.equals(this.reservedParam9, cancelTransactionResponse.reservedParam9) &&
        Objects.equals(this.reservedParam10, cancelTransactionResponse.reservedParam10) &&
        Objects.equals(this.instrumentType, cancelTransactionResponse.instrumentType) &&
        Objects.equals(this.txnType, cancelTransactionResponse.txnType) &&
        Objects.equals(this.deliveryChannel, cancelTransactionResponse.deliveryChannel) &&
        Objects.equals(this.deliveryOption, cancelTransactionResponse.deliveryOption) &&
        Objects.equals(this.cancelReasonCode, cancelTransactionResponse.cancelReasonCode) &&
        Objects.equals(this.baseCcyCode, cancelTransactionResponse.baseCcyCode) &&
        Objects.equals(this.xchgRatePayinToPayout, cancelTransactionResponse.xchgRatePayinToPayout) &&
        Objects.equals(this.xchgRateUSDToSettlementBuy, cancelTransactionResponse.xchgRateUSDToSettlementBuy) &&
        Objects.equals(this.xchgRateSettlementToSPCcy, cancelTransactionResponse.xchgRateSettlementToSPCcy) &&
        Objects.equals(this.xmCancellationChargesInLC, cancelTransactionResponse.xmCancellationChargesInLC) &&
        Objects.equals(this.xmRefundPayinAmount, cancelTransactionResponse.xmRefundPayinAmount) &&
        Objects.equals(this.xmRefundCommission, cancelTransactionResponse.xmRefundCommission) &&
        Objects.equals(this.xmRefundTax, cancelTransactionResponse.xmRefundTax) &&
        Objects.equals(this.xmRefundOtherCharges, cancelTransactionResponse.xmRefundOtherCharges) &&
        Objects.equals(this.xmCancellationCharges, cancelTransactionResponse.xmCancellationCharges) &&
        Objects.equals(this.xmRefundCardCharges, cancelTransactionResponse.xmRefundCardCharges) &&
        Objects.equals(this.xmRefundAdditionalCharges, cancelTransactionResponse.xmRefundAdditionalCharges) &&
        Objects.equals(this.xmRefundPayinAmountInSCcy, cancelTransactionResponse.xmRefundPayinAmountInSCcy) &&
        Objects.equals(this.xmCancellationChargesInSCcy, cancelTransactionResponse.xmCancellationChargesInSCcy) &&
        Objects.equals(this.xmRefundCardChargesInSCcy, cancelTransactionResponse.xmRefundCardChargesInSCcy) &&
        Objects.equals(this.xmRefundAddlChargesInSCcy, cancelTransactionResponse.xmRefundAddlChargesInSCcy) &&
        Objects.equals(this.payin2BaseCcyRate, cancelTransactionResponse.payin2BaseCcyRate) &&
        Objects.equals(this.refundPayinAmountInBaseCcy, cancelTransactionResponse.refundPayinAmountInBaseCcy) &&
        Objects.equals(this.spCcyCode, cancelTransactionResponse.spCcyCode) &&
        Objects.equals(this.refundPayinAmountInSPCcy, cancelTransactionResponse.refundPayinAmountInSPCcy) &&
        Objects.equals(this.refundCommissionInSPCcy, cancelTransactionResponse.refundCommissionInSPCcy) &&
        Objects.equals(this.refundTaxInSPCcy, cancelTransactionResponse.refundTaxInSPCcy) &&
        Objects.equals(this.refundOtherChargesInSPCcy, cancelTransactionResponse.refundOtherChargesInSPCcy) &&
        Objects.equals(this.cancellationChargesInSPCcy, cancelTransactionResponse.cancellationChargesInSPCcy) &&
        Objects.equals(this.refundCardChargesInSPCcy, cancelTransactionResponse.refundCardChargesInSPCcy) &&
        Objects.equals(this.refundAddlChargesInSPCcy, cancelTransactionResponse.refundAddlChargesInSPCcy) &&
        Objects.equals(this.draweeBankBranchCode, cancelTransactionResponse.draweeBankBranchCode) &&
        Objects.equals(this.createdBy, cancelTransactionResponse.createdBy) &&
        Objects.equals(this.instrumentNo, cancelTransactionResponse.instrumentNo) &&
        Objects.equals(this.taxInvoiceNo, cancelTransactionResponse.taxInvoiceNo) &&
        Objects.equals(this.returnCode, cancelTransactionResponse.returnCode) &&
        Objects.equals(this.returnMessage, cancelTransactionResponse.returnMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serverResponse, txnRefNo, partnerTxnRefNo, transactionGMTDateTime, cancellationGMTDateTime, senderType, senderRefNumber, senderFirstName, senderMiddleName, senderLastName, senderPOBox, senderAddress1, senderAddress2, senderCity, senderDistrict, senderState, senderCountryCode, senderZipCode, senderPhone, senderMobile, senderFax, senderEmail, senderOtherInfo, senderMessageToBeneficiary, senderGender, senderDateOfBirth, senderNationalityCode, senderOccupation, senderEmployerName, senderEmployerPhone, senderOtherInfo1, senderOtherInfo2, senderOtherInfo3, senderOtherInfo4, senderOtherInfo5, receiverType, receiverRefNumber, receiverFirstName, receiverMiddleName, receiverLastName, receiverPOBox, receiverAddress1, receiverAddress2, receiverCity, receiverDistrict, receiverState, receiverCountryCode, receiverZipCode, receiverPhone, receiverMobile, receiverFax, receiverEmail, receiverNationalityCode, receiverGender, receiverDateOfBirth, receiverOccupation, receiverCustomerRelationship, receiverBankAccountNo, receiverBankAccountName, receiverBankName, receivingAgentCode, serviceFlag, receiverBankPOBox, receiverBankAddress1, receiverBankAddress2, receiverBankCity, receiverBankDistrict, receiverBankState, receiverBankCountryCode, receiverBankZipCode, receiverBankPhone, receiverBankMobile, receiverBankFax, receiverBankEmail, receiverOtherInfo1, receiverOtherInfo2, receiverOtherInfo3, receiverOtherInfo4, receiverOtherInfo5, sourceOfIncome, purposeOfTxn, purposeOfTxnDetails, cancelReasonDesc, paymentMode, cancelXchgRatePayin2Payout, payinCcyCode, cancelPayinAmount, payoutCcyCode, cancelPayoutAmount, cancelCommission, cancelTax, cancelCardCharges, cancelAdditionalCharges, cancelOtherCharges, cancellationCharges, cancelTotalPayinAmount, sendingAgentCode, serviceProviderCode, settlementCcyCode, xchgRateUSDToPayin, xchgRateUSDToPayout, xchgRateUSDToSettlement, xchgRateSettlementToPayin, xchgRateSettlementToPayout, commissionInSCcy, taxInSCcy, cardChargesInSCcy, additionalChargesInSCcy, otherChargesInSCcy, payinAmountInSCcy, totalPayinAmountInSCcy, payoutAmountInSCcy, txnOtherInfo1, txnOtherInfo2, txnOtherInfo3, txnOtherInfo4, txnOtherInfo5, reservedParam1, reservedParam2, reservedParam3, reservedParam4, reservedParam5, reservedParam6, reservedParam7, reservedParam8, reservedParam9, reservedParam10, instrumentType, txnType, deliveryChannel, deliveryOption, cancelReasonCode, baseCcyCode, xchgRatePayinToPayout, xchgRateUSDToSettlementBuy, xchgRateSettlementToSPCcy, xmCancellationChargesInLC, xmRefundPayinAmount, xmRefundCommission, xmRefundTax, xmRefundOtherCharges, xmCancellationCharges, xmRefundCardCharges, xmRefundAdditionalCharges, xmRefundPayinAmountInSCcy, xmCancellationChargesInSCcy, xmRefundCardChargesInSCcy, xmRefundAddlChargesInSCcy, payin2BaseCcyRate, refundPayinAmountInBaseCcy, spCcyCode, refundPayinAmountInSPCcy, refundCommissionInSPCcy, refundTaxInSPCcy, refundOtherChargesInSPCcy, cancellationChargesInSPCcy, refundCardChargesInSPCcy, refundAddlChargesInSPCcy, draweeBankBranchCode, createdBy, instrumentNo, taxInvoiceNo, returnCode, returnMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelTxnDTO {\n");
    
    sb.append("    serverResponse: ").append(toIndentedString(serverResponse)).append("\n");
    sb.append("    txnRefNo: ").append(toIndentedString(txnRefNo)).append("\n");
    sb.append("    partnerTxnRefNo: ").append(toIndentedString(partnerTxnRefNo)).append("\n");
    sb.append("    transactionGMTDateTime: ").append(toIndentedString(transactionGMTDateTime)).append("\n");
    sb.append("    cancellationGMTDateTime: ").append(toIndentedString(cancellationGMTDateTime)).append("\n");
    sb.append("    senderType: ").append(toIndentedString(senderType)).append("\n");
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
    sb.append("    senderPhone: ").append(toIndentedString(senderPhone)).append("\n");
    sb.append("    senderMobile: ").append(toIndentedString(senderMobile)).append("\n");
    sb.append("    senderFax: ").append(toIndentedString(senderFax)).append("\n");
    sb.append("    senderEmail: ").append(toIndentedString(senderEmail)).append("\n");
    sb.append("    senderOtherInfo: ").append(toIndentedString(senderOtherInfo)).append("\n");
    sb.append("    senderMessageToBeneficiary: ").append(toIndentedString(senderMessageToBeneficiary)).append("\n");
    sb.append("    senderGender: ").append(toIndentedString(senderGender)).append("\n");
    sb.append("    senderDateOfBirth: ").append(toIndentedString(senderDateOfBirth)).append("\n");
    sb.append("    senderNationalityCode: ").append(toIndentedString(senderNationalityCode)).append("\n");
    sb.append("    senderOccupation: ").append(toIndentedString(senderOccupation)).append("\n");
    sb.append("    senderEmployerName: ").append(toIndentedString(senderEmployerName)).append("\n");
    sb.append("    senderEmployerPhone: ").append(toIndentedString(senderEmployerPhone)).append("\n");
    sb.append("    senderOtherInfo1: ").append(toIndentedString(senderOtherInfo1)).append("\n");
    sb.append("    senderOtherInfo2: ").append(toIndentedString(senderOtherInfo2)).append("\n");
    sb.append("    senderOtherInfo3: ").append(toIndentedString(senderOtherInfo3)).append("\n");
    sb.append("    senderOtherInfo4: ").append(toIndentedString(senderOtherInfo4)).append("\n");
    sb.append("    senderOtherInfo5: ").append(toIndentedString(senderOtherInfo5)).append("\n");
    sb.append("    receiverType: ").append(toIndentedString(receiverType)).append("\n");
    sb.append("    receiverRefNumber: ").append(toIndentedString(receiverRefNumber)).append("\n");
    sb.append("    receiverFirstName: ").append(toIndentedString(receiverFirstName)).append("\n");
    sb.append("    receiverMiddleName: ").append(toIndentedString(receiverMiddleName)).append("\n");
    sb.append("    receiverLastName: ").append(toIndentedString(receiverLastName)).append("\n");
    sb.append("    receiverPOBox: ").append(toIndentedString(receiverPOBox)).append("\n");
    sb.append("    receiverAddress1: ").append(toIndentedString(receiverAddress1)).append("\n");
    sb.append("    receiverAddress2: ").append(toIndentedString(receiverAddress2)).append("\n");
    sb.append("    receiverCity: ").append(toIndentedString(receiverCity)).append("\n");
    sb.append("    receiverDistrict: ").append(toIndentedString(receiverDistrict)).append("\n");
    sb.append("    receiverState: ").append(toIndentedString(receiverState)).append("\n");
    sb.append("    receiverCountryCode: ").append(toIndentedString(receiverCountryCode)).append("\n");
    sb.append("    receiverZipCode: ").append(toIndentedString(receiverZipCode)).append("\n");
    sb.append("    receiverPhone: ").append(toIndentedString(receiverPhone)).append("\n");
    sb.append("    receiverMobile: ").append(toIndentedString(receiverMobile)).append("\n");
    sb.append("    receiverFax: ").append(toIndentedString(receiverFax)).append("\n");
    sb.append("    receiverEmail: ").append(toIndentedString(receiverEmail)).append("\n");
    sb.append("    receiverNationalityCode: ").append(toIndentedString(receiverNationalityCode)).append("\n");
    sb.append("    receiverGender: ").append(toIndentedString(receiverGender)).append("\n");
    sb.append("    receiverDateOfBirth: ").append(toIndentedString(receiverDateOfBirth)).append("\n");
    sb.append("    receiverOccupation: ").append(toIndentedString(receiverOccupation)).append("\n");
    sb.append("    receiverCustomerRelationship: ").append(toIndentedString(receiverCustomerRelationship)).append("\n");
    sb.append("    receiverBankAccountNo: ").append(toIndentedString(receiverBankAccountNo)).append("\n");
    sb.append("    receiverBankAccountName: ").append(toIndentedString(receiverBankAccountName)).append("\n");
    sb.append("    receiverBankName: ").append(toIndentedString(receiverBankName)).append("\n");
    sb.append("    receivingAgentCode: ").append(toIndentedString(receivingAgentCode)).append("\n");
    sb.append("    serviceFlag: ").append(toIndentedString(serviceFlag)).append("\n");
    sb.append("    receiverBankPOBox: ").append(toIndentedString(receiverBankPOBox)).append("\n");
    sb.append("    receiverBankAddress1: ").append(toIndentedString(receiverBankAddress1)).append("\n");
    sb.append("    receiverBankAddress2: ").append(toIndentedString(receiverBankAddress2)).append("\n");
    sb.append("    receiverBankCity: ").append(toIndentedString(receiverBankCity)).append("\n");
    sb.append("    receiverBankDistrict: ").append(toIndentedString(receiverBankDistrict)).append("\n");
    sb.append("    receiverBankState: ").append(toIndentedString(receiverBankState)).append("\n");
    sb.append("    receiverBankCountryCode: ").append(toIndentedString(receiverBankCountryCode)).append("\n");
    sb.append("    receiverBankZipCode: ").append(toIndentedString(receiverBankZipCode)).append("\n");
    sb.append("    receiverBankPhone: ").append(toIndentedString(receiverBankPhone)).append("\n");
    sb.append("    receiverBankMobile: ").append(toIndentedString(receiverBankMobile)).append("\n");
    sb.append("    receiverBankFax: ").append(toIndentedString(receiverBankFax)).append("\n");
    sb.append("    receiverBankEmail: ").append(toIndentedString(receiverBankEmail)).append("\n");
    sb.append("    receiverOtherInfo1: ").append(toIndentedString(receiverOtherInfo1)).append("\n");
    sb.append("    receiverOtherInfo2: ").append(toIndentedString(receiverOtherInfo2)).append("\n");
    sb.append("    receiverOtherInfo3: ").append(toIndentedString(receiverOtherInfo3)).append("\n");
    sb.append("    receiverOtherInfo4: ").append(toIndentedString(receiverOtherInfo4)).append("\n");
    sb.append("    receiverOtherInfo5: ").append(toIndentedString(receiverOtherInfo5)).append("\n");
    sb.append("    sourceOfIncome: ").append(toIndentedString(sourceOfIncome)).append("\n");
    sb.append("    purposeOfTxn: ").append(toIndentedString(purposeOfTxn)).append("\n");
    sb.append("    purposeOfTxnDetails: ").append(toIndentedString(purposeOfTxnDetails)).append("\n");
    sb.append("    cancelReasonDesc: ").append(toIndentedString(cancelReasonDesc)).append("\n");
    sb.append("    paymentMode: ").append(toIndentedString(paymentMode)).append("\n");
    sb.append("    cancelXchgRatePayin2Payout: ").append(toIndentedString(cancelXchgRatePayin2Payout)).append("\n");
    sb.append("    payinCcyCode: ").append(toIndentedString(payinCcyCode)).append("\n");
    sb.append("    cancelPayinAmount: ").append(toIndentedString(cancelPayinAmount)).append("\n");
    sb.append("    payoutCcyCode: ").append(toIndentedString(payoutCcyCode)).append("\n");
    sb.append("    cancelPayoutAmount: ").append(toIndentedString(cancelPayoutAmount)).append("\n");
    sb.append("    cancelCommission: ").append(toIndentedString(cancelCommission)).append("\n");
    sb.append("    cancelTax: ").append(toIndentedString(cancelTax)).append("\n");
    sb.append("    cancelCardCharges: ").append(toIndentedString(cancelCardCharges)).append("\n");
    sb.append("    cancelAdditionalCharges: ").append(toIndentedString(cancelAdditionalCharges)).append("\n");
    sb.append("    cancelOtherCharges: ").append(toIndentedString(cancelOtherCharges)).append("\n");
    sb.append("    cancellationCharges: ").append(toIndentedString(cancellationCharges)).append("\n");
    sb.append("    cancelTotalPayinAmount: ").append(toIndentedString(cancelTotalPayinAmount)).append("\n");
    sb.append("    sendingAgentCode: ").append(toIndentedString(sendingAgentCode)).append("\n");
    sb.append("    serviceProviderCode: ").append(toIndentedString(serviceProviderCode)).append("\n");
    sb.append("    settlementCcyCode: ").append(toIndentedString(settlementCcyCode)).append("\n");
    sb.append("    xchgRateUSDToPayin: ").append(toIndentedString(xchgRateUSDToPayin)).append("\n");
    sb.append("    xchgRateUSDToPayout: ").append(toIndentedString(xchgRateUSDToPayout)).append("\n");
    sb.append("    xchgRateUSDToSettlement: ").append(toIndentedString(xchgRateUSDToSettlement)).append("\n");
    sb.append("    xchgRateSettlementToPayin: ").append(toIndentedString(xchgRateSettlementToPayin)).append("\n");
    sb.append("    xchgRateSettlementToPayout: ").append(toIndentedString(xchgRateSettlementToPayout)).append("\n");
    sb.append("    commissionInSCcy: ").append(toIndentedString(commissionInSCcy)).append("\n");
    sb.append("    taxInSCcy: ").append(toIndentedString(taxInSCcy)).append("\n");
    sb.append("    cardChargesInSCcy: ").append(toIndentedString(cardChargesInSCcy)).append("\n");
    sb.append("    additionalChargesInSCcy: ").append(toIndentedString(additionalChargesInSCcy)).append("\n");
    sb.append("    otherChargesInSCcy: ").append(toIndentedString(otherChargesInSCcy)).append("\n");
    sb.append("    payinAmountInSCcy: ").append(toIndentedString(payinAmountInSCcy)).append("\n");
    sb.append("    totalPayinAmountInSCcy: ").append(toIndentedString(totalPayinAmountInSCcy)).append("\n");
    sb.append("    payoutAmountInSCcy: ").append(toIndentedString(payoutAmountInSCcy)).append("\n");
    sb.append("    txnOtherInfo1: ").append(toIndentedString(txnOtherInfo1)).append("\n");
    sb.append("    txnOtherInfo2: ").append(toIndentedString(txnOtherInfo2)).append("\n");
    sb.append("    txnOtherInfo3: ").append(toIndentedString(txnOtherInfo3)).append("\n");
    sb.append("    txnOtherInfo4: ").append(toIndentedString(txnOtherInfo4)).append("\n");
    sb.append("    txnOtherInfo5: ").append(toIndentedString(txnOtherInfo5)).append("\n");
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
    sb.append("    instrumentType: ").append(toIndentedString(instrumentType)).append("\n");
    sb.append("    txnType: ").append(toIndentedString(txnType)).append("\n");
    sb.append("    deliveryChannel: ").append(toIndentedString(deliveryChannel)).append("\n");
    sb.append("    deliveryOption: ").append(toIndentedString(deliveryOption)).append("\n");
    sb.append("    cancelReasonCode: ").append(toIndentedString(cancelReasonCode)).append("\n");
    sb.append("    baseCcyCode: ").append(toIndentedString(baseCcyCode)).append("\n");
    sb.append("    xchgRatePayinToPayout: ").append(toIndentedString(xchgRatePayinToPayout)).append("\n");
    sb.append("    xchgRateUSDToSettlementBuy: ").append(toIndentedString(xchgRateUSDToSettlementBuy)).append("\n");
    sb.append("    xchgRateSettlementToSPCcy: ").append(toIndentedString(xchgRateSettlementToSPCcy)).append("\n");
    sb.append("    xmCancellationChargesInLC: ").append(toIndentedString(xmCancellationChargesInLC)).append("\n");
    sb.append("    xmRefundPayinAmount: ").append(toIndentedString(xmRefundPayinAmount)).append("\n");
    sb.append("    xmRefundCommission: ").append(toIndentedString(xmRefundCommission)).append("\n");
    sb.append("    xmRefundTax: ").append(toIndentedString(xmRefundTax)).append("\n");
    sb.append("    xmRefundOtherCharges: ").append(toIndentedString(xmRefundOtherCharges)).append("\n");
    sb.append("    xmCancellationCharges: ").append(toIndentedString(xmCancellationCharges)).append("\n");
    sb.append("    xmRefundCardCharges: ").append(toIndentedString(xmRefundCardCharges)).append("\n");
    sb.append("    xmRefundAdditionalCharges: ").append(toIndentedString(xmRefundAdditionalCharges)).append("\n");
    sb.append("    xmRefundPayinAmountInSCcy: ").append(toIndentedString(xmRefundPayinAmountInSCcy)).append("\n");
    sb.append("    xmCancellationChargesInSCcy: ").append(toIndentedString(xmCancellationChargesInSCcy)).append("\n");
    sb.append("    xmRefundCardChargesInSCcy: ").append(toIndentedString(xmRefundCardChargesInSCcy)).append("\n");
    sb.append("    xmRefundAddlChargesInSCcy: ").append(toIndentedString(xmRefundAddlChargesInSCcy)).append("\n");
    sb.append("    payin2BaseCcyRate: ").append(toIndentedString(payin2BaseCcyRate)).append("\n");
    sb.append("    refundPayinAmountInBaseCcy: ").append(toIndentedString(refundPayinAmountInBaseCcy)).append("\n");
    sb.append("    spCcyCode: ").append(toIndentedString(spCcyCode)).append("\n");
    sb.append("    refundPayinAmountInSPCcy: ").append(toIndentedString(refundPayinAmountInSPCcy)).append("\n");
    sb.append("    refundCommissionInSPCcy: ").append(toIndentedString(refundCommissionInSPCcy)).append("\n");
    sb.append("    refundTaxInSPCcy: ").append(toIndentedString(refundTaxInSPCcy)).append("\n");
    sb.append("    refundOtherChargesInSPCcy: ").append(toIndentedString(refundOtherChargesInSPCcy)).append("\n");
    sb.append("    cancellationChargesInSPCcy: ").append(toIndentedString(cancellationChargesInSPCcy)).append("\n");
    sb.append("    refundCardChargesInSPCcy: ").append(toIndentedString(refundCardChargesInSPCcy)).append("\n");
    sb.append("    refundAddlChargesInSPCcy: ").append(toIndentedString(refundAddlChargesInSPCcy)).append("\n");
    sb.append("    draweeBankBranchCode: ").append(toIndentedString(draweeBankBranchCode)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    instrumentNo: ").append(toIndentedString(instrumentNo)).append("\n");
    sb.append("    taxInvoiceNo: ").append(toIndentedString(taxInvoiceNo)).append("\n");
    sb.append("    returnCode: ").append(toIndentedString(returnCode)).append("\n");
    sb.append("    returnMessage: ").append(toIndentedString(returnMessage)).append("\n");
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

