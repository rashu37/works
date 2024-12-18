package com.google.games.controller;

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

import com.google.games.dto.GamesDto;
import com.google.games.service.GamesService;

@Component
@RequestMapping("/")
public class GamesController {
	
	@Autowired
	private GamesService service;
	
	public GamesController() {
		System.out.println("Game Controller Constructor");
	}
	
	@PostMapping("shows")
	public String getController(@ModelAttribute GamesDto dto,Model model ) {
		dto.setCreatedBy("Rashmi");
		dto.setGameDay(LocalDateTime.now());
		System.out.println(dto);
		String result=service.onSave(dto);
		System.out.println(result);
		model.addAttribute("games", dto);
		return "success";
	}
	
	@GetMapping("reading")
	public String getRead(Model model) {
		System.out.println(service.read());
		model.addAttribute("list", service.read());
		return "view";
		}
	
	@GetMapping("/search")
	public String getByPlayerName(@RequestParam String gamename, Model model) {
		System.out.println("Game Name:"+ gamename);
		List<GamesDto> listOfDto=service.getByGameName(gamename);
		model.addAttribute("listDto", listOfDto);
		return "search";
	}
	
	@GetMapping("/update")
	public String getById(@RequestParam int id, Model model) {
		System.out.println("getById()");
		GamesDto dto = service.findById(id);
		dto.setCreatedBy("Rashmi");
		System.out.println("Update Dto:"+ dto);
		model.addAttribute("dto", dto);
        return "update";
	}

	@PostMapping("/update")
	public String updateById(@ModelAttribute GamesDto dto,Model model) {
		System.out.println("Updated By Id");
		dto.setCreatedBy("Rashmi");
		System.out.println("dto:" + dto);
		boolean updateResult = service.update(dto);
		System.out.println("Updated By Id Dto:"+ updateResult);
		model.addAttribute("result",updateResult);
		return "search";
	}
	

}
