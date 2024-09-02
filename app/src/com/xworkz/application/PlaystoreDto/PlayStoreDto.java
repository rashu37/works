package com.xworkz.application.PlaystoreDto;

import java.time.LocalDate;

public class PlayStoreDto {
	
	private String applicationName;
	private double storage;
	private LocalDate realsedate;
	private LocalDate updatedate;
	
	
	public PlayStoreDto() {
		System.out.println("No arguments constructor");
	}
	
	public PlayStoreDto(String applicationName, double storage, LocalDate realsedate, LocalDate updatedate) {
		
		this.applicationName = applicationName;
		this.storage = storage;
		this.realsedate = realsedate;
		this.updatedate = updatedate;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public double getStorage() {
		return storage;
	}

	public void setStorage(double storage) {
		this.storage = storage;
	}

	public LocalDate getRealsedate() {
		return realsedate;
	}

	public void setRealsedate(LocalDate realsedate) {
		this.realsedate = realsedate;
	}

	public LocalDate getUpdatedate() {
		return updatedate;
	}

	public void setUpdatedate(LocalDate updatedate) {
		this.updatedate = updatedate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((applicationName == null) ? 0 : applicationName.hashCode());
		result = prime * result + ((realsedate == null) ? 0 : realsedate.hashCode());
		long temp;
		temp = Double.doubleToLongBits(storage);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((updatedate == null) ? 0 : updatedate.hashCode());
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
		PlayStoreDto other = (PlayStoreDto) obj;
		if (applicationName == null) {
			if (other.applicationName != null)
				return false;
		} else if (!applicationName.equals(other.applicationName))
			return false;
		if (realsedate == null) {
			if (other.realsedate != null)
				return false;
		} else if (!realsedate.equals(other.realsedate))
			return false;
		if (Double.doubleToLongBits(storage) != Double.doubleToLongBits(other.storage))
			return false;
		if (updatedate == null) {
			if (other.updatedate != null)
				return false;
		} else if (!updatedate.equals(other.updatedate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PlayStoreDto [applicationName=" + applicationName + ", storage=" + storage + ", realsedate="
				+ realsedate + ", updatedate=" + updatedate + "]";
	}

	
	
	
	
	
	

}
