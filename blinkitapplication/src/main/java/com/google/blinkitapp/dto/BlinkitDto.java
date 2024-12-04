package com.google.blinkitapp.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class BlinkitDto {
	
	private int id;
	private String productName;
	private String productBrand;
	private int productPrice;
	private int productQuantity;
	private int productRatings;


}