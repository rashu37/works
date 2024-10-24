package com.google.task.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


import com.google.task.dto.ProductsDto;

public class ProductsRunner {

	public static void main(String[] args) {
		
			List<ProductsDto> pdto = new ArrayList<ProductsDto>();
			pdto.add(new ProductsDto("Keyboard",5046,2));
			pdto.add(new ProductsDto("Mouse",3000,4));
			pdto.add(new ProductsDto("speaker",5749,1));
			System.out.println(pdto);
			Comparator<ProductsDto> ref = (ProductsDto s1, ProductsDto s2)-> s1.getPrice().compareTo(s2.getPrice());	
//			Comparator<ProductsDto> ref1 = (ProductsDto s1, ProductsDto s2)-> s1.getQuantity().compareTo(s2.getQuantity());	
//			Comparator.comparing(ProductsDto::getPrice() )
			Collections.sort(pdto, ref);
			System.out.println(pdto);
		}


		}
		
		


