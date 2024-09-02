package com.google.bankapplication.runner;
import com.google.bankapplication.things.Country;
import java.util.Date;
import com.google.bankapplication.things.State;
public class CountryRunner {

	public static void main(String[] args) {
		 
		Country country=new Country();
		
		State state=new State();
		Date date=new Date();
  System.out.println(state.details("India",345,"Narendra Modi",date));
  //System.out.println(state.info("Karnataka",345,"Narendra Modi",date));
	}

}
