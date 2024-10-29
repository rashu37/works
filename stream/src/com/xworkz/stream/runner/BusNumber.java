package com.xworkz.stream.runner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


public class BusNumber {

	public static void main(String[] args) {
		List<String> list =new ArrayList<String>();
		list.add("KA3426");
		list.add("KA2323");
		list.add("KA5435");
		list.add("KA8097");
		list.add("KA2110");
		list.add("KA3426");
		list.add("KA8097");
		list.add("KA5435");
		
		System.out.println("======Distinct element=========");
		list.stream().distinct().forEach(e->System.out.println(e));
		
		System.out.println("======Skip, limit,sorted=======");
		list.stream().skip(2).limit(3).sorted().forEach(s-> System.out.println(s));
		System.out.println("=============");
		Comparator<String> comparator=(String s1,String s2)-> s2.compareTo(s1);
		list.stream().sorted(comparator).forEach(s->System.out.println(s));
		
		System.out.println("Find Any");
		Optional<String> optional=list.stream().findAny();
		System.out.println(optional);
		

		        

	}

}
