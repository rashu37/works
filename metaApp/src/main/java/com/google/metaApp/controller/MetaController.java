package com.google.metaApp.controller;




import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.metaApp.Dto.MetaDto;

@Component
@RequestMapping("/")
public class MetaController {
	
	public MetaController() {
		System.out.println("Controller");
	}
	
	
	@GetMapping("/meta")
	public String getResponse(@ModelAttribute MetaDto dto,Model model) {
		model.addAttribute("Meta", dto);
		System.out.println("Dto"+dto);
		return "success.jsp";
		
	}

}
