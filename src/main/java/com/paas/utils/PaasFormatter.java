package com.paas.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PaasFormatter {
	
	public static String removeBankSearchSpecialChar(String inputValue) {
		
		inputValue = inputValue.replaceAll(" ", "*").replace("(", "*")
				.replace(")", "*").replace("-", "*")
				+ "*";
		return inputValue;
	}
	
	/**
	 * to get time stamp
	 * @return time stamp
	 */
	public static String getTimestamp() {
		
		return new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	}

}
