package com.xworkz.bank.controller;

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

import com.xworkz.bank.Dto.BankDto;
import com.xworkz.bank.service.BankService;

@Component
@RequestMapping("/")
public class BankController {
	
	@Autowired
	private BankService service;
	
	public BankController() {
		System.out.println("Bank Controller Constructor");
	}
	
	@PostMapping("/bank")
	public String getResponse(@ModelAttribute BankDto dto,Model model) {
		dto.setCreatedOn(LocalDateTime.now());
		dto.setCreatedBy("Rashmi");
		System.out.println(dto);
		String result=service.onSave(dto);
		System.out.println(result);
		model.addAttribute("details", dto);
		return "success";
		}
	
	@GetMapping("/mapping")
	public String getView(Model model) {
		System.out.println(service.read());
		model.addAttribute("list", service.read());
		return "view";
		}
	
	
	@GetMapping("/search")
	public String getByHolderName(@RequestParam String accountHolderName, Model model) {
		System.out.println("Holder name:" + accountHolderName);
		List<BankDto> listDto = service.getByHolderName(accountHolderName);
		model.addAttribute("list", listDto);
		return "search";
	}
	
	@GetMapping("/update")
	public String getById(@RequestParam int id, Model model) {
		System.out.println("getById()");
		BankDto dto=service.findById(id);
		dto.setCreatedOn(LocalDateTime.now());
		dto.setCreatedBy("Rashmi");
		System.out.println("Updted Dto:"+ dto);
		model.addAttribute("dto", dto);
		return "update";
	}
	
	@PostMapping("/update")
	public String updateById(@ModelAttribute BankDto dto,Model model) {
		dto.setCreatedOn(LocalDateTime.now());
		dto.setCreatedBy("Rashmi");
		System.out.println("dto:" + dto);
		boolean updateResult = service.update(dto);
		System.out.println("Updated By Id Dto:"+ updateResult);
		model.addAttribute("result",updateResult);
		return "search";
	}
	

}
