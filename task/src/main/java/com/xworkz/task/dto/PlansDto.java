package com.xworkz.task.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class PlansDto {
	
	@Value("Aritel Plan")
	private String name;
	@Value("567")
	private double price;
	@Value("30")
	private int duration;
	@Value("true")
	private boolean active;
	@Value("Monthly")
	private String type;

}
