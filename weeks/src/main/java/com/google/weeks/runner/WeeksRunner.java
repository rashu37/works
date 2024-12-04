package com.google.weeks.runner;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.google.weeks.configuration.WeeksConfiguration;

public class WeeksRunner {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(WeeksConfiguration.class);
		
		System.out.println(context.getBeanDefinitionCount());
		String instances[] = context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(instances));

	}
}
