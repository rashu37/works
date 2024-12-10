package com.google.colors.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class ColorController {
	
	public ColorController() {
		System.out.println("ColorController Constructor");
	}
	
	@GetMapping("color")
	public String getResponse(Model model) {
		Map<String, String> map=new HashMap<>();
		map.put("Color1", "Black");
		map.put("Color2", "Red");
		map.put("Color3", "White");
		map.put("Color4", "Purple");
		model.addAttribute("Color", map);
		return "success.jsp";
	}

}
