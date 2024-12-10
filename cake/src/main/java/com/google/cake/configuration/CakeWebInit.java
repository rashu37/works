package com.google.cake.configuration;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class CakeWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Get Root");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {CakeConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Get Mapping");
		return new String[] {"/"};
	}

}
