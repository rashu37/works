package com.xworkz.accessories.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString

public class ShoppingDto {
	
	private String name;
	private String brand;
	private int price;
	private double ratings;
	@Override
	public String toString() {
		return "ShoppingDto [name=" + getName() + ", brand=" + brand + ", price=" + price + ", ratings=" + ratings + "]";
	}
	

}
