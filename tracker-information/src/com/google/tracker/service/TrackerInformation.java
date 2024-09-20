package com.google.tracker.service;

import com.google.tracker.dto.TrackerInformationDto;

public interface TrackerInformation {
	
	boolean setarraysize(int arraysize);

	String validateAndSave(TrackerInformationDto listofdto);
	
	String update(int trackerid,TrackerInformationDto dto);
    void read();
}
