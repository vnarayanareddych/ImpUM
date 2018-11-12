package com.paas.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Configuration
@ComponentScan(basePackages = "com.paas")
@PropertySources({
@PropertySource(value = "classpath:/props/ErrorCode.properties", ignoreResourceNotFound=true),
@PropertySource(value = "classpath:/props/Paas.properties", ignoreResourceNotFound=true),
@PropertySource(value = "classpath:/props/PaasConfig.properties", ignoreResourceNotFound=true),
@PropertySource(value = "classpath:/props/SolrSearch.properties", ignoreResourceNotFound=true)
})
public class PaasPropsConfig {

	@Autowired
	DataSource dataSource;

	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	@Bean
	public JdbcTokenStore tokenStore() {
		return new JdbcTokenStore(dataSource);
	}
	
	@Bean
	public LocalValidatorFactoryBean getValidator() {
	    LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
	    bean.setValidationMessageSource(messageSource());
	    return bean;
	}

	
	@Bean
	public MessageSource messageSource() {
	    ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
	    messageSource.setBasename("classpath:/props/ErrorCode");
	    messageSource.setCacheSeconds(10); //reload messages every 10 seconds
	    return messageSource;
	}

}
