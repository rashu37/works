package com.xworkz.task.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class BuildingDto {
	
	
	@Value("Shree Krishna")
	private String name;
	@Value("6")
	private int rooms;
	@Value("7")
	private int floors;
	@Value("6560")
	private int price;
	@Value("true")
	private boolean isAvaliable;
	@Value("Hospet")
	private String location;
	

}
