package com.google.news.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.news.dto.NewsDto;

@Component
@RequestMapping("/")
public class NewsController {
	
	public NewsController() {
		System.out.println("News Controller Constructor");
	}
	
	@GetMapping("/submit")
	public String getResponse(Model model) {
		 NewsDto news = new NewsDto();
        news.setTitle("Sports News");
        news.setContent("RCB WON THE IPL CUP IN 2025.");
        news.setAuthor("Rashmi");
        model.addAttribute("News",news);
		return "success.jsp";
	}
	

}
