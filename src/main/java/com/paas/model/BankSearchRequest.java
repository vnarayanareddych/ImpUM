package com.paas.model;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Input request parameters for Bank search service.
 */
@ApiModel(description = "Input request parameters for Bank search service.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-16T10:50:16.108+05:30")
public class BankSearchRequest   {
  @JsonProperty("country")
  private String country = null;

  @JsonProperty("bankName")
  private String bankName = null;

  @JsonProperty("noOfResults")
  private Integer noOfResults = null;

  @JsonProperty("paginationNumber")
  private Integer paginationNumber = null;

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

  public BankSearchRequest country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Country in which receiver bank is available
   * @return country
  **/
  @ApiModelProperty(value = "Country in which receiver bank is available")


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public BankSearchRequest bankName(String bankName) {
    this.bankName = bankName;
    return this;
  }

  /**
   * Name of the bank to be searched
   * @return bankName
  **/
  @ApiModelProperty(value = "Name of the bank to be searched")


  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public BankSearchRequest noOfResults(Integer noOfResults) {
    this.noOfResults = noOfResults;
    return this;
  }

  /**
   * Maximum number of results allowed to be shown
   * @return noOfResults
  **/
  @ApiModelProperty(value = "Maximum number of results allowed to be shown")

  
  public Integer getNoOfResults() {
    return noOfResults;
  }

  public void setNoOfResults(Integer noOfResults) {
    this.noOfResults = noOfResults;
  }

  public BankSearchRequest paginationNumber(Integer paginationNumber) {
    this.paginationNumber = paginationNumber;
    return this;
  }

  /**
   * Maximum number of result pages allowed to be shown
   * @return paginationNumber
  **/
  @ApiModelProperty(value = "Maximum number of result pages allowed to be shown")


  public Integer getPaginationNumber() {
    return paginationNumber;
  }

  public void setPaginationNumber(Integer paginationNumber) {
    this.paginationNumber = paginationNumber;
  }

  public BankSearchRequest controlFlag(Integer controlFlag) {
    this.controlFlag = controlFlag;
    return this;
  }

  /**
   * Future use
   * @return controlFlag
  **/
  @ApiModelProperty(value = "Future use")


  public Integer getControlFlag() {
    return controlFlag;
  }

  public void setControlFlag(Integer controlFlag) {
    this.controlFlag = controlFlag;
  }

  public BankSearchRequest reservedParam1(String reservedParam1) {
    this.reservedParam1 = reservedParam1;
    return this;
  }

  /**
   * Future use
   * @return reservedParam1
  **/
  @ApiModelProperty(value = "Future use")


  public String getReservedParam1() {
    return reservedParam1;
  }

  public void setReservedParam1(String reservedParam1) {
    this.reservedParam1 = reservedParam1;
  }

  public BankSearchRequest reservedParam2(String reservedParam2) {
    this.reservedParam2 = reservedParam2;
    return this;
  }

  /**
   * Future use
   * @return reservedParam2
  **/
  @ApiModelProperty(value = "Future use")


  public String getReservedParam2() {
    return reservedParam2;
  }

  public void setReservedParam2(String reservedParam2) {
    this.reservedParam2 = reservedParam2;
  }

  public BankSearchRequest reservedParam3(String reservedParam3) {
    this.reservedParam3 = reservedParam3;
    return this;
  }

  /**
   * Future use
   * @return reservedParam3
  **/
  @ApiModelProperty(value = "Future use")


  public String getReservedParam3() {
    return reservedParam3;
  }

  public void setReservedParam3(String reservedParam3) {
    this.reservedParam3 = reservedParam3;
  }

  public BankSearchRequest reservedParam4(String reservedParam4) {
    this.reservedParam4 = reservedParam4;
    return this;
  }

  /**
   * Future use
   * @return reservedParam4
  **/
  @ApiModelProperty(value = "Future use")


  public String getReservedParam4() {
    return reservedParam4;
  }

  public void setReservedParam4(String reservedParam4) {
    this.reservedParam4 = reservedParam4;
  }

  public BankSearchRequest reservedParam5(String reservedParam5) {
    this.reservedParam5 = reservedParam5;
    return this;
  }

  /**
   * Future use
   * @return reservedParam5
  **/
  @ApiModelProperty(value = "Future use")


  public String getReservedParam5() {
    return reservedParam5;
  }

  public void setReservedParam5(String reservedParam5) {
    this.reservedParam5 = reservedParam5;
  }

  public BankSearchRequest reservedParam6(String reservedParam6) {
    this.reservedParam6 = reservedParam6;
    return this;
  }

  /**
   * Future use
   * @return reservedParam6
  **/
  @ApiModelProperty(value = "Future use")


  public String getReservedParam6() {
    return reservedParam6;
  }

  public void setReservedParam6(String reservedParam6) {
    this.reservedParam6 = reservedParam6;
  }

  public BankSearchRequest reservedParam7(String reservedParam7) {
    this.reservedParam7 = reservedParam7;
    return this;
  }

  /**
   * Future use
   * @return reservedParam7
  **/
  @ApiModelProperty(value = "Future use")


  public String getReservedParam7() {
    return reservedParam7;
  }

  public void setReservedParam7(String reservedParam7) {
    this.reservedParam7 = reservedParam7;
  }

  public BankSearchRequest reservedParam8(String reservedParam8) {
    this.reservedParam8 = reservedParam8;
    return this;
  }

  /**
   * Future use
   * @return reservedParam8
  **/
  @ApiModelProperty(value = "Future use")


  public String getReservedParam8() {
    return reservedParam8;
  }

  public void setReservedParam8(String reservedParam8) {
    this.reservedParam8 = reservedParam8;
  }

  public BankSearchRequest reservedParam9(String reservedParam9) {
    this.reservedParam9 = reservedParam9;
    return this;
  }

  /**
   * Future use
   * @return reservedParam9
  **/
  @ApiModelProperty(value = "Future use")


  public String getReservedParam9() {
    return reservedParam9;
  }

  public void setReservedParam9(String reservedParam9) {
    this.reservedParam9 = reservedParam9;
  }

  public BankSearchRequest reservedParam10(String reservedParam10) {
    this.reservedParam10 = reservedParam10;
    return this;
  }

  /**
   * Future use
   * @return reservedParam10
  **/
  @ApiModelProperty(value = "Future use")


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
    BankSearchRequest bankSearchRequest = (BankSearchRequest) o;
    return Objects.equals(this.country, bankSearchRequest.country) &&
        Objects.equals(this.bankName, bankSearchRequest.bankName) &&
        Objects.equals(this.noOfResults, bankSearchRequest.noOfResults) &&
        Objects.equals(this.paginationNumber, bankSearchRequest.paginationNumber) &&
        Objects.equals(this.controlFlag, bankSearchRequest.controlFlag) &&
        Objects.equals(this.reservedParam1, bankSearchRequest.reservedParam1) &&
        Objects.equals(this.reservedParam2, bankSearchRequest.reservedParam2) &&
        Objects.equals(this.reservedParam3, bankSearchRequest.reservedParam3) &&
        Objects.equals(this.reservedParam4, bankSearchRequest.reservedParam4) &&
        Objects.equals(this.reservedParam5, bankSearchRequest.reservedParam5) &&
        Objects.equals(this.reservedParam6, bankSearchRequest.reservedParam6) &&
        Objects.equals(this.reservedParam7, bankSearchRequest.reservedParam7) &&
        Objects.equals(this.reservedParam8, bankSearchRequest.reservedParam8) &&
        Objects.equals(this.reservedParam9, bankSearchRequest.reservedParam9) &&
        Objects.equals(this.reservedParam10, bankSearchRequest.reservedParam10);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, bankName, noOfResults, paginationNumber, controlFlag, reservedParam1, reservedParam2, reservedParam3, reservedParam4, reservedParam5, reservedParam6, reservedParam7, reservedParam8, reservedParam9, reservedParam10);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankSearchRequest {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    noOfResults: ").append(toIndentedString(noOfResults)).append("\n");
    sb.append("    paginationNumber: ").append(toIndentedString(paginationNumber)).append("\n");
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

