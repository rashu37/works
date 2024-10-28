package com.xworkz.stream.runner;

import java.util.ArrayList;
import java.util.List;

public class StreamRunner {

	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		list.add("Sunday");
		list.add("Monday");
		list.add("Saturday");
		list.add("Tuseday");
		list.add("Monday");
		list.add("Thursday");
		list.add("Friday");
		list.add("Sunday");
		list.add("Saturday");
		list.add("Saturday");
		System.out.println("Days:");
		list.stream().distinct().forEach(s->System.out.println(s));
		
		List<Integer> list1= new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(5);
		list1.add(1);
		list1.add(6);
		list1.add(7);
		list1.add(1);
		list1.add(3);
		System.out.println("Numbers:");
		list1.stream().distinct().forEach(n->System.out.println(n));
		long result=list1.stream().count();
		System.out.println("Total Count:"+result);
		
		int result2=list1.stream().reduce(0, (a, b) -> a + b);
		System.out.println("Total Sum:"+result2);
	}

}
