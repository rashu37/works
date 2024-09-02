package com.google.tasks.things;

public class Address {
	
	public String country;
	public String state;
	public String proper;
	public State state2;
	
	
	public Address(String country, String state, String proper, State state2) {
		
		this.country = country;
		this.state = state;
		this.proper = proper;
		this.state2 = state2;
	}


	@Override
	public String toString() {
		return "Address [country=" + country + ", state=" + state + ", proper=" + proper + ", state2=" + state2 + "]";
	}

}
