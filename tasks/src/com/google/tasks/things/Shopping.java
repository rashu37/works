package com.google.tasks.things;

public class Shopping {
	public String name;
	public double ratings;
	public int cost;
	public String brand;

	
	public String info(String name,double ratings,int cost) {
		//System.out.println(name+","+ratings+","+cost);
		return "Details are correct: "+ name +","+ ratings+"," +cost ;
	}
	
	public String info(String name,double ratings, int cost,String brand) {
		//System.out.println(name+","+ratings+","+cost+","+brand);
		return "Details are not correct:"+ name +","+ ratings+"," +cost +","+brand;
	}

}
