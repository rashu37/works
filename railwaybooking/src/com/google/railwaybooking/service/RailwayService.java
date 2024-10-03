package com.google.railwaybooking.service;

import com.google.railwaybooking.dto.PersonalDetails;
import com.google.railwaybooking.dto.RailwayDetails;

public interface RailwayService {
	
	public boolean ValidandSave(RailwayDetails dto);
	
	void read(RailwayDetails dto);
	
	public boolean update(long adharNum,String newDeparc,int totalAmount);
	
	public RailwayDetails find(String name);

}
