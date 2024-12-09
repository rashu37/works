package com.google.test2.service;

public class MethodOverLoading {
	
	public void State(String name) {
		System.out.println("Name:"+ name);
	}
	public void State(String name,int size) {
		System.out.println("Name:"+ name+ ", "+ "Size:"+size);
	}
	
	public void State(String name,int size,String capital) {
		System.out.println("Name:"+ name+ ", "+ "Size:"+size +" ,"+ "Capital:"+ capital);
	}
	

}
