package com.google.coffee.service;

import com.google.coffee.dto.Coffee;
import com.google.coffee.util.CoffeeValidation;

public class CoffeeService {
	CoffeeValidation validation=new CoffeeValidation();
	
	private Coffee[] coffee=new Coffee[3];
	private int index=0;
	
	public String onsave(Coffee coffeedto) {
		System.out.println("On save method is Running");
		if(validation.name(coffeedto.getName())&& 
				validation.price(coffeedto.getPrice())&&
				validation.location(coffeedto.getLocation())&&
				validation.ratings(coffeedto.getRatings())&&
				validation.num(coffeedto.getNum())&&
				validation.isgood(coffeedto.isIsgood())) {
			System.out.println("Validations are correct");
			if(this.index<coffee.length) {
				coffee[index]=coffeedto;
				index++;
				System.out.println("Saved Details");
				return "saved";
			}else {
				System.out.println("Not saved");
			}
		}
		return "not saved";
	}
	
	public void read() {
		for (int i = 0; i < coffee.length; i++) {
			System.out.println(coffee[i]);
		}
	}

}
