package com.google.bankapplication.things;

public class Buildings{
	
	public String name;
	public int price;
	public String address;
	public byte noofrooms;
	
	public String buildingsdetails(String name,int price,String address,byte noofrooms) {
		return "Buildings details:" + "Name:"+ name+ ","+"Price:"+price+ ","+ "Address:"+address+","+"No of rooms:"+noofrooms;
	}
	
}
