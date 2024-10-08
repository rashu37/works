package com.edge.exception.runner;

import com.edge.exception.exceptions.UserDefinedException;

public class UserDefinedRunner {

	public static void main(String[] args) {
		
		try {
			int age=15;
			if(age<18) {
				throw new UserDefinedException("Age is less than 18");
				}else {
					System.out.println("Age is Valid");
				}
		}catch(UserDefinedException e) {
					e.printStackTrace();
				}
		}

	}


