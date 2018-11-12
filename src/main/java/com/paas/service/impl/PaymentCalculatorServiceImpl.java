package com.paas.service.impl;

import static com.paas.constants.PaasConstants.PAYMENT_CALCULATOR_SERVICE_STATUS;
import static com.paas.constants.PaasConstants.CHARGES_TYPES;
import static com.paas.constants.PaasConstants.COMMA_SEPERATOR;
import static com.paas.constants.PaasConstants.LINE_SPACE;
import static com.paas.constants.PaasConstants.RESPONSE_INTERNAL_ERR;
import static com.paas.constants.PaasConstants.SUCCESS_CODE;
import static com.paas.constants.PaasConstants.SUCCESS_SUBCODE;
import static com.paas.constants.PaasConstants.SUB_STATUS_CODE;
import static com.paas.constants.PaasConstants.EMPTY_STRING;
import static com.paas.utils.PaasDataMapping.getInstrumentType;
import static com.paas.utils.PaasUtils.authenticateAgent;
import static com.paas.utils.PaasUtils.getServerResponse;
import static com.paas.utils.RequestValidator.setDefaultValuesForPaymentCalculatorRequest;
import static com.paas.utils.RequestValidator.validatePaymentCalculatorRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.paas.dao.PaymentCalculatorDAO;
import com.paas.dto.PaymentCalculatorDTO;
import com.paas.model.ChargesInfo;
import com.paas.model.PaymentCalculatorRequest;
import com.paas.model.PaymentCalculatorResponse;
import com.paas.model.ServerResponse;
import com.paas.service.AuthenticationService;
import com.paas.service.PaymentCalculatorService;

@Service
public class PaymentCalculatorServiceImpl implements PaymentCalculatorService {

	private static final Logger log = LoggerFactory.getLogger(PaymentCalculatorServiceImpl.class);

	@Autowired
	private Environment props;

	@Autowired
	private PaymentCalculatorDAO paymentCalculatorDAO;

	@Autowired
	private AuthenticationService authenticationService;

	@Override
	public ResponseEntity<PaymentCalculatorResponse> doPaymentCalculation(
			PaymentCalculatorRequest paymentCalculatorRequest, String agentCode) throws Exception {
		PaymentCalculatorDTO response = null;
		PaymentCalculatorResponse paymentCalculatorResponse = null;
		ServerResponse serverResponse = null;
		String subStatusCode = "";
		String subStatusDesc = "";
		String ssPrefix = "ssPrefixRateCal";
		List<ChargesInfo> chargesList = null;
		String jsonResponse = "";
		ObjectMapper objectMapper = new ObjectMapper();
		String[] chargesType = props.getProperty(CHARGES_TYPES).split(COMMA_SEPERATOR);

		paymentCalculatorResponse = new PaymentCalculatorResponse();

		subStatusCode = Optional.ofNullable(authenticateAgent(authenticationService, agentCode, PAYMENT_CALCULATOR_SERVICE_STATUS, props)
				.get(SUB_STATUS_CODE)).orElse(EMPTY_STRING);

		if (SUCCESS_CODE.equalsIgnoreCase(subStatusCode)) {

			paymentCalculatorRequest = setDefaultValuesForPaymentCalculatorRequest(paymentCalculatorRequest, props);

			subStatusCode = validatePaymentCalculatorRequest(paymentCalculatorRequest, props);

			if (SUCCESS_CODE.equalsIgnoreCase(subStatusCode)) {

				String jsonRequest = objectMapper.writerWithDefaultPrettyPrinter()
						.writeValueAsString(paymentCalculatorRequest);

				log.info(" Request to Payment Calculator API for PayinCcyCode : "
						+ paymentCalculatorRequest.getPayinCcyCode() + LINE_SPACE + LINE_SPACE + jsonRequest
						+ LINE_SPACE + LINE_SPACE + "Request Completed to Payment Calculator");

				response = paymentCalculatorDAO.doPaymentCalculation(
						getInstrumentType(paymentCalculatorRequest.getProductType().trim(), props),
						paymentCalculatorRequest);

				jsonResponse = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(response);

				log.info(" Response Received from DataBase to Payment Calculator for PayinCcyCode : "
						+ paymentCalculatorRequest.getPayinCcyCode() + LINE_SPACE + LINE_SPACE + jsonResponse
						+ LINE_SPACE + LINE_SPACE + "Response Completed to Payment Calculator");

				if (null != response) {

					chargesList = new ArrayList<ChargesInfo>();
					chargesList.add(new ChargesInfo().chargeType(chargesType[0]).chargeAmount(response.getCommission()));
					chargesList.add(new ChargesInfo().chargeType(chargesType[1]).chargeAmount(response.getTax()));
					chargesList.add(new ChargesInfo().chargeType(chargesType[2]).chargeAmount(response.getCardCharges()));
					chargesList.add(new ChargesInfo().chargeType(chargesType[3]).chargeAmount(response.getAdditionalCharges()));
					chargesList.add(new ChargesInfo().chargeType(chargesType[4]).chargeAmount(response.getOtherCharges()));
					
					jsonResponse = objectMapper.writeValueAsString(response);

					paymentCalculatorResponse = objectMapper.readValue(jsonResponse,
							PaymentCalculatorResponse.class);

					paymentCalculatorResponse
							.setChargesList(Optional.ofNullable(chargesList).orElse(new ArrayList<ChargesInfo>()));

					subStatusCode = SUCCESS_SUBCODE;
					
				}

			}

		}

		serverResponse = getServerResponse(subStatusCode, subStatusDesc, ssPrefix, props);

		paymentCalculatorResponse = Optional.ofNullable(paymentCalculatorResponse).orElse(new PaymentCalculatorResponse());

		paymentCalculatorResponse.setServerResponse(Optional.ofNullable(serverResponse).orElse(RESPONSE_INTERNAL_ERR));
		
		jsonResponse = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(paymentCalculatorResponse);

		log.info(" Payment Calculator API response for PayinCcyCode : "
				+ paymentCalculatorRequest.getPayinCcyCode() + LINE_SPACE + LINE_SPACE + jsonResponse
				+ LINE_SPACE + LINE_SPACE + "Response Completed to Payment Calculator");

		return new ResponseEntity<PaymentCalculatorResponse>(paymentCalculatorResponse,
				subStatusCode.equals(SUCCESS_CODE) ? HttpStatus.OK : HttpStatus.BAD_REQUEST);
	}

}
