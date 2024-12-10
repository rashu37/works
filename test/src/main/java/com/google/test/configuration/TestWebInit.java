package com.google.test.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class TestWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{
	
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
		return new Class[] {TestConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("GetServlet");
		return new String[] {"/"};
	}
}
