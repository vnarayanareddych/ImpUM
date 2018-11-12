package com.paas.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.paas.model.ServerResponse;
import com.paas.model.TransactionStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Response parameters for Transaction Enquiry service.
 */
@ApiModel(description = "Response parameters for Transaction Enquiry service.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-10T18:11:07.886+05:30")
@JsonInclude(Include.NON_NULL)

public class TransactionEnquiryResponse   {
  @JsonProperty("serverResponse")
  private ServerResponse serverResponse = null;

  @JsonProperty("transactionStatusList")
  @Valid
  private List<TransactionStatus> transactionStatusList = null;

  @JsonProperty("txnRefNo")
  private String txnRefNo = null;

  @JsonProperty("partnerTxnRefNo")
  private String partnerTxnRefNo = null;
  
  @JsonProperty("thirdPartyRefNo")
  private String thirdPartyRefNo = null;

  @JsonProperty("transactionGMTDateTime")
  private String transactionGMTDateTime = null;

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

  @JsonProperty("senderIDType")
  private String senderIDType = null;

  @JsonProperty("senderIDOtherType")
  private String senderIDOtherType = null;

  @JsonProperty("senderID")
  private String senderID = null;

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

  @JsonProperty("productType")
  private String productType = null;

  @JsonProperty("receivingAgentCode")
  private String receivingAgentCode = null;

  @JsonProperty("walletCode")
  private String walletCode = null;

  @JsonProperty("walletNumber")
  private String walletNumber = null;

  @JsonProperty("cardNumber")
  private String cardNumber = null;

  @JsonProperty("cardType")
  private String cardType = null;

  @JsonProperty("receiverBankAccountNo")
  private String receiverBankAccountNo = null;

  @JsonProperty("receiverBankAccountName")
  private String receiverBankAccountName = null;

  @JsonProperty("receiverBankName")
  private String receiverBankName = null;

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

  @JsonProperty("paymentMode")
  private String paymentMode = null;

  @JsonProperty("commission")
  private Double commission = null;

  @JsonProperty("tax")
  private Double tax = null;

  @JsonProperty("cardCharges")
  private Double cardCharges = null;

  @JsonProperty("additionalCharges")
  private Double additionalCharges = null;

  @JsonProperty("otherCharges")
  private Double otherCharges = null;

  @JsonProperty("totalPayinAmount")
  private Double totalPayinAmount = null;

  @JsonProperty("partnerCommission")
  private Double partnerCommission = null;

  @JsonProperty("disccount")
  private Double disccount = null;

  @JsonProperty("cancellationAgentCode")
  private String cancellationAgentCode = null;

  @JsonProperty("cancellationGMTDateTime")
  private String cancellationGMTDateTime = null;

  @JsonProperty("cancelXchgRatePayin2Payout")
  private Double cancelXchgRatePayin2Payout = null;

  @JsonProperty("cancelPayinAmount")
  private Double cancelPayinAmount = null;

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
  private Double cardChargesInSCcy = null;

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

  @JsonProperty("serviceProviderCode")
  private String serviceProviderCode = null;


  public TransactionEnquiryResponse serverResponse(ServerResponse serverResponse) {
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

  public TransactionEnquiryResponse transactionStatusList(List<TransactionStatus> transactionStatusList) {
    this.transactionStatusList = transactionStatusList;
    return this;
  }

  public TransactionEnquiryResponse addTransactionStatusListItem(TransactionStatus transactionStatusListItem) {
    if (this.transactionStatusList == null) {
      this.transactionStatusList = new ArrayList<TransactionStatus>();
    }
    this.transactionStatusList.add(transactionStatusListItem);
    return this;
  }

  /**
   * Get transactionStatusList
   * @return transactionStatusList
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<TransactionStatus> getTransactionStatusList() {
    return transactionStatusList;
  }

  public void setTransactionStatusList(List<TransactionStatus> transactionStatusList) {
    this.transactionStatusList = transactionStatusList;
  }

  public TransactionEnquiryResponse txnRefNo(String txnRefNo) {
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

  public TransactionEnquiryResponse partnerTxnRefNo(String partnerTxnRefNo) {
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

  public TransactionEnquiryResponse transactionGMTDateTime(String transactionGMTDateTime) {
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

  public TransactionEnquiryResponse senderType(Integer senderType) {
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

  public TransactionEnquiryResponse senderRefNumber(String senderRefNumber) {
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

  public TransactionEnquiryResponse senderFirstName(String senderFirstName) {
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

  public TransactionEnquiryResponse senderMiddleName(String senderMiddleName) {
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

  public TransactionEnquiryResponse senderLastName(String senderLastName) {
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

  public TransactionEnquiryResponse senderPOBox(String senderPOBox) {
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

  public TransactionEnquiryResponse senderAddress1(String senderAddress1) {
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

  public TransactionEnquiryResponse senderAddress2(String senderAddress2) {
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

  public TransactionEnquiryResponse senderCity(String senderCity) {
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

  public TransactionEnquiryResponse senderDistrict(String senderDistrict) {
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

  public TransactionEnquiryResponse senderState(String senderState) {
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

  public TransactionEnquiryResponse senderCountryCode(String senderCountryCode) {
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

  public TransactionEnquiryResponse senderZipCode(String senderZipCode) {
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

  public TransactionEnquiryResponse senderMobile(String senderMobile) {
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

  public TransactionEnquiryResponse senderPhone(String senderPhone) {
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

  public TransactionEnquiryResponse senderFax(String senderFax) {
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

  public TransactionEnquiryResponse senderEmail(String senderEmail) {
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

  public TransactionEnquiryResponse senderOtherInfo(String senderOtherInfo) {
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

  public TransactionEnquiryResponse senderMessageToBeneficiary(String senderMessageToBeneficiary) {
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

  public TransactionEnquiryResponse senderGender(String senderGender) {
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

  public TransactionEnquiryResponse senderDateOfBirth(String senderDateOfBirth) {
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

  public TransactionEnquiryResponse senderNationalityCode(String senderNationalityCode) {
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

  public TransactionEnquiryResponse senderOccupation(String senderOccupation) {
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

  public TransactionEnquiryResponse senderEmployerName(String senderEmployerName) {
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

  public TransactionEnquiryResponse senderEmployerPhone(String senderEmployerPhone) {
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

  public TransactionEnquiryResponse senderIDType(String senderIDType) {
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

  public TransactionEnquiryResponse senderIDOtherType(String senderIDOtherType) {
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

  public TransactionEnquiryResponse senderID(String senderID) {
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

  public TransactionEnquiryResponse senderIDIssuedBy(String senderIDIssuedBy) {
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

  public TransactionEnquiryResponse senderIDIssuedAt(String senderIDIssuedAt) {
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

  public TransactionEnquiryResponse senderIDIssueDate(String senderIDIssueDate) {
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

  public TransactionEnquiryResponse senderIDValidThru(String senderIDValidThru) {
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

  public TransactionEnquiryResponse senderIDIssuanceCountry(String senderIDIssuanceCountry) {
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

  public TransactionEnquiryResponse senderOtherInfo1(String senderOtherInfo1) {
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

  public TransactionEnquiryResponse senderOtherInfo2(String senderOtherInfo2) {
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

  public TransactionEnquiryResponse senderOtherInfo3(String senderOtherInfo3) {
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

  public TransactionEnquiryResponse senderOtherInfo4(String senderOtherInfo4) {
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

  public TransactionEnquiryResponse senderOtherInfo5(String senderOtherInfo5) {
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

  public TransactionEnquiryResponse receiverType(Integer receiverType) {
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

  public TransactionEnquiryResponse receiverRefNumber(String receiverRefNumber) {
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

  public TransactionEnquiryResponse receiverFirstName(String receiverFirstName) {
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

  public TransactionEnquiryResponse receiverMiddleName(String receiverMiddleName) {
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

  public TransactionEnquiryResponse receiverLastName(String receiverLastName) {
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

  public TransactionEnquiryResponse receiverPOBox(String receiverPOBox) {
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

  public TransactionEnquiryResponse receiverAddress1(String receiverAddress1) {
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

  public TransactionEnquiryResponse receiverAddress2(String receiverAddress2) {
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

  public TransactionEnquiryResponse receiverCity(String receiverCity) {
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

  public TransactionEnquiryResponse receiverDistrict(String receiverDistrict) {
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

  public TransactionEnquiryResponse receiverState(String receiverState) {
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

  public TransactionEnquiryResponse receiverCountryCode(String receiverCountryCode) {
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

  public TransactionEnquiryResponse receiverZipCode(String receiverZipCode) {
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

  public TransactionEnquiryResponse receiverPhone(String receiverPhone) {
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

  public TransactionEnquiryResponse receiverMobile(String receiverMobile) {
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

  public TransactionEnquiryResponse receiverFax(String receiverFax) {
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

  public TransactionEnquiryResponse receiverEmail(String receiverEmail) {
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

  public TransactionEnquiryResponse receiverNationalityCode(String receiverNationalityCode) {
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

  public TransactionEnquiryResponse receiverGender(String receiverGender) {
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

  public TransactionEnquiryResponse receiverDateOfBirth(String receiverDateOfBirth) {
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

  public TransactionEnquiryResponse receiverOccupation(String receiverOccupation) {
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

  public TransactionEnquiryResponse receiverCustomerRelationship(String receiverCustomerRelationship) {
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

  public TransactionEnquiryResponse productType(String productType) {
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

  public TransactionEnquiryResponse receivingAgentCode(String receivingAgentCode) {
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

  public TransactionEnquiryResponse walletCode(String walletCode) {
    this.walletCode = walletCode;
    return this;
  }

  /**
   * Get walletCode
   * @return walletCode
  **/
  @ApiModelProperty(value = "")


  public String getWalletCode() {
    return walletCode;
  }

  public void setWalletCode(String walletCode) {
    this.walletCode = walletCode;
  }

  public TransactionEnquiryResponse walletNumber(String walletNumber) {
    this.walletNumber = walletNumber;
    return this;
  }

  /**
   * Get walletNumber
   * @return walletNumber
  **/
  @ApiModelProperty(value = "")


  public String getWalletNumber() {
    return walletNumber;
  }

  public void setWalletNumber(String walletNumber) {
    this.walletNumber = walletNumber;
  }

  public TransactionEnquiryResponse cardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
    return this;
  }

  /**
   * Get cardNumber
   * @return cardNumber
  **/
  @ApiModelProperty(value = "")


  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public TransactionEnquiryResponse cardType(String cardType) {
    this.cardType = cardType;
    return this;
  }

  /**
   * Get cardType
   * @return cardType
  **/
  @ApiModelProperty(value = "")


  public String getCardType() {
    return cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }

  public TransactionEnquiryResponse receiverBankAccountNo(String receiverBankAccountNo) {
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

  public TransactionEnquiryResponse receiverBankAccountName(String receiverBankAccountName) {
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

  public TransactionEnquiryResponse receiverBankName(String receiverBankName) {
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

  public TransactionEnquiryResponse receiverBankPOBox(String receiverBankPOBox) {
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

  public TransactionEnquiryResponse receiverBankAddress1(String receiverBankAddress1) {
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

  public TransactionEnquiryResponse receiverBankAddress2(String receiverBankAddress2) {
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

  public TransactionEnquiryResponse receiverBankCity(String receiverBankCity) {
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

  public TransactionEnquiryResponse receiverBankDistrict(String receiverBankDistrict) {
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

  public TransactionEnquiryResponse receiverBankState(String receiverBankState) {
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

  public TransactionEnquiryResponse receiverBankCountryCode(String receiverBankCountryCode) {
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

  public TransactionEnquiryResponse receiverBankZipCode(String receiverBankZipCode) {
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

  public TransactionEnquiryResponse receiverBankPhone(String receiverBankPhone) {
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

  public TransactionEnquiryResponse receiverBankMobile(String receiverBankMobile) {
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

  public TransactionEnquiryResponse receiverBankFax(String receiverBankFax) {
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

  public TransactionEnquiryResponse receiverBankEmail(String receiverBankEmail) {
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

  public TransactionEnquiryResponse receiverOtherInfo1(String receiverOtherInfo1) {
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

  public TransactionEnquiryResponse receiverOtherInfo2(String receiverOtherInfo2) {
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

  public TransactionEnquiryResponse receiverOtherInfo3(String receiverOtherInfo3) {
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

  public TransactionEnquiryResponse receiverOtherInfo4(String receiverOtherInfo4) {
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

  public TransactionEnquiryResponse receiverOtherInfo5(String receiverOtherInfo5) {
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

  public TransactionEnquiryResponse sourceOfIncome(String sourceOfIncome) {
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

  public TransactionEnquiryResponse purposeOfTxn(String purposeOfTxn) {
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

  public TransactionEnquiryResponse purposeOfTxnDetails(String purposeOfTxnDetails) {
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

  public TransactionEnquiryResponse xchgRatePayin2Payout(Double xchgRatePayin2Payout) {
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

  public TransactionEnquiryResponse payinCcyCode(String payinCcyCode) {
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

  public TransactionEnquiryResponse payinAmount(Double payinAmount) {
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

  public TransactionEnquiryResponse payoutCcyCode(String payoutCcyCode) {
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

  public TransactionEnquiryResponse payoutAmount(Double payoutAmount) {
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

  public TransactionEnquiryResponse paymentMode(String paymentMode) {
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

  public TransactionEnquiryResponse commission(Double commission) {
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

  public TransactionEnquiryResponse tax(Double tax) {
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

  public TransactionEnquiryResponse cardCharges(Double cardCharges) {
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

  public TransactionEnquiryResponse additionalCharges(Double additionalCharges) {
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

  public TransactionEnquiryResponse otherCharges(Double otherCharges) {
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

  public TransactionEnquiryResponse totalPayinAmount(Double totalPayinAmount) {
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

  public TransactionEnquiryResponse partnerCommission(Double partnerCommission) {
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

  public TransactionEnquiryResponse disccount(Double disccount) {
    this.disccount = disccount;
    return this;
  }

  /**
   * Get disccount
   * @return disccount
  **/
  @ApiModelProperty(value = "")


  public Double getDisccount() {
    return disccount;
  }

  public void setDisccount(Double disccount) {
    this.disccount = disccount;
  }

  public TransactionEnquiryResponse cancellationAgentCode(String cancellationAgentCode) {
    this.cancellationAgentCode = cancellationAgentCode;
    return this;
  }

  /**
   * Get cancellationAgentCode
   * @return cancellationAgentCode
  **/
  @ApiModelProperty(value = "")


  public String getCancellationAgentCode() {
    return cancellationAgentCode;
  }

  public void setCancellationAgentCode(String cancellationAgentCode) {
    this.cancellationAgentCode = cancellationAgentCode;
  }

  public TransactionEnquiryResponse cancellationGMTDateTime(String cancellationGMTDateTime) {
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

  public TransactionEnquiryResponse cancelXchgRatePayin2Payout(Double cancelXchgRatePayin2Payout) {
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

  public TransactionEnquiryResponse cancelPayinAmount(Double cancelPayinAmount) {
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

  public TransactionEnquiryResponse cancelPayoutAmount(Double cancelPayoutAmount) {
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

  public TransactionEnquiryResponse cancelCommission(Double cancelCommission) {
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

  public TransactionEnquiryResponse cancelTax(Double cancelTax) {
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

  public TransactionEnquiryResponse cancelCardCharges(Double cancelCardCharges) {
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

  public TransactionEnquiryResponse cancelAdditionalCharges(Double cancelAdditionalCharges) {
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

  public TransactionEnquiryResponse cancelOtherCharges(Double cancelOtherCharges) {
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

  public TransactionEnquiryResponse cancellationCharges(Double cancellationCharges) {
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

  public TransactionEnquiryResponse cancelTotalPayinAmount(Double cancelTotalPayinAmount) {
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

  public TransactionEnquiryResponse settlementCcyCode(String settlementCcyCode) {
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

  public TransactionEnquiryResponse xchgRateUSDToPayin(Double xchgRateUSDToPayin) {
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

  public TransactionEnquiryResponse xchgRateUSDToPayout(Double xchgRateUSDToPayout) {
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

  public TransactionEnquiryResponse xchgRateUSDToSettlement(Double xchgRateUSDToSettlement) {
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

  public TransactionEnquiryResponse xchgRateSettlementToPayin(Double xchgRateSettlementToPayin) {
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

  public TransactionEnquiryResponse xchgRateSettlementToPayout(Double xchgRateSettlementToPayout) {
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

  public TransactionEnquiryResponse commissionInSCcy(Double commissionInSCcy) {
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

  public TransactionEnquiryResponse taxInSCcy(Double taxInSCcy) {
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

  public TransactionEnquiryResponse cardChargesInSCcy(Double cardChargesInSCcy) {
    this.cardChargesInSCcy = cardChargesInSCcy;
    return this;
  }

  /**
   * Get cardChargesInSCcy
   * @return cardChargesInSCcy
  **/
  @ApiModelProperty(value = "")


  public Double getCardChargesInSCcy() {
    return cardChargesInSCcy;
  }

  public void setCardChargesInSCcy(Double cardChargesInSCcy) {
    this.cardChargesInSCcy = cardChargesInSCcy;
  }

  public TransactionEnquiryResponse additionalChargesInSCcy(Double additionalChargesInSCcy) {
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

  public TransactionEnquiryResponse otherChargesInSCcy(Double otherChargesInSCcy) {
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

  public TransactionEnquiryResponse payinAmountInSCcy(Double payinAmountInSCcy) {
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

  public TransactionEnquiryResponse totalPayinAmountInSCcy(Double totalPayinAmountInSCcy) {
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

  public TransactionEnquiryResponse payoutAmountInSCcy(Double payoutAmountInSCcy) {
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

  public TransactionEnquiryResponse txnOtherInfo1(String txnOtherInfo1) {
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

  public TransactionEnquiryResponse txnOtherInfo2(String txnOtherInfo2) {
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

  public TransactionEnquiryResponse txnOtherInfo3(String txnOtherInfo3) {
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

  public TransactionEnquiryResponse txnOtherInfo4(String txnOtherInfo4) {
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

  public TransactionEnquiryResponse txnOtherInfo5(String txnOtherInfo5) {
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

  public TransactionEnquiryResponse reservedParam1(String reservedParam1) {
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

  public TransactionEnquiryResponse reservedParam2(String reservedParam2) {
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

  public TransactionEnquiryResponse reservedParam3(String reservedParam3) {
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

  public TransactionEnquiryResponse reservedParam4(String reservedParam4) {
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

  public TransactionEnquiryResponse reservedParam5(String reservedParam5) {
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

  public TransactionEnquiryResponse reservedParam6(String reservedParam6) {
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

  public TransactionEnquiryResponse reservedParam7(String reservedParam7) {
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

  public TransactionEnquiryResponse reservedParam8(String reservedParam8) {
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

  public TransactionEnquiryResponse reservedParam9(String reservedParam9) {
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

  public TransactionEnquiryResponse reservedParam10(String reservedParam10) {
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

  public TransactionEnquiryResponse serviceProviderCode(String serviceProviderCode) {
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

  public TransactionEnquiryResponse thirdPartyRefNo(String thirdPartyRefNo) {
    this.thirdPartyRefNo = thirdPartyRefNo;
    return this;
  }

  /**
   * Get thirdPartyRefNo
   * @return thirdPartyRefNo
  **/
  @ApiModelProperty(value = "")


  public String getThirdPartyRefNo() {
    return thirdPartyRefNo;
  }

  public void setThirdPartyRefNo(String thirdPartyRefNo) {
    this.thirdPartyRefNo = thirdPartyRefNo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionEnquiryResponse transactionEnquiryResponse = (TransactionEnquiryResponse) o;
    return Objects.equals(this.serverResponse, transactionEnquiryResponse.serverResponse) &&
        Objects.equals(this.transactionStatusList, transactionEnquiryResponse.transactionStatusList) &&
        Objects.equals(this.txnRefNo, transactionEnquiryResponse.txnRefNo) &&
        Objects.equals(this.partnerTxnRefNo, transactionEnquiryResponse.partnerTxnRefNo) &&
        Objects.equals(this.transactionGMTDateTime, transactionEnquiryResponse.transactionGMTDateTime) &&
        Objects.equals(this.senderType, transactionEnquiryResponse.senderType) &&
        Objects.equals(this.senderRefNumber, transactionEnquiryResponse.senderRefNumber) &&
        Objects.equals(this.senderFirstName, transactionEnquiryResponse.senderFirstName) &&
        Objects.equals(this.senderMiddleName, transactionEnquiryResponse.senderMiddleName) &&
        Objects.equals(this.senderLastName, transactionEnquiryResponse.senderLastName) &&
        Objects.equals(this.senderPOBox, transactionEnquiryResponse.senderPOBox) &&
        Objects.equals(this.senderAddress1, transactionEnquiryResponse.senderAddress1) &&
        Objects.equals(this.senderAddress2, transactionEnquiryResponse.senderAddress2) &&
        Objects.equals(this.senderCity, transactionEnquiryResponse.senderCity) &&
        Objects.equals(this.senderDistrict, transactionEnquiryResponse.senderDistrict) &&
        Objects.equals(this.senderState, transactionEnquiryResponse.senderState) &&
        Objects.equals(this.senderCountryCode, transactionEnquiryResponse.senderCountryCode) &&
        Objects.equals(this.senderZipCode, transactionEnquiryResponse.senderZipCode) &&
        Objects.equals(this.senderMobile, transactionEnquiryResponse.senderMobile) &&
        Objects.equals(this.senderPhone, transactionEnquiryResponse.senderPhone) &&
        Objects.equals(this.senderFax, transactionEnquiryResponse.senderFax) &&
        Objects.equals(this.senderEmail, transactionEnquiryResponse.senderEmail) &&
        Objects.equals(this.senderOtherInfo, transactionEnquiryResponse.senderOtherInfo) &&
        Objects.equals(this.senderMessageToBeneficiary, transactionEnquiryResponse.senderMessageToBeneficiary) &&
        Objects.equals(this.senderGender, transactionEnquiryResponse.senderGender) &&
        Objects.equals(this.senderDateOfBirth, transactionEnquiryResponse.senderDateOfBirth) &&
        Objects.equals(this.senderNationalityCode, transactionEnquiryResponse.senderNationalityCode) &&
        Objects.equals(this.senderOccupation, transactionEnquiryResponse.senderOccupation) &&
        Objects.equals(this.senderEmployerName, transactionEnquiryResponse.senderEmployerName) &&
        Objects.equals(this.senderEmployerPhone, transactionEnquiryResponse.senderEmployerPhone) &&
        Objects.equals(this.senderIDType, transactionEnquiryResponse.senderIDType) &&
        Objects.equals(this.senderIDOtherType, transactionEnquiryResponse.senderIDOtherType) &&
        Objects.equals(this.senderID, transactionEnquiryResponse.senderID) &&
        Objects.equals(this.senderIDIssuedBy, transactionEnquiryResponse.senderIDIssuedBy) &&
        Objects.equals(this.senderIDIssuedAt, transactionEnquiryResponse.senderIDIssuedAt) &&
        Objects.equals(this.senderIDIssueDate, transactionEnquiryResponse.senderIDIssueDate) &&
        Objects.equals(this.senderIDValidThru, transactionEnquiryResponse.senderIDValidThru) &&
        Objects.equals(this.senderIDIssuanceCountry, transactionEnquiryResponse.senderIDIssuanceCountry) &&
        Objects.equals(this.senderOtherInfo1, transactionEnquiryResponse.senderOtherInfo1) &&
        Objects.equals(this.senderOtherInfo2, transactionEnquiryResponse.senderOtherInfo2) &&
        Objects.equals(this.senderOtherInfo3, transactionEnquiryResponse.senderOtherInfo3) &&
        Objects.equals(this.senderOtherInfo4, transactionEnquiryResponse.senderOtherInfo4) &&
        Objects.equals(this.senderOtherInfo5, transactionEnquiryResponse.senderOtherInfo5) &&
        Objects.equals(this.receiverType, transactionEnquiryResponse.receiverType) &&
        Objects.equals(this.receiverRefNumber, transactionEnquiryResponse.receiverRefNumber) &&
        Objects.equals(this.receiverFirstName, transactionEnquiryResponse.receiverFirstName) &&
        Objects.equals(this.receiverMiddleName, transactionEnquiryResponse.receiverMiddleName) &&
        Objects.equals(this.receiverLastName, transactionEnquiryResponse.receiverLastName) &&
        Objects.equals(this.receiverPOBox, transactionEnquiryResponse.receiverPOBox) &&
        Objects.equals(this.receiverAddress1, transactionEnquiryResponse.receiverAddress1) &&
        Objects.equals(this.receiverAddress2, transactionEnquiryResponse.receiverAddress2) &&
        Objects.equals(this.receiverCity, transactionEnquiryResponse.receiverCity) &&
        Objects.equals(this.receiverDistrict, transactionEnquiryResponse.receiverDistrict) &&
        Objects.equals(this.receiverState, transactionEnquiryResponse.receiverState) &&
        Objects.equals(this.receiverCountryCode, transactionEnquiryResponse.receiverCountryCode) &&
        Objects.equals(this.receiverZipCode, transactionEnquiryResponse.receiverZipCode) &&
        Objects.equals(this.receiverPhone, transactionEnquiryResponse.receiverPhone) &&
        Objects.equals(this.receiverMobile, transactionEnquiryResponse.receiverMobile) &&
        Objects.equals(this.receiverFax, transactionEnquiryResponse.receiverFax) &&
        Objects.equals(this.receiverEmail, transactionEnquiryResponse.receiverEmail) &&
        Objects.equals(this.receiverNationalityCode, transactionEnquiryResponse.receiverNationalityCode) &&
        Objects.equals(this.receiverGender, transactionEnquiryResponse.receiverGender) &&
        Objects.equals(this.receiverDateOfBirth, transactionEnquiryResponse.receiverDateOfBirth) &&
        Objects.equals(this.receiverOccupation, transactionEnquiryResponse.receiverOccupation) &&
        Objects.equals(this.receiverCustomerRelationship, transactionEnquiryResponse.receiverCustomerRelationship) &&
        Objects.equals(this.productType, transactionEnquiryResponse.productType) &&
        Objects.equals(this.receivingAgentCode, transactionEnquiryResponse.receivingAgentCode) &&
        Objects.equals(this.walletCode, transactionEnquiryResponse.walletCode) &&
        Objects.equals(this.walletNumber, transactionEnquiryResponse.walletNumber) &&
        Objects.equals(this.cardNumber, transactionEnquiryResponse.cardNumber) &&
        Objects.equals(this.cardType, transactionEnquiryResponse.cardType) &&
        Objects.equals(this.receiverBankAccountNo, transactionEnquiryResponse.receiverBankAccountNo) &&
        Objects.equals(this.receiverBankAccountName, transactionEnquiryResponse.receiverBankAccountName) &&
        Objects.equals(this.receiverBankName, transactionEnquiryResponse.receiverBankName) &&
        Objects.equals(this.receiverBankPOBox, transactionEnquiryResponse.receiverBankPOBox) &&
        Objects.equals(this.receiverBankAddress1, transactionEnquiryResponse.receiverBankAddress1) &&
        Objects.equals(this.receiverBankAddress2, transactionEnquiryResponse.receiverBankAddress2) &&
        Objects.equals(this.receiverBankCity, transactionEnquiryResponse.receiverBankCity) &&
        Objects.equals(this.receiverBankDistrict, transactionEnquiryResponse.receiverBankDistrict) &&
        Objects.equals(this.receiverBankState, transactionEnquiryResponse.receiverBankState) &&
        Objects.equals(this.receiverBankCountryCode, transactionEnquiryResponse.receiverBankCountryCode) &&
        Objects.equals(this.receiverBankZipCode, transactionEnquiryResponse.receiverBankZipCode) &&
        Objects.equals(this.receiverBankPhone, transactionEnquiryResponse.receiverBankPhone) &&
        Objects.equals(this.receiverBankMobile, transactionEnquiryResponse.receiverBankMobile) &&
        Objects.equals(this.receiverBankFax, transactionEnquiryResponse.receiverBankFax) &&
        Objects.equals(this.receiverBankEmail, transactionEnquiryResponse.receiverBankEmail) &&
        Objects.equals(this.receiverOtherInfo1, transactionEnquiryResponse.receiverOtherInfo1) &&
        Objects.equals(this.receiverOtherInfo2, transactionEnquiryResponse.receiverOtherInfo2) &&
        Objects.equals(this.receiverOtherInfo3, transactionEnquiryResponse.receiverOtherInfo3) &&
        Objects.equals(this.receiverOtherInfo4, transactionEnquiryResponse.receiverOtherInfo4) &&
        Objects.equals(this.receiverOtherInfo5, transactionEnquiryResponse.receiverOtherInfo5) &&
        Objects.equals(this.sourceOfIncome, transactionEnquiryResponse.sourceOfIncome) &&
        Objects.equals(this.purposeOfTxn, transactionEnquiryResponse.purposeOfTxn) &&
        Objects.equals(this.purposeOfTxnDetails, transactionEnquiryResponse.purposeOfTxnDetails) &&
        Objects.equals(this.xchgRatePayin2Payout, transactionEnquiryResponse.xchgRatePayin2Payout) &&
        Objects.equals(this.payinCcyCode, transactionEnquiryResponse.payinCcyCode) &&
        Objects.equals(this.payinAmount, transactionEnquiryResponse.payinAmount) &&
        Objects.equals(this.payoutCcyCode, transactionEnquiryResponse.payoutCcyCode) &&
        Objects.equals(this.payoutAmount, transactionEnquiryResponse.payoutAmount) &&
        Objects.equals(this.paymentMode, transactionEnquiryResponse.paymentMode) &&
        Objects.equals(this.commission, transactionEnquiryResponse.commission) &&
        Objects.equals(this.tax, transactionEnquiryResponse.tax) &&
        Objects.equals(this.cardCharges, transactionEnquiryResponse.cardCharges) &&
        Objects.equals(this.additionalCharges, transactionEnquiryResponse.additionalCharges) &&
        Objects.equals(this.otherCharges, transactionEnquiryResponse.otherCharges) &&
        Objects.equals(this.totalPayinAmount, transactionEnquiryResponse.totalPayinAmount) &&
        Objects.equals(this.partnerCommission, transactionEnquiryResponse.partnerCommission) &&
        Objects.equals(this.disccount, transactionEnquiryResponse.disccount) &&
        Objects.equals(this.cancellationAgentCode, transactionEnquiryResponse.cancellationAgentCode) &&
        Objects.equals(this.cancellationGMTDateTime, transactionEnquiryResponse.cancellationGMTDateTime) &&
        Objects.equals(this.cancelXchgRatePayin2Payout, transactionEnquiryResponse.cancelXchgRatePayin2Payout) &&
        Objects.equals(this.cancelPayinAmount, transactionEnquiryResponse.cancelPayinAmount) &&
        Objects.equals(this.cancelPayoutAmount, transactionEnquiryResponse.cancelPayoutAmount) &&
        Objects.equals(this.cancelCommission, transactionEnquiryResponse.cancelCommission) &&
        Objects.equals(this.cancelTax, transactionEnquiryResponse.cancelTax) &&
        Objects.equals(this.cancelCardCharges, transactionEnquiryResponse.cancelCardCharges) &&
        Objects.equals(this.cancelAdditionalCharges, transactionEnquiryResponse.cancelAdditionalCharges) &&
        Objects.equals(this.cancelOtherCharges, transactionEnquiryResponse.cancelOtherCharges) &&
        Objects.equals(this.cancellationCharges, transactionEnquiryResponse.cancellationCharges) &&
        Objects.equals(this.cancelTotalPayinAmount, transactionEnquiryResponse.cancelTotalPayinAmount) &&
        Objects.equals(this.settlementCcyCode, transactionEnquiryResponse.settlementCcyCode) &&
        Objects.equals(this.xchgRateUSDToPayin, transactionEnquiryResponse.xchgRateUSDToPayin) &&
        Objects.equals(this.xchgRateUSDToPayout, transactionEnquiryResponse.xchgRateUSDToPayout) &&
        Objects.equals(this.xchgRateUSDToSettlement, transactionEnquiryResponse.xchgRateUSDToSettlement) &&
        Objects.equals(this.xchgRateSettlementToPayin, transactionEnquiryResponse.xchgRateSettlementToPayin) &&
        Objects.equals(this.xchgRateSettlementToPayout, transactionEnquiryResponse.xchgRateSettlementToPayout) &&
        Objects.equals(this.commissionInSCcy, transactionEnquiryResponse.commissionInSCcy) &&
        Objects.equals(this.taxInSCcy, transactionEnquiryResponse.taxInSCcy) &&
        Objects.equals(this.cardChargesInSCcy, transactionEnquiryResponse.cardChargesInSCcy) &&
        Objects.equals(this.additionalChargesInSCcy, transactionEnquiryResponse.additionalChargesInSCcy) &&
        Objects.equals(this.otherChargesInSCcy, transactionEnquiryResponse.otherChargesInSCcy) &&
        Objects.equals(this.payinAmountInSCcy, transactionEnquiryResponse.payinAmountInSCcy) &&
        Objects.equals(this.totalPayinAmountInSCcy, transactionEnquiryResponse.totalPayinAmountInSCcy) &&
        Objects.equals(this.payoutAmountInSCcy, transactionEnquiryResponse.payoutAmountInSCcy) &&
        Objects.equals(this.txnOtherInfo1, transactionEnquiryResponse.txnOtherInfo1) &&
        Objects.equals(this.txnOtherInfo2, transactionEnquiryResponse.txnOtherInfo2) &&
        Objects.equals(this.txnOtherInfo3, transactionEnquiryResponse.txnOtherInfo3) &&
        Objects.equals(this.txnOtherInfo4, transactionEnquiryResponse.txnOtherInfo4) &&
        Objects.equals(this.txnOtherInfo5, transactionEnquiryResponse.txnOtherInfo5) &&
        Objects.equals(this.reservedParam1, transactionEnquiryResponse.reservedParam1) &&
        Objects.equals(this.reservedParam2, transactionEnquiryResponse.reservedParam2) &&
        Objects.equals(this.reservedParam3, transactionEnquiryResponse.reservedParam3) &&
        Objects.equals(this.reservedParam4, transactionEnquiryResponse.reservedParam4) &&
        Objects.equals(this.reservedParam5, transactionEnquiryResponse.reservedParam5) &&
        Objects.equals(this.reservedParam6, transactionEnquiryResponse.reservedParam6) &&
        Objects.equals(this.reservedParam7, transactionEnquiryResponse.reservedParam7) &&
        Objects.equals(this.reservedParam8, transactionEnquiryResponse.reservedParam8) &&
        Objects.equals(this.reservedParam9, transactionEnquiryResponse.reservedParam9) &&
        Objects.equals(this.reservedParam10, transactionEnquiryResponse.reservedParam10) &&
        Objects.equals(this.serviceProviderCode, transactionEnquiryResponse.serviceProviderCode) &&
        Objects.equals(this.thirdPartyRefNo, transactionEnquiryResponse.thirdPartyRefNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serverResponse, transactionStatusList, txnRefNo, partnerTxnRefNo, transactionGMTDateTime, senderType, senderRefNumber, senderFirstName, senderMiddleName, senderLastName, senderPOBox, senderAddress1, senderAddress2, senderCity, senderDistrict, senderState, senderCountryCode, senderZipCode, senderMobile, senderPhone, senderFax, senderEmail, senderOtherInfo, senderMessageToBeneficiary, senderGender, senderDateOfBirth, senderNationalityCode, senderOccupation, senderEmployerName, senderEmployerPhone, senderIDType, senderIDOtherType, senderID, senderIDIssuedBy, senderIDIssuedAt, senderIDIssueDate, senderIDValidThru, senderIDIssuanceCountry, senderOtherInfo1, senderOtherInfo2, senderOtherInfo3, senderOtherInfo4, senderOtherInfo5, receiverType, receiverRefNumber, receiverFirstName, receiverMiddleName, receiverLastName, receiverPOBox, receiverAddress1, receiverAddress2, receiverCity, receiverDistrict, receiverState, receiverCountryCode, receiverZipCode, receiverPhone, receiverMobile, receiverFax, receiverEmail, receiverNationalityCode, receiverGender, receiverDateOfBirth, receiverOccupation, receiverCustomerRelationship, productType, receivingAgentCode, walletCode, walletNumber, cardNumber, cardType, receiverBankAccountNo, receiverBankAccountName, receiverBankName, receiverBankPOBox, receiverBankAddress1, receiverBankAddress2, receiverBankCity, receiverBankDistrict, receiverBankState, receiverBankCountryCode, receiverBankZipCode, receiverBankPhone, receiverBankMobile, receiverBankFax, receiverBankEmail, receiverOtherInfo1, receiverOtherInfo2, receiverOtherInfo3, receiverOtherInfo4, receiverOtherInfo5, sourceOfIncome, purposeOfTxn, purposeOfTxnDetails, xchgRatePayin2Payout, payinCcyCode, payinAmount, payoutCcyCode, payoutAmount, paymentMode, commission, tax, cardCharges, additionalCharges, otherCharges, totalPayinAmount, partnerCommission, disccount, cancellationAgentCode, cancellationGMTDateTime, cancelXchgRatePayin2Payout, cancelPayinAmount, cancelPayoutAmount, cancelCommission, cancelTax, cancelCardCharges, cancelAdditionalCharges, cancelOtherCharges, cancellationCharges, cancelTotalPayinAmount, settlementCcyCode, xchgRateUSDToPayin, xchgRateUSDToPayout, xchgRateUSDToSettlement, xchgRateSettlementToPayin, xchgRateSettlementToPayout, commissionInSCcy, taxInSCcy, cardChargesInSCcy, additionalChargesInSCcy, otherChargesInSCcy, payinAmountInSCcy, totalPayinAmountInSCcy, payoutAmountInSCcy, txnOtherInfo1, txnOtherInfo2, txnOtherInfo3, txnOtherInfo4, txnOtherInfo5, reservedParam1, reservedParam2, reservedParam3, reservedParam4, reservedParam5, reservedParam6, reservedParam7, reservedParam8, reservedParam9, reservedParam10, serviceProviderCode, thirdPartyRefNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionEnquiryResponse {\n");
    
    sb.append("    serverResponse: ").append(toIndentedString(serverResponse)).append("\n");
    sb.append("    transactionStatusList: ").append(toIndentedString(transactionStatusList)).append("\n");
    sb.append("    txnRefNo: ").append(toIndentedString(txnRefNo)).append("\n");
    sb.append("    partnerTxnRefNo: ").append(toIndentedString(partnerTxnRefNo)).append("\n");
    sb.append("    transactionGMTDateTime: ").append(toIndentedString(transactionGMTDateTime)).append("\n");
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
    sb.append("    senderMobile: ").append(toIndentedString(senderMobile)).append("\n");
    sb.append("    senderPhone: ").append(toIndentedString(senderPhone)).append("\n");
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
    sb.append("    senderIDType: ").append(toIndentedString(senderIDType)).append("\n");
    sb.append("    senderIDOtherType: ").append(toIndentedString(senderIDOtherType)).append("\n");
    sb.append("    senderID: ").append(toIndentedString(senderID)).append("\n");
    sb.append("    senderIDIssuedBy: ").append(toIndentedString(senderIDIssuedBy)).append("\n");
    sb.append("    senderIDIssuedAt: ").append(toIndentedString(senderIDIssuedAt)).append("\n");
    sb.append("    senderIDIssueDate: ").append(toIndentedString(senderIDIssueDate)).append("\n");
    sb.append("    senderIDValidThru: ").append(toIndentedString(senderIDValidThru)).append("\n");
    sb.append("    senderIDIssuanceCountry: ").append(toIndentedString(senderIDIssuanceCountry)).append("\n");
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
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    receivingAgentCode: ").append(toIndentedString(receivingAgentCode)).append("\n");
    sb.append("    walletCode: ").append(toIndentedString(walletCode)).append("\n");
    sb.append("    walletNumber: ").append(toIndentedString(walletNumber)).append("\n");
    sb.append("    cardNumber: ").append(toIndentedString(cardNumber)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    receiverBankAccountNo: ").append(toIndentedString(receiverBankAccountNo)).append("\n");
    sb.append("    receiverBankAccountName: ").append(toIndentedString(receiverBankAccountName)).append("\n");
    sb.append("    receiverBankName: ").append(toIndentedString(receiverBankName)).append("\n");
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
    sb.append("    xchgRatePayin2Payout: ").append(toIndentedString(xchgRatePayin2Payout)).append("\n");
    sb.append("    payinCcyCode: ").append(toIndentedString(payinCcyCode)).append("\n");
    sb.append("    payinAmount: ").append(toIndentedString(payinAmount)).append("\n");
    sb.append("    payoutCcyCode: ").append(toIndentedString(payoutCcyCode)).append("\n");
    sb.append("    payoutAmount: ").append(toIndentedString(payoutAmount)).append("\n");
    sb.append("    paymentMode: ").append(toIndentedString(paymentMode)).append("\n");
    sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    cardCharges: ").append(toIndentedString(cardCharges)).append("\n");
    sb.append("    additionalCharges: ").append(toIndentedString(additionalCharges)).append("\n");
    sb.append("    otherCharges: ").append(toIndentedString(otherCharges)).append("\n");
    sb.append("    totalPayinAmount: ").append(toIndentedString(totalPayinAmount)).append("\n");
    sb.append("    partnerCommission: ").append(toIndentedString(partnerCommission)).append("\n");
    sb.append("    disccount: ").append(toIndentedString(disccount)).append("\n");
    sb.append("    cancellationAgentCode: ").append(toIndentedString(cancellationAgentCode)).append("\n");
    sb.append("    cancellationGMTDateTime: ").append(toIndentedString(cancellationGMTDateTime)).append("\n");
    sb.append("    cancelXchgRatePayin2Payout: ").append(toIndentedString(cancelXchgRatePayin2Payout)).append("\n");
    sb.append("    cancelPayinAmount: ").append(toIndentedString(cancelPayinAmount)).append("\n");
    sb.append("    cancelPayoutAmount: ").append(toIndentedString(cancelPayoutAmount)).append("\n");
    sb.append("    cancelCommission: ").append(toIndentedString(cancelCommission)).append("\n");
    sb.append("    cancelTax: ").append(toIndentedString(cancelTax)).append("\n");
    sb.append("    cancelCardCharges: ").append(toIndentedString(cancelCardCharges)).append("\n");
    sb.append("    cancelAdditionalCharges: ").append(toIndentedString(cancelAdditionalCharges)).append("\n");
    sb.append("    cancelOtherCharges: ").append(toIndentedString(cancelOtherCharges)).append("\n");
    sb.append("    cancellationCharges: ").append(toIndentedString(cancellationCharges)).append("\n");
    sb.append("    cancelTotalPayinAmount: ").append(toIndentedString(cancelTotalPayinAmount)).append("\n");
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
    sb.append("    serviceProviderCode: ").append(toIndentedString(serviceProviderCode)).append("\n");
    sb.append("    thirdPartyRefNo: ").append(toIndentedString(thirdPartyRefNo)).append("\n");
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

