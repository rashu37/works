package com.xworkz.stream.runner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class AreaNames {

	public static void main(String[] args) {
		List<String> area =new ArrayList<String>();
		area.add("Btm");
		area.add("Mejstick");
		area.add("Bansanakari");
		area.add("WhiteFeild");
		area.add("Bansanakari");
		area.add("Mejstick");
		area.add("Hsr");
		area.add("Btm");
		area.add("Bansanakari");
		area.add("Btm");
		
		System.out.println("======Distinct element=========");
		area.stream().distinct().forEach(e->System.out.println(e));
		
		System.out.println("======Skip, limit,sorted=======");
		area.stream().skip(3).limit(3).sorted().forEach(s-> System.out.println(s));
		System.out.println("=============");
		Comparator<String> comparator=(String s1,String s2)-> s2.compareTo(s1);
		area.stream().sorted(comparator).forEach(s->System.out.println(s));
		
		System.out.println("Find Any");
		Optional<String> optional=area.stream().findAny();
		System.out.println(optional);


	}

}
