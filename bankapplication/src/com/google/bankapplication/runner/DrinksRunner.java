package com.google.bankapplication.runner;
import com.google.bankapplication.things.Drinks;
import com.google.bankapplication.things.Tea;
public class DrinksRunner {

	public static void main(String[] args) {
		
		Drinks drinks=new Drinks();
		Tea tea=new Tea();
		System.out.println(drinks.info("Hot tea", 250, "Very nice", 5.5));
		System.out.println(tea.info("cold tea", 350,"very good", 4.5));
		

	}

}
