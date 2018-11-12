package com.paas.service.impl;

import static com.paas.constants.PaasConstants.LINE_SPACE;
import static com.paas.utils.PaasUtils.getDBErrorCodeOrMsg;
import static com.paas.utils.PaasUtils.getSQLException;

import java.sql.SQLException;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paas.dao.AuthenticationDAO;
import com.paas.dto.AuthenticationDTO;
import com.paas.service.AuthenticationService;

@Service
public class AuthenticationServiceImpl implements AuthenticationService{
	
	private static Logger log = Logger.getLogger(AuthenticationServiceImpl.class.getName());
	
	@Autowired
	private AuthenticationDAO authenticationDAO;
	
	public AuthenticationDTO validateAgentCode(String agentCode) {		
		AuthenticationDTO authenticationDTO = null;
		String subStatusCode = "";
		String subStatusDesc = "";
		try {
			authenticationDTO = authenticationDAO.validateAgentCode(agentCode);
		} catch (Exception ex) {
			SQLException sqlEx = getSQLException(ex);
			if (null != getSQLException(ex)) {
				subStatusCode = getDBErrorCodeOrMsg(sqlEx, false);
				subStatusDesc = getDBErrorCodeOrMsg(sqlEx, true);
			} 
			log.info("Error while Validatng agent code : "+ agentCode +  LINE_SPACE + LINE_SPACE +subStatusCode +"-"+ subStatusDesc +LINE_SPACE + LINE_SPACE + ex.getMessage() );
		}
		return authenticationDTO;
	}

}
