/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.paas.controller;

import com.paas.model.PaymentCalculatorRequest;
import com.paas.model.PaymentCalculatorResponse;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-05T19:34:51.520+05:30")

@Api(value = "paymentCalculator", description = "the paymentCalculator API")
public interface PaymentCalculatorApi {

    @ApiOperation(value = "", nickname = "doPaymentCalculation", notes = "Retrieves Bank Details based on the search criteria", response = PaymentCalculatorResponse.class, tags={ "PaymentCalculator", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response, with a bank branch search request.", response = PaymentCalculatorResponse.class),
        @ApiResponse(code = 404, message = "The requested bank branch was not found.") })
    @RequestMapping(value = "/paymentCalculator",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<PaymentCalculatorResponse> doPaymentCalculation(@ApiParam(value = "Bank Branch Search request input parameters" ,required=true )  @Valid @RequestBody PaymentCalculatorRequest paymentCalculatorRequest) throws Exception;

}