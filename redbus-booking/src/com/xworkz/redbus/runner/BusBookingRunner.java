package com.xworkz.redbus.runner;

import java.time.LocalDateTime;

import com.xworkz.redbus.dto.BusBookingDto;
import com.xworkz.redbus.service.BookingService;
import com.xworkz.redbus.service.BookingServiceImplimentation;

public class BusBookingRunner {

	public static void main(String[] args) {
		
		BusBookingDto busdto=new BusBookingDto();
		busdto.setBusNumber("KA2362");
		busdto.setFrom("Hydrabad");
		busdto.setTo("Bengaluru");
		busdto.setStartDateTime(LocalDateTime.now());
		busdto.setPrice(300);
		
		BusBookingDto bus=new BusBookingDto();
		bus.setBusNumber("KA6562");
		bus.setFrom("Mysore");
		bus.setTo("Koppal");
		bus.setStartDateTime(LocalDateTime.now());
		bus.setPrice(500);
		
		BookingService booking=new BookingServiceImplimentation();
		booking.onSave(busdto);
		booking.onSave(bus);
		booking.read();
		
		booking.update("KA2362", bus);
		booking.read();
		
		booking.delete("KA6562");
		booking.read();
	}

}
