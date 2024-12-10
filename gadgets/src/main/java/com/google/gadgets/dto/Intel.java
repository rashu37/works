package com.google.gadgets.dto;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
public class Intel implements LaptopBrand {
	
	public Intel() {
		System.out.println("Intel constructor");
	}

}
