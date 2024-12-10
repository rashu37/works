package com.xworkz.google.controller;


import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class GoogleController {
	
   public GoogleController() {
	   System.out.println("Google Constructor");
   }
   
   @GetMapping("/save")
   public String getResponse(@RequestParam String appName, @RequestParam int version, @RequestParam int mb, 
		@RequestParam int size,@RequestParam String updated,  Model model) {
	   System.out.println("Get Response");
	   model.addAttribute("App",appName);
	   model.addAttribute("ver",version);
	   model.addAttribute("mb",mb);
	   model.addAttribute("size",size);
	   model.addAttribute("update",updated);
	   
	   System.out.println("App Name:"+ appName);
	   System.out.println("App Version:"+ version);
	   System.out.println(" Mb:"+ mb);
	   System.out.println("Size:"+ size);
	   System.out.println("Updated:"+ updated);
	   return "success.jsp";
	   
   }
}
