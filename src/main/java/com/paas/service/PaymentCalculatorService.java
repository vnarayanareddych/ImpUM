package com.paas.service;

import org.springframework.http.ResponseEntity;
import com.paas.model.PaymentCalculatorRequest;
import com.paas.model.PaymentCalculatorResponse;

public interface PaymentCalculatorService {

	public ResponseEntity<PaymentCalculatorResponse> doPaymentCalculation(PaymentCalculatorRequest paymentCalculatorRequest, String agentCode) throws Exception;
}
