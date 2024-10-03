package com.google.railwaybooking.dto;

import com.google.railwaybooking.constant.Location;

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

public class RailwayDetails {
	
	private String stationName;
	private int trainNum;
	private byte platFromNo;
	private String departure;
	private Location location;
	private PersonalDetails details;

}
