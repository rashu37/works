package com.google.shirt.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class TShirtWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
    
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Get Root");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {TShirtConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Get Mapping");
		return new String[] {"/"};
	}
	

}
