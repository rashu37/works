package com.google.days.runner;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.google.days.configuration.DayConfiguration;

public class DayRunner {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context= new
				AnnotationConfigApplicationContext(DayConfiguration.class);
		System.out.println(context.getBeanDefinitionCount());
		String instances[]=context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(instances));
	}

}
