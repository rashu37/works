package com.bing.product.runner;

import java.util.Scanner;

import com.bing.product.dto.ProductDto;
import com.bing.product.repository.ProductRepositoryImplimentation;
import com.bing.product.service.ProductService;
import com.bing.product.service.ProductServiceImplimentation;

public class ProductRunner {

	public static void main(String[] args) {

        System.out.println("Enter the Choice below");
		
		System.out.println("Enter '1' to save the ComplaintDto");
		System.out.println("Enter '2' to Read ComplaintDto");
		System.out.println("Enter '3' to update");
		System.out.println("Enter '4' to delete");
		
		Scanner scanner= new Scanner(System.in);
		int choice=scanner.nextInt();
		
		ProductDto dto1=new ProductDto();
		dto1.setProductId(1);
		dto1.setProductName("Table");
		dto1.setProductPrice(4200);
		dto1.setProductDelivaryPlace("Bengaluru");
		
		ProductService service=new ProductServiceImplimentation(new ProductRepositoryImplimentation());
		
		while(choice<=4) {
			switch(choice) {
			case 1:
				String result=service.validate(dto1);
				System.out.println(result);
				break;
			case 2:
				System.out.println(service.getAll());
				break;
			case 3:
				ProductDto dto2=new ProductDto();
				dto2.setProductId(2);
				dto2.setProductName("Washing machine");
				dto2.setProductPrice(10000);
				dto2.setProductDelivaryPlace("Mysore");
				String update =service.updateById(1, dto2);
				System.out.println(update);
				
				System.out.println(service.getAll());
				break;
				
				
			case 4:
				String delete=service.deleteById(2, dto1);
				System.out.println(delete);
				System.out.println(service.getAll());
				break;
				
				default:
				System.out.println("Enter proper values");
				}
			choice=scanner.nextInt();
		}
				
				
			}
		

}
