package com.google.railwaybooking.repo;

import com.google.railwaybooking.dto.PersonalDetails;
import com.google.railwaybooking.dto.RailwayDetails;

public class RailwayRepoImplimentation implements RailwayRepo {
	
	private RailwayDetails listofDto[]=new RailwayDetails[4];
	private int index=0;

	@Override
	public boolean save(RailwayDetails dto) {
		if(dto!=null) {
			if(this.index<listofDto.length) {
				listofDto[index]=dto;
				index++;
				return true;
			}
		}
		return false;
	}

	@Override
	public void read(RailwayDetails dto) {
		if(dto!=null) {
			for (int i = 0; i < listofDto.length; i++) {
				System.out.println(listofDto[i]);
			}
		}
		
	}

	@Override
	public boolean update(long adharNum,String newDeparc,int totalAmount) {
	    for (int i = 0; i < listofDto.length; i++) {
	    	RailwayDetails details=listofDto[i];
	    	if(details.getDetails().getAdharNum()==adharNum) {
	    		details.setDeparture(newDeparc);
	    		details.getDetails().setTotalAmount(totalAmount);
				//listofDto[i].getDetails().setTotalAmount(676);
				//listofDto[i].getDetails().setPhoneNum(8951088116l);
				return true;
			}
		}
		return false;
	}

	@Override
	public RailwayDetails find(String name) {
		for (int j = 0; j < listofDto.length; j++) {
		RailwayDetails details=listofDto[j];
		if(details.getDetails().getName().equalsIgnoreCase(name)) {
		  
//		  System.out.println("Person Details Found:"+listofDto[j]);
		  return details;
		}
		}
		
		return null;
	}
}


