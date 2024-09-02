package com.google.bankapplication.runner;
import com.google.bankapplication.things.Location;
public class CountrryRunner {

	public static void main(String[] args) {
		Location location=new Location();
       System.out.println("Country name:"+location.getName());
       System.out.println("Capital:"+location.getCapital());
       System.out.println("PM:"+location.getPm());
       
       System.out.println(location.toString());
	}

}
