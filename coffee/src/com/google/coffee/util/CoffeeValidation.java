package com.google.coffee.util;



public class CoffeeValidation extends AbsatractCoffee {

	@Override
	public boolean name(String name) {
		System.out.println("Name method is Running");
		if(name!=null) {
			if(name.isBlank()&& name.isEmpty()) {
				System.out.println("name is not saved");
				return false;
			}
			}
		return true;
	}

	@Override
	public boolean price(int price) {
		System.out.println("Price method is Running");
		if(price!=0) {
			if(price>500) {
				System.out.println("price is not saved");
				return false;
				
			}
		}
		return true;
	}

	@Override
	public boolean ratings(double ratings) {
		System.out.println("Ratings method is Running");
		if(ratings!=0) {
			if(ratings<5) {
				System.out.println("Ratings is not saved");
				return false;
				
			}
		}
	
		return true;
	}

	@Override
	public boolean location(String location) {
		System.out.println("Location method is Running");
		if(location!=null) {
			if(location.isBlank()&& location.isEmpty()) {
				System.out.println("location is not saved");
				return false;
			}
			}
		return true;
	}

	@Override
	public boolean num(long num) {
		System.out.println("Number is checking");
		if (num != 0 && idCheck(num)) {
			System.out.println("Not saved");
			return false;
		}
		return true;
	}
	

	@Override
	public boolean isgood(boolean isgood) {
		System.out.println("Taste method is Running");
		if(isgood==false) {
			System.out.println("taste is not saved");
				return false;
			
			}
		return true;
		
		
	}
	
	public boolean idCheck(long num) {
		String valid = String.valueOf(num);
		if (valid.length() == 10) {
			return false;

		}
		return true;
	}

	

}
