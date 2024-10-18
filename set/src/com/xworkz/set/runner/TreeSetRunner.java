package com.xworkz.set.runner;

import java.util.Set;
import java.util.Spliterator;
import java.util.TreeSet;

public class TreeSetRunner {

	public static void main(String[] args) {

		Set<String> malls = new TreeSet<String>();
		System.out.println("Malls Names:");
		malls.add("City Center");
		malls.add("Orion mall");
		malls.add("Lullu mall");
		malls.add("Mall of asia");
		malls.add("The star");
		malls.forEach(m -> System.out.println(m));

		boolean result1 = malls.contains("Lullu mall");
		System.out.println("is item prsent:" + result1);

		boolean result2 = malls.equals("The star");
		System.out.println("is item equals:" + result2);

		boolean result3 = malls.isEmpty();
		System.out.println("is item empty:" + result3);

		int result4 = malls.hashCode();
		System.out.println("Hash code:" + result4);

		boolean result5 = malls.remove("Orion mall");
		System.out.println("remove:" + result5);
		// malls.forEach(s->System.out.println(s));

		int result6 = malls.size();
		System.out.println("size:" + result6);

		Object[] result8 = malls.toArray();
		for (Object array : result8) {
			System.out.println("To Array:" + array);
		}

		Object[] result9 = malls.toArray();
		System.out.println("To array");
		for (Object array : result9) {
			System.out.println("To Array:" + array);
		}

		malls.clear();
		System.out.println("After clear");
		malls.forEach(s -> System.out.println(s));

	}

}
