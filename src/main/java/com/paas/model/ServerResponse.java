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
 * Server response parameters for PAAS API services.
 */
@ApiModel(description = "Server response parameters for PAAS API services.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-05T14:50:25.040+05:30")

public class ServerResponse   {
  @JsonProperty("responseCode")
  private String responseCode = null;

  @JsonProperty("responseReason")
  private String responseReason = null;

  @JsonProperty("subStatusCode")
  private String subStatusCode = null;

  @JsonProperty("subStatusDescription")
  private String subStatusDescription = null;
  
  public ServerResponse responseCode(String responseCode) {
    this.responseCode = responseCode;
    return this;
  }

  /**
   * Get responseCode
   * @return responseCode
  **/
  @ApiModelProperty(value = "")


  public String getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

  public ServerResponse responseReason(String responseReason) {
    this.responseReason = responseReason;
    return this;
  }

  /**
   * Get responseReason
   * @return responseReason
  **/
  @ApiModelProperty(value = "")


  public String getResponseReason() {
    return responseReason;
  }

  public void setResponseReason(String responseReason) {
    this.responseReason = responseReason;
  }

  public ServerResponse subStatusCode(String subStatusCode) {
    this.subStatusCode = subStatusCode;
    return this;
  }

  /**
   * Get subStatusCode
   * @return subStatusCode
  **/
  @ApiModelProperty(value = "")


  public String getSubStatusCode() {
    return subStatusCode;
  }

  public void setSubStatusCode(String subStatusCode) {
    this.subStatusCode = subStatusCode;
  }

  public ServerResponse subStatusDescription(String subStatusDescription) {
    this.subStatusDescription = subStatusDescription;
    return this;
  }

  /**
   * Get subStatusDescription
   * @return subStatusDescription
  **/
  @ApiModelProperty(value = "")


  public String getSubStatusDescription() {
    return subStatusDescription;
  }

  public void setSubStatusDescription(String subStatusDescription) {
    this.subStatusDescription = subStatusDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServerResponse serverResponse = (ServerResponse) o;
    return Objects.equals(this.responseCode, serverResponse.responseCode) &&
        Objects.equals(this.responseReason, serverResponse.responseReason) &&
        Objects.equals(this.subStatusCode, serverResponse.subStatusCode) &&
        Objects.equals(this.subStatusDescription, serverResponse.subStatusDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseCode, responseReason, subStatusCode, subStatusDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServerResponse {\n");
    
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    responseReason: ").append(toIndentedString(responseReason)).append("\n");
    sb.append("    subStatusCode: ").append(toIndentedString(subStatusCode)).append("\n");
    sb.append("    subStatusDescription: ").append(toIndentedString(subStatusDescription)).append("\n");
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

