package com.google.coffee.runner;

import com.google.coffee.constant.CoffeeConstant;
import com.google.coffee.dto.Coffee;
import com.google.coffee.service.CoffeeService;
import com.google.coffee.util.CoffeeValidation;

public class CoffeeRunner {
	public static void main(String[] args) {
		Coffee coffe=new Coffee("Coffee Day", 200, CoffeeConstant.COLDCOFFEE, 5.5, "Bengaluru", 6567838765l, true);
		Coffee coffe2=new Coffee("Cafe", 230, CoffeeConstant.HOTCOFFEE, 6.5, "Koppal", 8746592873l, true);
		Coffee coffe3=new Coffee("Peace", 350, CoffeeConstant.LATTE, 5.3, "Btm", 8766543873l, true);
		CoffeeValidation valid= new CoffeeValidation();
		valid.name("coffee day");
		valid.price(400);
		valid.ratings(6.6);
		valid.location("Bengaluru");
		valid.num(7865596766l);
		valid.isgood(true);
		
		
		CoffeeService service=new CoffeeService();
		
		service.onsave(coffe);
		service.onsave(coffe2);
		service.onsave(coffe3);
		
		service.read();
	}

}
