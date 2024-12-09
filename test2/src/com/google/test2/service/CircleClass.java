package com.google.test2.service;

public class CircleClass extends ShapeAbstract{
    @Override
	public String calculateArea(double r) {
		double pi = 3.142;
		double area= (pi*(r*r));
		System.out.println(area);
		return " Circle Area:Result";
		
		
	}

	@Override
	public String calculaterectArea(double l, double w) {
		double a= l*w;
	    System.out.println(a);
		return "Rectangle Area:Result";
	}

	

}
