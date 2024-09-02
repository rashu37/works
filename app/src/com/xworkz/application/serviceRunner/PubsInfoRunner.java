package com.xworkz.application.serviceRunner;

import java.time.LocalDate;
import java.time.LocalTime;

import com.xworkz.application.service.PubInfo;
import com.xworkz.application.service.PubsNamesConstant;

public class PubsInfoRunner {
     public static void main(String[] args) {
		
    	 PubInfo info= new PubInfo();
    	 PubInfo info1= new PubInfo(PubsNamesConstant.ENJOYLIFE,"Bengaluru",LocalDate.of(2024, 8, 022),LocalTime.of(2, 30));
    	 System.out.println(info.toString());
    	 System.out.println(info1);
	}

}
