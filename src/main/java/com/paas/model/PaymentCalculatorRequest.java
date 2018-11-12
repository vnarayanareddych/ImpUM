package com.paas.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Input request parameter for Payment Calculator service.
 */
@ApiModel(description = "Input request parameter for Payment Calculator service.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-05T19:34:51.520+05:30")

public class PaymentCalculatorRequest   {
  @JsonProperty("xchgRateDisplayFlag")
  private Integer xchgRateDisplayFlag = null;

  @JsonProperty("payinCcyCode")
  private String payinCcyCode = null;

  @JsonProperty("payinAmount")
  private Double payinAmount = null;

  @JsonProperty("payoutCcyCode")
  private String payoutCcyCode = null;

  @JsonProperty("payoutAmount")
  private Double payoutAmount = null;

  @JsonProperty("sendingAgentCode")
  private String sendingAgentCode = null;

  @JsonProperty("serviceProviderCode")
  private String serviceProviderCode = null;

  @JsonProperty("senderCountryCode")
  private String senderCountryCode = null;

  @JsonProperty("receiverCountryCode")
  private String receiverCountryCode = null;

  @JsonProperty("receiverBankBranchCode")
  private String receiverBankBranchCode = null;

  @JsonProperty("includeCharges")
  private Integer includeCharges = null;

  @JsonProperty("paymentMode")
  private String paymentMode = null;

  @JsonProperty("senderType")
  private Integer senderType = null;

  @JsonProperty("receiverType")
  private Integer receiverType = null;

  @JsonProperty("serviceType")
  private String serviceType = null;

  @JsonProperty("productType")
  private String productType = null;

  @JsonProperty("serviceFlag")
  private Integer serviceFlag = null;

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

  public PaymentCalculatorRequest xchgRateDisplayFlag(Integer xchgRateDisplayFlag) {
    this.xchgRateDisplayFlag = xchgRateDisplayFlag;
    return this;
  }

  /**
   * Get xchgRateDisplayFlag
   * @return xchgRateDisplayFlag
  **/
  @ApiModelProperty(value = "")


  public Integer getXchgRateDisplayFlag() {
    return xchgRateDisplayFlag;
  }

  public void setXchgRateDisplayFlag(Integer xchgRateDisplayFlag) {
    this.xchgRateDisplayFlag = xchgRateDisplayFlag;
  }

  public PaymentCalculatorRequest payinCcyCode(String payinCcyCode) {
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

  public PaymentCalculatorRequest payinAmount(Double payinAmount) {
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

  public PaymentCalculatorRequest payoutCcyCode(String payoutCcyCode) {
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

  public PaymentCalculatorRequest payoutAmount(Double payoutAmount) {
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

  public PaymentCalculatorRequest sendingAgentCode(String sendingAgentCode) {
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

  public PaymentCalculatorRequest serviceProviderCode(String serviceProviderCode) {
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

  public PaymentCalculatorRequest senderCountryCode(String senderCountryCode) {
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

  public PaymentCalculatorRequest receiverCountryCode(String receiverCountryCode) {
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

  public PaymentCalculatorRequest receiverBankBranchCode(String receiverBankBranchCode) {
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

  public PaymentCalculatorRequest includeCharges(Integer includeCharges) {
    this.includeCharges = includeCharges;
    return this;
  }

  /**
   * Get includeCharges
   * @return includeCharges
  **/
  @ApiModelProperty(value = "")


  public Integer getIncludeCharges() {
    return includeCharges;
  }

  public void setIncludeCharges(Integer includeCharges) {
    this.includeCharges = includeCharges;
  }

  public PaymentCalculatorRequest paymentMode(String paymentMode) {
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

  public PaymentCalculatorRequest senderType(Integer senderType) {
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

  public PaymentCalculatorRequest receiverType(Integer receiverType) {
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

  public PaymentCalculatorRequest serviceType(String serviceType) {
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

  public PaymentCalculatorRequest productType(String productType) {
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

  public PaymentCalculatorRequest serviceFlag(Integer serviceFlag) {
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

  public PaymentCalculatorRequest controlFlag(Integer controlFlag) {
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

  public PaymentCalculatorRequest reservedParam1(String reservedParam1) {
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

  public PaymentCalculatorRequest reservedParam2(String reservedParam2) {
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

  public PaymentCalculatorRequest reservedParam3(String reservedParam3) {
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

  public PaymentCalculatorRequest reservedParam4(String reservedParam4) {
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

  public PaymentCalculatorRequest reservedParam5(String reservedParam5) {
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

  public PaymentCalculatorRequest reservedParam6(String reservedParam6) {
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

  public PaymentCalculatorRequest reservedParam7(String reservedParam7) {
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

  public PaymentCalculatorRequest reservedParam8(String reservedParam8) {
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

  public PaymentCalculatorRequest reservedParam9(String reservedParam9) {
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

  public PaymentCalculatorRequest reservedParam10(String reservedParam10) {
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
    PaymentCalculatorRequest paymentCalculatorRequest = (PaymentCalculatorRequest) o;
    return Objects.equals(this.xchgRateDisplayFlag, paymentCalculatorRequest.xchgRateDisplayFlag) &&
        Objects.equals(this.payinCcyCode, paymentCalculatorRequest.payinCcyCode) &&
        Objects.equals(this.payinAmount, paymentCalculatorRequest.payinAmount) &&
        Objects.equals(this.payoutCcyCode, paymentCalculatorRequest.payoutCcyCode) &&
        Objects.equals(this.payoutAmount, paymentCalculatorRequest.payoutAmount) &&
        Objects.equals(this.sendingAgentCode, paymentCalculatorRequest.sendingAgentCode) &&
        Objects.equals(this.serviceProviderCode, paymentCalculatorRequest.serviceProviderCode) &&
        Objects.equals(this.senderCountryCode, paymentCalculatorRequest.senderCountryCode) &&
        Objects.equals(this.receiverCountryCode, paymentCalculatorRequest.receiverCountryCode) &&
        Objects.equals(this.receiverBankBranchCode, paymentCalculatorRequest.receiverBankBranchCode) &&
        Objects.equals(this.includeCharges, paymentCalculatorRequest.includeCharges) &&
        Objects.equals(this.paymentMode, paymentCalculatorRequest.paymentMode) &&
        Objects.equals(this.senderType, paymentCalculatorRequest.senderType) &&
        Objects.equals(this.receiverType, paymentCalculatorRequest.receiverType) &&
        Objects.equals(this.serviceType, paymentCalculatorRequest.serviceType) &&
        Objects.equals(this.productType, paymentCalculatorRequest.productType) &&
        Objects.equals(this.serviceFlag, paymentCalculatorRequest.serviceFlag) &&
        Objects.equals(this.controlFlag, paymentCalculatorRequest.controlFlag) &&
        Objects.equals(this.reservedParam1, paymentCalculatorRequest.reservedParam1) &&
        Objects.equals(this.reservedParam2, paymentCalculatorRequest.reservedParam2) &&
        Objects.equals(this.reservedParam3, paymentCalculatorRequest.reservedParam3) &&
        Objects.equals(this.reservedParam4, paymentCalculatorRequest.reservedParam4) &&
        Objects.equals(this.reservedParam5, paymentCalculatorRequest.reservedParam5) &&
        Objects.equals(this.reservedParam6, paymentCalculatorRequest.reservedParam6) &&
        Objects.equals(this.reservedParam7, paymentCalculatorRequest.reservedParam7) &&
        Objects.equals(this.reservedParam8, paymentCalculatorRequest.reservedParam8) &&
        Objects.equals(this.reservedParam9, paymentCalculatorRequest.reservedParam9) &&
        Objects.equals(this.reservedParam10, paymentCalculatorRequest.reservedParam10);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xchgRateDisplayFlag, payinCcyCode, payinAmount, payoutCcyCode, payoutAmount, sendingAgentCode, serviceProviderCode, senderCountryCode, receiverCountryCode, receiverBankBranchCode, includeCharges, paymentMode, senderType, receiverType, serviceType, productType, serviceFlag, controlFlag, reservedParam1, reservedParam2, reservedParam3, reservedParam4, reservedParam5, reservedParam6, reservedParam7, reservedParam8, reservedParam9, reservedParam10);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentCalculatorRequest {\n");
    
    sb.append("    xchgRateDisplayFlag: ").append(toIndentedString(xchgRateDisplayFlag)).append("\n");
    sb.append("    payinCcyCode: ").append(toIndentedString(payinCcyCode)).append("\n");
    sb.append("    payinAmount: ").append(toIndentedString(payinAmount)).append("\n");
    sb.append("    payoutCcyCode: ").append(toIndentedString(payoutCcyCode)).append("\n");
    sb.append("    payoutAmount: ").append(toIndentedString(payoutAmount)).append("\n");
    sb.append("    sendingAgentCode: ").append(toIndentedString(sendingAgentCode)).append("\n");
    sb.append("    serviceProviderCode: ").append(toIndentedString(serviceProviderCode)).append("\n");
    sb.append("    senderCountryCode: ").append(toIndentedString(senderCountryCode)).append("\n");
    sb.append("    receiverCountryCode: ").append(toIndentedString(receiverCountryCode)).append("\n");
    sb.append("    receiverBankBranchCode: ").append(toIndentedString(receiverBankBranchCode)).append("\n");
    sb.append("    includeCharges: ").append(toIndentedString(includeCharges)).append("\n");
    sb.append("    paymentMode: ").append(toIndentedString(paymentMode)).append("\n");
    sb.append("    senderType: ").append(toIndentedString(senderType)).append("\n");
    sb.append("    receiverType: ").append(toIndentedString(receiverType)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    serviceFlag: ").append(toIndentedString(serviceFlag)).append("\n");
    sb.append("    controlFlag: ").append(toIndentedString(controlFlag)).append("\n");
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

