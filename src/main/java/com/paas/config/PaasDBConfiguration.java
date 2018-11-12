package com.paas.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;


import static com.paas.constants.PaasConstants.SYBASE_TR;
import static com.paas.constants.PaasConstants.SYBASE_PR;
import static com.paas.constants.PaasConstants.JDBC_TEMPLATE_TR;
import static com.paas.constants.PaasConstants.JDBC_TEMPLATE_PR;
import static com.paas.constants.PaasConstants.SYBASE_CONFIG_PREFIX_TR;
import static com.paas.constants.PaasConstants.SYBASE_CONFIG_PREFIX_PR;

@Configuration
public class PaasDBConfiguration {

	@Bean(name = SYBASE_TR)
	@Primary
	@ConfigurationProperties(prefix = SYBASE_CONFIG_PREFIX_TR)
	public DataSource sybaseTRDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = JDBC_TEMPLATE_TR)
	@Primary
	public JdbcTemplate jdbcTemplate(@Qualifier(SYBASE_TR) DataSource SybaseDS_TR) {
		return new JdbcTemplate(SybaseDS_TR);
	}
	
	@Bean(name = SYBASE_PR)
	@ConfigurationProperties(prefix = SYBASE_CONFIG_PREFIX_PR)
	public DataSource sybasePRDataSource() {
		return  DataSourceBuilder.create().build();
	}

	@Bean(name = JDBC_TEMPLATE_PR)
	public JdbcTemplate postgresJdbcTemplate(@Qualifier(SYBASE_PR) DataSource SybaseDS_PR) {
		return new JdbcTemplate(SybaseDS_PR);
	}
}