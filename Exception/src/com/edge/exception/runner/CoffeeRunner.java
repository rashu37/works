package com.edge.exception.runner;

import java.io.IOException;

public class CoffeeRunner {

	public static void main(String[] args) throws IOException {
		try {
			String name ="Cold coffee";
			if(name.equalsIgnoreCase("Cold coffee")) {
				throw new IOException("Coffee is not there");
				}else {
					System.out.println("Coffee is there");
				}
		}
		finally {
			System.out.println("Coffee is there");
					
				}


	}

}
