package com.paas.dao;

import com.paas.dto.PaymentCalculatorDTO;
import com.paas.model.PaymentCalculatorRequest;

public interface PaymentCalculatorDAO {

	public PaymentCalculatorDTO doPaymentCalculation(String instrumentType,
			PaymentCalculatorRequest request);
}
