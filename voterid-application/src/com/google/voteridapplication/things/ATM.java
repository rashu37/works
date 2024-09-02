package com.google.voteridapplication.things;

public class ATM {
	
	
	public void getamount(int amount[]) {
		
		int onehundread=0;
		int twohundread=0;
		int fivehundread=0;
		int twothousand=0;
		
		for(int index=0; index<amount.length; index++) {
			if(amount[index]==100) {
				onehundread++;
			}else if(amount[index]==200){
				twohundread++;
			}else if(amount[index]==500) {
				fivehundread++;
			}else if(amount[index]==2000) {
				twothousand++;
		}
			
	}
		System.out.println("One hundread total count: "+onehundread);
		System.out.println("two hundread total count: "+twohundread);
		System.out.println("five hundread total count:"+ fivehundread);
		System.out.println("two thousand total count: "+twothousand);

}
}