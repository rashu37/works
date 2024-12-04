package com.xworkz.task.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class PaperDto {
	
	@Value("Black")
	private String colour;
	@Value("A4")
	private String type;
	@Value("4")
	private int length;
	@Value("0.112")
	private double weight;
	@Value("true")
	private boolean isRecycle;
	

}
