package com.google.test2.runner;

import com.google.test2.service.CircleClass;
import com.google.test2.service.ShapeAbstract;

public class CircleRunner {
	public static void main(String[] args) {
		ShapeAbstract shape= new CircleClass();
		
		String result=shape.calculateArea(3);
		System.out.println(result);
		
		String result2=shape.calculaterectArea(2, 4);
		System.out.println(result2);
	}

}
