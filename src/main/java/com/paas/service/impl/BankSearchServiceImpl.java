package com.paas.service.impl;

import static com.paas.constants.PaasConstants.BANK_SEARCH_SERVICE_STATUS;
import static com.paas.constants.PaasConstants.EMPTY_STRING;
import static com.paas.constants.PaasConstants.QUESTION_MARK;
import static com.paas.constants.PaasConstants.RESPONSE_INTERNAL_ERR;
import static com.paas.constants.PaasConstants.SUCCESS_CODE;
import static com.paas.constants.PaasConstants.SUCCESS_NO_RECORDS;
import static com.paas.constants.PaasConstants.SUCCESS_SUBCODE;
import static com.paas.constants.PaasConstants.SUB_STATUS_CODE;
import static com.paas.utils.PaasFormatter.removeBankSearchSpecialChar;
import static com.paas.utils.PaasUtils.authenticateAgent;
import static com.paas.utils.PaasUtils.getServerResponse;
import static com.paas.utils.PaasUtils.httpPost;
import static com.paas.utils.PaasUtils.restrictParamLength;
import static com.paas.utils.RequestValidator.setDefaultValuesForReservedParams;
import static com.paas.utils.RequestValidator.validateBankSearchRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.paas.dto.BankDTO;
import com.paas.model.Bank;
import com.paas.model.BankSearchRequest;
import com.paas.model.BankSearchResponse;
import com.paas.model.ServerResponse;
import com.paas.service.AuthenticationService;
import com.paas.service.BankSearchService;

@Service
public class BankSearchServiceImpl implements BankSearchService {

	private static final Logger log = LoggerFactory.getLogger(BankSearchServiceImpl.class);

	@Autowired
	public Environment props;

	@Autowired
	private AuthenticationService authenticationService;
	
	@Override
	public ResponseEntity<BankSearchResponse> doBankSearch(BankSearchRequest bankSearchRequest, String agentCode)
			throws Exception {
		BankSearchResponse bankSearchResponse = null;
		ServerResponse serverResponse = null;
		List<BankDTO> bankList = null;
		List<Bank> bankDetailsList = null;
		String subStatusCode = "";
		String subStatusDesc = "";
		String response = "";
		String queryString = "";
		String httpURL = "";
		String bankCountry = "";
		String bankName = "";
		int noOfResults = 100;
		int paginationNumber = 1;
		int controlFlag = 1;
		int startFrom = 0;
		String ssPrefix = "ssPrefixBankSearch";
		ObjectMapper objectMapper = new ObjectMapper();

		subStatusCode = Optional.ofNullable(authenticateAgent(authenticationService, agentCode, BANK_SEARCH_SERVICE_STATUS, props)
				.get(SUB_STATUS_CODE)).orElse(EMPTY_STRING);
		
		if (SUCCESS_CODE.equalsIgnoreCase(subStatusCode)) {

			subStatusCode = validateBankSearchRequest(bankSearchRequest);

			if (SUCCESS_CODE.equalsIgnoreCase(subStatusCode)) {
				
				bankList = new ArrayList<BankDTO>();
				httpURL = props.getProperty("beneBankSearch");
				queryString = "select?q=";
				bankCountry = bankSearchRequest.getCountry().trim().toUpperCase();
				bankName = Optional.ofNullable(bankSearchRequest.getBankName()).orElse(EMPTY_STRING).trim()
						.toUpperCase().replace(QUESTION_MARK, EMPTY_STRING);
				noOfResults = Optional.ofNullable(bankSearchRequest.getNoOfResults()).orElse(0) != 0
						? bankSearchRequest.getNoOfResults() : 100;
				paginationNumber = Optional.ofNullable(bankSearchRequest.getPaginationNumber()).orElse(0) != 0
						? bankSearchRequest.getPaginationNumber() : 1;
				controlFlag = Optional.ofNullable(bankSearchRequest.getControlFlag()).orElse(controlFlag);
				startFrom = paginationNumber == 2 ? noOfResults : paginationNumber > 2 
						? (noOfResults * (paginationNumber - 1)) : 0;

				if (bankName.trim().length() > 0) {
					queryString = queryString + "bankName:*" + removeBankSearchSpecialChar(bankName);
				}
				if (bankCountry.trim().length() > 0) {
					queryString = queryString + "+bankCountryCode:" + bankCountry;
				}
				queryString = queryString + "&start=" + startFrom + "&wt=json&rows=" + noOfResults;

				log.info(bankSearchRequest + "\nURL:\t" + httpURL + queryString);

				response = httpPost(httpURL + queryString, "", "");

				JsonNode json = objectMapper.readTree(response);
				JsonNode json1 = json.get("response");
				TypeFactory typeFactory = objectMapper.getTypeFactory();
				bankList = objectMapper.readValue(json1.get("docs").toString(),
						typeFactory.constructCollectionType(List.class, BankDTO.class));
				bankList.removeIf(list -> (Integer.valueOf(list.getBankStatus()) & 1073741824) != 0);

				bankDetailsList = bankList.stream().filter(Objects::nonNull)
						.map(bankListDTO -> new Bank()
								.bankCode(restrictParamLength(
										Optional.ofNullable(bankListDTO.getBankCode()).orElse(EMPTY_STRING), 12))
								.bankName(restrictParamLength(
										Optional.ofNullable(bankListDTO.getBankName()).orElse(EMPTY_STRING), 60)))
						.collect(Collectors.toList());

				bankSearchResponse = new BankSearchResponse();

				bankSearchResponse.setBankList(Optional.ofNullable(bankDetailsList).orElse(new ArrayList<Bank>()));

				subStatusCode = bankDetailsList.size() > 0 ? SUCCESS_SUBCODE : SUCCESS_NO_RECORDS;

				bankSearchResponse = setDefaultValuesForReservedParams(bankSearchResponse);

			}
			
		}
		
		serverResponse = getServerResponse(subStatusCode, subStatusDesc, ssPrefix, props);

		bankSearchResponse = Optional.ofNullable(bankSearchResponse).orElse(new BankSearchResponse());

		bankSearchResponse.setServerResponse(Optional.ofNullable(serverResponse).orElse(RESPONSE_INTERNAL_ERR));

		return new ResponseEntity<BankSearchResponse>(bankSearchResponse, subStatusCode.equals(SUCCESS_CODE) ? HttpStatus.OK : HttpStatus.BAD_REQUEST);
	}

}
