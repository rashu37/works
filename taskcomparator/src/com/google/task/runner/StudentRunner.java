package com.google.task.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.google.task.dto.EmployeeDto;
import com.google.task.dto.StudentInfoDto;

public class StudentRunner {

	public static void main(String[] args) {

		List<StudentInfoDto> info = new ArrayList<>();
		info.add(new StudentInfoDto("shree", 22));
		info.add(new StudentInfoDto("laxmi", 23));
		info.add(new StudentInfoDto("Candu", 25));
			
		 Comparator<StudentInfoDto> value=(StudentInfoDto p1,StudentInfoDto p2) -> p2.getName().compareToIgnoreCase(p1.getName());
			Collections.sort(info,value);
			System.out.println(info);
	}
	
	
}
