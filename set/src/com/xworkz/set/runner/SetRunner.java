package com.xworkz.set.runner;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Spliterator;

public class SetRunner {

	public static void main(String[] args) {
		Set<String> degree = new LinkedHashSet<String>();
		System.out.println("Degree:");
		degree.add("Bachelor of Engeeniring");
		degree.add("Bachelor of science");
		degree.add("Bachelor of commerce");
		degree.add("Bachelore of computer");
		degree.add("Bachelore of science");
		degree.forEach(s -> System.out.println(s));

		boolean result1 = degree.contains("Bachelor of commerce");
		System.out.println("is degree prsent:" + result1);

		boolean result2 = degree.equals("Bachelore of science");
		System.out.println("is degree equals:" + result2);

		boolean result3 = degree.isEmpty();
		System.out.println("is degree empty:" + result3);

		int result4 = degree.hashCode();
		System.out.println("Hash code:" + result4);

		boolean result5 = degree.remove("Bachelore of computer");
		System.out.println("remove:" + result5);
		// degree.forEach(s->System.out.println(s));

		int result6 = degree.size();
		System.out.println("size:" + result6);

		Object[] result8 = degree.toArray();
		for (Object array : result8) {
			System.out.println("To Array:" + array);
		}

		Object[] result9 = degree.toArray();
		System.out.println("To array");
		for (Object array : result9) {
			System.out.println("To Array:" + array);
		}

	}

}
