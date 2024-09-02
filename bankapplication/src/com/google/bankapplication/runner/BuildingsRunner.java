package com.google.bankapplication.runner;
import com.google.bankapplication.things.Buildings;
import com.google.bankapplication.things.Apartment;

public class BuildingsRunner{

	public static void main(String[] args){
		
		Buildings buildings=new Buildings();
		Apartment apartment=new Apartment();
	    System.out.println(buildings.buildingsdetails("Shree Krishna",15000,"Bengaluru",(byte)24));
		}

}
