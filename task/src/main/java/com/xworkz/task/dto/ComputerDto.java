package com.xworkz.task.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class ComputerDto {
	
	@Value("Apple")
    private String brand;
	@Value("56789")
	private int price;
	@Value("8")
	private String model;
	@Value("45")
    private int storageSize;
	@Value("11")
    private String processor;
	@Value("234")
    private int ramSize;
     
   
}
