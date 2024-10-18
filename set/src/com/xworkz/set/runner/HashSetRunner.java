package com.xworkz.set.runner;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Spliterator;

public class HashSetRunner {

	public static void main(String[] args) {
		Set<String> items = new HashSet<String>();
		System.out.println("Snacks Items:");
		items.add("Ice creme");
		items.add("Cake");
		items.add("Chocolate");
		items.add("Pizza");
		items.add("Egg rolls");
		items.forEach(i -> System.out.println(i));

		boolean result1 = items.contains("Chocolate");
		System.out.println("is item prsent:" + result1);

		boolean result2 = items.equals("Ice creme");
		System.out.println("is item equals:" + result2);

		boolean result3 = items.isEmpty();
		System.out.println("is item empty:" + result3);

		int result4 = items.hashCode();
		System.out.println("Hash code:" + result4);

		boolean result5 = items.remove("Egg rolls");
		System.out.println("remove:" + result5);
		// items.forEach(s->System.out.println(s));

		int result6 = items.size();
		System.out.println("size:" + result6);

		Object[] result8 = items.toArray();
		for (Object array : result8) {
			System.out.println("To Array:" + array);
		}

		Object[] result9 = items.toArray();
		System.out.println("To array");
		for (Object array : result9) {
			System.out.println("To Array:" + array);
		}

		items.clear();
		System.out.println("After clear");
		items.forEach(s -> System.out.println(s));

	}

}
