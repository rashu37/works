package com.google.bankapplication.runner;

import com.google.bankapplication.things.BankAccount;

public class BankAccountRunner {

	public static void main(String[] args) {
	
		BankAccount bank=new BankAccount();
		
		bank.setname("Sihi");
		bank.setbankname("SBI");
		bank.setbalance(25000.45);
		bank.setaccnum("IFSC345676");
		bank.setadharnum("8957604860");
		
		if(bank.getaccnum().length()==10) {
			System.out.println("Account holder name: "+bank.getname()+ ","+ " Bank name:"+ bank.getbankname());
		}
		if(bank.getaccnum().length()==10) {
			System.out.println("Aadhar number: "+ bank.getadharnum());
		}
		
		bank.details("Seetha",300, "ICICI");
		
		bank.details2(4000);
		bank.details3(30000);
		
		bank.withdraw(500);
		

	}

}
