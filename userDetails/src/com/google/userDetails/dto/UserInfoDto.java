package com.google.userDetails.dto;

import com.google.userDetails.constant.GenderConstant;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class UserInfoDto {
	private String userName;
	private String emailId;
	private long contactNumber;
	private int age;
	private String education;
	private GenderConstant gender;
	private String designation;
	private String address;
	private long adharCardNumber;
	
	
	

}
