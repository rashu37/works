package com.google.payment.configuration;



import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class PaymentWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
   
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {PaymentConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("ServletMapping");
		return new String[] {"/"};
	}

}
