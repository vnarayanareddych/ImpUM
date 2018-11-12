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
 * BankBranch
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-05T14:50:25.040+05:30")

public class BankBranch   {
  @JsonProperty("bankCode")
  private String bankCode = null;

  @JsonProperty("bankName")
  private String bankName = null;

  @JsonProperty("bankBranchCode")
  private String bankBranchCode = null;

  @JsonProperty("bankBranchName")
  private String bankBranchName = null;

  @JsonProperty("bankBranchAddress")
  private String bankBranchAddress = null;

  @JsonProperty("bankBranchCity")
  private String bankBranchCity = null;

  @JsonProperty("bankBranchState")
  private String bankBranchState = null;

  @JsonProperty("bankBranchPOBox")
  private String bankBranchPOBox = null;

  @JsonProperty("bankBranchCountryCode")
  private String bankBranchCountryCode = null;

  @JsonProperty("bankBranchAddressZip")
  private String bankBranchAddressZip = null;

  @JsonProperty("bankBranchPhone")
  private String bankBranchPhone = null;

  @JsonProperty("bankBranchFax")
  private String bankBranchFax = null;

  @JsonProperty("bankBranchEmail")
  private String bankBranchEmail = null;

  @JsonProperty("bankBranchIdentifier1")
  private String bankBranchIdentifier1 = null;

  @JsonProperty("bankBranchIdentifier2")
  private String bankBranchIdentifier2 = null;

  public BankBranch bankCode(String bankCode) {
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

  public BankBranch bankName(String bankName) {
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

  public BankBranch bankBranchCode(String bankBranchCode) {
    this.bankBranchCode = bankBranchCode;
    return this;
  }

  /**
   * Get bankBranchCode
   * @return bankBranchCode
  **/
  @ApiModelProperty(value = "")


  public String getBankBranchCode() {
    return bankBranchCode;
  }

  public void setBankBranchCode(String bankBranchCode) {
    this.bankBranchCode = bankBranchCode;
  }

  public BankBranch bankBranchName(String bankBranchName) {
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

  public BankBranch bankBranchAddress(String bankBranchAddress) {
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

  public BankBranch bankBranchCity(String bankBranchCity) {
    this.bankBranchCity = bankBranchCity;
    return this;
  }

  /**
   * Get bankBranchCity
   * @return bankBranchCity
  **/
  @ApiModelProperty(value = "")


  public String getBankBranchCity() {
    return bankBranchCity;
  }

  public void setBankBranchCity(String bankBranchCity) {
    this.bankBranchCity = bankBranchCity;
  }

  public BankBranch bankBranchState(String bankBranchState) {
    this.bankBranchState = bankBranchState;
    return this;
  }

  /**
   * Get bankBranchState
   * @return bankBranchState
  **/
  @ApiModelProperty(value = "")


  public String getBankBranchState() {
    return bankBranchState;
  }

  public void setBankBranchState(String bankBranchState) {
    this.bankBranchState = bankBranchState;
  }

  public BankBranch bankBranchPOBox(String bankBranchPOBox) {
    this.bankBranchPOBox = bankBranchPOBox;
    return this;
  }

  /**
   * Get bankBranchPOBox
   * @return bankBranchPOBox
  **/
  @ApiModelProperty(value = "")


  public String getBankBranchPOBox() {
    return bankBranchPOBox;
  }

  public void setBankBranchPOBox(String bankBranchPOBox) {
    this.bankBranchPOBox = bankBranchPOBox;
  }

  public BankBranch bankBranchCountryCode(String bankBranchCountryCode) {
    this.bankBranchCountryCode = bankBranchCountryCode;
    return this;
  }

  /**
   * Get bankBranchCountryCode
   * @return bankBranchCountryCode
  **/
  @ApiModelProperty(value = "")


  public String getBankBranchCountryCode() {
    return bankBranchCountryCode;
  }

  public void setBankBranchCountryCode(String bankBranchCountryCode) {
    this.bankBranchCountryCode = bankBranchCountryCode;
  }

  public BankBranch bankBranchAddressZip(String bankBranchAddressZip) {
    this.bankBranchAddressZip = bankBranchAddressZip;
    return this;
  }

  /**
   * Get bankBranchAddressZip
   * @return bankBranchAddressZip
  **/
  @ApiModelProperty(value = "")


  public String getBankBranchAddressZip() {
    return bankBranchAddressZip;
  }

  public void setBankBranchAddressZip(String bankBranchAddressZip) {
    this.bankBranchAddressZip = bankBranchAddressZip;
  }

  public BankBranch bankBranchPhone(String bankBranchPhone) {
    this.bankBranchPhone = bankBranchPhone;
    return this;
  }

  /**
   * Get bankBranchPhone
   * @return bankBranchPhone
  **/
  @ApiModelProperty(value = "")


  public String getBankBranchPhone() {
    return bankBranchPhone;
  }

  public void setBankBranchPhone(String bankBranchPhone) {
    this.bankBranchPhone = bankBranchPhone;
  }

  public BankBranch bankBranchFax(String bankBranchFax) {
    this.bankBranchFax = bankBranchFax;
    return this;
  }

  /**
   * Get bankBranchFax
   * @return bankBranchFax
  **/
  @ApiModelProperty(value = "")


  public String getBankBranchFax() {
    return bankBranchFax;
  }

  public void setBankBranchFax(String bankBranchFax) {
    this.bankBranchFax = bankBranchFax;
  }

  public BankBranch bankBranchEmail(String bankBranchEmail) {
    this.bankBranchEmail = bankBranchEmail;
    return this;
  }

  /**
   * Get bankBranchEmail
   * @return bankBranchEmail
  **/
  @ApiModelProperty(value = "")


  public String getBankBranchEmail() {
    return bankBranchEmail;
  }

  public void setBankBranchEmail(String bankBranchEmail) {
    this.bankBranchEmail = bankBranchEmail;
  }

  public BankBranch bankBranchIdentifier1(String bankBranchIdentifier1) {
    this.bankBranchIdentifier1 = bankBranchIdentifier1;
    return this;
  }

  /**
   * Get bankBranchIdentifier1
   * @return bankBranchIdentifier1
  **/
  @ApiModelProperty(value = "")


  public String getBankBranchIdentifier1() {
    return bankBranchIdentifier1;
  }

  public void setBankBranchIdentifier1(String bankBranchIdentifier1) {
    this.bankBranchIdentifier1 = bankBranchIdentifier1;
  }

  public BankBranch bankBranchIdentifier2(String bankBranchIdentifier2) {
    this.bankBranchIdentifier2 = bankBranchIdentifier2;
    return this;
  }

  /**
   * Get bankBranchIdentifier2
   * @return bankBranchIdentifier2
  **/
  @ApiModelProperty(value = "")


  public String getBankBranchIdentifier2() {
    return bankBranchIdentifier2;
  }

  public void setBankBranchIdentifier2(String bankBranchIdentifier2) {
    this.bankBranchIdentifier2 = bankBranchIdentifier2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankBranch bankBranch = (BankBranch) o;
    return Objects.equals(this.bankCode, bankBranch.bankCode) &&
        Objects.equals(this.bankName, bankBranch.bankName) &&
        Objects.equals(this.bankBranchCode, bankBranch.bankBranchCode) &&
        Objects.equals(this.bankBranchName, bankBranch.bankBranchName) &&
        Objects.equals(this.bankBranchAddress, bankBranch.bankBranchAddress) &&
        Objects.equals(this.bankBranchCity, bankBranch.bankBranchCity) &&
        Objects.equals(this.bankBranchState, bankBranch.bankBranchState) &&
        Objects.equals(this.bankBranchPOBox, bankBranch.bankBranchPOBox) &&
        Objects.equals(this.bankBranchCountryCode, bankBranch.bankBranchCountryCode) &&
        Objects.equals(this.bankBranchAddressZip, bankBranch.bankBranchAddressZip) &&
        Objects.equals(this.bankBranchPhone, bankBranch.bankBranchPhone) &&
        Objects.equals(this.bankBranchFax, bankBranch.bankBranchFax) &&
        Objects.equals(this.bankBranchEmail, bankBranch.bankBranchEmail) &&
        Objects.equals(this.bankBranchIdentifier1, bankBranch.bankBranchIdentifier1) &&
        Objects.equals(this.bankBranchIdentifier2, bankBranch.bankBranchIdentifier2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankCode, bankName, bankBranchCode, bankBranchName, bankBranchAddress, bankBranchCity, bankBranchState, bankBranchPOBox, bankBranchCountryCode, bankBranchAddressZip, bankBranchPhone, bankBranchFax, bankBranchEmail, bankBranchIdentifier1, bankBranchIdentifier2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankBranch {\n");
    
    sb.append("    bankCode: ").append(toIndentedString(bankCode)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    bankBranchCode: ").append(toIndentedString(bankBranchCode)).append("\n");
    sb.append("    bankBranchName: ").append(toIndentedString(bankBranchName)).append("\n");
    sb.append("    bankBranchAddress: ").append(toIndentedString(bankBranchAddress)).append("\n");
    sb.append("    bankBranchCity: ").append(toIndentedString(bankBranchCity)).append("\n");
    sb.append("    bankBranchState: ").append(toIndentedString(bankBranchState)).append("\n");
    sb.append("    bankBranchPOBox: ").append(toIndentedString(bankBranchPOBox)).append("\n");
    sb.append("    bankBranchCountryCode: ").append(toIndentedString(bankBranchCountryCode)).append("\n");
    sb.append("    bankBranchAddressZip: ").append(toIndentedString(bankBranchAddressZip)).append("\n");
    sb.append("    bankBranchPhone: ").append(toIndentedString(bankBranchPhone)).append("\n");
    sb.append("    bankBranchFax: ").append(toIndentedString(bankBranchFax)).append("\n");
    sb.append("    bankBranchEmail: ").append(toIndentedString(bankBranchEmail)).append("\n");
    sb.append("    bankBranchIdentifier1: ").append(toIndentedString(bankBranchIdentifier1)).append("\n");
    sb.append("    bankBranchIdentifier2: ").append(toIndentedString(bankBranchIdentifier2)).append("\n");
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

