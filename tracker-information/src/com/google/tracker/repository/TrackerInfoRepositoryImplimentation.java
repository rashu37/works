package com.google.tracker.repository;

import com.google.tracker.dto.TrackerInformationDto;

public class TrackerInfoRepositoryImplimentation implements TrackerInfoRepository {

	private int index = 0;
	private TrackerInformationDto listofDto[];

	@Override
	public boolean setarraysize(int arraysize) {
		listofDto = new TrackerInformationDto[arraysize];
		if (listofDto.length == arraysize) {
			System.out.println("Array size is correct");
			return true;
		}
		return false;

	}

	@Override
	public boolean onSave(TrackerInformationDto listofdto) {
		if (listofDto != null) {
			if (this.index < listofDto.length) {
				listofDto[index] = listofdto;
				index++;
				// System.out.println("Saved Succusefully");
				return true;
			}
		}
		return false;
	}

	@Override
	public void read() {
		if (listofDto != null) {
			for (int i = 0; i < listofDto.length; i++) {
				System.out.println(listofDto[i]);
			}
		}
	}

	@Override
	public boolean checkDuplicate(TrackerInformationDto dto) {
		if (listofDto != null) {
			for (int i = 0; i < listofDto.length; i++) {
				if (listofDto[i]!=null &&listofDto[i].equals(dto)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean update(int trackerid,TrackerInformationDto dto) {
	for (int i = 0; i < listofDto.length; i++) {
		if(listofDto!=null && listofDto[i]!=null && listofDto[i].equals(dto)) {
			listofDto[i].setTrackerId(trackerid);
			
			return true;
		}
	}
		return false;
	}

}
