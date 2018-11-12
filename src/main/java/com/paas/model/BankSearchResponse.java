package com.paas.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Response parameters for Bank search service.
 */
@ApiModel(description = "Response parameters for Bank search service.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-16T10:50:16.108+05:30")
@JsonInclude(Include.NON_NULL)
public class BankSearchResponse   {
  @JsonProperty("serverResponse")
  private ServerResponse serverResponse = null;

  @JsonProperty("bankList")
  @Valid
  private List<Bank> bankList = null;

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

  public BankSearchResponse serverResponse(ServerResponse serverResponse) {
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

  public BankSearchResponse bankList(List<Bank> bankList) {
    this.bankList = bankList;
    return this;
  }

  public BankSearchResponse addBankListItem(Bank bankListItem) {
    if (this.bankList == null) {
      this.bankList = new ArrayList<Bank>();
    }
    this.bankList.add(bankListItem);
    return this;
  }

  /**
   * Get bankList
   * @return bankList
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Bank> getBankList() {
    return bankList;
  }

  public void setBankList(List<Bank> bankList) {
    this.bankList = bankList;
  }

  public BankSearchResponse reservedParam1(String reservedParam1) {
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

  public BankSearchResponse reservedParam2(String reservedParam2) {
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

  public BankSearchResponse reservedParam3(String reservedParam3) {
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

  public BankSearchResponse reservedParam4(String reservedParam4) {
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

  public BankSearchResponse reservedParam5(String reservedParam5) {
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

  public BankSearchResponse reservedParam6(String reservedParam6) {
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

  public BankSearchResponse reservedParam7(String reservedParam7) {
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

  public BankSearchResponse reservedParam8(String reservedParam8) {
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

  public BankSearchResponse reservedParam9(String reservedParam9) {
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

  public BankSearchResponse reservedParam10(String reservedParam10) {
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
    BankSearchResponse bankSearchResponse = (BankSearchResponse) o;
    return Objects.equals(this.serverResponse, bankSearchResponse.serverResponse) &&
        Objects.equals(this.bankList, bankSearchResponse.bankList) &&
        Objects.equals(this.reservedParam1, bankSearchResponse.reservedParam1) &&
        Objects.equals(this.reservedParam2, bankSearchResponse.reservedParam2) &&
        Objects.equals(this.reservedParam3, bankSearchResponse.reservedParam3) &&
        Objects.equals(this.reservedParam4, bankSearchResponse.reservedParam4) &&
        Objects.equals(this.reservedParam5, bankSearchResponse.reservedParam5) &&
        Objects.equals(this.reservedParam6, bankSearchResponse.reservedParam6) &&
        Objects.equals(this.reservedParam7, bankSearchResponse.reservedParam7) &&
        Objects.equals(this.reservedParam8, bankSearchResponse.reservedParam8) &&
        Objects.equals(this.reservedParam9, bankSearchResponse.reservedParam9) &&
        Objects.equals(this.reservedParam10, bankSearchResponse.reservedParam10);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serverResponse, bankList, reservedParam1, reservedParam2, reservedParam3, reservedParam4, reservedParam5, reservedParam6, reservedParam7, reservedParam8, reservedParam9, reservedParam10);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankSearchResponse {\n");
    
    sb.append("    serverResponse: ").append(toIndentedString(serverResponse)).append("\n");
    sb.append("    bankList: ").append(toIndentedString(bankList)).append("\n");
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

