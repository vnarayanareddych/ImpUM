package com.paas.service.impl;

import static com.paas.constants.PaasConstants.RESPONSE_INTERNAL_ERR;
import static com.paas.constants.PaasConstants.RELEASE_TXN_QUEUE;
import static com.paas.utils.PaasUtils.callReXPIService;
import static com.paas.utils.PaasUtils.callReXPIServiceForEnquiry;
import static com.paas.utils.PaasUtils.dataPush;
import static com.paas.utils.RequestValidator.generateSOAPformatForLockTxn;
import static com.paas.utils.RequestValidator.generateSOAPformatForRelease;
import static com.paas.utils.RequestValidator.generateSOAPformatForTxnEnquiry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.paas.model.LockTransactionRequest;
import com.paas.model.ReleaseTransactionRequest;
import com.paas.model.ServerResponse;
import com.paas.model.TransactionEnquiryRequest;
import com.paas.model.TransactionEnquiryResponse;
import com.paas.service.ReXPIServices;


@Service
public class ReXPIServicesImpl implements ReXPIServices {

	@Autowired
	private JmsTemplate jmsTemplate;

	@Override
	public ServerResponse doReleaseAETxn(ReleaseTransactionRequest releaseTransactionRequest, String agentCode,
			String serviceProviderCode, Environment props) {

		String xmlRequestInStringFormat = "";

		if (null != releaseTransactionRequest) {
			if (releaseTransactionRequest.getReleaseFlag() == 1 || releaseTransactionRequest.getReleaseFlag() == 3) {
				if (releaseTransactionRequest.getReleaseFlag() == 1) {

					xmlRequestInStringFormat = generateSOAPformatForRelease(releaseTransactionRequest);

				} else {
					LockTransactionRequest lockTransactionRequest = new LockTransactionRequest();

					lockTransactionRequest.setTxnRefNo(releaseTransactionRequest.getTxnRefNo());
					lockTransactionRequest.setLockUnlockFlag(releaseTransactionRequest.getRevertCancelWithLock());
					lockTransactionRequest.setControlFlag(releaseTransactionRequest.getControlFlag());
					lockTransactionRequest.setReservedParam1(releaseTransactionRequest.getReservedParam1());
					lockTransactionRequest.setReservedParam2(releaseTransactionRequest.getReservedParam2());
					lockTransactionRequest.setReservedParam3(releaseTransactionRequest.getReservedParam3());
					lockTransactionRequest.setReservedParam4(releaseTransactionRequest.getReservedParam4());
					lockTransactionRequest.setReservedParam5(releaseTransactionRequest.getReservedParam5());
					lockTransactionRequest.setReservedParam6(releaseTransactionRequest.getReservedParam6());
					lockTransactionRequest.setReservedParam7(releaseTransactionRequest.getReservedParam7());
					lockTransactionRequest.setReservedParam8(releaseTransactionRequest.getReservedParam8());
					lockTransactionRequest.setReservedParam9(releaseTransactionRequest.getReservedParam9());
					lockTransactionRequest.setReservedParam10(releaseTransactionRequest.getReservedParam10());

					xmlRequestInStringFormat = generateSOAPformatForLockTxn(lockTransactionRequest);

				}

				return callReXPIService(xmlRequestInStringFormat, props);

			} else if (releaseTransactionRequest.getReleaseFlag() == 2) {

				return dataPush(agentCode, releaseTransactionRequest.getProductType(), serviceProviderCode,
						releaseTransactionRequest.getTxnRefNo(), RELEASE_TXN_QUEUE, "SC", jmsTemplate);

			}
		}

		return RESPONSE_INTERNAL_ERR;
	}
	
	@Override
	public TransactionEnquiryResponse doTxnEnquiryReXPI(TransactionEnquiryRequest txnEnquiryRequest,Environment props, TransactionEnquiryResponse txnEnquiryResponse) {
	
		  String requestEnquiryXML = "";
		  TransactionEnquiryResponse txnEnqiryResponse = null;

		  if (null != txnEnquiryRequest) {
			    
			  requestEnquiryXML = generateSOAPformatForTxnEnquiry(txnEnquiryRequest);

			  return callReXPIServiceForEnquiry(requestEnquiryXML, props,txnEnquiryResponse);
  
		  }
   
		  return txnEnqiryResponse;
	}

}
