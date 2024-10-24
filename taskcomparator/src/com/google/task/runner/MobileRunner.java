package com.google.task.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.google.task.dto.MobileDto;

public class MobileRunner {

	public static void main(String[] args) {
	    List<MobileDto> mob = new ArrayList<MobileDto>();
        mob.add(new MobileDto(36999, "Realme"));
        mob.add(new MobileDto(43790, "Readme"));
        mob.add(new MobileDto(65433, "Sumsung"));
        mob.add(new MobileDto(35432, "Iphone"));
        mob.add(new MobileDto(32000, "Nothing"));
        System.out.println("Before:"+ mob);
        
        
        Comparator<MobileDto>carcomp=new Comparator<MobileDto>() {

			@Override
			public int compare(MobileDto o1, MobileDto o2) {
				 int brandComparison = o1.getBrand().compareToIgnoreCase(o2.getBrand());
	                if (brandComparison == 0) 
	                    return o1.getPrice().compareTo(o2.getPrice());
	                
	                return brandComparison;
			}
		};
		Collections.sort(mob, carcomp);
		System.out.println("After Sorted by Brand Name:"+mob);

	}

}
