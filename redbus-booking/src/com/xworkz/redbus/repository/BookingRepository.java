package com.xworkz.redbus.repository;

import com.xworkz.redbus.dto.BusBookingDto;

public interface BookingRepository {
	
	boolean onSave(BusBookingDto dto);
	//BusBookingDto[] read();
	void read();
	boolean update(String busNumber,BusBookingDto dtobus);
	boolean delete(String busNumber);
}
