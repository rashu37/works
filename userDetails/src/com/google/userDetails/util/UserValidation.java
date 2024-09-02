package com.google.userDetails.util;

public class UserValidation {
	public static boolean emailValid(String useremail) {
		String valid[]=useremail.split("");
		for(String email:valid) {
			if(email.equals("@")) {
				return true;
			}
		}
		return false;

}
	
	public static boolean contactCheck(long phoneNum) {
		String valid=String.valueOf(phoneNum);
		if(valid.length()==10) {
			return true;
			
		}
		return false;
	}
	
	public static boolean adharCheck(long adharNum) {
		String valid=String.valueOf(adharNum);
		if(valid.length()==12) {
			return true;
			
		}
		return false;
	}
	
	
}
