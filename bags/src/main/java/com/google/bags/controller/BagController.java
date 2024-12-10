package com.google.bags.controller;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.bags.dto.BagDto;

@Component
@RequestMapping("/")
public class BagController {
	public BagController() {
		System.out.println("BagController Constructor");
	}
	  
	 @GetMapping("/submit")
	  public String getBagNames(Model model) {
		  LinkedList<String> list=new LinkedList<String>();
			list.add("Leather Bag");
			list.add("Jute Bag");
			list.add("Cotton Bag");
	        list.add("Side Bag");
//	        BagDto dto=new BagDto();	 
//	        dto.setNames("Leather Bag");
//	        
	        model.addAttribute("Bags", list);
	        return "success.jsp";
	}

}
