package com.google.tv.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.tv.dto.TvDto;
import com.google.tv.service.TvService;


@Component
@RequestMapping("/")
public class TvController {
	
	@Autowired
	private TvService service;
	
	public TvController() {
		System.out.println("Tv Constructor");
	}
	
	@PostMapping("/Tv")
	public String getOnSave(@ModelAttribute TvDto dto,Model model) {
		dto.setCreatedBy("Rashmi");
		
		System.out.println(dto);
		String result=service.onSave(dto);
		System.out.println(result);
		model.addAttribute("shows", dto);
		return "success";
		}
	
	@GetMapping("Television")
	public String getView(Model model) {
		System.out.println(service.read());
		model.addAttribute("list", service.read());
		return "view";
		
	}
	
	@GetMapping("/search")
	public String getByDeveloperName(@RequestParam String  title, Model model) {
		System.out.println("Tv Show name:" +  title);
		List<TvDto> listOfDto = service.getByShowName( title);
		model.addAttribute("list", listOfDto);
		return "Search";
	}
	
	@GetMapping("/update")
	public String getById(@RequestParam int id, Model model) {
		System.out.println("getById()");
		TvDto dto = service.findById(id);
		dto.setCreatedBy("Rashmi");
		System.out.println("Update Dto:"+ dto);
		model.addAttribute("dto", dto);
        return "update";
	}

	@PostMapping("/update")
	public String updateById(@ModelAttribute TvDto dto,Model model) {
		System.out.println("Updated By Id");
		dto.setCreatedBy("Rashmi");
		System.out.println("dto:" + dto);
		boolean updateResult = service.update(dto);
		System.out.println("Updated By Id Dto:"+ updateResult);
		model.addAttribute("result",updateResult);
		return "Search";
	}

	
		
	}


