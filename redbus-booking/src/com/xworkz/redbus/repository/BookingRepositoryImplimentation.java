package com.xworkz.redbus.repository;

import java.util.Arrays;

import com.xworkz.redbus.dto.BusBookingDto;

public class BookingRepositoryImplimentation implements BookingRepository {
     private int index=0;
     private BusBookingDto listofDto[]=new BusBookingDto[4];
	@Override
	public boolean onSave(BusBookingDto dto) {
		if(this.index<this.listofDto.length) {
			listofDto[index]=dto;
			index++;
			return true;
		}
		return false;
	}
	/*@Override
	public BusBookingDto[] read() {
		return listofDto;
			
		}*/
	@Override
	public void read() {
		for (int i = 0; i < listofDto.length; i++) {
			System.out.println(listofDto[i]);
		}
		
	}
	@Override
	public boolean update(String busNumber, BusBookingDto dtobus) {
		for (int i = 0; i < listofDto.length; i++) {
			if(listofDto!=null && listofDto[i]!=null && listofDto[i].getBusNumber().equalsIgnoreCase(busNumber)) {
				//listofDto[i].setBusNumber(dtobus.getBusNumber());
			   listofDto[i].setFrom(dtobus.getFrom());
				return true;
			}
		}
		return false;
	}
	@Override
	public boolean delete(String busNumber) {
		if(busNumber!=null ) {
			int i,j;
			for(i=0,j=0; i<listofDto.length; i++) {
				if(listofDto[i]!=null && !listofDto[i].getBusNumber().equals(busNumber)) {
					listofDto[j++]=listofDto[i];
					System.out.println("Deleting method");
					
					}
			}
			listofDto = Arrays.copyOf(listofDto, j);
			return true;
		}
		return false;
	}
		
	}


