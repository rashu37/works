package com.xworkz.accessories.service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

import com.xworkz.accessories.abstracts.AbstractShopping;
import com.xworkz.accessories.dto.ShoppingDto;

public class ShoppingService extends AbstractShopping {

	public ShoppingDto[] shopping = new ShoppingDto[3];
	public int index = 0;

	public String onSave(ShoppingDto dto) {
		System.out.println("Onsave method is Running");
		if (name(dto.getName()) == true && brand(dto.getBrand()) == true && price(dto.getPrice()) == true
				&& ratings(dto.getRatings()) == true) {
			System.out.println("Shopping details are saved");
			if (this.index < shopping.length) {
				shopping[index] = dto;
				index++;
			}

		} else {
			System.out.println("Details not Saved");
		}
		return "Not Saved";

	}

	@Override
	public boolean name(String name) {
		System.out.println("Name method is Running");
		if (name != null) {
			if (name.isBlank() && (name.isEmpty())) {
				System.out.println("Name is not saved");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean brand(String brand) {
		System.out.println("Brand method is Running");
		if (brand != null) {
			if (brand.isBlank() && brand.isEmpty()) {
				System.out.println("Brand is not saved");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean price(int price) {
		System.out.println("Price method is Running");
		if (price != 0) {
			if (price <= 1000) {
				System.out.println("Price not saved");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean ratings(double ratings) {
		System.out.println("Rating method is Running");
		if (ratings != 0) {
			if (ratings <= 5) {
				System.out.println("Ratings not saved");
				return false;
			}
		}
		return true;
	}

	public void read() {
		for (int i = 0; i < shopping.length; i++) {
			System.out.println(shopping[i]);

		}
	}

	public boolean delete(String brand) {
		if (brand != null) {
			int i, j;
			for (i = 0, j = 0; i < this.shopping.length; i++) {
				if (!shopping[i].getBrand().equals(brand)) {
					shopping[j++] = shopping[i];
					System.out.println("Deleting method is Running");
				}

			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			shopping = Arrays.copyOf(shopping, j);
			return true;
		}
		return false;
	}
}
