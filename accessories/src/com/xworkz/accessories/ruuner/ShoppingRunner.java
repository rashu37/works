package com.xworkz.accessories.ruuner;

import com.xworkz.accessories.dto.ShoppingDto;
import com.xworkz.accessories.service.ShoppingService;

public class ShoppingRunner {

	public static void main(String[] args) {
		ShoppingDto dto=new ShoppingDto();
		ShoppingService service=new ShoppingService();
		
		//saving method 
		ShoppingDto name=new ShoppingDto("Dress","zara",2500,5.6);
		ShoppingDto price=new ShoppingDto("krutha","soch",3600,6.7);
		ShoppingDto brand=new ShoppingDto("Saree","Aavas",5000,8.2);
		
		//this each method checking 
//		service.name("Dress");
//		service.brand("zara");
//		service.price(10000);
//		service.ratings(5.5);
		
		service.onSave(name);
		service.onSave(price);
		service.onSave(brand);
		
		service.read();
		service.delete("zara");
		service.read();
		
		

	}

}
