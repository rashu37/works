package com.google.productinfo.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.google.productinfo.abstracts.ProductValidation;
import com.google.productinfo.constant.BrandNames;
import com.google.productinfo.dto.ProductInfoDto;
import com.google.productinfo.services.ProductService;

public class ProductInfoRunner {

	public static void main(String[] args) {
		ProductInfoDto productdto = new ProductInfoDto();
		ProductValidation product = new ProductValidation();

		product.name("creams");
		product.price(10000);
		product.productId(89747873l);

		ProductService service = new ProductService();

		ProductInfoDto productdto1 = new ProductInfoDto("Shoes", BrandNames.ADIDAS.toString(), 2500, 78645343l,
				LocalDate.of(2021, 3, 23), LocalDateTime.of(2024, 8, 26, 12, 12));

		ProductInfoDto productdto2 = new ProductInfoDto("Sweets", BrandNames.HALDIRAMS.toString(), 2340, 78687343l,
				LocalDate.of(2019, 5, 2), LocalDateTime.of(2023, 7, 13, 11, 11));

		ProductInfoDto productdto3 = new ProductInfoDto("Makeup Kit", BrandNames.NYKAA.toString(), 3000, 87346543l,
				LocalDate.of(2018, 3, 13), LocalDateTime.of(2022, 8, 23, 10, 10));

		// ProductInfoDto productdto4=new ProductInfoDto("Makeup kit ",
		// BrandNames.NYKAA.toString(), 3000, 87346543l,
		// LocalDate.of(2018, 3, 13), LocalDateTime.of(2022, 8, 23, 10, 10));

		ProductInfoDto productdto4 = new ProductInfoDto("T-shirt", BrandNames.PUMA.toString(), 2340, 67983343l,
				LocalDate.of(2022, 5, 3), LocalDateTime.of(2020, 3, 11, 19, 19));
		service.onSave(productdto1);
		service.onSave(productdto2);
		service.onSave(productdto3);
		service.onSave(productdto4);

		service.read();
    
		service.update("Sweets", "Khara");
		
		service.delete(67983343);
		service.read();
	}

}
