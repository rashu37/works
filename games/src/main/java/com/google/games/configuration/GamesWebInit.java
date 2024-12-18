package com.google.games.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class GamesWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	 
	@Override
	public Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	public  Class<?>[] getServletConfigClasses() {
		return new Class[] {GamesConfiguration.class};
	}

	@Override
	public  String[] getServletMappings() {
		return new String[] {"/"};
	}

}
