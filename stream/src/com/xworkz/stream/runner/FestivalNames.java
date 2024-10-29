package com.xworkz.stream.runner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FestivalNames {
	public static void main(String[] args) {
		List<String> festival =new ArrayList<String>();
		festival.add("Diwali");
		festival.add("Dasara");
		festival.add("Navarathri");
		festival.add("Ganesha Chathurthi");
		festival.add("Sankaranthi");
		festival.add("Ganesha Chathurthi");
		festival.add("Dasara");
		festival.add("Shivarathri");
		
		System.out.println("======Distinct element=========");
		festival.stream().distinct().forEach(e->System.out.println(e));
		
		System.out.println("======Skip, limit,sorted=======");
		festival.stream().skip(3).limit(3).sorted().forEach(s-> System.out.println(s));
		System.out.println("=============");
		Comparator<String> comparator=(String s1,String s2)-> s2.compareTo(s1);
		festival.stream().sorted(comparator).forEach(s->System.out.println(s));
		
		System.out.println("Find Any");
		Optional<String> optional=festival.stream().findAny();
		System.out.println(optional);
		
	}

}
