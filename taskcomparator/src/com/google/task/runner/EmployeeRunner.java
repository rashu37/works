package com.google.task.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.google.task.dto.EmployeeDto;
import com.google.task.dto.ProductsDto;

public class EmployeeRunner {

	public static void main(String[] args) {
		List<EmployeeDto> employees = new ArrayList<>();
		employees.add(new EmployeeDto(101, "shree", 450000));
		employees.add(new EmployeeDto(102, "laxmi", 600000));
		employees.add(new EmployeeDto(103, "Candu", 550000));
		System.out.println(employees);
			Comparator<EmployeeDto> ref = (EmployeeDto s1, EmployeeDto s2)-> s2.getId().compareTo(s1.getId());
			Collections.sort(employees, ref);
			System.out.println(employees);
	}
}
