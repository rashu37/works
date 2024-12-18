package com.google.payment.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.google")
public class PaymentConfiguration {
	
	
	@Bean
	public ViewResolver getReslove() {
		InternalResourceViewResolver view=new InternalResourceViewResolver();
		view.setSuffix(".jsp");
		return view;
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean getManager() {
		return new LocalContainerEntityManagerFactoryBean();
	}

}
