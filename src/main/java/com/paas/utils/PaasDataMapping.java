/**
 * 
 */
package com.paas.utils;

import org.springframework.core.env.Environment;

/**
 * @author Manigandan Ravi
 * 
 */
public class PaasDataMapping {

	public static String getInstrumentType(String productType, Environment props) {
		return props.getProperty("InstType." + productType);
	}

	public static String getGender(String productType, Environment props) {
		return props.getProperty("Gender." + productType);
	}

	public static int getGrade(String productType, Environment props) {
		return Integer.parseInt(props.getProperty("GradeType." + productType));
	}

	public static int getCustBeneType(String productType, Environment props) {
		return Integer.parseInt(props.getProperty("CustBeneType." + productType));
	}

	public static String getDeliveryOption(String deliveryOption, Environment props) {
		return props.getProperty("DeliveryOption." + deliveryOption);
	}

	public static String getChargesFlag(int chargesFlag, Environment props) {
		return props.getProperty("ChargesFlag.0" + String.valueOf(chargesFlag));
	}

	public static String getProductType(String productType, Environment props) {
		return props.getProperty("ProductType." + productType);
	}

	public static String getXmStatus(String status, Environment props) {
		return props.getProperty("XmStatus." + status);
	}

	public static String getAccountCode(String accountCode, Environment props) {
		return props.getProperty("AccountCode." + accountCode);
	}

}
