package com.google.userDetails.service;

import com.google.userDetails.constant.GenderConstant;
import com.google.userDetails.dto.UserInfoDto;
import com.google.userDetails.util.UserValidation;

public class UserDetails extends UserDetailsAbstract {

	public UserInfoDto[] userdto = new UserInfoDto[3];
	public int index = 0;

	@Override
	public String onsave(UserInfoDto userinfo) {
		System.out.println("On save Method Running");
		if (userinfo != null && userinfo.getUserName().length() >= 3) {
			System.out.println("Saved info");
		} else if (userinfo.getUserName().isEmpty() && userinfo.getUserName().isBlank()) {
			System.out.println("not saved");
		}
		return "not saved";

	}

	@Override
	public String email(UserInfoDto userinfo) {
		System.out.println("Email method Running");
		if (userinfo != null && UserValidation.emailValid(userinfo.getEmailId())) {
			System.out.println("Email Id is saved");
		} else {
			System.out.println("Email Id is invalid");
		}
		return "not saved";
	}

	@Override
	public String designation(UserInfoDto userinfo) {
		System.out.println("Designation Method Running");
		if (userinfo != null && userinfo.getDesignation().length() >= 3) {
			System.out.println("Saved info");
		} else if (userinfo.getDesignation().isEmpty() && userinfo.getUserName().isBlank()) {
			System.out.println("not saved");
		}
		return "not saved";

	}

	@Override
	public String education(UserInfoDto userinfo) {
		System.out.println("Education Method Running");
		if (userinfo != null && userinfo.getEducation().length() >= 3) {
			System.out.println("Saved info");
		} else if (userinfo.getEducation().isEmpty() && userinfo.getEducation().isBlank()) {
			System.out.println("not saved");
		}
		return "not saved";
	}

	@Override
	public String address(UserInfoDto userinfo) {
		System.out.println("Address Method Running");
		if (userinfo != null && userinfo.getAddress().length() >= 3) {
			System.out.println("Saved info");
		} else if (userinfo.getAddress().isEmpty() && userinfo.getAddress().isBlank()) {
			System.out.println("not saved");
		}
		return "not saved";
	}

	@Override
	public String age(UserInfoDto userInfo) {
		System.out.println("Age method is Running");
		if (userInfo != null && userInfo.getAge() > 0) {
			System.out.println("Age is saved");

		} else {
			System.out.println("Age is not saved");
		}
		return "not saved";
	}

	@Override
	public String gender(UserInfoDto userInfo) {
		System.out.println("Gender is Running");
		if (userInfo != null) {
			if (GenderConstant.FEMALE.equals(userInfo.getGender())
					|| GenderConstant.MALE.equals(userInfo.getGender())) {
				System.out.println("Gender is saved");
			}
		} else {
			System.out.println("Gender is not saved");

		}
		return "Not saved";
	}

	@Override
	public String contact(UserInfoDto userinfo) {
		System.out.println("Contact method is Running");
		if (userinfo != null && UserValidation.contactCheck(userinfo.getContactNumber())) {
			System.out.println("Phone Number is saved");
		} else {
			System.out.println("Not saved");
		}
		return "not saved";
	}

	@Override
	public String adhar(UserInfoDto userInfo) {
		System.out.println("Adhar method is Running");
		if (userInfo != null && UserValidation.adharCheck(userInfo.getAdharCardNumber())) {
			System.out.println("Adhar Number is saved");
		} else {
			System.out.println("Not saved");
		}
		return "not saved";
	}
}
