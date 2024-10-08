package com.edge.exception.runner;

import com.edge.exception.exceptions.UserDefinedException;

public class LibraryRunner {

	public static void main(String[] args) {
		try {
			String location ="BT";
			if(location.length()<3) {
				throw new UserDefinedException("location is incorrect");
				}else {
					System.out.println("location is correct");
				}
		}catch(UserDefinedException e) {
					e.printStackTrace();
				}
		finally {
			System.out.println("Location is present but incorrect ");
					
				}

	}

}
