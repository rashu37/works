package com.xworkz.task.runner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.task.dto.BuildingDto;
import com.xworkz.task.dto.ChairsDto;
import com.xworkz.task.dto.ComputerDto;
import com.xworkz.task.dto.CupsDto;
import com.xworkz.task.dto.PaperDto;
import com.xworkz.task.dto.PlansDto;
import com.xworkz.task.dto.PowerBankDto;
import com.xworkz.task.dto.RoadDto;

public class TaskRunner {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ComputerDto.class);
		Object result=context.getBean(ComputerDto.class);
		System.out.println(result);
		
		AnnotationConfigApplicationContext context1=new AnnotationConfigApplicationContext(RoadDto.class);
		Object result1=context1.getBean(RoadDto.class);
		System.out.println(result1);
		
		AnnotationConfigApplicationContext context2=new AnnotationConfigApplicationContext(PaperDto.class);
		Object result2=context2.getBean(PaperDto.class);
		System.out.println(result2);
		
		AnnotationConfigApplicationContext context3=new AnnotationConfigApplicationContext(PlansDto.class);
		Object result3=context3.getBean(PlansDto.class);
		System.out.println(result3);
		
		AnnotationConfigApplicationContext context4=new AnnotationConfigApplicationContext(BuildingDto.class);
		Object result4=context4.getBean(BuildingDto.class);
		System.out.println(result4);
	
		AnnotationConfigApplicationContext context5=new AnnotationConfigApplicationContext(ChairsDto.class);
		Object result5=context5.getBean(ChairsDto.class);
		System.out.println(result5);
		
		AnnotationConfigApplicationContext context6=new AnnotationConfigApplicationContext(CupsDto.class);
		Object result6=context6.getBean(CupsDto.class);
		System.out.println(result6);
	
		AnnotationConfigApplicationContext context7=new AnnotationConfigApplicationContext(PowerBankDto.class);
		Object result7=context7.getBean(PowerBankDto.class);
		System.out.println(result7);
	
	
	
	}
	

}
