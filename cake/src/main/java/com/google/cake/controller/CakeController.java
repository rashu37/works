package com.google.cake.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class CakeController {
	public CakeController() {
		System.out.println("CakeController Constructor");
	}
	
	@GetMapping("/cake")
	public String getResponse(Model model) {
		System.out.println("Get Response");
		model.addAttribute("Cake","Pastery cake,Apple cake,Chocolate cake,Strawaberry cake");
		return "success.jsp";
	}

}
