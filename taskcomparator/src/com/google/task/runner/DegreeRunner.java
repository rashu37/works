package com.google.task.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.List;


public class DegreeRunner {

	public static void main(String[] args) {
		List<String> degree = new ArrayList<String>();
		System.out.println("Degree:");
		degree.add("Bachelor of Engeeniring");
		degree.add("Bachelor of science");
		degree.add("Bachelor of commerce");
		degree.add("Bachelore of computer");
		degree.add("Bachelore of science");
		System.out.println(degree);
		
		Comparator<String> comparator1 = (String s1, String s2) -> {

			if (s1 == null)
				return 0;
			else if (s2 == null)
				return 0;
			else
				return s2.compareToIgnoreCase(s1);

		};
        System.out.println("After Sorting");
		Collections.sort(degree, comparator1);
		System.out.println("Sorted list with Null");
		


	}

}
