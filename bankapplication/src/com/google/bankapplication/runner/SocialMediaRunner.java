package com.google.bankapplication.runner;
import com.google.bankapplication.things.AccountDetails;
public class SocialMediaRunner {

	public static void main(String[] args) {
		
		AccountDetails accountdetails=new AccountDetails();
		
     System.out.println("Username:"+ accountdetails.getName());
     System.out.println("Followers on account:"+accountdetails.getFollowers());
     System.out.println("Following on acount:"+accountdetails.getFollowing());
     System.out.println("Password:"+accountdetails.getPassword());
     
     System.out.println(accountdetails.toString());
     
	}

}
