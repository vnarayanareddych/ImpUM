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
 * ChargesInfo
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-17T16:02:44.569+05:30")

public class ChargesInfo   {
  @JsonProperty("chargeType")
  private String chargeType = null;

  @JsonProperty("chargeAmount")
  private Double chargeAmount = null;

  public ChargesInfo chargeType(String chargeType) {
    this.chargeType = chargeType;
    return this;
  }

  /**
   * Get chargeType
   * @return chargeType
  **/
  @ApiModelProperty(value = "")


  public String getChargeType() {
    return chargeType;
  }

  public void setChargeType(String chargeType) {
    this.chargeType = chargeType;
  }

  public ChargesInfo chargeAmount(Double chargeAmount) {
    this.chargeAmount = chargeAmount;
    return this;
  }

  /**
   * Get chargeAmount
   * @return chargeAmount
  **/
  @ApiModelProperty(value = "")


  public Double getChargeAmount() {
    return chargeAmount;
  }

  public void setChargeAmount(Double chargeAmount) {
    this.chargeAmount = chargeAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChargesInfo chargesInfo = (ChargesInfo) o;
    return Objects.equals(this.chargeType, chargesInfo.chargeType) &&
        Objects.equals(this.chargeAmount, chargesInfo.chargeAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeType, chargeAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChargesInfo {\n");
    
    sb.append("    chargeType: ").append(toIndentedString(chargeType)).append("\n");
    sb.append("    chargeAmount: ").append(toIndentedString(chargeAmount)).append("\n");
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

