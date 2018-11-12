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
 * Input request parameter for TransactionEnquiry service.
 */
@ApiModel(description = "Input request parameter for TransactionEnquiry service.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-10T18:11:07.886+05:30")

public class TransactionEnquiryRequest   {
  @JsonProperty("txnRefNo")
  private String txnRefNo = null;

  @JsonProperty("partnerTxnRefNo")
  private String partnerTxnRefNo = null;

  @JsonProperty("serviceType")
  private String serviceType = null;

  @JsonProperty("productType")
  private String productType = null;

  @JsonProperty("sendReceiveCancelFlag")
  private Integer sendReceiveCancelFlag = null;

  @JsonProperty("statusHistoryFlag")
  private Integer statusHistoryFlag = null;

  @JsonProperty("controlFlag")
  private Integer controlFlag = null;

  @JsonProperty("statusOnly")
  private Integer statusOnly = null;

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

  public TransactionEnquiryRequest txnRefNo(String txnRefNo) {
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

  public TransactionEnquiryRequest partnerTxnRefNo(String partnerTxnRefNo) {
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

  public TransactionEnquiryRequest serviceType(String serviceType) {
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

  public TransactionEnquiryRequest productType(String productType) {
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

  public TransactionEnquiryRequest sendReceiveCancelFlag(Integer sendReceiveCancelFlag) {
    this.sendReceiveCancelFlag = sendReceiveCancelFlag;
    return this;
  }

  /**
   * Get sendReceiveCancelFlag
   * @return sendReceiveCancelFlag
  **/
  @ApiModelProperty(value = "")


  public Integer getSendReceiveCancelFlag() {
    return sendReceiveCancelFlag;
  }

  public void setSendReceiveCancelFlag(Integer sendReceiveCancelFlag) {
    this.sendReceiveCancelFlag = sendReceiveCancelFlag;
  }

  public TransactionEnquiryRequest statusHistoryFlag(Integer statusHistoryFlag) {
    this.statusHistoryFlag = statusHistoryFlag;
    return this;
  }

  /**
   * Get statusHistoryFlag
   * @return statusHistoryFlag
  **/
  @ApiModelProperty(value = "")


  public Integer getStatusHistoryFlag() {
    return statusHistoryFlag;
  }

  public void setStatusHistoryFlag(Integer statusHistoryFlag) {
    this.statusHistoryFlag = statusHistoryFlag;
  }

  public TransactionEnquiryRequest controlFlag(Integer controlFlag) {
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

  public TransactionEnquiryRequest statusOnly(Integer statusOnly) {
    this.statusOnly = statusOnly;
    return this;
  }

  /**
   * Get statusOnly
   * @return statusOnly
  **/
  @ApiModelProperty(value = "")


  public Integer getStatusOnly() {
    return statusOnly;
  }

  public void setStatusOnly(Integer statusOnly) {
    this.statusOnly = statusOnly;
  }

  public TransactionEnquiryRequest reservedParam1(String reservedParam1) {
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

  public TransactionEnquiryRequest reservedParam2(String reservedParam2) {
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

  public TransactionEnquiryRequest reservedParam3(String reservedParam3) {
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

  public TransactionEnquiryRequest reservedParam4(String reservedParam4) {
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

  public TransactionEnquiryRequest reservedParam5(String reservedParam5) {
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

  public TransactionEnquiryRequest reservedParam6(String reservedParam6) {
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

  public TransactionEnquiryRequest reservedParam7(String reservedParam7) {
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

  public TransactionEnquiryRequest reservedParam8(String reservedParam8) {
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

  public TransactionEnquiryRequest reservedParam9(String reservedParam9) {
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

  public TransactionEnquiryRequest reservedParam10(String reservedParam10) {
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
    TransactionEnquiryRequest transactionEnquiryRequest = (TransactionEnquiryRequest) o;
    return Objects.equals(this.txnRefNo, transactionEnquiryRequest.txnRefNo) &&
        Objects.equals(this.partnerTxnRefNo, transactionEnquiryRequest.partnerTxnRefNo) &&
        Objects.equals(this.serviceType, transactionEnquiryRequest.serviceType) &&
        Objects.equals(this.productType, transactionEnquiryRequest.productType) &&
        Objects.equals(this.sendReceiveCancelFlag, transactionEnquiryRequest.sendReceiveCancelFlag) &&
        Objects.equals(this.statusHistoryFlag, transactionEnquiryRequest.statusHistoryFlag) &&
        Objects.equals(this.controlFlag, transactionEnquiryRequest.controlFlag) &&
        Objects.equals(this.statusOnly, transactionEnquiryRequest.statusOnly) &&
        Objects.equals(this.reservedParam1, transactionEnquiryRequest.reservedParam1) &&
        Objects.equals(this.reservedParam2, transactionEnquiryRequest.reservedParam2) &&
        Objects.equals(this.reservedParam3, transactionEnquiryRequest.reservedParam3) &&
        Objects.equals(this.reservedParam4, transactionEnquiryRequest.reservedParam4) &&
        Objects.equals(this.reservedParam5, transactionEnquiryRequest.reservedParam5) &&
        Objects.equals(this.reservedParam6, transactionEnquiryRequest.reservedParam6) &&
        Objects.equals(this.reservedParam7, transactionEnquiryRequest.reservedParam7) &&
        Objects.equals(this.reservedParam8, transactionEnquiryRequest.reservedParam8) &&
        Objects.equals(this.reservedParam9, transactionEnquiryRequest.reservedParam9) &&
        Objects.equals(this.reservedParam10, transactionEnquiryRequest.reservedParam10);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txnRefNo, partnerTxnRefNo, serviceType, productType, sendReceiveCancelFlag, statusHistoryFlag, controlFlag, statusOnly, reservedParam1, reservedParam2, reservedParam3, reservedParam4, reservedParam5, reservedParam6, reservedParam7, reservedParam8, reservedParam9, reservedParam10);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionEnquiryRequest {\n");
    
    sb.append("    txnRefNo: ").append(toIndentedString(txnRefNo)).append("\n");
    sb.append("    partnerTxnRefNo: ").append(toIndentedString(partnerTxnRefNo)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    sendReceiveCancelFlag: ").append(toIndentedString(sendReceiveCancelFlag)).append("\n");
    sb.append("    statusHistoryFlag: ").append(toIndentedString(statusHistoryFlag)).append("\n");
    sb.append("    controlFlag: ").append(toIndentedString(controlFlag)).append("\n");
    sb.append("    statusOnly: ").append(toIndentedString(statusOnly)).append("\n");
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

