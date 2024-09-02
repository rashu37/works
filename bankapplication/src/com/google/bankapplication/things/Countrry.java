package com.google.bankapplication.things;

public class Countrry {
	
	private String name;
	private String capital;
	private String pm;
	
	public Countrry() {
		System.out.println("Default constructor of Country");
	}
	
	public Countrry(String name,String capital,String pm) {
		this.name=name;
		this.capital=capital;
		this.pm=pm;
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public void setPm(String pm) {
		this.pm = pm;
	}

	public String getName() {
		return name;
	}

	public String getCapital() {
		return capital;
	}

	public String getPm() {
		return pm;
	}
	
	public String toString() {
		return "Country Details:["+"Country name:"+this.name+","+"Capital:"+this.capital+","+"PM:"+pm+"]";
	}
	

}
