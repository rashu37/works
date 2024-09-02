package com.google.tasks.thingsrunner;
import com.google.tasks.things.Shopping;
public class ShoppingRunner {

	public static void main(String[] args) {
		Shopping shop=new Shopping();
		System.out.println(shop.info("dress", 4.5, 3425));
		System.out.println(shop.info("Sarees", 5.5, 4562,"Zara"));
	}

}
