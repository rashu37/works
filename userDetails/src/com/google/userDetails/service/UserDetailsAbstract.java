package com.google.userDetails.service;

import com.google.userDetails.dto.UserInfoDto;

public abstract class UserDetailsAbstract  {
       
	public abstract String onsave(UserInfoDto userInfo);
	public abstract String email(UserInfoDto userInfo);
	public abstract String designation(UserInfoDto userInfo);
	public abstract String address(UserInfoDto userInfo);
	public abstract String education(UserInfoDto userInfo);
	public abstract String age(UserInfoDto userInfo); 
	public abstract String gender(UserInfoDto userInfo);
	public abstract String contact(UserInfoDto userInfo);
	public abstract String adhar(UserInfoDto userInfo);
	
	
	
}
