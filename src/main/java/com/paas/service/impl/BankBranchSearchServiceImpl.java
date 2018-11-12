package com.paas.service.impl;

import static com.paas.constants.PaasConstants.BANK_BRANCH_SEARCH_SERVICE_STATUS;
import static com.paas.constants.PaasConstants.EMPTY_STRING;
import static com.paas.constants.PaasConstants.QUESTION_MARK;
import static com.paas.constants.PaasConstants.RESPONSE_INTERNAL_ERR;
import static com.paas.constants.PaasConstants.SUB_STATUS_CODE;
import static com.paas.constants.PaasConstants.SUCCESS_CODE;
import static com.paas.constants.PaasConstants.SUCCESS_NO_RECORDS;
import static com.paas.constants.PaasConstants.SUCCESS_SUBCODE;
import static com.paas.utils.PaasFormatter.removeBankSearchSpecialChar;
import static com.paas.utils.PaasUtils.authenticateAgent;
import static com.paas.utils.PaasUtils.getServerResponse;
import static com.paas.utils.PaasUtils.httpPost;
import static com.paas.utils.PaasUtils.restrictParamLength;
import static com.paas.utils.RequestValidator.setDefaultValuesForReservedParams;
import static com.paas.utils.RequestValidator.validateBankBranchSearchRequest;

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
import com.paas.dto.BankBranchDTO;
import com.paas.model.BankBranch;
import com.paas.model.BankBranchSearchRequest;
import com.paas.model.BankBranchSearchResponse;
import com.paas.model.ServerResponse;
import com.paas.service.AuthenticationService;
import com.paas.service.BankBranchSearchService;

@Service
public class BankBranchSearchServiceImpl implements BankBranchSearchService {

	private static final Logger log = LoggerFactory.getLogger(BankBranchSearchServiceImpl.class);

	@Autowired
	private Environment props;

	@Autowired
	private AuthenticationService authenticationService;

	@Override
	public ResponseEntity<BankBranchSearchResponse> doBankBranchSearch(BankBranchSearchRequest bankBranchSearchRequest,
			String agentCode) throws Exception {
		BankBranchSearchResponse bankBranchSearchResponse = null;
		ServerResponse serverResponse = null;
		List<BankBranchDTO> bankBranchList = null;
		List<BankBranch> bankBranchDetailsList = null;
		BankBranch bankBranchDetails = null;
		String subStatusCode = "";
		String subStatusDesc = "";
		String response = "";
		String queryString = "";
		String httpURL = "";
		String bankCountry = "";
		String bankCode = "";
		String bankName = "";
		String bankBranchName = "";
		String bankBranchAddress = "";
		String branchIdentifier = "";
		int noOfResults = 100;
		int paginationNumber = 1;
		int searchFlag = 1;
		int controlFlag = 1;
		int startFrom = 0;
		String sendingAgentCode = "";
		String ssPrefix = "ssPrefixBankBranchSearch";
		ObjectMapper objectMapper = new ObjectMapper();

		subStatusCode = Optional.ofNullable(authenticateAgent(authenticationService, agentCode, BANK_BRANCH_SEARCH_SERVICE_STATUS, props)
				.get(SUB_STATUS_CODE)).orElse(EMPTY_STRING);

		if (SUCCESS_CODE.equalsIgnoreCase(subStatusCode)) {

			subStatusCode = validateBankBranchSearchRequest(bankBranchSearchRequest);

			if (SUCCESS_CODE.equalsIgnoreCase(subStatusCode)) {
				serverResponse = new ServerResponse();

				queryString = "select?q=";
				httpURL = props.getProperty("beneBankBranchSearch");
				bankCountry = bankBranchSearchRequest.getCountry().trim().toUpperCase();
				bankBranchName = Optional.ofNullable(bankBranchSearchRequest.getBankBranchName()).orElse(EMPTY_STRING)
						.trim().toUpperCase().replace(QUESTION_MARK, EMPTY_STRING);
				bankBranchAddress = Optional.ofNullable(bankBranchSearchRequest.getBankBranchAddress())
						.orElse(EMPTY_STRING).trim().toUpperCase().replace(QUESTION_MARK, EMPTY_STRING);
				branchIdentifier = Optional.ofNullable(bankBranchSearchRequest.getBranchIdentifier())
						.orElse(EMPTY_STRING);
				bankName = Optional.ofNullable(bankBranchSearchRequest.getBankName()).orElse(EMPTY_STRING).trim()
						.toUpperCase().replace(QUESTION_MARK, EMPTY_STRING);
				bankCode = Optional.ofNullable(bankBranchSearchRequest.getBankCode()).orElse(EMPTY_STRING).trim()
						.toUpperCase().replace(QUESTION_MARK, EMPTY_STRING);
				bankCode = bankCode != null && bankCode.trim().length() > 0 ? bankCode.substring(0, 5).toUpperCase()
						: EMPTY_STRING;
				noOfResults = bankBranchSearchRequest.getNoOfResults() != 0 ? bankBranchSearchRequest.getNoOfResults()
						: 100;
				paginationNumber = bankBranchSearchRequest.getPaginationNumber() != 0
						? bankBranchSearchRequest.getPaginationNumber()
						: 1;

				startFrom = paginationNumber == 2 ? noOfResults
						: paginationNumber > 2 ? (noOfResults * (paginationNumber - 1)) : 0;

				searchFlag = bankBranchSearchRequest.getSearchFlag() != 0 ? bankBranchSearchRequest.getSearchFlag() : 1;
				controlFlag = bankBranchSearchRequest.getControlFlag() != 0 ? bankBranchSearchRequest.getControlFlag()
						: 1;

				if (null != bankCode && bankCode.trim().length() > 0) {
					queryString = queryString + "bankCode:*" + removeBankSearchSpecialChar(bankCode);
				}
				if (null != bankName && bankName.trim().length() > 0) {
					queryString = queryString + "+bankName:*" + removeBankSearchSpecialChar(bankName);
				}
				if (null != bankCountry && bankCountry.trim().length() > 0) {
					queryString = queryString + "+bankCountryCode:" + bankCountry;
				}
				if (null != bankBranchName && bankBranchName.trim().length() > 0) {
					queryString = queryString + "+bankBranchName:*" + removeBankSearchSpecialChar(bankBranchName);
				}

				if (null != bankBranchAddress && bankBranchAddress.trim().length() > 0) {
					queryString = queryString + "+bankBranchAddressIndex:*"
							+ removeBankSearchSpecialChar(bankBranchAddress);
				}
				if (null != sendingAgentCode && sendingAgentCode.trim().length() > 0) {
					queryString = queryString + "+sendingAgentCode:*" + sendingAgentCode;
				}

				if (null != branchIdentifier && branchIdentifier.trim().length() > 0) {
					queryString = queryString + "+(bankBranchSwiftCode1:" + branchIdentifier.replaceAll(" ", "*")
							+ "*+OR+bankBranchSwiftCode2:" + branchIdentifier.replaceAll(" ", "*")
							+ "*+OR+bankBranchSortCode:" + branchIdentifier.replaceAll(" ", "*") + "*";
					queryString = queryString + "+OR+bankBranchID:" + branchIdentifier.replaceAll(" ", "*") + "*)";
				}
				queryString = queryString + "&start=" + startFrom + "&wt=json&rows=" + noOfResults;

				log.info("Url request for Solr bank branch search : " + httpURL + queryString);
				response = httpPost(httpURL + queryString, "", "");

				JsonNode json = objectMapper.readTree(response);
				JsonNode json1 = json.get("response");
				TypeFactory typeFactory = objectMapper.getTypeFactory();
				bankBranchList = objectMapper.readValue(json1.get("docs").toString(),
						typeFactory.constructCollectionType(List.class, BankBranchDTO.class));
				bankBranchList.removeIf(list -> (list.getBankBranchStatus() & 1073741824) != 0);
				bankBranchList.removeIf(list -> (list.getDraweeBankBranchStatus() & 1073741824) != 0);
				bankBranchList.removeIf(list -> (list.getBankStatus() & 1073741824) != 0);

				bankBranchDetailsList = bankBranchList.stream().filter(Objects::nonNull)
						.map(bankBranchListDTO -> new BankBranch()
								.bankCode(restrictParamLength(
										Optional.ofNullable(bankBranchListDTO.getBankCode()).orElse(EMPTY_STRING), 12))
								.bankName(restrictParamLength(
										Optional.ofNullable(bankBranchListDTO.getBankName()).orElse(EMPTY_STRING), 60))
								.bankBranchCode(restrictParamLength(
										Optional.ofNullable(bankBranchListDTO.getBankBranchCode()).orElse(EMPTY_STRING),
										12))
								.bankBranchName(restrictParamLength(
										Optional.ofNullable(bankBranchListDTO.getBankBranchName()).orElse(EMPTY_STRING),
										60))
								.bankBranchAddress(restrictParamLength(Optional
										.ofNullable(bankBranchListDTO.getBankBranchAddress()).orElse(EMPTY_STRING),
										120))
								.bankBranchCity(restrictParamLength(
										Optional.ofNullable(bankBranchListDTO.getBankBranchCity()).orElse(EMPTY_STRING),
										60))
								.bankBranchState(restrictParamLength(Optional
										.ofNullable(bankBranchListDTO.getBankBranchState()).orElse(EMPTY_STRING), 60))
								.bankBranchPOBox(restrictParamLength(Optional
										.ofNullable(bankBranchListDTO.getBankBranchPOBox()).orElse(EMPTY_STRING), 10))
								.bankBranchCountryCode(restrictParamLength(Optional
										.ofNullable(bankBranchListDTO.getBankBranchCountryCode()).orElse(EMPTY_STRING),
										2))
								.bankBranchAddressZip(restrictParamLength(Optional
										.ofNullable(bankBranchListDTO.getBankBranchAddressZip()).orElse(EMPTY_STRING),
										15))
								.bankBranchPhone(restrictParamLength(Optional
										.ofNullable(bankBranchListDTO.getBankBranchPhone()).orElse(EMPTY_STRING), 40))
								.bankBranchFax(restrictParamLength(
										Optional.ofNullable(bankBranchListDTO.getBankBranchFax()).orElse(EMPTY_STRING),
										40))
								.bankBranchEmail(restrictParamLength(Optional
										.ofNullable(bankBranchListDTO.getBankBranchEmail()).orElse(EMPTY_STRING), 60))
								.bankBranchIdentifier1(restrictParamLength(Optional
										.ofNullable(bankBranchListDTO.getBankBranchIdentifier1()).orElse(EMPTY_STRING),
										25))
								.bankBranchIdentifier2(restrictParamLength(Optional
										.ofNullable(bankBranchListDTO.getBankBranchIdentifier2()).orElse(EMPTY_STRING),
										25)))
						.collect(Collectors.toList());

				bankBranchSearchResponse = new BankBranchSearchResponse();

				bankBranchSearchResponse.setBankBranchList(
						Optional.ofNullable(bankBranchDetailsList).orElse(new ArrayList<BankBranch>()));

				subStatusCode = bankBranchDetailsList.size() > 0 ? SUCCESS_SUBCODE : SUCCESS_NO_RECORDS;

				bankBranchSearchResponse = setDefaultValuesForReservedParams(bankBranchSearchResponse);

			}

		}

		serverResponse = getServerResponse(subStatusCode, subStatusDesc, ssPrefix, props);

		bankBranchSearchResponse = Optional.ofNullable(bankBranchSearchResponse).orElse(new BankBranchSearchResponse());

		bankBranchSearchResponse.setServerResponse(Optional.ofNullable(serverResponse).orElse(RESPONSE_INTERNAL_ERR));

		return new ResponseEntity<BankBranchSearchResponse>(bankBranchSearchResponse, subStatusCode.equals(SUCCESS_CODE) ? HttpStatus.OK : HttpStatus.BAD_REQUEST);

	}

}
