package com.google.productinfo.services;

import java.util.Arrays;

import com.google.productinfo.abstracts.ProductValidation;
import com.google.productinfo.dto.ProductInfoDto;
import com.google.productinfo.util.ProductInfoCheck;

public class ProductService {
	ProductValidation validation = new ProductValidation();

	private ProductInfoDto[] productInfodto = new ProductInfoDto[4];
	private int index = 0;

	public String onSave(ProductInfoDto dto) {
		System.out.println("Saving method is Runnning");
		if (validation.name(dto.getProductName()) && validation.price(dto.getPrice())
				&& validation.productId(dto.getProductId())) {
			boolean duplicateresult = ProductInfoCheck.checkDuplicate(productInfodto, dto);
			if (duplicateresult == false) {
				System.out.println("Product details are saved");
				if (this.index < productInfodto.length) {
					productInfodto[index] = dto;
					index++;
				} else {
					System.out.println("Not saved");
				}
			}

		}
		return "saved";
	}

	public void read() {
		for (int i = 0; i < productInfodto.length; i++) {
			System.out.println(productInfodto[i]);

		}
	}

	public void update(String productname, String newproduct) {
		System.out.println("Update method is Running");
		for (int index = 0; index < productInfodto.length; index++) {
			if (productInfodto != null && productInfodto[index].getProductName() != null
					&& productInfodto[index].getProductName().equalsIgnoreCase(productname)) {
				productInfodto[index].setProductName(newproduct);
				System.out.println("Updated" + productInfodto[index]);
			}

		}
	}
	
	public boolean delete(long productID) {
		if (productID != 0) {
			int i, j;
			for (i = 0, j = 0; i < this.productInfodto.length; i++) {
				if (!(productInfodto[i].getProductId()==productID)) {
					productInfodto[j++] = productInfodto[i];
					System.out.println("Deleting method is Running");
				}

			}
			productInfodto = Arrays.copyOf(productInfodto, j);
			return true;
		}
		return false;
	}
}
