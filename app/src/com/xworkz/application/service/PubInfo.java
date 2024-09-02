package com.xworkz.application.service;

import java.time.LocalDate;
import java.time.LocalTime;

public class PubInfo {
	
	private Enum pubname;
	private String location;
	private LocalDate openingdate;
	private LocalTime openingtime;
	
	public PubInfo() {
		System.out.println("No arguments constructro");
	}
	
	public PubInfo(Enum pubname, String location, LocalDate openingdate, LocalTime openingtime) {
		
		this.pubname = pubname;
		this.location = location;
		this.openingdate = openingdate;
		this.openingtime = openingtime;
	}
	public Enum getPubname() {
		return pubname;
	}
	public void setPubname(Enum pubname) {
		this.pubname = pubname;
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
		result = prime * result + ((openingdate == null) ? 0 : openingdate.hashCode());
		result = prime * result + ((openingtime == null) ? 0 : openingtime.hashCode());
		result = prime * result + ((pubname == null) ? 0 : pubname.hashCode());
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
		PubInfo other = (PubInfo) obj;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
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
		if (pubname == null) {
			if (other.pubname != null)
				return false;
		} else if (!pubname.equals(other.pubname))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "PubInfo [pubname=" + pubname + ", location=" + location + ", openingdate=" + openingdate
				+ ", openingtime=" + openingtime + "]";
	}
	
	
	
	
	

}
