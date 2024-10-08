package com.edge.exception.things;

public class Details implements Cloneable {
	
	public String name;
	public int income;
	
	public Details clone() throws CloneNotSupportedException{
		System.out.println("Clone method Invoked");
		return (Details)super.clone();
	}

	@Override
	public String toString() {
		return "Details [name=" + name + ", income=" + income + "]";
	}
	
	
	
	
	

}
