package com.google.test2.runner;

import com.google.test2.service.MethodOverLoading;

public class MethodloadingRunner {
	public static void main(String[] args) {
		
		MethodOverLoading loading=new MethodOverLoading();
		loading.State("karnataka");
		loading.State("Karnataka", 2346);
		loading.State("Karnataka", 2343, "New Delhi");
		
		}

}
