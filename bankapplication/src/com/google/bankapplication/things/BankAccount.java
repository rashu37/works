package com.google.bankapplication.things;

public class BankAccount {
	
	private String name;
	private String bankname;
	private double balance;
	private String accnum;
	private String adharnum;
	
	public void setname(String name) {
		this.name=name;
	}
    public String getname() {
    	return this.name;
    }
    
    public void setbankname(String bankname) {
    	this.bankname=bankname;
    }
    
    public String getbankname() {
    	return this.bankname;
    }
    
    public void setbalance(double balance) {
    	this.balance=balance;
    }
    public double getbalance() {
    	return this.balance;
    }
    
    public void setaccnum(String accnum) {
    	this.accnum=accnum;
    	
    }
    public String getaccnum() {
    	return this.accnum;
    }
    
    public void setadharnum(String adharnum) {
    	this.adharnum=adharnum;
    }
    public String getadharnum() {
    	return this.adharnum;
    }
    
    public void details(String name,double balance,String bankname) {
    	if(balance<500) {
    		System.out.println("Please maintain bank balance");
    		}
    }
    
    public void details2(double balance) {
    	if(balance>500 && balance<10000) {
    		balance=balance+(balance*0.01);
    		System.out.println(" Total balance with 10% intrest:"+ balance);
    	}
    }
    
    public void details3(double balance) {
    	if(balance>10000 && balance<50000) {
    		balance=balance+(balance*0.02);
    		System.out.println(" Total balance with 20% intrest:"+ balance);
    	}
    }
    
    public void withdraw(int amount) {
    	if(amount<1000) {
    		System.out.println("Cannot withdraw, improper balance:"+amount);
    	}else {
    		System.out.println("Amount is drawn");
    	}
    }
    
    
}
