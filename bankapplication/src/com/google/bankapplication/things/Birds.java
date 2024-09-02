package com.google.bankapplication.things;

public class Birds {
	public String names;
	public int age;
	public String location;
	public int price;
	
	public String birdsinfo(String names,int age,String location,int price) {
		return "Birds details:"+ "Name:"+ names+ ","+ "Age:"+age+ ","+ "Location:"+location+","+"Price:"+price;
	}

}
