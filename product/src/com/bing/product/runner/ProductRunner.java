package com.bing.product.runner;

import com.bing.product.dto.ProductDto;
import com.bing.product.repository.ProductRepositoryImplimentation;
import com.bing.product.service.ProductService;
import com.bing.product.service.ProductServiceImplimentation;

public class ProductRunner {

	public static void main(String[] args) {
		ProductDto dto=new ProductDto();
		dto.setProductId(1);
		dto.setProductName("Bag");
		dto.setProductPrice(3500);
		dto.setProductDelivaryPlace("BTM");
		
		ProductDto dto1=new ProductDto();
		dto1.setProductId(2);
		dto1.setProductName("Table");
		dto1.setProductPrice(4200);
		dto1.setProductDelivaryPlace("Bengaluru");
		
		ProductService service=new ProductServiceImplimentation(new ProductRepositoryImplimentation());
        String result=service.validate(dto);
        System.out.println(result);
       
        String result1=service.validate(dto1);
        System.out.println(result1);
        
        System.out.println("Read Method");
        service.getAll().forEach(s->System.out.println(s));
        
        String result2=service.updateById(1, dto1);
        System.out.println(result2);
        service.getAll().forEach(s->System.out.println(s));
        
        String result3=service.deleteById(1, dto);
        System.out.println(result3);
        System.out.println("After Deleting:");
        System.out.println(service.getAll());
	}
	

}
