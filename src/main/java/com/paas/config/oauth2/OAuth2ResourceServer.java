package com.paas.config.oauth2;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;

@Configuration
@EnableResourceServer
public class OAuth2ResourceServer extends ResourceServerConfigurerAdapter {
	private static final String SERVER_RESOURCE_ID = "oauth2-server";

	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	public JdbcTokenStore tokenStore;

	@Override
	public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
		resources.resourceId(SERVER_RESOURCE_ID).tokenStore(tokenStore);
	}

	@Override
	public void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests().antMatchers(HttpMethod.POST,"/bankSearch1/**").access("#oauth2.hasScope('trust') and hasRole('USER')");
		/*http.authorizeRequests().antMatchers(HttpMethod.POST,"/bankBranchSearch/**").access("#oauth2.hasScope('trust') and hasRole('USER')");
		http.authorizeRequests().antMatchers(HttpMethod.POST,"/paymentCalculator/**").access("#oauth2.hasScope('trust') and hasRole('USER')");
		http.authorizeRequests().antMatchers(HttpMethod.POST,"/createTransaction/**").access("#oauth2.hasScope('trust') and hasRole('USER')");
		http.authorizeRequests().antMatchers(HttpMethod.POST,"/cancelTransaction/**").access("#oauth2.hasScope('trust') and hasRole('USER')");
		http.authorizeRequests().antMatchers(HttpMethod.POST,"/txnEnquiry/**").access("#oauth2.hasScope('trust') and hasRole('USER')");
		http.authorizeRequests().antMatchers(HttpMethod.POST,"/releaseTransaction/**").access("#oauth2.hasScope('trust') and hasRole('USER')");*/
	}
}
