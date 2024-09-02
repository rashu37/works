package com.google.tasks.thingsrunner;
//import com.google.tasks.*;
import com.google.tasks.things.Address;
import com.google.tasks.things.Application;
import com.google.tasks.things.State;
import com.google.tasks.things.Users;
public class ApplicationRunner {
	public static void main(String args[]) {
		
		State state=new State("Karnataka","Koppal","yellburga","Sanganahal");
		Address address =new Address("India","karnataka","bengaluru",state);
		Users user=new Users("rashu","09876fgh","rash@gmail.com",address);
		Application application=new Application(user);
		
		
		System.out.println(application);
		
	}
	
	

}
