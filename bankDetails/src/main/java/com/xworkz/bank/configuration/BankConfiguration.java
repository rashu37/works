package com.xworkz.bank.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz")
public class BankConfiguration {
	
	
	@Bean
	public ViewResolver getReslover() {
		InternalResourceViewResolver reslover=new InternalResourceViewResolver();
		reslover.setSuffix(".jsp");
		return reslover;
		}
	

	@Bean
	public LocalContainerEntityManagerFactoryBean getManager() {
		return new LocalContainerEntityManagerFactoryBean();
	}

}
