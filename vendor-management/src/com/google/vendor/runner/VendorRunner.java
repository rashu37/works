package com.google.vendor.runner;

import java.util.Scanner;

import com.google.vendor.dto.VendorDto;
import com.google.vendor.repository.VendorRepo;
import com.google.vendor.repository.VendorRepoImpl;
import com.google.vendor.service.VendorService;
import com.google.vendor.service.VendorServiceImpl;

public class VendorRunner {

	public static void main(String[] args) {
		
//		VendorDto vendorDto =new VendorDto();
//		vendorDto.setVendorId(1);
//		vendorDto.setVendorName("Ramamm");
//		vendorDto.setProductName("Laptop");
//		vendorDto.setEmail("Raj@123gmail.com");
//		vendorDto.setVendorNum(276357748l);
//		//System.out.println(vendorDto);
//		
//		//VendorService service=new VendorServiceImpl(VendorRepo);
//		
//		VendorService service=new VendorServiceImpl(new VendorRepoImpl());
//		String result=service.validate(vendorDto);
//         System.out.println(result);
//         
//         
//        VendorDto vendorDto1 =new VendorDto();
// 		vendorDto1.setVendorId(2);
// 		vendorDto1.setVendorName("Sahana");
// 		vendorDto1.setProductName("TV");
// 		vendorDto1.setEmail("Sahana@123gmail.com");
// 		vendorDto1.setVendorNum(86455636l);
//         String result2=service.validate(vendorDto1);
//         service.getAll().forEach(s->System.out.println(s));
//         
//         System.out.println("Update Method Start");
//         
//         String result3=service.updateById(1, vendorDto);
//         System.out.println(result3);
//         service.getAll().forEach(s->System.out.println(s));
//         
//         String result4=service.deleteById(1, vendorDto);
//         System.out.println(result4);
//         System.out.println("After Deleting:");
//         System.out.println(service.getAll());
         
        System.out.println("Enter the Choice below");
		
		System.out.println("Enter '1' to save the ComplaintDto");
		System.out.println("Enter '2' to Read ComplaintDto");
		System.out.println("Enter '3' to update");
		System.out.println("Enter '4' to delete");
		
		Scanner scanner= new Scanner(System.in);
		int choice=scanner.nextInt();
		
		VendorDto vendorDto =new VendorDto();
		vendorDto.setVendorId(1);
		vendorDto.setVendorName("Ramamm");
		vendorDto.setProductName("Laptop");
		vendorDto.setEmail("Raj@123gmail.com");
		vendorDto.setVendorNum(276357748l);
		
		VendorDto vendorDto2 =new VendorDto();
		vendorDto2.setVendorId(3);
		vendorDto2.setVendorName("Ram");
		vendorDto2.setProductName("TV");
		vendorDto2.setEmail("Ram@123gmail.com");
		vendorDto2.setVendorNum(276357748l);
		
		VendorService service=new VendorServiceImpl(new VendorRepoImpl());
		while(choice<=4) {
			switch(choice) {
			case 1:
				String result=service.validate(vendorDto);
				System.out.println(result);
				String result1=service.validate(vendorDto2);
				System.out.println(result1);
				break;
				
			case 2:
				System.out.println(service.getAll());
				break;
			case 3:
				 VendorDto vendorDto1 =new VendorDto();
			 		vendorDto1.setVendorId(2);
			 		vendorDto1.setVendorName("Sahana");
		 		    vendorDto1.setProductName("TV");
			 		vendorDto1.setEmail("Sahana@123gmail.com");
			 		vendorDto1.setVendorNum(86455636l);
			 		String update=service.updateById(1, vendorDto1);
			 		System.out.println(update);
					
					System.out.println(service.getAll());
					break;
			case 4:
					String delete=service.deleteById(2, vendorDto);
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
