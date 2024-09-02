package com.google.voteridapplication.runner;
import com.google.voteridapplication.things.ATM;
public class ATMRunner {

	public static void main(String[] args) {
		
		ATM atm=new ATM();
		
		
		int amount[]= {100,200,500,200,500,100,100,2000,200,100,2000};
		atm.getamount(amount);

	}

}
