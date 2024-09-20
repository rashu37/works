package com.google.tracker.repository;

import com.google.tracker.dto.TrackerInformationDto;

public interface TrackerInfoRepository {

	boolean setarraysize(int arraysize);

	boolean onSave(TrackerInformationDto listofdto);

	void read();

	boolean checkDuplicate(TrackerInformationDto listofdto);
	
	boolean update(int trackerid,TrackerInformationDto dto);

}
