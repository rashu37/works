package com.google.railwaybooking.repo;

import com.google.railwaybooking.dto.PersonalDetails;
import com.google.railwaybooking.dto.RailwayDetails;

public  interface RailwayRepo {
	
	public boolean save(RailwayDetails dto);
	
	void read(RailwayDetails dto);
	
	public boolean update(long adharNum,String newDeparc,int totalAmount);
	
	public RailwayDetails find(String name);

}
