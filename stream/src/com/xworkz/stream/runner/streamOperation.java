package com.xworkz.stream.runner;

import java.util.ArrayList;
import java.util.List;

public class streamOperation {

	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		list.add("Chips");
		list.add("Cake");
		list.add("Chocalate");
		list.add("Ice cream");
		list.add("Soda");
		list.add("Egg puff");
		
		list.stream().skip(2).limit(3).sorted().forEach(s-> System.out.println(s));
		
	}

}
