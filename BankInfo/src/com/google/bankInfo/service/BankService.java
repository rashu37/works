package com.google.bankInfo.service;

import java.util.Set;

import com.google.bankInfo.dto.BankInfoDto;

public interface BankService {
	
     String validateAndSave(BankInfoDto dto);
	
	Set<BankInfoDto> getAll();

}
