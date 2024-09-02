package com.google.tasks.things;

public class Users {

	
	public String username;
	public String password;
	public String email;
	public Address address;
	
	
	public Users(String username, String password, String email, Address address) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.address = address;
	}


	@Override
	public String toString() {
		return "Users [username=" + username + ", password=" + password + ", email=" + email + ", address=" + address
				+ "]";
	}
	
}
