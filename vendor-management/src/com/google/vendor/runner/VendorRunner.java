package com.google.vendor.runner;

import com.google.vendor.dto.VendorDto;
import com.google.vendor.repository.VendorRepo;
import com.google.vendor.repository.VendorRepoImpl;
import com.google.vendor.service.VendorService;
import com.google.vendor.service.VendorServiceImpl;

public class VendorRunner {

	public static void main(String[] args) {
		
		VendorDto vendorDto =new VendorDto();
		vendorDto.setVendorId(1);
		vendorDto.setVendorName("Ramamm");
		vendorDto.setProductName("Laptop");
		vendorDto.setEmail("Raj@123gmail.com");
		vendorDto.setVendorNum(276357748l);
		//System.out.println(vendorDto);
		
		//VendorService service=new VendorServiceImpl(VendorRepo);
		
		VendorService service=new VendorServiceImpl(new VendorRepoImpl());
		String result=service.validate(vendorDto);
         System.out.println(result);
         
         
        VendorDto vendorDto1 =new VendorDto();
 		vendorDto1.setVendorId(2);
 		vendorDto1.setVendorName("Sahana");
 		vendorDto1.setProductName("TV");
 		vendorDto1.setEmail("Sahana@123gmail.com");
 		vendorDto1.setVendorNum(86455636l);
         String result2=service.validate(vendorDto1);
         service.getAll().forEach(s->System.out.println(s));
         
         System.out.println("Update Method Start");
         
         String result3=service.updateById(1, vendorDto);
         System.out.println(result3);
         service.getAll().forEach(s->System.out.println(s));
         
         String result4=service.deleteById(1, vendorDto);
         System.out.println(result4);
         System.out.println("After Deleting:");
         System.out.println(service.getAll());
	}

}
