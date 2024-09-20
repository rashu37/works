package com.xworkz.redbus.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString

public class BusBookingDto {
	
	private String busNumber;
	private String from;
	private String to;
	private int price;
	private LocalDateTime startDateTime;
	

}
