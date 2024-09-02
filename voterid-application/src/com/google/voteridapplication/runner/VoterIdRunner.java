package com.google.voteridapplication.runner;
import com.google.voteridapplication.things.VoterId;

public class VoterIdRunner {

	public static void main(String[] args) {
	 VoterId voterId =  new VoterId();
	 voterId.setName("Rashmi");
	 
	 System.out.println("name is:"+voterId.getName());
	}

}
