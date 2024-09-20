package com.xworkz.redbus.service;

import com.xworkz.redbus.dto.BusBookingDto;

public interface BookingService {
	String onSave(BusBookingDto dto);
	void read();
	String update(String busNumber,BusBookingDto dtobus);
	String delete(String busNumber);


}
