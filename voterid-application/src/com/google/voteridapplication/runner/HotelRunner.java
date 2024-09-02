package com.google.voteridapplication.runner;
import com.google.voteridapplication.things.Hotel;
public class HotelRunner {

	public static void main(String[] args) {
		
		Hotel hotel=new Hotel();
		
		int get=hotel.getlength();
		System.out.println(" "+ get);
		
		String getnames=hotel.savenames("Krishna hotel");
		String getnames1=hotel.savenames("Hari hotel");
		String getnames2=hotel.savenames("Vishnu hotel");
		String getnames3=hotel.savenames("Madhavan hotel");
		System.out.println(" "+ getnames);
		
		hotel.read();
		
		String getupdate=hotel.update("Hari hotel","Radha hotel");
		System.out.println(" "+ getupdate);
		hotel.read();
		
		String getdelete=hotel.delete("Madhavan hotel");
		System.out.println(" "+ getdelete);
		hotel.read();
		
		hotel.search("Vishnu hotel");
		hotel.read();

	}

}


