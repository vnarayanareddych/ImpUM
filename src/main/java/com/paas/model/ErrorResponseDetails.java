package com.paas.model;

import java.util.Date;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModel;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.paas.model.ServerResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;



/**
 * Response parameters for PaymentCalculator service.
 */
@ApiModel(description = "Response parameters for PaymentCalculator service.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-08T15:55:28.806+05:30")

@JsonIgnoreProperties(ignoreUnknown = true)

public class ErrorResponseDetails {
 
  @JsonProperty("serverResponse")
  private ServerResponse serverResponse = null;
  
  public ErrorResponseDetails serverResponse(ServerResponse serverResponse) {
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


}