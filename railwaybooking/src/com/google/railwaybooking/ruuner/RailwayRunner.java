package com.google.railwaybooking.ruuner;

import com.google.railwaybooking.constant.Location;
import com.google.railwaybooking.dto.PersonalDetails;
import com.google.railwaybooking.dto.RailwayDetails;
import com.google.railwaybooking.service.RailwayService;
import com.google.railwaybooking.service.RailwayServiceImplimentation;

public class RailwayRunner {

	public static void main(String[] args) {
		
		PersonalDetails personal=new PersonalDetails();
		personal.setName("Seetha");
		personal.setAge((byte)22);
		personal.setPhoneNum(345682676l);
		personal.setTotalAmount(350);
		personal.setAdharNum(234516654514l);
		
		
		RailwayDetails details=new RailwayDetails();
		details.setStationName("BTM station");
		details.setTrainNum(234564);
		details.setPlatFromNo((byte)34);
		details.setDeparture("Hubali Station");
		details.setLocation(Location.BENGALURU);
		details.setDetails(personal);
		
		PersonalDetails personal1=new PersonalDetails();
		personal1.setName("Shree");
		personal1.setAge((byte)22);
		personal1.setPhoneNum(398745666l);
		personal1.setTotalAmount(550);
		personal1.setAdharNum(234516516514l);
		
		
		RailwayDetails details1=new RailwayDetails();
		details1.setStationName("Bengaluru Station");
		details1.setTrainNum(654452);
		details1.setPlatFromNo((byte)13);
		details1.setDeparture("Mysore Station");
		details1.setLocation(Location.HOSPETE);
		details1.setDetails(personal1);
		
		PersonalDetails personal2=new PersonalDetails();
		personal2.setName("Rohini");
		personal2.setAge((byte)25);
		personal2.setPhoneNum(4325452526l);
		personal2.setTotalAmount(643);
		personal2.setAdharNum(234516516514l);
		
		
		RailwayDetails details2=new RailwayDetails();
		details2.setStationName("Koppal station");
		details2.setTrainNum(583232);
		details2.setPlatFromNo((byte)9);
		details2.setDeparture("Hubali Station");
		details2.setLocation(Location.KOPPAL);
		details2.setDetails(personal2);
		
		PersonalDetails personal3=new PersonalDetails();
		personal3.setName("Vidhya");
		personal3.setAge((byte)20);
		personal3.setPhoneNum(7635434526l);
		personal3.setTotalAmount(452);
		personal3.setAdharNum(6543677214l);
		
		
		RailwayDetails details3=new RailwayDetails();
		details3.setStationName("Koppal station");
		details3.setTrainNum(654324);
		details3.setPlatFromNo((byte)14);
		details3.setDeparture("Dharwad Station");
		details3.setLocation(Location.KOPPAL);
		details3.setDetails(personal3);
		
		
		RailwayService result=new RailwayServiceImplimentation();
		result.ValidandSave(details);
		result.ValidandSave(details1);
		result.ValidandSave(details2);
		result.ValidandSave(details3);
		
		result.read(details);
		
		//result.update(personal2, 234516516514l);
		result.update(6543677214l, "Shivamoga station", 1100);
		result.update(234516516514l, "Bengaluru station", 700);
		result.read(details);
		
		System.out.println("-----------------");
		
		RailwayDetails find2 = result.find("Rohini");
		System.err.println(find2);
		RailwayDetails find = result.find("seetha");
		System.err.println(find);
		
	}

}
