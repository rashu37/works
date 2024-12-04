package com.xworkz.festival.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class FestivalConfiguration {
       public FestivalConfiguration() {
    	   System.out.println("WebInt Constructor");
       }
}
