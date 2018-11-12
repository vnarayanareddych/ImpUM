package com.paas.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Input request parameters for Release Transaction service.
 */
@ApiModel(description = "Input request parameters for Release Transaction service.")
@Validated
@JsonInclude(Include.NON_NULL)
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-11T14:17:32.589+05:30")

public class ReleaseTransactionRequest   {
  @JsonProperty("txnRefNo")
  private String txnRefNo = null;

  @JsonProperty("serviceType")
  private String serviceType = null;

  @JsonProperty("productType")
  private String productType = null;

  @JsonProperty("releaseFlag")
  private Integer releaseFlag = null;

  @JsonProperty("revertCancelWithLock")
  private Integer revertCancelWithLock = null;

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

  public ReleaseTransactionRequest txnRefNo(String txnRefNo) {
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

  public ReleaseTransactionRequest serviceType(String serviceType) {
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

  public ReleaseTransactionRequest productType(String productType) {
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

  public ReleaseTransactionRequest releaseFlag(Integer releaseFlag) {
    this.releaseFlag = releaseFlag;
    return this;
  }

  /**
   * Get releaseFlag
   * @return releaseFlag
  **/
  @ApiModelProperty(value = "")


  public Integer getReleaseFlag() {
    return releaseFlag;
  }

  public void setReleaseFlag(Integer releaseFlag) {
    this.releaseFlag = releaseFlag;
  }

  public ReleaseTransactionRequest revertCancelWithLock(Integer revertCancelWithLock) {
    this.revertCancelWithLock = revertCancelWithLock;
    return this;
  }

  /**
   * Get revertCancelWithLock
   * @return revertCancelWithLock
  **/
  @ApiModelProperty(value = "")


  public Integer getRevertCancelWithLock() {
    return revertCancelWithLock;
  }

  public void setRevertCancelWithLock(Integer revertCancelWithLock) {
    this.revertCancelWithLock = revertCancelWithLock;
  }

  public ReleaseTransactionRequest controlFlag(Integer controlFlag) {
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

  public ReleaseTransactionRequest reservedParam1(String reservedParam1) {
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

  public ReleaseTransactionRequest reservedParam2(String reservedParam2) {
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

  public ReleaseTransactionRequest reservedParam3(String reservedParam3) {
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

  public ReleaseTransactionRequest reservedParam4(String reservedParam4) {
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

  public ReleaseTransactionRequest reservedParam5(String reservedParam5) {
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

  public ReleaseTransactionRequest reservedParam6(String reservedParam6) {
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

  public ReleaseTransactionRequest reservedParam7(String reservedParam7) {
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

  public ReleaseTransactionRequest reservedParam8(String reservedParam8) {
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

  public ReleaseTransactionRequest reservedParam9(String reservedParam9) {
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

  public ReleaseTransactionRequest reservedParam10(String reservedParam10) {
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
    ReleaseTransactionRequest releaseTransactionRequest = (ReleaseTransactionRequest) o;
    return Objects.equals(this.txnRefNo, releaseTransactionRequest.txnRefNo) &&
        Objects.equals(this.serviceType, releaseTransactionRequest.serviceType) &&
        Objects.equals(this.productType, releaseTransactionRequest.productType) &&
        Objects.equals(this.releaseFlag, releaseTransactionRequest.releaseFlag) &&
        Objects.equals(this.revertCancelWithLock, releaseTransactionRequest.revertCancelWithLock) &&
        Objects.equals(this.controlFlag, releaseTransactionRequest.controlFlag) &&
        Objects.equals(this.reservedParam1, releaseTransactionRequest.reservedParam1) &&
        Objects.equals(this.reservedParam2, releaseTransactionRequest.reservedParam2) &&
        Objects.equals(this.reservedParam3, releaseTransactionRequest.reservedParam3) &&
        Objects.equals(this.reservedParam4, releaseTransactionRequest.reservedParam4) &&
        Objects.equals(this.reservedParam5, releaseTransactionRequest.reservedParam5) &&
        Objects.equals(this.reservedParam6, releaseTransactionRequest.reservedParam6) &&
        Objects.equals(this.reservedParam7, releaseTransactionRequest.reservedParam7) &&
        Objects.equals(this.reservedParam8, releaseTransactionRequest.reservedParam8) &&
        Objects.equals(this.reservedParam9, releaseTransactionRequest.reservedParam9) &&
        Objects.equals(this.reservedParam10, releaseTransactionRequest.reservedParam10);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txnRefNo, serviceType, productType, releaseFlag, revertCancelWithLock, controlFlag, reservedParam1, reservedParam2, reservedParam3, reservedParam4, reservedParam5, reservedParam6, reservedParam7, reservedParam8, reservedParam9, reservedParam10);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReleaseTransactionRequest {\n");
    
    sb.append("    txnRefNo: ").append(toIndentedString(txnRefNo)).append("\n");
    sb.append("    serviceType: ").append(toIndentedString(serviceType)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    releaseFlag: ").append(toIndentedString(releaseFlag)).append("\n");
    sb.append("    revertCancelWithLock: ").append(toIndentedString(revertCancelWithLock)).append("\n");
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

