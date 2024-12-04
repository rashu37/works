package com.xworkz.task.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class CupsDto {
	
	@Value("Glass")
	private String type;
	@Value("450")
	private int price;
	@Value("4")
	private int quantity;
	@Value("3.4")
	private double height;
	@Value("White")
	private String color;
	@Value("2")
	private int weigth;

}
