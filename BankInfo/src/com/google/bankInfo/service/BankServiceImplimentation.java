package com.google.bankInfo.service;

import java.util.Set;

import com.google.bankInfo.dto.BankInfoDto;
import com.google.bankInfo.repository.BankRepository;
import com.google.bankInfo.utils.BankValidation;

import lombok.AllArgsConstructor;
@AllArgsConstructor

public class BankServiceImplimentation implements BankService {
	
	private BankRepository bankRepo;

	@Override
	public String validateAndSave(BankInfoDto dto) {
		if(dto!=null) {
			System.out.println("List is not null");
			if(BankValidation.validId(dto.getBankId())){
				if(BankValidation.validName(dto.getBankEmployee())){
			        if(BankValidation.validNum(dto.getBankNumber())) {
				       if(bankRepo.save(dto)) {
				System.out.println("Saved");
				return "Saved Succsesfully";
			}
			        }
				}
			}
		}
		return " not Saved Succsesfully";
	}

	@Override
	public Set<BankInfoDto> getAll() {
		return bankRepo.getAll();
	}

}
