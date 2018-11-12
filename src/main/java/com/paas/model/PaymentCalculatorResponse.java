package com.paas.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.paas.model.ChargesInfo;
import com.paas.model.ServerResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Response parameters for PaymentCalculator service.
 */
@ApiModel(description = "Response parameters for PaymentCalculator service.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-08T15:55:28.806+05:30")
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentCalculatorResponse   {
  @JsonProperty("serverResponse")
  private ServerResponse serverResponse = null;

  @JsonProperty("senderCountryCode")
  private String senderCountryCode = null;

  @JsonProperty("receiverCountryCode")
  private String receiverCountryCode = null;

  @JsonProperty("serviceType")
  private String serviceType = null;

  @JsonProperty("productType")
  private String productType = null;

  @JsonProperty("payinCcyCode")
  private String payinCcyCode = null;

  @JsonProperty("payoutCcyCode")
  private String payoutCcyCode = null;

  @JsonProperty("payinAmount")
  private Double payinAmount = null;

  @JsonProperty("payoutAmount")
  private Double payoutAmount = null;

  @JsonProperty("xchgRate")
  private Double xchgRate = null;

  @JsonProperty("xchgRateFormatFlag")
  private String xchgRateFormatFlag = null;

  @JsonProperty("chargesList")
  @Valid
  private List<ChargesInfo> chargesList = null;

  @JsonProperty("totalPayinAmount")
  private Double totalPayinAmount = null;

  @JsonProperty("paymentMode")
  private String paymentMode = null;

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

  public PaymentCalculatorResponse serverResponse(ServerResponse serverResponse) {
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

  public PaymentCalculatorResponse senderCountryCode(String senderCountryCode) {
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

  public PaymentCalculatorResponse receiverCountryCode(String receiverCountryCode) {
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

  public PaymentCalculatorResponse serviceType(String serviceType) {
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

  public PaymentCalculatorResponse productType(String productType) {
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

  public PaymentCalculatorResponse payinCcyCode(String payinCcyCode) {
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

  public PaymentCalculatorResponse payoutCcyCode(String payoutCcyCode) {
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

  public PaymentCalculatorResponse payinAmount(Double payinAmount) {
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

  public PaymentCalculatorResponse payoutAmount(Double payoutAmount) {
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

  public PaymentCalculatorResponse xchgRate(Double xchgRate) {
    this.xchgRate = xchgRate;
    return this;
  }

  /**
   * Get xchgRate
   * @return xchgRate
  **/
  @ApiModelProperty(value = "")


  public Double getXchgRate() {
    return xchgRate;
  }

  public void setXchgRate(Double xchgRate) {
    this.xchgRate = xchgRate;
  }

  public PaymentCalculatorResponse xchgRateFormatFlag(String xchgRateFormatFlag) {
    this.xchgRateFormatFlag = xchgRateFormatFlag;
    return this;
  }

  /**
   * Get xchgRateFormatFlag
   * @return xchgRateFormatFlag
  **/
  @ApiModelProperty(value = "")


  public String getXchgRateFormatFlag() {
    return xchgRateFormatFlag;
  }

  public void setXchgRateFormatFlag(String xchgRateFormatFlag) {
    this.xchgRateFormatFlag = xchgRateFormatFlag;
  }

  public PaymentCalculatorResponse chargesList(List<ChargesInfo> chargesList) {
    this.chargesList = chargesList;
    return this;
  }

  public PaymentCalculatorResponse addChargesListItem(ChargesInfo chargesListItem) {
    if (this.chargesList == null) {
      this.chargesList = new ArrayList<ChargesInfo>();
    }
    this.chargesList.add(chargesListItem);
    return this;
  }

  /**
   * Get chargesList
   * @return chargesList
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<ChargesInfo> getChargesList() {
    return chargesList;
  }

  public void setChargesList(List<ChargesInfo> chargesList) {
    this.chargesList = chargesList;
  }

  public PaymentCalculatorResponse totalPayinAmount(Double totalPayinAmount) {
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

  public PaymentCalculatorResponse paymentMode(String paymentMode) {
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

  public PaymentCalculatorResponse rateOtherInfo1(String rateOtherInfo1) {
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

  public PaymentCalculatorResponse rateOtherInfo2(String rateOtherInfo2) {
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

  public PaymentCalculatorResponse rateOtherInfo3(String rateOtherInfo3) {
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

  public PaymentCalculatorResponse rateOtherInfo4(String rateOtherInfo4) {
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

  public PaymentCalculatorResponse rateOtherInfo5(String rateOtherInfo5) {
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

  public PaymentCalculatorResponse reservedParam1(String reservedParam1) {
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

  public PaymentCalculatorResponse reservedParam2(String reservedParam2) {
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

  public PaymentCalculatorResponse reservedParam3(String reservedParam3) {
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

  public PaymentCalculatorResponse reservedParam4(String reservedParam4) {
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

  public PaymentCalculatorResponse reservedParam5(String reservedParam5) {
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

  public PaymentCalculatorResponse reservedParam6(String reservedParam6) {
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

  public PaymentCalculatorResponse reservedParam7(String reservedParam7) {
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

  public PaymentCalculatorResponse reservedParam8(String reservedParam8) {
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

  public PaymentCalculatorResponse reservedParam9(String reservedParam9) {
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

  public PaymentCalculatorResponse reservedParam10(String reservedParam10) {
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
    PaymentCalculatorResponse paymentCalculatorResponse = (PaymentCalculatorResponse) o;
    return Objects.equals(this.serverResponse, paymentCalculatorResponse.serverResponse) &&
        Objects.equals(this.senderCountryCode, paymentCalculatorResponse.senderCountryCode) &&
        Objects.equals(this.receiverCountryCode, paymentCalculatorResponse.receiverCountryCode) &&
        Objects.equals(this.serviceType, paymentCalculatorResponse.serviceType) &&
        Objects.equals(this.productType, paymentCalculatorResponse.productType) &&
        Objects.equals(this.payinCcyCode, paymentCalculatorResponse.payinCcyCode) &&
        Objects.equals(this.payoutCcyCode, paymentCalculatorResponse.payoutCcyCode) &&
        Objects.equals(this.payinAmount, paymentCalculatorResponse.payinAmount) &&
        Objects.equals(this.payoutAmount, paymentCalculatorResponse.payoutAmount) &&
        Objects.equals(this.xchgRate, paymentCalculatorResponse.xchgRate) &&
        Objects.equals(this.xchgRateFormatFlag, paymentCalculatorResponse.xchgRateFormatFlag) &&
        Objects.equals(this.chargesList, paymentCalculatorResponse.chargesList) &&
        Objects.equals(this.totalPayinAmount, paymentCalculatorResponse.totalPayinAmount) &&
        Objects.equals(this.paymentMode, paymentCalculatorResponse.paymentMode) &&
        Objects.equals(this.rateOtherInfo1, paymentCalculatorResponse.rateOtherInfo1) &&
        Objects.equals(this.rateOtherInfo2, paymentCalculatorResponse.rateOtherInfo2) &&
        Objects.equals(this.rateOtherInfo3, paymentCalculatorResponse.rateOtherInfo3) &&
        Objects.equals(this.rateOtherInfo4, paymentCalculatorResponse.rateOtherInfo4) &&
        Objects.equals(this.rateOtherInfo5, paymentCalculatorResponse.rateOtherInfo5) &&
        Objects.equals(this.reservedParam1, paymentCalculatorResponse.reservedParam1) &&
        Objects.equals(this.reservedParam2, paymentCalculatorResponse.reservedParam2) &&
        Objects.equals(this.reservedParam3, paymentCalculatorResponse.reservedParam3) &&
        Objects.equals(this.reservedParam4, paymentCalculatorResponse.reservedParam4) &&
        Objects.equals(this.reservedParam5, paymentCalculatorResponse.reservedParam5) &&
        Objects.equals(this.reservedParam6, paymentCalculatorResponse.reservedParam6) &&
        Objects.equals(this.reservedParam7, paymentCalculatorResponse.reservedParam7) &&
        Objects.equals(this.reservedParam8, paymentCalculatorResponse.reservedParam8) &&
        Objects.equals(this.reservedParam9, paymentCalculatorResponse.reservedParam9) &&
        Objects.equals(this.reservedParam10, paymentCalculatorResponse.reservedParam10);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serverResponse, senderCountryCode, receiverCountryCode, serviceType, productType, payinCcyCode, payoutCcyCode, payinAmount, payoutAmount, xchgRate, xchgRateFormatFlag, chargesList, totalPayinAmount, paymentMode, rateOtherInfo1, rateOtherInfo2, rateOtherInfo3, rateOtherInfo4, rateOtherInfo5, reservedParam1, reservedParam2, reservedParam3, reservedParam4, reservedParam5, reservedParam6, reservedParam7, reservedParam8, reservedParam9, reservedParam10);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentCalculatorResponse {\n");
    
    sb.append("    serverResponse: ").append(toIndentedString(serverResponse)).append("\n");
    sb.append("    senderCountryCode: ").append(toIndentedString(senderCountryCode)).append("\n");
    sb.append("    receiverCountryCode: ").append(toIndentedString(receiverCountryCode)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    payinCcyCode: ").append(toIndentedString(payinCcyCode)).append("\n");
    sb.append("    payoutCcyCode: ").append(toIndentedString(payoutCcyCode)).append("\n");
    sb.append("    payinAmount: ").append(toIndentedString(payinAmount)).append("\n");
    sb.append("    payoutAmount: ").append(toIndentedString(payoutAmount)).append("\n");
    sb.append("    xchgRate: ").append(toIndentedString(xchgRate)).append("\n");
    sb.append("    xchgRateFormatFlag: ").append(toIndentedString(xchgRateFormatFlag)).append("\n");
    sb.append("    chargesList: ").append(toIndentedString(chargesList)).append("\n");
    sb.append("    totalPayinAmount: ").append(toIndentedString(totalPayinAmount)).append("\n");
    sb.append("    paymentMode: ").append(toIndentedString(paymentMode)).append("\n");
    sb.append("    rateOtherInfo1: ").append(toIndentedString(rateOtherInfo1)).append("\n");
    sb.append("    rateOtherInfo2: ").append(toIndentedString(rateOtherInfo2)).append("\n");
    sb.append("    rateOtherInfo3: ").append(toIndentedString(rateOtherInfo3)).append("\n");
    sb.append("    rateOtherInfo4: ").append(toIndentedString(rateOtherInfo4)).append("\n");
    sb.append("    rateOtherInfo5: ").append(toIndentedString(rateOtherInfo5)).append("\n");
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

