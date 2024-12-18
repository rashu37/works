package com.google.payment.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.payment.dto.PaymentDto;
import com.google.payment.service.PaymentService;

@Component
@RequestMapping("/")
public class PaymentController {
	
	@Autowired
	private PaymentService paymentservice;
	
	public PaymentController() {
		System.out.println("Payment Controller Constructor");
		
	}
	
	@PostMapping("service")
	public String getOnSave(@ModelAttribute PaymentDto dto, Model model) {
		dto.setCreatedOn(LocalDateTime.now());
		dto.setCreatedBy("Rashmi");
		
		System.out.println(dto);
		String result=paymentservice.onSave(dto);
		System.out.println(result);
		model.addAttribute("payment",dto );
		
		return "success";
		}
	
	@GetMapping("/viewentity")
	public String getRead(Model model) {
		System.out.println(paymentservice.read());
		model.addAttribute("list", paymentservice.read());
		return "view";
		
	}
	
	@GetMapping("/search")
	public String getByHolderName(@RequestParam String accountHolderName, Model model) {
		System.out.println("Holder name:" + accountHolderName);
		List<PaymentDto> listDto = paymentservice.getByHolderName(accountHolderName);
		model.addAttribute("list", listDto);
		return "search";
	}
	
	@GetMapping("/update")
	public String getById(@RequestParam int id, Model model) {
		System.out.println("getById()");
		PaymentDto dto = paymentservice.findById(id);
		dto.setCreatedOn(LocalDateTime.now());
		dto.setCreatedBy("Rashmi");
		System.out.println("Update Dto:"+ dto);
		model.addAttribute("dto", dto);
        return "update";
	}

	@PostMapping("/update")
	public String updateById(@ModelAttribute PaymentDto dto,Model model) {
		System.out.println("Updated By Id");
		dto.setCreatedOn(LocalDateTime.now());
		dto.setCreatedBy("Rashmi");
		System.out.println("dto:" + dto);
		boolean updateResult = paymentservice.update(dto);
		System.out.println("Updated By Id Dto:"+ updateResult);
		model.addAttribute("result",updateResult);
		return "search";
	}
	
	

}
