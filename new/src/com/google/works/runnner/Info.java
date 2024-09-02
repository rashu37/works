package com.google.works.runnner;

import java.util.Arrays;
import java.util.Iterator;

public class Info {

	public static void main(String[] args) {
		
		String value="Have a Great Day.";
		char ch[]=value.toCharArray();
		System.out.println(ch.length);
		System.out.println(Arrays.toString(ch));
		System.out.println(value.toUpperCase());
		System.out.println(value.toLowerCase());
		//System.out.println(value.chars().filter(Character::isWhitespace).count());
		int space=0;
		for (int i = 0; i < ch.length; i++) {
			if(Character.isWhitespace(value.charAt(i))) {
				space++;
			}
			
		}
		System.out.println("White Space is:"+space);
		String remove="";
		for (int i = 0; i < ch.length; i++) {
			char complete=value.charAt(i);
			if(complete!= 32) {
				remove=remove+complete;
				
			}
			
		}
		System.out.println("Deleting Space:"+ remove);
		
		for (int j = 0; j < ch.length; j++) {
			if(Character.isDigit(value.charAt(j))){
				//System.out.println("Contains Digit"+" "+value);
			}else {
				//System.out.println("Not contains Digit"+" "+value);
			}
		}
		
	}
}