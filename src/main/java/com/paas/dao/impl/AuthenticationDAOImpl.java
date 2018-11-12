/**
 * 
 */
package com.paas.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.paas.dao.AuthenticationDAO;
import com.paas.dto.AuthenticationDTO;

import static com.paas.constants.PaasConstants.JDBC_TEMPLATE_TR;
import static com.paas.constants.PaasConstants.SP_AUTH_PAAS_AGENT_CALL;


/**
 * @author srikanth.sethuraman
 * 
 */
@Component
public class AuthenticationDAOImpl implements AuthenticationDAO {
	
	
	private static final Logger log = LoggerFactory.getLogger(AuthenticationDAOImpl.class);
	
	
	@Autowired
	@Qualifier(JDBC_TEMPLATE_TR)
	private JdbcTemplate sybaseJDBCTemplateTR;

	public AuthenticationDTO validateAgentCode(String agentCode) {

		AuthenticationDTO authenticationDTO = null;
		
		Object[] parameters = new Object[2];
		parameters[0] = agentCode;
		parameters[1] = "PAASAPI";
		
		RowMapper<AuthenticationDTO> rowMapper = new BeanPropertyRowMapper<AuthenticationDTO>(
				AuthenticationDTO.class);
		
		authenticationDTO = sybaseJDBCTemplateTR.queryForObject(SP_AUTH_PAAS_AGENT_CALL, parameters, rowMapper);

		log.info("authenticationDTO  -----"+authenticationDTO.getAuthKey() +" " + authenticationDTO.getAgentCode());
		
		return authenticationDTO;
	}


}
