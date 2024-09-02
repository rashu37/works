package com.google.tasks.service;

public class Movies {
	public String name;
	public String language;
	public int cost;
	
	
	public Movies() {
		System.out.println("Movie Details");
	}


	public void moviesinfo(String name, String language, int cost) {
		System.out.println("Name:"+name+","+"Language:"+language+","+"Cost:"+cost);
	}

	
}
