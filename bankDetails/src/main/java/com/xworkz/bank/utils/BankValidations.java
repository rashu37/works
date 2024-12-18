package com.xworkz.bank.utils;

public class BankValidations {
	
	
	private BankValidations() {
		
	}
	
	public static boolean number(long accNumber) {
		String valid=String.valueOf(accNumber);
		if(valid.length()==10) {
			return true;
			}
		return false;
	}

}
