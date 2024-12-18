package com.google.games.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.google")
public class GamesConfiguration {
	
	@Bean
	public ViewResolver getResolver() {
		InternalResourceViewResolver view=new InternalResourceViewResolver();
	   view.setSuffix(".jsp");	
	   return view;
	}
	

	@Bean
	public LocalContainerEntityManagerFactoryBean getManager() {
		return new LocalContainerEntityManagerFactoryBean();
	}

}
