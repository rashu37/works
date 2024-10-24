package com.google.task.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LastStringSort {

	public static void main(String[] args) {
		
	        List<String> fruits = new ArrayList<>();
	        fruits.add("apple");
	        fruits.add("banana");
	        fruits.add("grape");
	        fruits.add("cherry");
	        fruits.add("mango");

	       
	        Collections.sort(fruits, (s1, s2) -> {
	             return Character.compare(s1.charAt(s1.length() - 1), s2.charAt(s2.length() - 1));
	        });

	        System.out.println("Sorted list: " + fruits);


	}

}
