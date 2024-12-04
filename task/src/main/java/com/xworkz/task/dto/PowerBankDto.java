package com.xworkz.task.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;



@Data
@Component
public class PowerBankDto {
	
	
	@Value("Sumsung")
	private String brand;
	@Value("243")
    private int capacity; 
    @Value("3")
    private int numberOfPorts;
    @Value("true")
    private boolean fastChargingSupported;
    @Value("1000")
    private double price;

}
