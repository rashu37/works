package com.google.railwaybooking.utils;

import com.google.railwaybooking.dto.PersonalDetails;

public class Validations {
	
	public static boolean num(int number) {
		String valid=String.valueOf(number);
		if(valid.length()==6) {
			return true;
			}
	
	return false;
	}
	
	public static boolean platno(byte num) {
		String result=String.valueOf(num);
		if(result.length()==2 || result.length()==1 ) {
			return true;
			}
	
	return false;
	}
	
	public boolean validDetails(PersonalDetails personaldetail) {
		if(personaldetail.getName().length()>3) {
	}else {
		System.out.println("Name is Invalid");
		return false;
	}
		return true;
	}

}
