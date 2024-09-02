package com.google.tasks.service;

public class Buildings {
	
	private String name;
	private int price;
	private int noofRooms;
	private String address;
	
	public Buildings() {
		System.out.println("Default constructor of Buildings");
	}
	
	public Buildings(String name,int price,int noofRooms,String address) {
		this.name=name;
		this.price=price;
		this.noofRooms=noofRooms;
		this.address=address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setNoofRooms(byte noofRooms) {
		this.noofRooms = noofRooms;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getNoofRooms() {
		return noofRooms;
	}

	public String getAddress() {
		return address;
	}
	
	public void getdetails(String name,int price,int noofRooms,String address) {
		System.out.println("name:"+name+ ","+ "Price"+ price+","+"No of Rooms:"+noofRooms+","+"Address:"+address);
		
	}
	
	

}
