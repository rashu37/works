package com.google.bankInfo.repository;

import java.util.Set;

import com.google.bankInfo.dto.BankInfoDto;

public interface BankRepository {
	 
	boolean save(BankInfoDto dto);
	
	Set<BankInfoDto>getAll();
	
	

}
