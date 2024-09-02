package com.google.application.util;

import com.google.application.dto.MallsDto;

public class MallsDuplicateCheck {
	
	public static boolean checkduplicate(MallsDto[] mallsdto,MallsDto dto) {
		System.out.println("Checking Duplicate");
		for(MallsDto mdto:mallsdto) {
			if(mdto!=null && mdto.equals(dto)) {
				return true;
			}
			
		}
		return false;
	}

}
