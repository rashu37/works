package com.google.bank.connection;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class BankConfiguration {
	public BankConfiguration() {
		System.out.println("Bank Constructor");
	}

}
