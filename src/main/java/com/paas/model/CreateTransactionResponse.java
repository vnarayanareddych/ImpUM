package com.paas.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.paas.model.ServerResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Create Response Object .
 */
@ApiModel(description = "Create Response Object .")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-11T14:37:17.134+05:30")
@JsonInclude(Include.NON_NULL)

public class CreateTransactionResponse   {
  @JsonProperty("serverResponse")
  private ServerResponse serverResponse = null;

  @JsonProperty("txnRefNo")
  private String txnRefNo = null;

  @JsonProperty("partnerTxnRefNo")
  private String partnerTxnRefNo = null;

  @JsonProperty("taxInvoiceNumber")
  private String taxInvoiceNumber = null;

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

  @JsonProperty("partnerCommission")
  private Double partnerCommission = null;

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

  @JsonProperty("sendingAgentCode")
  private String sendingAgentCode = null;

  @JsonProperty("serviceProviderCode")
  private String serviceProviderCode = null;

  @JsonProperty("receivingAgentCode")
  private String receivingAgentCode = null;

  @JsonProperty("sourceOfIncome")
  private String sourceOfIncome = null;

  @JsonProperty("purposeOfTxn")
  private String purposeOfTxn = null;

  @JsonProperty("transactionGMTDateTime")
  private String transactionGMTDateTime = null;

  @JsonProperty("settlementCcyCode")
  private String settlementCcyCode = null;

  @JsonProperty("xchgRateUSDToPayin")
  private Double xchgRateUSDToPayin = null;

  @JsonProperty("xchgRateUSDToPayout")
  private Double xchgRateUSDToPayout = null;

  @JsonProperty("xchgRateUSDToSettlement")
  private String xchgRateUSDToSettlement = null;

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

  public CreateTransactionResponse serverResponse(ServerResponse serverResponse) {
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

  public CreateTransactionResponse txnRefNo(String txnRefNo) {
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

  public CreateTransactionResponse partnerTxnRefNo(String partnerTxnRefNo) {
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

  public CreateTransactionResponse taxInvoiceNumber(String taxInvoiceNumber) {
    this.taxInvoiceNumber = taxInvoiceNumber;
    return this;
  }

  /**
   * Get taxInvoiceNumber
   * @return taxInvoiceNumber
  **/
  @ApiModelProperty(value = "")


  public String getTaxInvoiceNumber() {
    return taxInvoiceNumber;
  }

  public void setTaxInvoiceNumber(String taxInvoiceNumber) {
    this.taxInvoiceNumber = taxInvoiceNumber;
  }

  public CreateTransactionResponse xchgRatePayin2Payout(Double xchgRatePayin2Payout) {
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

  public CreateTransactionResponse payinCcyCode(String payinCcyCode) {
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

  public CreateTransactionResponse payinAmount(Double payinAmount) {
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

  public CreateTransactionResponse payoutCcyCode(String payoutCcyCode) {
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

  public CreateTransactionResponse payoutAmount(Double payoutAmount) {
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

  public CreateTransactionResponse paymentMode(String paymentMode) {
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

  public CreateTransactionResponse partnerCommission(Double partnerCommission) {
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

  public CreateTransactionResponse commission(Double commission) {
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

  public CreateTransactionResponse tax(Double tax) {
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

  public CreateTransactionResponse cardCharges(Double cardCharges) {
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

  public CreateTransactionResponse additionalCharges(Double additionalCharges) {
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

  public CreateTransactionResponse otherCharges(Double otherCharges) {
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

  public CreateTransactionResponse totalPayinAmount(Double totalPayinAmount) {
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

  public CreateTransactionResponse sendingAgentCode(String sendingAgentCode) {
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

  public CreateTransactionResponse serviceProviderCode(String serviceProviderCode) {
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

  public CreateTransactionResponse receivingAgentCode(String receivingAgentCode) {
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

  public CreateTransactionResponse sourceOfIncome(String sourceOfIncome) {
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

  public CreateTransactionResponse purposeOfTxn(String purposeOfTxn) {
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

  public CreateTransactionResponse transactionGMTDateTime(String transactionGMTDateTime) {
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

  public CreateTransactionResponse settlementCcyCode(String settlementCcyCode) {
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

  public CreateTransactionResponse xchgRateUSDToPayin(Double xchgRateUSDToPayin) {
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

  public CreateTransactionResponse xchgRateUSDToPayout(Double xchgRateUSDToPayout) {
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

  public CreateTransactionResponse xchgRateUSDToSettlement(String xchgRateUSDToSettlement) {
    this.xchgRateUSDToSettlement = xchgRateUSDToSettlement;
    return this;
  }

  /**
   * Get xchgRateUSDToSettlement
   * @return xchgRateUSDToSettlement
  **/
  @ApiModelProperty(value = "")


  public String getXchgRateUSDToSettlement() {
    return xchgRateUSDToSettlement;
  }

  public void setXchgRateUSDToSettlement(String xchgRateUSDToSettlement) {
    this.xchgRateUSDToSettlement = xchgRateUSDToSettlement;
  }

  public CreateTransactionResponse xchgRateSettlementToPayin(Double xchgRateSettlementToPayin) {
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

  public CreateTransactionResponse xchgRateSettlementToPayout(Double xchgRateSettlementToPayout) {
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

  public CreateTransactionResponse commissionInSCcy(Double commissionInSCcy) {
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

  public CreateTransactionResponse taxInSCcy(Double taxInSCcy) {
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

  public CreateTransactionResponse cardChargesInSCcy(Double cardChargesInSCcy) {
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

  public CreateTransactionResponse additionalChargesInSCcy(Double additionalChargesInSCcy) {
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

  public CreateTransactionResponse otherChargesInSCcy(Double otherChargesInSCcy) {
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

  public CreateTransactionResponse payinAmountInSCcy(Double payinAmountInSCcy) {
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

  public CreateTransactionResponse totalPayinAmountInSCcy(Double totalPayinAmountInSCcy) {
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

  public CreateTransactionResponse payoutAmountInSCcy(Double payoutAmountInSCcy) {
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

  public CreateTransactionResponse reservedParam1(String reservedParam1) {
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

  public CreateTransactionResponse reservedParam2(String reservedParam2) {
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

  public CreateTransactionResponse reservedParam3(String reservedParam3) {
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

  public CreateTransactionResponse reservedParam4(String reservedParam4) {
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

  public CreateTransactionResponse reservedParam5(String reservedParam5) {
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

  public CreateTransactionResponse reservedParam6(String reservedParam6) {
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

  public CreateTransactionResponse reservedParam7(String reservedParam7) {
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

  public CreateTransactionResponse reservedParam8(String reservedParam8) {
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

  public CreateTransactionResponse reservedParam9(String reservedParam9) {
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

  public CreateTransactionResponse reservedParam10(String reservedParam10) {
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
    CreateTransactionResponse createTransactionResponse = (CreateTransactionResponse) o;
    return Objects.equals(this.serverResponse, createTransactionResponse.serverResponse) &&
        Objects.equals(this.txnRefNo, createTransactionResponse.txnRefNo) &&
        Objects.equals(this.partnerTxnRefNo, createTransactionResponse.partnerTxnRefNo) &&
        Objects.equals(this.taxInvoiceNumber, createTransactionResponse.taxInvoiceNumber) &&
        Objects.equals(this.xchgRatePayin2Payout, createTransactionResponse.xchgRatePayin2Payout) &&
        Objects.equals(this.payinCcyCode, createTransactionResponse.payinCcyCode) &&
        Objects.equals(this.payinAmount, createTransactionResponse.payinAmount) &&
        Objects.equals(this.payoutCcyCode, createTransactionResponse.payoutCcyCode) &&
        Objects.equals(this.payoutAmount, createTransactionResponse.payoutAmount) &&
        Objects.equals(this.paymentMode, createTransactionResponse.paymentMode) &&
        Objects.equals(this.partnerCommission, createTransactionResponse.partnerCommission) &&
        Objects.equals(this.commission, createTransactionResponse.commission) &&
        Objects.equals(this.tax, createTransactionResponse.tax) &&
        Objects.equals(this.cardCharges, createTransactionResponse.cardCharges) &&
        Objects.equals(this.additionalCharges, createTransactionResponse.additionalCharges) &&
        Objects.equals(this.otherCharges, createTransactionResponse.otherCharges) &&
        Objects.equals(this.totalPayinAmount, createTransactionResponse.totalPayinAmount) &&
        Objects.equals(this.sendingAgentCode, createTransactionResponse.sendingAgentCode) &&
        Objects.equals(this.serviceProviderCode, createTransactionResponse.serviceProviderCode) &&
        Objects.equals(this.receivingAgentCode, createTransactionResponse.receivingAgentCode) &&
        Objects.equals(this.sourceOfIncome, createTransactionResponse.sourceOfIncome) &&
        Objects.equals(this.purposeOfTxn, createTransactionResponse.purposeOfTxn) &&
        Objects.equals(this.transactionGMTDateTime, createTransactionResponse.transactionGMTDateTime) &&
        Objects.equals(this.settlementCcyCode, createTransactionResponse.settlementCcyCode) &&
        Objects.equals(this.xchgRateUSDToPayin, createTransactionResponse.xchgRateUSDToPayin) &&
        Objects.equals(this.xchgRateUSDToPayout, createTransactionResponse.xchgRateUSDToPayout) &&
        Objects.equals(this.xchgRateUSDToSettlement, createTransactionResponse.xchgRateUSDToSettlement) &&
        Objects.equals(this.xchgRateSettlementToPayin, createTransactionResponse.xchgRateSettlementToPayin) &&
        Objects.equals(this.xchgRateSettlementToPayout, createTransactionResponse.xchgRateSettlementToPayout) &&
        Objects.equals(this.commissionInSCcy, createTransactionResponse.commissionInSCcy) &&
        Objects.equals(this.taxInSCcy, createTransactionResponse.taxInSCcy) &&
        Objects.equals(this.cardChargesInSCcy, createTransactionResponse.cardChargesInSCcy) &&
        Objects.equals(this.additionalChargesInSCcy, createTransactionResponse.additionalChargesInSCcy) &&
        Objects.equals(this.otherChargesInSCcy, createTransactionResponse.otherChargesInSCcy) &&
        Objects.equals(this.payinAmountInSCcy, createTransactionResponse.payinAmountInSCcy) &&
        Objects.equals(this.totalPayinAmountInSCcy, createTransactionResponse.totalPayinAmountInSCcy) &&
        Objects.equals(this.payoutAmountInSCcy, createTransactionResponse.payoutAmountInSCcy) &&
        Objects.equals(this.reservedParam1, createTransactionResponse.reservedParam1) &&
        Objects.equals(this.reservedParam2, createTransactionResponse.reservedParam2) &&
        Objects.equals(this.reservedParam3, createTransactionResponse.reservedParam3) &&
        Objects.equals(this.reservedParam4, createTransactionResponse.reservedParam4) &&
        Objects.equals(this.reservedParam5, createTransactionResponse.reservedParam5) &&
        Objects.equals(this.reservedParam6, createTransactionResponse.reservedParam6) &&
        Objects.equals(this.reservedParam7, createTransactionResponse.reservedParam7) &&
        Objects.equals(this.reservedParam8, createTransactionResponse.reservedParam8) &&
        Objects.equals(this.reservedParam9, createTransactionResponse.reservedParam9) &&
        Objects.equals(this.reservedParam10, createTransactionResponse.reservedParam10);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serverResponse, txnRefNo, partnerTxnRefNo, taxInvoiceNumber, xchgRatePayin2Payout, payinCcyCode, payinAmount, payoutCcyCode, payoutAmount, paymentMode, partnerCommission, commission, tax, cardCharges, additionalCharges, otherCharges, totalPayinAmount, sendingAgentCode, serviceProviderCode, receivingAgentCode, sourceOfIncome, purposeOfTxn, transactionGMTDateTime, settlementCcyCode, xchgRateUSDToPayin, xchgRateUSDToPayout, xchgRateUSDToSettlement, xchgRateSettlementToPayin, xchgRateSettlementToPayout, commissionInSCcy, taxInSCcy, cardChargesInSCcy, additionalChargesInSCcy, otherChargesInSCcy, payinAmountInSCcy, totalPayinAmountInSCcy, payoutAmountInSCcy, reservedParam1, reservedParam2, reservedParam3, reservedParam4, reservedParam5, reservedParam6, reservedParam7, reservedParam8, reservedParam9, reservedParam10);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTransactionResponse {\n");
    
    sb.append("    serverResponse: ").append(toIndentedString(serverResponse)).append("\n");
    sb.append("    txnRefNo: ").append(toIndentedString(txnRefNo)).append("\n");
    sb.append("    partnerTxnRefNo: ").append(toIndentedString(partnerTxnRefNo)).append("\n");
    sb.append("    taxInvoiceNumber: ").append(toIndentedString(taxInvoiceNumber)).append("\n");
    sb.append("    xchgRatePayin2Payout: ").append(toIndentedString(xchgRatePayin2Payout)).append("\n");
    sb.append("    payinCcyCode: ").append(toIndentedString(payinCcyCode)).append("\n");
    sb.append("    payinAmount: ").append(toIndentedString(payinAmount)).append("\n");
    sb.append("    payoutCcyCode: ").append(toIndentedString(payoutCcyCode)).append("\n");
    sb.append("    payoutAmount: ").append(toIndentedString(payoutAmount)).append("\n");
    sb.append("    paymentMode: ").append(toIndentedString(paymentMode)).append("\n");
    sb.append("    partnerCommission: ").append(toIndentedString(partnerCommission)).append("\n");
    sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    cardCharges: ").append(toIndentedString(cardCharges)).append("\n");
    sb.append("    additionalCharges: ").append(toIndentedString(additionalCharges)).append("\n");
    sb.append("    otherCharges: ").append(toIndentedString(otherCharges)).append("\n");
    sb.append("    totalPayinAmount: ").append(toIndentedString(totalPayinAmount)).append("\n");
    sb.append("    sendingAgentCode: ").append(toIndentedString(sendingAgentCode)).append("\n");
    sb.append("    serviceProviderCode: ").append(toIndentedString(serviceProviderCode)).append("\n");
    sb.append("    receivingAgentCode: ").append(toIndentedString(receivingAgentCode)).append("\n");
    sb.append("    sourceOfIncome: ").append(toIndentedString(sourceOfIncome)).append("\n");
    sb.append("    purposeOfTxn: ").append(toIndentedString(purposeOfTxn)).append("\n");
    sb.append("    transactionGMTDateTime: ").append(toIndentedString(transactionGMTDateTime)).append("\n");
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

