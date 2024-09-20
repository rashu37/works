package com.google.tracker.service;

import com.google.tracker.dto.TrackerInformationDto;
import com.google.tracker.repository.TrackerInfoRepository;
import com.google.tracker.repository.TrackerInfoRepositoryImplimentation;

public class TrackerInformationImplimentation implements TrackerInformation {
	
	TrackerInfoRepository info=new TrackerInfoRepositoryImplimentation();

	@Override
	public boolean setarraysize(int arraysize) {
		if(arraysize>0) {
			if(info.setarraysize(arraysize)) {
			System.out.println("Array size given correct");
			return true;
		}
		}
		else {
			System.out.println("Array size is incorrect,should be greater than 0");
		}
		return false;
	}

	@Override
	public String validateAndSave(TrackerInformationDto listofdto) {
		System.out.println("Save method is on");
		if(listofdto!=null) {
			if(!info.checkDuplicate(listofdto)) {
				if(info.onSave(listofdto)) {
				System.out.println("Saved succsefully ");
				return "saved";
			}
			
		}
		}
		return "not saved";
	}

	@Override
	public void read() {
		info.read();
	}

	@Override
	public String update(int trackerid, TrackerInformationDto dto) {
		if(info.update(trackerid, dto)) {
			System.out.println("Updated");
			return "Updated";
		}
		return "Not updated";
	}

	

	

	

	
			

}

	
	

	


