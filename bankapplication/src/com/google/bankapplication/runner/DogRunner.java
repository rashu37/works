package com.google.bankapplication.runner;
import com.google.bankapplication.things.Dogs;
import com.google.bankapplication.things.GoldenRetrivier;
import java.util.Date;

public class DogRunner {

	public static void main(String[] args) {
		
	Dogs dog=new Dogs();
	GoldenRetrivier golden=new GoldenRetrivier();
	Date date=new Date();
	System.out.println(golden.birthdetils("Labrador","white",date,2.5,"Female"));
	

	}
}
