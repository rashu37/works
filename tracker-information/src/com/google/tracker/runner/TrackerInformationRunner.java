package com.google.tracker.runner;

import java.time.LocalDateTime;
import java.util.Scanner;

import com.google.tracker.dto.TrackerInformationDto;
import com.google.tracker.service.TrackerInformation;
import com.google.tracker.service.TrackerInformationImplimentation;

public class TrackerInformationRunner {
	public static void main(String args[]) {
		TrackerInformationDto trackerinfo=new TrackerInformationDto();
		trackerinfo.setTrackerId(12342);
		trackerinfo.setProductName("Specks");
		trackerinfo.setToLocation("Lenskart");
		trackerinfo.setFromLocation("Bengaluru");
		trackerinfo.setPackingdatetime(LocalDateTime.of(2024,9, 17, 11, 50));
		trackerinfo.setDispatcheddatetime(LocalDateTime.now().plusDays(7));
		
		TrackerInformationDto trackerInfo=new TrackerInformationDto();
		trackerInfo.setTrackerId(75642);
		trackerInfo.setProductName("Watch");
		trackerInfo.setToLocation("Sonat");
		trackerInfo.setFromLocation("Bengaluru");
		trackerInfo.setPackingdatetime(LocalDateTime.of(2024,10, 10, 10, 50));
		trackerInfo.setDispatcheddatetime(LocalDateTime.now().plusDays(5));
	
	
		
		
		System.out.println("Enter the Array size");
		Scanner scanner=new Scanner(System.in);
	    int value =	scanner.nextInt();
	    
		
	    TrackerInformation tracker=new TrackerInformationImplimentation();
	    tracker.setarraysize(value);
	  
	   System.out.println("On save starts");
	   String result= tracker.validateAndSave(trackerinfo);
	   String result1= tracker.validateAndSave(trackerInfo);
	   System.out.println("Results:"+ result);
	   System.out.println("Results:"+ result1);
	   
     
	   //System.err.println(tracker.validateAndSave(trackerinfo));
	   tracker.read();
	   
	   tracker.update(78930, trackerinfo);
	   tracker.read(); 
	   
	   tracker.update(value, trackerInfo);
	   
	   
	   
	}

}
