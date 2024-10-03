package com.google.railwaybooking.dto;

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
public class PersonalDetails {
	
	private String name;
	private byte age;
	private long phoneNum;
	private int totalAmount;
	private long adharNum;

}
