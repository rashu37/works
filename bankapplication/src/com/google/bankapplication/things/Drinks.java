package com.google.bankapplication.things;

public class Drinks {
	
	public String type;
	public int rate;
	public String taste;
	public double ratings;
	
	public String info(String type, int rate, String taste,double ratings) {
		return "Info:" + type + ","+ "Price:"+rate+","+ "Taste:"+ taste+"," +"Ratings:"+ ratings;
	}
}
