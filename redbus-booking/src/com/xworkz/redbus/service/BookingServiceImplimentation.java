package com.xworkz.redbus.service;

import com.xworkz.redbus.dto.BusBookingDto;
import com.xworkz.redbus.repository.BookingRepository;
import com.xworkz.redbus.repository.BookingRepositoryImplimentation;

public class BookingServiceImplimentation implements BookingService {
	
	BookingRepository service=new BookingRepositoryImplimentation();

	@Override
	public String onSave(BusBookingDto dto) {
		if(dto!=null) {
			if(service.onSave(dto)) {
				System.out.println("Saved");
				return "Saved Successfully";
			}
		}
		return "Not Saved Successfully";
	}

	@Override
	public void read() {
		service.read();
		
	}

	@Override
	public String update(String busNumber, BusBookingDto dtobus) {
		System.out.println("Update method is Running");
		if(service.update(busNumber, dtobus)) {
			System.out.println("Updated");
			return "Updated Successfully";
		}
		return "Not Updated Successfully";
	}

	@Override
	public String delete(String busNumber) {
		if(busNumber!=null) {
		if(service.delete(busNumber)) {
			System.out.println("Delete Done");
			return "Deleted";
		}
		}
		return "Not Deleted";
	}
	

	
}
