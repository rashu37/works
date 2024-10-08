package com.edge.exception.runner;

import com.edge.exception.things.Mobile;

public class MobileRunner {

	public static void main(String[] args) {
		
		Mobile mobile =new Mobile();
		mobile.name="Grishma";
		mobile.price=25000;
		mobile.number=7657847567l;
		mobile.brand="Samsung";
		mobile.storage=15;
		mobile.mb=1000;
		System.out.println(mobile);
		
		try {
			Mobile mobile1=(Mobile)mobile.clone();
			System.out.println(mobile1);
			mobile1.name="Shivu";
			mobile1.price=30000;
			mobile1.number=6755435377l;
			mobile1.brand="iphone";
			mobile1.storage=30;
			mobile1.mb=10000;
			System.out.println("After Changing");
			System.out.println(mobile1);
			
			
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
			
		}
		
				

	}

}
