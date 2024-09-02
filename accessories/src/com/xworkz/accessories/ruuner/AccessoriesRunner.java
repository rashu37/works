package com.xworkz.accessories.ruuner;

import com.xworkz.accessories.dto.AccessoriesDto;
import com.xworkz.accessories.service.AccessoriesService;

public class AccessoriesRunner {
	public static void main(String[] args) {
		
		AccessoriesDto dto= new AccessoriesDto();
		AccessoriesService service=new AccessoriesService();
		
		AccessoriesDto name=new AccessoriesDto("SideBag", "Nykaa Fashion", 2000, 5.6, "White", "Leather");
		AccessoriesDto brand=new AccessoriesDto("Bag", "Nykaa ", 2100, 5.5, "Black", "Rubber");
		AccessoriesDto ratings=new AccessoriesDto("Jewellary", "Joyalukas", 30000, 7.8, "Green pearl", "stones");
		AccessoriesDto price=new AccessoriesDto("Makeup kit", "Likee", 2500, 5.8, "Pink", "kit");
		
		//each method checking 
//		service.name("Side Bag");
//		service.brand("Nykaa fashion");
//		service.price(787.4);
//		service.ratings(5.6);
//		service.color("white");
//		service.type("Leather");
		
		service.onSave(name);
		service.onSave(brand);
		service.onSave(ratings);
		service.onSave(price);
		service.read();
	}

}
