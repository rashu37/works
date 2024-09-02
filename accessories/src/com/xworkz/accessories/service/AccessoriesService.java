package com.xworkz.accessories.service;

import com.xworkz.accessories.abstracts.AbstarctAccessories;
import com.xworkz.accessories.dto.AccessoriesDto;

public class AccessoriesService extends AbstarctAccessories {

	private AccessoriesDto[] accessories = new AccessoriesDto[4];
	private int index = 0;

	public String onSave(AccessoriesDto dto) {
		if (name(dto.getName()) && brand(dto.getBrand()) && price(dto.getPrice()) && ratings(dto.getRatings())
				&& color(dto.getColor()) && type(dto.getType())) {
			System.out.println("Accessories details is saved");
			if (this.index < accessories.length) {
				accessories[index] = dto;
				index++;
			}
		} else {
			System.out.println("Accessories details not saved");
			return "not saved";
		}
		return "Saved";
	}

	@Override
	public boolean name(String name) {
		System.out.println("Name method is Running");
		if (name != null) {
			if (name.isEmpty() && name.isBlank()) {
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
			if (brand.isEmpty() && brand.isBlank()) {
				System.out.println("brand is not saved");
				return false;
			}
		}
		return true;

	}

	@Override
	public boolean price(double price) {
		System.out.println("Price method is Running");
		if (price != 0 && price <= 1000) {
			System.out.println("price is not  saved");
			return false;
		}
		return true;
	}

	@Override
	public boolean ratings(double ratings) {
		System.out.println("Ratings method is Running");
		if (ratings != 0 && ratings <= 5) {
			System.out.println("Ratings is not  saved");
			return false;
		}
		return true;

	}

	@Override
	public boolean color(String color) {
		System.out.println("Color method is Running");
		if (color != null && color.isEmpty() && color.isBlank()) {
			System.out.println("Color is not  saved");
			return false;

		} else {
			// System.out.println("Color is saved");
			return true;
		}

	}

	@Override
	public boolean type(String type) {
		System.out.println("Type method is Running");
		if (type != null && type.isEmpty() && type.isBlank()) {
			System.out.println("Type method is not  saved");
			return false;
		} else {
			// System.out.println("Type method is saved");
			return true;
		}

	}

	public void read() {
		for (int i = 0; i < accessories.length; i++) {
			System.out.println(accessories[i]);
		}
	}
}
