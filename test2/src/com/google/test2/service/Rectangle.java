package com.google.test2.service;




public class Rectangle extends ShapeAbstract {

	@Override
	public String calculateArea(double r) {
   ShapeAbstract shape= new CircleClass();
		
		String result=shape.calculateArea(3);
		System.out.println(result);
		return "Circle Area:result";
	}

	@Override
	public String calculaterectArea(double l, double w) {
	    double a= l*w;
	    System.out.println(a);
		return "Rectangle Area:Result";
	}


}
