package com.google.tasks.runner;
import com.google.tasks.service.Apartments;

public class BuildingsRunner {
	public static void main(String[] args) {
	Apartments apartments=new Apartments();
	
	apartments.getdetails("Krishna", 2345, 23, "Bengaluru");
	
	}

}
