package com.google.tasks.things;

public class ElectronicDevice {
	
	public String name;
	public int price;
	public int warranty;

	public ElectronicDevice() {
		System.out.println("Details of Devices");
	}

	public ElectronicDevice(String name, int price, int warranty) {
		this.name = name;
		this.price = price;
		this.warranty = warranty;
	}
	
	public void details(String name,int price, int warranty) {
		System.out.println("Name:"+name+","+"Price:"+price+","+"Warranty:"+warranty);
		
	}
}
