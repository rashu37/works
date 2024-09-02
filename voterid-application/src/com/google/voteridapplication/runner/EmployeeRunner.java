package com.google.voteridapplication.runner;

import com.google.voteridapplication.things.Employee;

public class EmployeeRunner {

	public static void main(String[] args){
		
		
		int price[]= {25000,12176,24757,24765,20000,23000,18000,24986};
		Employee employee=new Employee ("Sahithi",price);
		
		int total=employee.getanuualsalary(employee.salary);
		System.out.println("total anuual salary: "+ total);
		
		employee.getmonthlysalary(employee.salary);
		
		int maximum=employee.getmaximum(employee.salary);
		System.out.println("Maximum salary:"+ maximum);
		
		int minimum=employee.getminimum(employee.salary);
		System.out.println("Minimum salary:"+ minimum);
		
		
		

	}

}
