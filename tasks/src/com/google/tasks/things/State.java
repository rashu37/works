package com.google.tasks.things;

public class State {
	public String name;
	public String dist;
	public String tq;
	public String proper;
	
	
	public State(String name, String dist, String tq, String proper) {
		
		this.name = name;
		this.dist = dist;
		this.tq = tq;
		this.proper = proper;
	}


	@Override
	public String toString() {
		return "State [name=" + name + ", dist=" + dist + ", tq=" + tq + ", proper=" + proper + "]";
	}
	

	
}
