package com.google.test.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/")
public class TestController {
	
	public TestController() {
		System.out.println("Test Controller constructor");
	}
	
	
	@GetMapping("/submit")
	public String getResponse(Model model) {
		System.out.println("Response");
		model.addAttribute("message","welcome to web page");
		return "success.jsp";
	}
	
	
	@PostMapping("/post")
	public String getPost() {
		System.out.println("Post Update");
		return "success.jsp";
		
	}
	
	@DeleteMapping("/delete")
	public String getDelete() {
		System.out.println("Deleted Done");
		return "success.jsp";
	}

}
