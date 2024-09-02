package com.google.application.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import com.google.application.constant.MallsNamesConstant;
import com.google.application.dto.MallsDto;
import com.google.application.service.MallsService;

public class MallsRunner {
	public static void main(String[] args) {
		
		MallsDto mall= new MallsDto();
		MallsDto mall2= new MallsDto(MallsNamesConstant.CITYCENTER.toString(),"Bengaluru",LocalDate.of(2024, 8, 26),LocalTime.of(12,12));
		System.out.println(mall2);
		MallsDto mall3= new MallsDto(MallsNamesConstant.ORION_MALL.toString(),"Mysore",LocalDate.of(2024, 8, 29),LocalTime.of(12,15));
		System.out.println(mall3);
		MallsDto mall4= new MallsDto(MallsNamesConstant.LIFESTYLE.toString(),"Bengaluru",LocalDate.of(2024, 8, 22),LocalTime.of(12,22));
		System.out.println(mall4);
		MallsDto mall5= new MallsDto(MallsNamesConstant.ZUDIO.toString(),"Bengaluru",LocalDate.of(2024, 8, 25),LocalTime.of(12,13));
		System.out.println(mall5);
		
		
		MallsService service =new MallsService();
		
		service.save(mall2);
		service.save(mall3);
		service.save(mall4);
		service.save(mall5);
		
		service.read();
		
		service.update("CITYCENTER","RELLIENCE");
		
		
		
	}

}
