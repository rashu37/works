package com.google.employee.runner;

import java.util.HashMap;
import java.util.Map;

import com.google.employee.dto.EmployeeService;

public class EmployeeRunner {
	public static void main(String[] args) {

		EmployeeService service = new EmployeeService();
		service.details();

	}

}
