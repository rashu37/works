package com.google.metaApp.configuration;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MetaWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		
		return new Class[] {MetaConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Get Mapping");
		return new String[] {"/"};
	}

}
