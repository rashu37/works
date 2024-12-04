package com.xworkz.festival.runner;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.festival.configuration.FestivalConfiguration;

public class WebintRunner {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FestivalConfiguration.class);
		System.out.println(context.getBeanDefinitionCount());
		String instances[] = context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(instances));
	}

}
