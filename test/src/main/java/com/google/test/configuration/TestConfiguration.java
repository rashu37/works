package com.google.test.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.google")
public class TestConfiguration {
	public TestConfiguration() {
		System.out.println("Test Configuration Constructor");
	}

}
