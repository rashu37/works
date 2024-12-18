package com.google.tv.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.google")
public class TvConfiguration {
	
	
	@Bean
	public ViewResolver getReslover() {
		InternalResourceViewResolver view=new InternalResourceViewResolver();
		view.setSuffix(".jsp");
		return view;
		}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean getManager() {
		return new LocalContainerEntityManagerFactoryBean();
	}

}
