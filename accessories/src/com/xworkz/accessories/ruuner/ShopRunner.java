package com.xworkz.accessories.ruuner;

import java.awt.AlphaComposite;
import java.util.Arrays;

public class ShopRunner {
	public static void main(String[] args) {
		String value="Have a Nice Day";
		char ch[]= value.toCharArray();
		System.out.println(ch.length);
		System.out.println(Arrays.toString(ch));
		
		System.out.println(Character.isUpperCase(value.charAt(0)));
		
		String password="Ra1hu1234";
		char cha[]=password.toCharArray();
		System.out.println(cha.length);
		System.out.println(Arrays.toString(cha));
		if(cha!=null && cha.length>=8 && cha.length<=16) {
			if(Character.isUpperCase(password.charAt(0)) &&
					Character.isLowerCase(password.charAt(1))) {
						if(Character.isDigit(password.charAt(2))){
				//sif(Character.isLowerCase(password.charAt(10))) {
					System.out.println("Saved:" +password);
				
			}
		}
}
}
}



