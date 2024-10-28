package com.xworkz.stream.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.xworkz.stream.dto.VehicalInfoDto;

public class VehicalRunner {

	public static void main(String[] args) {
		VehicalInfoDto vehical=new VehicalInfoDto();
		vehical.setName("Car");
		vehical.setPrice(500000);
        vehical.setColour("Blue");
        
        VehicalInfoDto vehical1=new VehicalInfoDto();
		vehical1.setName("Truck");
		vehical1.setPrice(700000);
        vehical1.setColour("Red");
        
        VehicalInfoDto vehical2=new VehicalInfoDto();
		vehical2.setName("Bus");
		vehical2.setPrice(400000);
        vehical2.setColour("Yellow");
        
        VehicalInfoDto vehical3=new VehicalInfoDto();
		vehical3.setName("Car");
		vehical3.setPrice(500000);
        vehical3.setColour("Blue");
        
        List<VehicalInfoDto> list=new ArrayList();
        list.add(vehical);
        list.add(vehical2);
        list.add(vehical3);
        list.add(vehical1);
        Stream<VehicalInfoDto> dto1=list.stream();
        dto1.forEach(v->System.out.println(v));
        System.out.println("========================");
        System.out.println("Distinct Dtos");
       // List<VehicalInfoDto> listofDto=list.stream().collect(Collectors.toList());
        list.stream().distinct().forEach(v->System.out.println(v));

	}

}
