package com.edge.exception.things;

public class Mobile implements Cloneable {
	
	 public String name;
	   public int price;
	   public String brand;
	   public byte storage;
	   public int mb;
	   public long number;
	   
	   public Mobile clone() throws CloneNotSupportedException {
		  return (Mobile)super.clone();
	   }

	@Override
	public String toString() {
		return "Mobile [name=" + name + ", price=" + price + ", brand=" + brand + ", storage=" + storage + ", mb=" + mb
				+ ", number=" + number + "]";
	}
	   
	   

}
