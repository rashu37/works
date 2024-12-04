package com.xworkz.task.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class RoadDto {
	    @Value("Highway")
        private String name;
	    @Value("Concert")
	    private String type;
	    @Value("890.7")
	    private double length;
	    @Value("4")
	    private int numberOfLanes;
	    @Value("5")
	    private int amountTransferred;

	   
}
