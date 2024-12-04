package com.google.months.runner;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.google.months.configuration.MonthConfiguration;


public class MonthRunner {
   public static void main(String[] args) {
	   AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(MonthConfiguration.class);
		
		System.out.println(context.getBeanDefinitionCount());
		String instances[] = context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(instances));

}
}
