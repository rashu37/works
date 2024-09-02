package com.google.application.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public class MallsDto {
	
	private String mallNames;
	private String location;
    private LocalDate openingdate;
    private LocalTime openingtime;
    
    public MallsDto() {
    	System.out.println("No arguments constructor");
    }
    
    
	public MallsDto(String mallNames, String location, LocalDate openingdate, LocalTime openingtime) {
		this.mallNames = mallNames;
		this.location = location;
		this.openingdate = openingdate;
		this.openingtime = openingtime;
	}

	public String getMallNames() {
		return mallNames;
	}


	public void setMallNames(String mallNames) {
		this.mallNames = mallNames;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public LocalDate getOpeningdate() {
		return openingdate;
	}


	public void setOpeningdate(LocalDate openingdate) {
		this.openingdate = openingdate;
	}


	public LocalTime getOpeningtime() {
		return openingtime;
	}


	public void setOpeningtime(LocalTime openingtime) {
		this.openingtime = openingtime;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((mallNames == null) ? 0 : mallNames.hashCode());
		result = prime * result + ((openingdate == null) ? 0 : openingdate.hashCode());
		result = prime * result + ((openingtime == null) ? 0 : openingtime.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MallsDto other = (MallsDto) obj;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (mallNames == null) {
			if (other.mallNames != null)
				return false;
		} else if (!mallNames.equals(other.mallNames))
			return false;
		if (openingdate == null) {
			if (other.openingdate != null)
				return false;
		} else if (!openingdate.equals(other.openingdate))
			return false;
		if (openingtime == null) {
			if (other.openingtime != null)
				return false;
		} else if (!openingtime.equals(other.openingtime))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "MallsDto [mallNames=" + mallNames + ", location=" + location + ", openingdate=" + openingdate
				+ ", openingtime=" + openingtime + "]";
	}
	
    

}
