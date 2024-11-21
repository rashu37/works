package com.google.blinkit.runner;

import java.util.List;

import com.google.blinkit.dto.BlinkitDto;
import com.google.blinkit.repo.BlinkitRepo;
import com.google.blinkit.repo.BlinkitRepoImpl;
import com.google.blinkit.service.BlinkitService;
import com.google.blinkit.service.BlinkitServiceImpl;

public class BlinkitRunner {

	public static void main(String[] args) {
		
		BlinkitDto dto=new BlinkitDto();
		dto.setId(1);
		dto.setProductName("Bag");
		dto.setProductBrand("Gucci");
		dto.setProductprice(2000);
		dto.setProductQuantity(4);
		dto.setProductRatings(5);
		
		BlinkitRepo repo=new BlinkitRepoImpl();
		BlinkitService service = new BlinkitServiceImpl(repo);
		String result=service.onSave(dto);
		System.out.println("Result:"+result);
		
		System.out.println(service.read());
		System.out.println("================================");
		System.out.println("Product is Search");
        System.out.println(service.search(3));
//        System.out.println(service.deleted(3));
        System.out.println(service.updated(20, dto));
		
	}

}
