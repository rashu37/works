package com.google.railwaybooking.service;

import com.google.railwaybooking.dto.PersonalDetails;
import com.google.railwaybooking.dto.RailwayDetails;
import com.google.railwaybooking.repo.RailwayRepo;
import com.google.railwaybooking.repo.RailwayRepoImplimentation;
import com.google.railwaybooking.utils.Validations;

public class RailwayServiceImplimentation implements RailwayService {

	RailwayRepo railway = new RailwayRepoImplimentation();

	@Override
	public boolean ValidandSave(RailwayDetails dto) {
		if (dto != null) {
			if (dto.getStationName().length() > 5) {
				
			} else {
				System.err.println("Length should be greater than 5");
				return false;
			}
			if (Validations.num(dto.getTrainNum())) {
			} else {
				System.out.println("Number is invalid");
				return false;
			}
			if (Validations.platno(dto.getPlatFromNo())) {
			} else {
				System.out.println("PlatFrom num is Invalid");
				return false;
			}
			if (dto.getDeparture().length() > 10) {
			} else {
				System.out.println("Departure is Invalid");
				return false;
				}
		
			railway.save(dto);
			System.out.println("Details Saved");
			return true;
		}

		System.out.println("Details not Saved");
		return false;
	}

	@Override
	public void read(RailwayDetails dto) {
		railway.read(dto);

	}

	@Override
	public boolean update(long adharNum,String newDeparc,int totalAmount) {
		if(railway.update(adharNum, newDeparc, totalAmount)) {
			System.out.println("Updated successfully");
			return true;
		}
		return false;
	}

	@Override
	public RailwayDetails find(String name) {
		RailwayDetails find = railway.find(name);
		if(find !=null) {
			System.err.println("Person details found");
		return find;
		}else {
			System.err.println("Person details not found");
			return find;
		}
	}
}
