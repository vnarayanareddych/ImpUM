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
 * TransactionStatus
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-10T18:11:07.886+05:30")

public class TransactionStatus   {
  @JsonProperty("txnStatusCode")
  private String txnStatusCode = null;

  @JsonProperty("txnStatusDescription")
  private String txnStatusDescription = null;

  @JsonProperty("recordGMTDate")
  private String recordGMTDate = null;

  @JsonProperty("userID")
  private String userID = null;

  public TransactionStatus txnStatusCode(String txnStatusCode) {
    this.txnStatusCode = txnStatusCode;
    return this;
  }

  /**
   * Get txnStatusCode
   * @return txnStatusCode
  **/
  @ApiModelProperty(value = "")


  public String getTxnStatusCode() {
    return txnStatusCode;
  }

  public void setTxnStatusCode(String txnStatusCode) {
    this.txnStatusCode = txnStatusCode;
  }

  public TransactionStatus txnStatusDescription(String txnStatusDescription) {
    this.txnStatusDescription = txnStatusDescription;
    return this;
  }

  /**
   * Get txnStatusDescription
   * @return txnStatusDescription
  **/
  @ApiModelProperty(value = "")


  public String getTxnStatusDescription() {
    return txnStatusDescription;
  }

  public void setTxnStatusDescription(String txnStatusDescription) {
    this.txnStatusDescription = txnStatusDescription;
  }

  public TransactionStatus recordGMTDate(String recordGMTDate) {
    this.recordGMTDate = recordGMTDate;
    return this;
  }

  /**
   * Get recordGMTDate
   * @return recordGMTDate
  **/
  @ApiModelProperty(value = "")


  public String getRecordGMTDate() {
    return recordGMTDate;
  }

  public void setRecordGMTDate(String recordGMTDate) {
    this.recordGMTDate = recordGMTDate;
  }

  public TransactionStatus userID(String userID) {
    this.userID = userID;
    return this;
  }

  /**
   * Get userID
   * @return userID
  **/
  @ApiModelProperty(value = "")


  public String getUserID() {
    return userID;
  }

  public void setUserID(String userID) {
    this.userID = userID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionStatus transactionStatus = (TransactionStatus) o;
    return Objects.equals(this.txnStatusCode, transactionStatus.txnStatusCode) &&
        Objects.equals(this.txnStatusDescription, transactionStatus.txnStatusDescription) &&
        Objects.equals(this.recordGMTDate, transactionStatus.recordGMTDate) &&
        Objects.equals(this.userID, transactionStatus.userID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(txnStatusCode, txnStatusDescription, recordGMTDate, userID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionStatus {\n");
    
    sb.append("    txnStatusCode: ").append(toIndentedString(txnStatusCode)).append("\n");
    sb.append("    txnStatusDescription: ").append(toIndentedString(txnStatusDescription)).append("\n");
    sb.append("    recordGMTDate: ").append(toIndentedString(recordGMTDate)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
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

