package com.google.tasks.things;

public class Application {
	
	public Users users;
	
	

	public Application(Users users) {
		this.users = users;
	}



	@Override
	public String toString() {
		return "Application [users=" + users + "]";
	}
	

}
