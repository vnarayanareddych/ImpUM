package com.paas.service;


import com.paas.dto.AuthenticationDTO;

public interface AuthenticationService {
	
	public AuthenticationDTO validateAgentCode(String agentCode);

}
