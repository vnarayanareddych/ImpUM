package com.paas.utils;

import static com.paas.constants.PaasConstants.AGENT_CODE_EMPTY;
import static com.paas.constants.PaasConstants.AGENT_DISABLE_SUBSTATUSCODE;
import static com.paas.constants.PaasConstants.AGENT_SUBSTATUSCODE;
import static com.paas.constants.PaasConstants.ALPHA_NUMERIC_HASH_REGEX;
import static com.paas.constants.PaasConstants.ALPHA_NUMERIC_REGEX;
import static com.paas.constants.PaasConstants.ALPHA_ONLY_REGEX;
import static com.paas.constants.PaasConstants.AUTHENTICATE_STATUSCODE;
import static com.paas.constants.PaasConstants.AUTHORIZATION_STATUSCODE;
import static com.paas.constants.PaasConstants.BREAK_TAG;
import static com.paas.constants.PaasConstants.COMMA_SEPERATOR;
import static com.paas.constants.PaasConstants.DECIMAL_ONLY_REGEX;
import static com.paas.constants.PaasConstants.DOT_SEPERATOR;
import static com.paas.constants.PaasConstants.EMPTY_SPACES;
import static com.paas.constants.PaasConstants.EMPTY_STRING;
import static com.paas.constants.PaasConstants.ERR;
import static com.paas.constants.PaasConstants.LINE_SPACE;
import static com.paas.constants.PaasConstants.RELEASE_TXN_QUEUE;
import static com.paas.constants.PaasConstants.RESPONSE_INTERNAL_ERR;
import static com.paas.constants.PaasConstants.RESPONSE_SUCCESS;
import static com.paas.constants.PaasConstants.SUCCESS_CODE;
import static com.paas.constants.PaasConstants.TAB_SPACE;
import static com.paas.constants.PaasConstants.VALIDATION_CODE;
import static com.paas.constants.PaasConstants.AUTH_KEY;
import static com.paas.constants.PaasConstants.AGENT_CODE;
import static com.paas.constants.PaasConstants.USER_ID;
import static com.paas.constants.PaasConstants.IP_ADDRESS;
import static com.paas.constants.PaasConstants.AGENT_STATUS;
import static com.paas.constants.PaasConstants.AGENT_STATUS2;
import static com.paas.constants.PaasConstants.ACCESS_FLAG;
import static com.paas.constants.PaasConstants.PAYMENT_MODES;
import static com.paas.constants.PaasConstants.KEY_STATUS;
import static com.paas.constants.PaasConstants.SUB_STATUS_CODE;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.io.Writer;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.jboss.logging.Logger;
import org.springframework.core.env.Environment;
import org.springframework.jms.core.JmsTemplate;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.paas.dto.AuthenticationDTO;
import com.paas.dto.DataPushDTO;
import com.paas.model.ServerResponse;
import com.paas.model.TransactionEnquiryResponse;
import com.paas.model.TransactionStatus;
import com.paas.service.AuthenticationService;

public class PaasUtils {

	private static Logger log = Logger.getLogger(PaasUtils.class.getName());

	private static ServerResponse serverResponse;
	
	public static Object nullCheck(String values, Object defaultValues) {
		return values == null ? defaultValues : values.trim().toString();
	}

	public static String setDefaultValues(String input, String key, Environment props) {
		if (Optional.ofNullable(input).orElse(EMPTY_STRING).isEmpty())
			return props.getProperty(key).trim();
		else
			return input.trim();
	}

	public static ServerResponse getServerResponse(String subStatusCode, String subStatusDesc, String ssPrefix,
			Environment props) {

		String statusCode = "E5555";
		String commonPrefix = "";

		if (subStatusCode.startsWith("V")) {

			statusCode = VALIDATION_CODE;

		} else if (subStatusCode.startsWith("S")) {

			statusCode = SUCCESS_CODE;

		} else if (subStatusCode.startsWith("A")) {

			statusCode = AUTHENTICATE_STATUSCODE;

		} else if (subStatusCode.length() != 5) {
			statusCode = "E0000";
			commonPrefix = "DBError";
		} else {

			ssPrefix = props.getProperty(ssPrefix);
			commonPrefix = getSplitCode(subStatusCode, 3);
			subStatusCode = ssPrefix + getSplitCode(subStatusCode, 2);

			if (subStatusCode.equalsIgnoreCase("E2404"))
				statusCode = "E0000";

			if (statusCode.isEmpty())
				statusCode = ssPrefix + "000";
		}

		return getServerResponse(statusCode, subStatusCode, subStatusDesc, commonPrefix, props);
	}

	public static ServerResponse getServerResponse(String statusCode, String subStatusCode, String responseMessage,
			String commonPrefix, Environment props) {

		String statusDesc = "";
		String subStatusDesc = "";
		String statusCodeTemp = "";
		String prefix = "";

		ServerResponse serverResponse = null;

		statusDesc = props.getProperty(statusCode);
		if (!commonPrefix.equalsIgnoreCase("8")) {
			subStatusDesc = props.getProperty(subStatusCode);
		}

		if (null == subStatusDesc || subStatusDesc == "") {

			prefix = props.getProperty("ssPrefixCommon");
			if (!commonPrefix.equalsIgnoreCase("DBError")) {
				statusCodeTemp = prefix + getSplitCode(subStatusCode, 2);
				subStatusDesc = props.getProperty(statusCodeTemp); // check common error code
				subStatusCode = statusCodeTemp;
			}

		}

		if (null == subStatusDesc || subStatusDesc == "") {
			statusCode = "E0002";
			statusDesc = props.getProperty(statusCode);
			subStatusDesc = removedSpecialCharFromException(responseMessage);
		}

		if (null == statusCode || statusCode == "" || null == statusDesc || statusDesc == "" || null == subStatusCode
				|| subStatusCode == "" || null == subStatusDesc || subStatusDesc == "") {
			System.out.println("Inside empty conditions PaasUtils");
			serverResponse = RESPONSE_INTERNAL_ERR;
		}

		if (null == serverResponse) {
			serverResponse = new ServerResponse().responseCode(restrictParamLength(statusCode, 5))
					.responseReason(restrictParamLength(statusDesc.trim(), 180))
					.subStatusCode(restrictParamLength(subStatusCode, 5))
					.subStatusDescription(restrictParamLength(subStatusDesc.trim(), 180));
		}

		return serverResponse;
	}

	public static String restrictParamLength(String value, Integer maxLength) {
		return value.substring(0, value.length() < maxLength ? value.length() : maxLength).trim();
	}

	public static String getSplitCode(String subStatusCode, int startPoint) {
		String splitCode = "";
		if (startPoint != 3) {
			splitCode = subStatusCode.substring(startPoint, 5).trim();
		} else {
			splitCode = subStatusCode.substring(0, 1).trim();
		}
		return splitCode;
	}

	public static String httpPost(String urlStr, String paramName, String paramVal) throws Exception {

		URL url = new URL(urlStr);
		String line;

		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("POST");
		conn.setDoOutput(true);
		conn.setDoInput(true);
		conn.setUseCaches(false);
		conn.setAllowUserInteraction(false);
		conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		OutputStream out = conn.getOutputStream();
		Writer writer = new OutputStreamWriter(out, "UTF-8");

		writer.write(paramName);
		writer.write("=");
		writer.write(paramVal);
		writer.close();
		out.close();

		BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String responseVal = "";
		while ((line = rd.readLine()) != null) {
			responseVal = responseVal.concat(line);
		}

		rd.close();
		conn.disconnect();
		return responseVal;
	}

	/**
	 * This method Validates for alpha and numeric values
	 */
	public static boolean isAlphaNumeric(String value) {
		return Pattern.compile(ALPHA_NUMERIC_REGEX).matcher(value).matches();
	}

	/**
	 * This method Validates for alphabets, numeric values and '#' tag (Mostly for
	 * Agent Code validation)
	 */
	public static boolean isAlphaNumericWithHash(String value) {
		return Pattern.compile(ALPHA_NUMERIC_HASH_REGEX).matcher(value).matches();
	}

	/**
	 * This method Validates for alphabets alone
	 */
	public static boolean isAlphabet(String value) {
		return Pattern.compile(ALPHA_ONLY_REGEX).matcher(value).matches();
	}

	/**
	 * @description getSQLException
	 * @param exception
	 * @return SQLException
	 */
	public static SQLException getSQLException(Exception exception) {

		if (exception instanceof SQLException) {
			return (SQLException) exception;
		} else if (exception.getCause() instanceof SQLException) {
			return (SQLException) exception.getCause();
		}
		return null;
	}

	/**
	 * 
	 * @param ex
	 * @param codeMessageFlag
	 * @return
	 */
	public static String getDBErrorCodeOrMsg(SQLException ex, boolean codeMessageFlag) {

		String dbErrorCodeOrMsg = null;
		dbErrorCodeOrMsg = String.valueOf(ex.getErrorCode());

		if (codeMessageFlag)
			dbErrorCodeOrMsg = ex.getLocalizedMessage();

		return dbErrorCodeOrMsg;
	}

	/**
	 * 
	 * isExactLength variable checks whether the validate length should be precise
	 * or should be less than given maxLength value isExactLength = true (The given
	 * value should be exact match as maxLength) isExactLength = false (The given
	 * value should be less than the given maxLength)
	 * 
	 */
	public static boolean validateLength(String value, String maxLength, boolean isExactLength) {
		boolean status = false;
		if (isExactLength) {
			if (value.trim().length() != Integer.valueOf(maxLength).intValue()) {
				status = true;
			}
		} else {
			if (value.trim().length() > Integer.valueOf(maxLength).intValue()) {
				status = true;
			}
		}
		return status;
	}

	public static String getRequesterAddress(HttpServletRequest httpRequest) {
		String requesterAddress = "";

		if (httpRequest.getHeader("x-forwarded-for") == null) {
			requesterAddress = httpRequest.getRemoteAddr();
			log.info("Requester remoteAddr info" + requesterAddress);
		} else {
			requesterAddress = httpRequest.getHeader("x-forwarded-for");
			log.info("Requester header info" + requesterAddress);
		}

		return requesterAddress;
	}

	public static boolean isDecimal(String value) {
		boolean match = Pattern.compile(DECIMAL_ONLY_REGEX).matcher(value).matches();
		if (match) {
			String[] splitter = value.split(DOT_SEPERATOR);
			if (splitter.length > 1) {
				if (splitter[0].length() > 12 || splitter[1].length() > 3) {
					match = false;
				}
			} else if (splitter.length > 0) {
				if (splitter[0].length() > 12) {
					match = false;
				}
			}
		}
		return match;
	}

	public static List<String> getCSVfromPropsFile(String key, Environment props) {
		String value = props.getProperty(key);
		List<String> csvList = new ArrayList<>();
		String seperatedArray[] = value.split(COMMA_SEPERATOR);
		for (int i = 0; i < seperatedArray.length; i++) {
			csvList.add(seperatedArray[i].trim().toUpperCase());
		}
		return csvList;
	}

	public static String removedSpecialCharFromException(String responseMessage) {
		log.info("Exception message from database : " + responseMessage);
		if (responseMessage.contains(ERR)) {
			responseMessage = responseMessage.substring(0, responseMessage.lastIndexOf(ERR));
		}

		return responseMessage.replace(EMPTY_SPACES, EMPTY_STRING).replace(BREAK_TAG, EMPTY_STRING)
				.replaceAll(LINE_SPACE, EMPTY_STRING).replaceAll(TAB_SPACE, EMPTY_STRING);
	}

	public static TransactionEnquiryResponse callReXPIServiceForEnquiry(String requestXmlString, Environment props, TransactionEnquiryResponse txnEnquiryResponse) {
		
		
		serverResponse = null;

		try {
			
			 String responseString = "";
		     String outputString = "";
		     
             String connUrl = props.getProperty("reXPIURL"); 
		     String authKey =  props.getProperty("authKey"); 
		    
		     System.out.println("connUrl => " + connUrl);
		     System.out.println("authKey => " + authKey);
		     
		     URL endpointURL = new URL(connUrl);
		     URLConnection connection = endpointURL.openConnection();
		     HttpURLConnection httpConn = (HttpURLConnection)connection;
		     ByteArrayOutputStream bout = new ByteArrayOutputStream();
		     
		     System.out.println("requestXML:"+requestXmlString);
		     byte[] buffer = new byte[requestXmlString.length()];
		     buffer = requestXmlString.getBytes();
		     bout.write(buffer);
		     byte[] b = bout.toByteArray();
		     
		     System.out.println("TransactionEnq Request XML : " + requestXmlString);
		     
		     httpConn.setRequestProperty("Content-Type","text/xml; charset=utf-8"); 
		     httpConn.setRequestProperty("ReXPI_AUTHENTICATION_KEY",authKey);
		     httpConn.setRequestMethod("POST");
		     httpConn.setDoOutput(true);
		     httpConn.setDoInput(true);
		     OutputStream out = httpConn.getOutputStream();
		     out.write(b);
		     out.close();
		     
		     InputStreamReader isr = new InputStreamReader(
		     httpConn.getInputStream());
		     BufferedReader in = new BufferedReader(isr);
		     
		     while ((responseString = in.readLine()) != null) {
		    	  System.out.println(responseString);
		    	  outputString = outputString + responseString;
		     }
		      
		     log.info("************* Response XML ** : " + outputString);
		      
			 Document document = parseXmlFile(outputString);
			      
	         String respCode = "";
	         String respMsg = ""; 
	         String subStatusCode = "";
	         String subStatusDesc = ""; 
		      
		     NodeList reXPIserverResponse = document.getElementsByTagName("ns3:ServerResp");
		     NodeList TransactionEnq = document.getElementsByTagName("ns3:transactionEnquiryResponse");
		     NodeList transactionStatus = document.getElementsByTagName("ns3:transactionStatus");
			  
			 respCode = reXPIserverResponse.item(0).getChildNodes().item(0).getTextContent(); 
			 respMsg =  reXPIserverResponse.item(0).getChildNodes().item(1).getTextContent();
			 subStatusCode = reXPIserverResponse.item(0).getChildNodes().item(2).getTextContent();
			 subStatusDesc = reXPIserverResponse.item(0).getChildNodes().item(3).getTextContent();
			 
			 System.out.println(" Rexpi Enquiry Response RespCode -> " + respCode + " RespMsg -> " + respMsg + " SubStatusCode -> " + subStatusCode + " SubStatusDesc -> " + subStatusDesc);

			 System.out.println("size"  + transactionStatus.getLength());
			 			 
			 if(respCode.equals("S0000")){		
				
				 for(int i=0; i< TransactionEnq.getLength(); i++){
                      
					 List<TransactionStatus> tslist = new ArrayList<TransactionStatus>();

					  for(int j=0;j<transactionStatus.getLength();j++){
						  TransactionStatus tstatus = new TransactionStatus();
						  tstatus.setTxnStatusCode(transactionStatus.item(j).getChildNodes().item(0).getTextContent());
						  tstatus.setTxnStatusDescription(transactionStatus.item(j).getChildNodes().item(1).getTextContent());
						  tstatus.setRecordGMTDate(transactionStatus.item(j).getChildNodes().item(2).getTextContent());
						  tstatus.setUserID(transactionStatus.item(j).getChildNodes().item(3).getTextContent());
						  tslist.add(tstatus);
					  }
				  
					  txnEnquiryResponse.setTransactionStatusList(tslist);
				 }
			 }
			 
			 if(respCode.equals("E0002")){	
				 List<TransactionStatus> tslist = new ArrayList<TransactionStatus>();
				 TransactionStatus tstatus = new TransactionStatus();
				 tstatus.setRecordGMTDate("Jan 01 1900 00:00:00:000AM");
				 tstatus.setTxnStatusCode("0");
				 tstatus.setUserID("");
				 tstatus.setTxnStatusDescription("");
				 tslist.add(tstatus);
				 txnEnquiryResponse.setTransactionStatusList(tslist);
			 }

		} catch (ConnectException ce) {
			 System.out.println("*** Error in TransactionEnq Connection Failure***" + 
		      ce.getMessage());
			 serverResponse.setResponseCode("ERROR");
			 serverResponse.setResponseReason("ERROR");
		      ce.printStackTrace();
			}catch (NullPointerException ne) {
			   System.out.println("*** Error in TransactionEnq ***" + ne.getMessage());
				 serverResponse.setResponseCode("ERROR");
				 serverResponse.setResponseReason("ERROR");
		       ne.printStackTrace();
			} catch (Exception e) {
	    	   System.out.println("*** Error in TransactionEnq ***" + e.getMessage());
	    	   e.printStackTrace();
	  		  serverResponse.setResponseCode("ERROR");
	  		  serverResponse.setResponseReason("ERROR");
		       e.printStackTrace();
			}

		txnEnquiryResponse.setServerResponse(serverResponse);
		return txnEnquiryResponse;
		
	}
	public static ServerResponse callReXPIService(String requestXmlString, Environment props) {

		String reXPIUrl = props.getProperty("reXPIURL");
		String reXPIAuthenticationKey = props.getProperty("authKey");
		String responseString = "";
		String outputString = "";
		String responseCode = "";
		String responsedesc = "";
		String subStatusCode = "";
		String subStatusDesc = "";
		ServerResponse serverResponse = null;
		try {
			URL endpointURL = new URL(reXPIUrl);
			URLConnection connection = endpointURL.openConnection();
			HttpURLConnection httpConn = (HttpURLConnection) connection;
			ByteArrayOutputStream bout = new ByteArrayOutputStream();
			log.info("ReXPI XML Request :" + requestXmlString);
			byte[] buffer = new byte[requestXmlString.length()];
			buffer = requestXmlString.getBytes();
			bout.write(buffer);
			byte[] b = bout.toByteArray();

			httpConn.setRequestProperty("Content-Type", "text/xml; charset=utf-8");
			httpConn.setRequestProperty("ReXPI_AUTHENTICATION_KEY", reXPIAuthenticationKey);
			httpConn.setRequestMethod("POST");
			httpConn.setDoOutput(true);
			httpConn.setDoInput(true);
			OutputStream out = httpConn.getOutputStream();
			out.write(b);
			out.close();

			InputStreamReader isr = new InputStreamReader(httpConn.getInputStream());
			BufferedReader in = new BufferedReader(isr);

			while ((responseString = in.readLine()) != null) {
				log.info("responseString : ==> " + responseString);
				outputString = outputString + responseString;
			}

			System.out.println("************* Response XML ** : " + outputString);

			out.close();
			httpConn.disconnect();
			isr.close();

			if (null != outputString) {

				Document document = parseXmlFile(outputString);

				NodeList returnCode = document.getElementsByTagName("ns2:responseCode");
				responseCode = returnCode.item(0).getTextContent();

				NodeList returnDesc = document.getElementsByTagName("ns2:responseDesc");
				responsedesc = returnDesc.item(0).getTextContent();

				NodeList statusCode = document.getElementsByTagName("ns2:subStatusCode");
				subStatusCode = statusCode.item(0).getTextContent();

				NodeList statusDesc = document.getElementsByTagName("ns2:subStatusDesc");
				subStatusDesc = statusDesc.item(0).getTextContent();

			}

			if (responseCode != null && responsedesc != null && subStatusCode != null && subStatusDesc != null) {
				serverResponse = new ServerResponse().responseCode(responseCode).responseReason(responsedesc)
						.subStatusCode(subStatusCode).subStatusDescription(subStatusDesc);

			}

		} catch (Exception ex) {
			log.info("Exception while calling ReXPI server : " + ex.getMessage() + LINE_SPACE + ex);

			serverResponse = RESPONSE_INTERNAL_ERR;
		}

		log.info("ServerResponse ::" + serverResponse);

		return serverResponse;
	}

	public static Document parseXmlFile(String in) {
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			InputSource is = new InputSource(new StringReader(in));
			return db.parse(is);
		} catch (ParserConfigurationException e) {
			throw new RuntimeException(e);
		} catch (SAXException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static ServerResponse dataPush(String agentCode, String productType, String serviceProviderCode,
			String txnRefNo, String queueName, String txnType, JmsTemplate jmsTemplate) {

		try {

			DataPushDTO dataPushDTO = new DataPushDTO();

			dataPushDTO.setAgentCode(agentCode);
			dataPushDTO.setDataPushMode("SC");
			dataPushDTO.setInstrumentType(productType.substring(0, 2));
			dataPushDTO.setPaymentMode("");
			dataPushDTO.setServiceProviderCode(serviceProviderCode);
			dataPushDTO.setSessionKey("");
			dataPushDTO.setSourceDC("KDC");
			dataPushDTO.setStageNo(0);
			dataPushDTO.setTxnRefNo(txnRefNo);
			dataPushDTO.setTxnType(txnType);

			log.info("=======:: Before data push to Release Txn queue !");

			jmsTemplate.convertAndSend(queueName, dataPushDTO);

			log.info("=======:: After data push to Release Txn queue  !");

			return RESPONSE_SUCCESS;

		} catch (Exception ex) {

			log.info("Exception while performing data push - release Txn (Cancellation Authorization) : " + ex);

			return RESPONSE_INTERNAL_ERR;

		}
	}

	public static Map<String,String> authenticateAgent(AuthenticationService authenticationService, String agentCode, String serviceName, Environment props) {

		Map<String,String> response = new HashMap<String,String>();
		
		AuthenticationDTO authenticationDTO = null;
		
		String subStatusCode = "";
		
		Integer serviceStatus = Integer.valueOf(props.getProperty(serviceName));
		
		if (!Optional.ofNullable(agentCode).orElse(EMPTY_STRING).isEmpty()) {
			
			authenticationDTO = authenticationService.validateAgentCode(agentCode);
			if (null == authenticationDTO) {
				subStatusCode = AGENT_SUBSTATUSCODE; // Authentication Error
				log.info(" Fatal Error - for  : " + LINE_SPACE + props.getProperty(subStatusCode));
			} else if (((authenticationDTO.getAgentStatus() & 1073741824) == 1073741824)) {
				subStatusCode = AGENT_DISABLE_SUBSTATUSCODE; // Authentication Error
				log.info(" Fatal Error - for  : " + LINE_SPACE + props.getProperty(subStatusCode));
			} else if ((authenticationDTO.getAgentStatus2() & serviceStatus) == serviceStatus) {
				subStatusCode = SUCCESS_CODE; //valid request
			}else {
				subStatusCode = AUTHORIZATION_STATUSCODE; // Authentication Error
			}
			if(null != authenticationDTO) {
				response.put(AUTH_KEY, authenticationDTO.getAuthKey());
				response.put(AGENT_CODE, authenticationDTO.getAgentCode());
				response.put(USER_ID, authenticationDTO.getUserID());
				response.put(IP_ADDRESS, authenticationDTO.getIpAddress());
				response.put(AGENT_STATUS, String.valueOf(authenticationDTO.getAgentStatus()));
				response.put(AGENT_STATUS2, String.valueOf(authenticationDTO.getAgentStatus2()));
				response.put(ACCESS_FLAG, String.valueOf(authenticationDTO.getAccessFlag()));
				response.put(PAYMENT_MODES, String.valueOf(authenticationDTO.getPaymentModes()));
				response.put(KEY_STATUS, String.valueOf(authenticationDTO.getKeyStatus()));
			}
		} else {
			subStatusCode = AGENT_CODE_EMPTY; // Agent code is not provided in the request header
			log.info(" Fatal Error - for : " + LINE_SPACE + props.getProperty(subStatusCode));
		}
		
		response.put(SUB_STATUS_CODE, subStatusCode);
		
		
		return response;
	}
	
	
}
