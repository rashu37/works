package com.google.userDetails.runner;

import com.google.userDetails.constant.GenderConstant;
import com.google.userDetails.dto.UserInfoDto;
import com.google.userDetails.service.UserDetails;

public class UserInfoDtoRunner {

	public static void main(String[] args) {
		UserInfoDto dto=new UserInfoDto();
		UserDetails user=new UserDetails();
		dto.setUserName("Romi");
		user.onsave(dto);
		
		dto.setEmailId("romi@gmail.com");
		user.email(dto);
		
		dto.setDesignation("Software Devloper");
		user.designation(dto);
		
		dto.setAddress("Sanganhal");
		user.address(dto);
		
		dto.setEducation("Sanganhal");
		user.education(dto);
		
		dto.setAge(22);
		user.age(dto);
		
		dto.setGender(GenderConstant.FEMALE);
		user.gender(dto);
        
		dto.setContactNumber(9876246693l);
		user.contact(dto);
		
		dto.setAdharCardNumber(987624669338l);
		user.adhar(dto);
		
	}
	

}
