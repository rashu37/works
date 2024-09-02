package com.google.productinfo.util;

import com.google.productinfo.dto.ProductInfoDto;

public class ProductInfoCheck {

	public static boolean idCheck(long idNum) {
		String valid = String.valueOf(idNum);
		if (valid.length() == 8) {
			return false;

		}
		return true;
	}

	public static boolean checkDuplicate(ProductInfoDto[] productInfodto, ProductInfoDto infodto) {
		System.out.println("Checking duplicate");
		for (ProductInfoDto productInfoDto2 : productInfodto) {
			if (productInfoDto2 != null && productInfoDto2.equals(infodto)) {
				return true;
			}

		}
		return false;
	}

}
