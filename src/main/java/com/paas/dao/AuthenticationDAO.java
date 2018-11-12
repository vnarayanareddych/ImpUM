/**
 * 
 */
package com.paas.dao;

import com.paas.dto.AuthenticationDTO;

/**
 * @author srikanth.sethuraman
 * 
 */
public interface AuthenticationDAO {

	
	public AuthenticationDTO validateAgentCode(String agentCode);
}
