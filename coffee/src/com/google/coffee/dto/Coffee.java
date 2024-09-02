package com.google.coffee.dto;

import com.google.coffee.constant.CoffeeConstant;

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
public class Coffee {
	private String name;
	private int price;
	private CoffeeConstant types;
	private double ratings;
	private String location;
	private long num;
    private boolean isgood;
	

}
