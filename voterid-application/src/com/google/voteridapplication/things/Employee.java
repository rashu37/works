package com.google.voteridapplication.things;

public class Employee {
	
	public String name;
	public int salary[];
	
	public Employee(String name,int salary[]) {
		this.name=name;
		this.salary=salary;
	}
	
	public int getanuualsalary(int amount[]) {
		int total=0;
		for(int index=0; index<amount.length; index++) {
			total=total+amount[index];
		}
		return total;
	}
	
	public void getmonthlysalary(int amount[]) {
		int avg=getanuualsalary(amount)/amount.length;
		System.out.println("Monthly salary: "+ avg);
	}
	
	public int getmaximum(int amount[]) {
		int max=amount[0];
		for(int index=0; index<amount.length; index++) {
			if(amount[index]>max) {
				max=amount[index];
				
			}
		}
		return max;
	}
	
	public int getminimum(int amount[]) {
		int mini=amount[0];
		for(int index=0; index<amount.length; index++) {
			if(amount[index]<mini) {
				mini=amount[index];
				
			}
		}
		return mini;
	}
	

}
