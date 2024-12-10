package com.google.news.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.google")
public class NewsConfiguration {
	public NewsConfiguration() {
		System.out.println("News configuration Constructor");
	}

}
