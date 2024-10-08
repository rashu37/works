package com.edge.exception.runner;

import com.edge.exception.things.Details;

public class DetailsRunner {

	public static void main(String[] args) {
		
		Details details=new Details();
		details.name="Seetha";
		details.income=35000;
		System.out.println(details);
		
		try {
			Details details1=details.clone();
			System.out.println("Before Chaning"+details1);
			details1.name="Rohini";
			details1.income=4000000;
			
			System.out.println("After Chaning"+details1);
		}   catch(CloneNotSupportedException e) {
		     e.printStackTrace();
	}
	}

}
