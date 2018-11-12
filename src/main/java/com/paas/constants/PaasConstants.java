package com.paas.constants;

import com.paas.model.ServerResponse;

public class PaasConstants {

	public static final String EMPTY_STRING 	= "";
	public static final String TAB_SPACE 		= "\t";
	public static final String LINE_SPACE 		= "\n";
	public static final String COMMA_SEPERATOR	= ",";
	public static final String EMPTY_SPACES		= "\\s";
	public static final String QUESTION_MARK	= "?";
	public static final String DOT_SEPERATOR 	= "\\.";
	public static final String BREAK_TAG 		= "<br>";
	public static final String DECIMAL_PATTERN	= "############.###";
	
	
	/*Property file Name*/
	public static final String SOLR_PROPS_NAME = "SolrSearch.properties";
	public static final String PROPS_ERR_FILENAME = "ErrorCode.properties";
	public static final String PROPS_CONFIG_FILENAME = "PaasConfig.properties";
	public static final String PAAS_PROPS = "Paas.properties";
	
	/*Stored Procedure Names*/
	public static final String SP_PAYMENT_CALC_CALL = "EXEC xremit.dbo.p_paymentCalculatorPAAS(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	public static final String SP_CREATE_TXN_CALL = "";
	public static final String SP_CANCEL_TXN_CALL = "EXEC xremit.dbo.p_cancelPAASTxn(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	public static final String SP_RELEASE_TXN_CALL = "EXEC xremit.dbo.p_releasePAASTxn(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	public static final String SP_TXN_ENQ_CALL = "";
	public static final String SP_TXN_STATUS_CALL = "";
	public static final String SP_AUTH_PAAS_AGENT_CALL = "EXEC xfuse.dbo.p_authenticatePAASAgent(?,?)";
	public static final String SP_ENQUIRY_TXN_DATA_CALL = "EXEC xremit.dbo.p_getPAASTxnEnquiry(?,?,?,?,?,?)";
	public static final String SP_ENQUIRY_TXN_STATUSLIST_CALL = "EXEC xremit.dbo.p_getPAASTxnStatusEnquiry(?)";
	
	/*DB Configuration Constants */
	public static final String SYBASE_TR = "sybase-tr";
	public static final String SYBASE_PR = "sybase-pr";
	public static final String JDBC_TEMPLATE_TR = "jdbcTemplateForTR";
	public static final String JDBC_TEMPLATE_PR = "jdbcTemplateForPR";
	public static final String SYBASE_CONFIG_PREFIX_TR = "spring.sybase-tr";
	public static final String SYBASE_CONFIG_PREFIX_PR = "spring.sybase-pr";
	
	public static final String SUCCESS_CODE = "S0000";
	public static final String ERROR_CODE = "E0000";
	public static final String AE_STATUS_CODE = "S7777";
	public static final String SUCCESS = "Success";
	public static final String ERROR = "Error";
	public static final String SUCCESS_SUBCODE = "S7004";
	public static final String SUCCESS_NO_RECORDS = "S1111";
	public static final String VALIDATION_CODE = "V0000";
	public static final String AUTHENTICATE_STATUSCODE = "AC000";
	public static final String SUCCESS_VALIDATE_STATUSCODE = "S7005";
	public static final String AUTHORIZATION_STATUSCODE = "AU000";
	public static final String AUTHENTICATE_SUBSTATUSCODE = "AC555";
	public static final String SIGNATURE_SUBSTATUSCODE = "AC444";
	public static final String SUCCESS_RELEASED = "S7003";
	public static final String AUTHENTICATE_DISABLE_SUBSTATUSCODE = "AC777";
	public static final String AGENT_CODE_EMPTY = "AG222";
	public static final String AGENT_SUBSTATUSCODE = "AG555";
	public static final String AGENT_DISABLE_SUBSTATUSCODE = "AG777";	
	public static final String AUTHENTICATION_EMPTY = "AC222";
			
	/* Bank Search Error codes */
	public static final String V0005	= "V0005";
	public static final String V0006	= "V0006";
	public static final String V0012	= "V0012";
	public static final String V0013	= "V0013";
	public static final String V5048	= "V5048";
	public static final String V5049	= "V5049";
	
	/* Bank Branch Search Error codes */
	public static final String V0020	= "V0020";
	public static final String V0023	= "V0023";
	public static final String V0024	= "V0024";
	public static final String V0025	= "V0025";
	public static final String V0016	= "V0016";
	public static final String V0003	= "V0003";
	public static final String V0001	= "V0001";
	public static final String V0014	= "V0014";
	
	/* Payment Calculator Error codes */
	public static final String V0017	= "V0017";
	public static final String V0018	= "V0018";
	public static final String V0021	= "V0021";
	public static final String V5001	= "V5001";
	public static final String V5010	= "V5010";
	public static final String V5012	= "V5012";
	public static final String V5011	= "V5011";
	public static final String V5019	= "V5019";
	public static final String V5020	= "V5020";
	public static final String V5030	= "V5030";
	public static final String V5031	= "V5031";
	public static final String V5042	= "V5042";
	public static final String V5060	= "V5060";
	public static final String V5061	= "V5061";
	public static final String V5110	= "V5110";
	public static final String V5160	= "V5160";
	
	/* Release Txn Error Codes*/
	public static final String V5034	= "V5034";
	public static final String V5035	= "V5035";
	public static final String V5044	= "V5044";
	public static final String V5043	= "V5043";
	public static final String V0026	= "V0026";
	public static final String V0027	= "V0027";
	
	/* Cancel Txn Error Codes*/
	public static final String V9004	= "V9004";
	public static final String V5162	= "V5162";
	public static final String V5161	= "V5161";
	public static final String V7003	= "V7003";
	
	public static final String V9003	= "V9003";
	public static final String V7002	= "V7002";
	public static final String AE_SERVICE_PROVIDER_SUBCODE = "77075";
	public static final String INVALID_TXN = "80043";
	
	/* Regular Expressions*/
	public static final String ALPHA_NUMERIC_REGEX			= "^[a-zA-Z0-9 ]+$";
 	public static final String ALPHA_NUMERIC_HASH_REGEX		= "^[a-zA-Z0-9 #]+$";
	public static final String ALPHA_ONLY_REGEX				= "^[a-zA-Z]+$";
	public static final String DECIMAL_ONLY_REGEX			= "^[0-9.]*$";
	
	/*Setting Default Values*/
	public static final String DEFAULT_PAYIN_AMOUNT				= "Default.PayinAmount";
	public static final String DEFAULT_PAYOUT_AMOUNT			= "Default.PayinAmount";
	public static final String DEFAULT_XCHG_RATE_DISPLAY_FLAG 	= "Default.XchgRateDisplayFlag";
	public static final String DEFAULT_INCLUDE_CHARGES 			= "Default.IncludeCharges";
	public static final String DEFAULT_PAYMENT_MODE 			= "Default.PaymentMode";
	public static final String DEFAULT_SENDER_TYPE 				= "Default.SenderType";
	public static final String DEFAULT_RECEIVER_TYPE 			= "Default.ReceiverType";
	public static final String DEFAULT_SERVICE_TYPE 			= "Default.ServiceType";
	public static final String DEFAULT_PRODUCT_TYPE 			= "Default.ProductType";
	public static final String DEFAULT_SERVICE_FLAG 			= "Default.ServiceFlag";
	public static final String DEFAULT_CONTROL_FLAG 			= "Default.ControlFlag";
	public static final String CHARGES_TYPES		 			= "ChargesTypes";
	public static final String LC2FC		 					= "LC2FC";
	public static final String FC2LC		 					= "FC2LC";
	public static final String XRFL			 					= "XRFL";
	public static final String CPFL			 					= "CPFL";
	public static final String VALID_SERVICE_TYPES 				= "VALID_SERVICE_TYPES";
	public static final String VALID_RELEASE_FLAGS 				= "VALID_RELEASE_FLAGS";
	public static final String VALID_PAYMENT_MODES 				= "VALID_PAYMENT_MODES";
	public static final String VALID_REVERT_CANCEL_FLAGS 		= "VALID_REVERT_CANCEL_FLAGS";
	public static final String C2BK_PRODUCT_TYPES				= "C2BK.PRODUCT_TYPES";
	public static final String C2WT_PRODUCT_TYPES				= "C2WT.PRODUCT_TYPES";
	public static final String C2CH_PRODUCT_TYPES 				= "C2CH.PRODUCT_TYPES";
	public static final String C2CD_PRODUCT_TYPES				= "C2CD.PRODUCT_TYPES";
	public static final String C2DD_PRODUCT_TYPES 				= "C2DD.PRODUCT_TYPES";
	public static final String ERR  		 					= "Err";
	
	/* PAAS Services status bits */
	public static final String BANK_SEARCH_SERVICE_STATUS 			= "BANK_SEARCH_SERVICE_STATUS";
	public static final String BANK_BRANCH_SEARCH_SERVICE_STATUS 	= "BANK_BRANCH_SEARCH_SERVICE_STATUS";
	public static final String CREATE_TXN_SERVICE_STATUS			= "CREATE_TXN_SERVICE_STATUS";
	public static final String CANCEL_TXN_SERVICE_STATUS 			= "CANCEL_TXN_SERVICE_STATUS";
	public static final String RELEASE_TXN_SERVICE_STATUS			= "RELEASE_TXN_SERVICE_STATUS";
	public static final String PAYMENT_CALCULATOR_SERVICE_STATUS 	= "PAYMENT_CALCULATOR_SERVICE_STATUS";
	public static final String TXN_ENQUIRY_SERVICE_STATUS 			= "TXN_ENQUIRY_SERVICE_STATUS";
	public static final String CREATE_TXN_V2_SERVICE_STATUS 		= "CREATE_TXN_V2_SERVICE_STATUS";
	
	public static final ServerResponse RESPONSE_INTERNAL_ERR = new ServerResponse().responseCode(ERROR_CODE).responseReason(ERROR).subStatusCode(ERROR_CODE).subStatusDescription("Internal Error");
	public static final ServerResponse RESPONSE_SUCCESS = new ServerResponse().responseCode(SUCCESS_CODE).responseReason(SUCCESS).subStatusCode(SUCCESS_CODE).subStatusDescription("Request has been successfully processed");
	
	
	
	public static final int DEFAULT_INTEGER = 0;
	public static final double DEFAULT_DOUBLE = 0.0;	
	
	public static final String INSTRUMENTTYPE_XR		= "XR";
	public static final String INSTRUMENTTYPE_CP		= "CP";
	public static final String SERVICETYPE_C2BK			= "C2BK";	
	public static final String SERVICEFLAG_TT			= "TT";
	public static final String SERVICEFLAG_FL			= "FL";
	public static final String AUTH_KEY 				= "authKey";
	public static final String AGENT_CODE 				= "agentCode";
	public static final String USER_ID 					= "userID";
	public static final String IP_ADDRESS 				= "ipAddress";
	public static final String AGENT_STATUS 			= "agentStatus";
	public static final String AGENT_STATUS2 			= "agentStatus2";
	public static final String ACCESS_FLAG 				= "accessFlag";
	public static final String PAYMENT_MODES 			= "paymentModes";
	public static final String KEY_STATUS 				= "keyStatus";
	public static final String SUB_STATUS_CODE 			= "subStatusCode";
	

	/*JMS Queue*/
	public static final String CANCEL_TXN_QUEUE  			= "CANCEL_TXN";//"CancelTxn";
	public static final String CREATE_TXN_QUEUE  			= "CREATE_TXN";
	public static final String CREATE_TXN_V2_QUEUE  		= "CREATE_TXN_V2";
	public static final String RELEASE_TXN_QUEUE  			= "RELEASE_TXN";
	
	public static final String SERVICETYPE_C2WT			= "C2WT";	
}
