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
 * Input request parameter for Bank branch search service.
 */
@ApiModel(description = "Input request parameter for Bank branch search service.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-05T14:50:25.040+05:30")

public class BankBranchSearchRequest   {
  @JsonProperty("country")
  private String country = null;

  @JsonProperty("bankCode")
  private String bankCode = null;

  @JsonProperty("bankName")
  private String bankName = null;

  @JsonProperty("bankBranchName")
  private String bankBranchName = null;

  @JsonProperty("bankBranchAddress")
  private String bankBranchAddress = null;

  @JsonProperty("branchIdentifier")
  private String branchIdentifier = null;

  @JsonProperty("noOfResults")
  private Integer noOfResults = null;

  @JsonProperty("paginationNumber")
  private Integer paginationNumber = null;

  @JsonProperty("searchFlag")
  private Integer searchFlag = null;

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

  public BankBranchSearchRequest country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
  **/
  @ApiModelProperty(value = "")


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public BankBranchSearchRequest bankCode(String bankCode) {
    this.bankCode = bankCode;
    return this;
  }

  /**
   * Get bankCode
   * @return bankCode
  **/
  @ApiModelProperty(value = "")


  public String getBankCode() {
    return bankCode;
  }

  public void setBankCode(String bankCode) {
    this.bankCode = bankCode;
  }

  public BankBranchSearchRequest bankName(String bankName) {
    this.bankName = bankName;
    return this;
  }

  /**
   * Get bankName
   * @return bankName
  **/
  @ApiModelProperty(value = "")


  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public BankBranchSearchRequest bankBranchName(String bankBranchName) {
    this.bankBranchName = bankBranchName;
    return this;
  }

  /**
   * Get bankBranchName
   * @return bankBranchName
  **/
  @ApiModelProperty(value = "")


  public String getBankBranchName() {
    return bankBranchName;
  }

  public void setBankBranchName(String bankBranchName) {
    this.bankBranchName = bankBranchName;
  }

  public BankBranchSearchRequest bankBranchAddress(String bankBranchAddress) {
    this.bankBranchAddress = bankBranchAddress;
    return this;
  }

  /**
   * Get bankBranchAddress
   * @return bankBranchAddress
  **/
  @ApiModelProperty(value = "")


  public String getBankBranchAddress() {
    return bankBranchAddress;
  }

  public void setBankBranchAddress(String bankBranchAddress) {
    this.bankBranchAddress = bankBranchAddress;
  }

  public BankBranchSearchRequest branchIdentifier(String branchIdentifier) {
    this.branchIdentifier = branchIdentifier;
    return this;
  }

  /**
   * Get branchIdentifier
   * @return branchIdentifier
  **/
  @ApiModelProperty(value = "")


  public String getBranchIdentifier() {
    return branchIdentifier;
  }

  public void setBranchIdentifier(String branchIdentifier) {
    this.branchIdentifier = branchIdentifier;
  }

  public BankBranchSearchRequest noOfResults(Integer noOfResults) {
    this.noOfResults = noOfResults;
    return this;
  }

  /**
   * Get noOfResults
   * @return noOfResults
  **/
  @ApiModelProperty(value = "")


  public Integer getNoOfResults() {
    return noOfResults;
  }

  public void setNoOfResults(Integer noOfResults) {
    this.noOfResults = noOfResults;
  }

  public BankBranchSearchRequest paginationNumber(Integer paginationNumber) {
    this.paginationNumber = paginationNumber;
    return this;
  }

  /**
   * Get paginationNumber
   * @return paginationNumber
  **/
  @ApiModelProperty(value = "")


  public Integer getPaginationNumber() {
    return paginationNumber;
  }

  public void setPaginationNumber(Integer paginationNumber) {
    this.paginationNumber = paginationNumber;
  }

  public BankBranchSearchRequest searchFlag(Integer searchFlag) {
    this.searchFlag = searchFlag;
    return this;
  }

  /**
   * Get searchFlag
   * @return searchFlag
  **/
  @ApiModelProperty(value = "")


  public Integer getSearchFlag() {
    return searchFlag;
  }

  public void setSearchFlag(Integer searchFlag) {
    this.searchFlag = searchFlag;
  }

  public BankBranchSearchRequest controlFlag(Integer controlFlag) {
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

  public BankBranchSearchRequest reservedParam1(String reservedParam1) {
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

  public BankBranchSearchRequest reservedParam2(String reservedParam2) {
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

  public BankBranchSearchRequest reservedParam3(String reservedParam3) {
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

  public BankBranchSearchRequest reservedParam4(String reservedParam4) {
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

  public BankBranchSearchRequest reservedParam5(String reservedParam5) {
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

  public BankBranchSearchRequest reservedParam6(String reservedParam6) {
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

  public BankBranchSearchRequest reservedParam7(String reservedParam7) {
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

  public BankBranchSearchRequest reservedParam8(String reservedParam8) {
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

  public BankBranchSearchRequest reservedParam9(String reservedParam9) {
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

  public BankBranchSearchRequest reservedParam10(String reservedParam10) {
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
    BankBranchSearchRequest bankBranchSearchRequest = (BankBranchSearchRequest) o;
    return Objects.equals(this.country, bankBranchSearchRequest.country) &&
        Objects.equals(this.bankCode, bankBranchSearchRequest.bankCode) &&
        Objects.equals(this.bankName, bankBranchSearchRequest.bankName) &&
        Objects.equals(this.bankBranchName, bankBranchSearchRequest.bankBranchName) &&
        Objects.equals(this.bankBranchAddress, bankBranchSearchRequest.bankBranchAddress) &&
        Objects.equals(this.branchIdentifier, bankBranchSearchRequest.branchIdentifier) &&
        Objects.equals(this.noOfResults, bankBranchSearchRequest.noOfResults) &&
        Objects.equals(this.paginationNumber, bankBranchSearchRequest.paginationNumber) &&
        Objects.equals(this.searchFlag, bankBranchSearchRequest.searchFlag) &&
        Objects.equals(this.controlFlag, bankBranchSearchRequest.controlFlag) &&
        Objects.equals(this.reservedParam1, bankBranchSearchRequest.reservedParam1) &&
        Objects.equals(this.reservedParam2, bankBranchSearchRequest.reservedParam2) &&
        Objects.equals(this.reservedParam3, bankBranchSearchRequest.reservedParam3) &&
        Objects.equals(this.reservedParam4, bankBranchSearchRequest.reservedParam4) &&
        Objects.equals(this.reservedParam5, bankBranchSearchRequest.reservedParam5) &&
        Objects.equals(this.reservedParam6, bankBranchSearchRequest.reservedParam6) &&
        Objects.equals(this.reservedParam7, bankBranchSearchRequest.reservedParam7) &&
        Objects.equals(this.reservedParam8, bankBranchSearchRequest.reservedParam8) &&
        Objects.equals(this.reservedParam9, bankBranchSearchRequest.reservedParam9) &&
        Objects.equals(this.reservedParam10, bankBranchSearchRequest.reservedParam10);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, bankCode, bankName, bankBranchName, bankBranchAddress, branchIdentifier, noOfResults, paginationNumber, searchFlag, controlFlag, reservedParam1, reservedParam2, reservedParam3, reservedParam4, reservedParam5, reservedParam6, reservedParam7, reservedParam8, reservedParam9, reservedParam10);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankBranchSearchRequest {\n");
    
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    bankBranchName: ").append(toIndentedString(bankBranchName)).append("\n");
    sb.append("    bankBranchAddress: ").append(toIndentedString(bankBranchAddress)).append("\n");
    sb.append("    branchIdentifier: ").append(toIndentedString(branchIdentifier)).append("\n");
    sb.append("    noOfResults: ").append(toIndentedString(noOfResults)).append("\n");
    sb.append("    paginationNumber: ").append(toIndentedString(paginationNumber)).append("\n");
    sb.append("    searchFlag: ").append(toIndentedString(searchFlag)).append("\n");
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

