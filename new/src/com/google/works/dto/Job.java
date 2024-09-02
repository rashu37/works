package com.google.works.dto;

public class Job extends SoftwareEngg {

	@Override
	public void joblocation(String location) {
		System.out.println("Location:"+location);
		
	}

	@Override
	public void salary(int salary) {
		System.out.println("Salary:"+salary);
		
	}

	@Override
	public void experience(int exp) {
		System.out.println("Experience:"+exp);
		
	}
	

}
