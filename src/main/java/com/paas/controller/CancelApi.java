/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (2.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.paas.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.paas.model.CancelTransactionRequest;
import com.paas.model.CancelTransactionResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-10T17:06:02.753+05:30")

@Api(value = "cancel", description = "the cancel API")
public interface CancelApi {

    @ApiOperation(value = "", nickname = "doCancelTxn", notes = "To cancel the transaction", response = CancelTransactionResponse.class, tags={ "CancellationRequest", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Cancellation response, with proper description.", response = CancelTransactionResponse.class),
        @ApiResponse(code = 404, message = "The requested resource was not found.") })
    @RequestMapping(value = "/cancelTransaction",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<CancelTransactionResponse> doCancelTxn(@ApiParam(value = "Bank Search request input parameters" ,required=true )  @Valid @RequestBody CancelTransactionRequest bankSearchRequest);

}
