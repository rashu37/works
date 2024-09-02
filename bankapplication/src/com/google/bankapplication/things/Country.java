package com.google.bankapplication.things;

import java.util.Date;

public class Country {
	
	public String name;
	public int area;
	public String pm;
	public Date date;
	
	public String details(String name,int area, String pm,Date date) {
		return "Details:" + "Country name:"+ name+ ", " +"Area:"+ area + ", "+"Prime minister:"+pm+ "," +"date:"+ date;
	}
	
	
}
