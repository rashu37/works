package com.xworkz.application.service;

import java.time.LocalDate;

public class MallsInfo {
	
	private Enum mallsNames;
	private String location;
	private double ratings;
	private LocalDate opentime;
	private LocalDate closetime;
	
	public MallsInfo(Enum mallsNames, String location, double ratings, LocalDate opentime, LocalDate closetime) {
		
		this.mallsNames = mallsNames;
		this.location = location;
		this.ratings = ratings;
		this.opentime = opentime;
		this.closetime = closetime;
	}

	public Enum getMallsNames() {
		return mallsNames;
	}

	public void setMallsNames(Enum mallsNames) {
		this.mallsNames = mallsNames;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getRatings() {
		return ratings;
	}

	public void setRatings(double ratings) {
		this.ratings = ratings;
	}

	public LocalDate getOpentime() {
		return opentime;
	}

	public void setOpentime(LocalDate opentime) {
		this.opentime = opentime;
	}

	public LocalDate getClosetime() {
		return closetime;
	}

	public void setClosetime(LocalDate closetime) {
		this.closetime = closetime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((closetime == null) ? 0 : closetime.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((mallsNames == null) ? 0 : mallsNames.hashCode());
		result = prime * result + ((opentime == null) ? 0 : opentime.hashCode());
		long temp;
		temp = Double.doubleToLongBits(ratings);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		MallsInfo other = (MallsInfo) obj;
		if (closetime == null) {
			if (other.closetime != null)
				return false;
		} else if (!closetime.equals(other.closetime))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (mallsNames == null) {
			if (other.mallsNames != null)
				return false;
		} else if (!mallsNames.equals(other.mallsNames))
			return false;
		if (opentime == null) {
			if (other.opentime != null)
				return false;
		} else if (!opentime.equals(other.opentime))
			return false;
		if (Double.doubleToLongBits(ratings) != Double.doubleToLongBits(other.ratings))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MallsInfo [mallsNames=" + mallsNames + ", location=" + location + ", ratings=" + ratings + ", opentime="
				+ opentime + ", closetime=" + closetime + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
