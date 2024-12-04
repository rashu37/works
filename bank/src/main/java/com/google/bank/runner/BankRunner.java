package com.google.bank.runner;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.google.bank.connection.BankConfiguration;


public class BankRunner {
	public static void main(String[] args) {
		
	
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BankConfiguration.class);
	System.out.println(context.getBeanDefinitionCount());
	String instances[] = context.getBeanDefinitionNames();
	System.out.println(Arrays.toString(instances));
}

}
