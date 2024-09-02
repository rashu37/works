package com.google.productinfo.abstracts;

import com.google.productinfo.util.ProductInfoCheck;
import com.google.productinfo.dto.ProductInfoDto;

public class ProductValidation extends Abstractproduct {

	@Override
	public boolean name(String name) {
		System.out.println("Name method is running");
		if (name != null) {
			if (name.isEmpty() && name.isBlank()) {
				System.out.println("Name is not saved");
				return false;
			}

		}
		return true;
	}

	@Override
	public boolean price(int price) {
		System.out.println("Price method is Running");
		if (price != 0 && price <= 2000) {
			System.out.println("Price is not saved");
			return false;

		}
		return true;
	}

	@Override
	public boolean productId(long id) {
		System.out.println("Product Id is checking");
		if (id != 0 && ProductInfoCheck.idCheck(id)) {
			System.out.println("Not saved");
			return false;
		}
		return true;
	}

}
