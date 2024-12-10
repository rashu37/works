package com.google.gadgets.runner;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.google.gadgets.configuration.GadgetsConfiguration;
import com.google.gadgets.dto.GadgetsUser;


public class GadgetsRunner {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(GadgetsConfiguration.class);
		 System.out.println(context.getBeanDefinitionCount());
		 String[] instance=context.getBeanDefinitionNames();
		 for(String i:instance) {
			 System.out.println(i);
		 }
		// System.out.println(Arrays.toString(instance));
		 
		 Object result=context.getBean(GadgetsUser.class);
			System.out.println(result);		 
		 
		
	}

}
