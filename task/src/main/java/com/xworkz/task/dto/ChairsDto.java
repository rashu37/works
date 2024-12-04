package com.xworkz.task.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class ChairsDto {
	
	@Value("Bhaskar Brand")
	private String brand;
	@Value("Brown")
	private String color;
	@Value("657")
	private int price;
	@Value("5")
	private int quantity;
	@Value("Wooden")
	private String type;
	@Value("true")
	private boolean quality;

}
