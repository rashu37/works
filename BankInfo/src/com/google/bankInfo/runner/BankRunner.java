package com.google.bankInfo.runner;

import com.google.bankInfo.dto.BankInfoDto;
import com.google.bankInfo.repository.BankRepositoryImplimentation;
import com.google.bankInfo.service.BankService;
import com.google.bankInfo.service.BankServiceImplimentation;

public class BankRunner {

	public static void main(String[] args) {
		BankInfoDto dto=new BankInfoDto();
		
		dto.setBankId(11);
		dto.setBankEmployee("Harini");
		dto.setBankBranch("Mysore");
		dto.setBankNumber(9876543567l);
		
		BankInfoDto dto1=new BankInfoDto();
		dto1.setBankId(12);
		dto1.setBankEmployee("Joythi");
		dto1.setBankBranch("Hydrabad");
		dto1.setBankNumber(9345433597l);
		
		BankService service=new BankServiceImplimentation(new BankRepositoryImplimentation());
		String result= service.validateAndSave(dto);
		System.out.println(result);
		String result2= service.validateAndSave(dto1);
		System.out.println(result2);
		
		service.getAll().forEach(s->System.out.println(s));
		

	}

}
