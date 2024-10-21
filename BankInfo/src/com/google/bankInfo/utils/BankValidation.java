package com.google.bankInfo.utils;

public class BankValidation {
	
	public static boolean validId(int id) {
		if(id!=0 && id>10) {
			return true;
		}
		return false;
	}
		
		public static boolean validName(String name) {
			if(name.length()>3) {
				return true;
			}
			return false;
		}
		
		public static boolean validNum(long num) {
			String valid=String.valueOf(num);
			if(valid.length()==10) {
				return true;
				
			}
			return false;
		}
		}
	


