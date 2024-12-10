package com.google.shirt.controller;


import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class TShirtController {
	
	@GetMapping("/shirt")
	public String getResponse(Model model) {
		Set<String> set=new HashSet<String>();
		set.add("Black");
		set.add("Blue");
		set.add("Orange");
		set.add("White");
		model.addAttribute("Shirt",set);
		return "success.jsp";
		
	}

}
