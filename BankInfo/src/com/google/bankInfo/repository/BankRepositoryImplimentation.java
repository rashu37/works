package com.google.bankInfo.repository;


import java.util.LinkedHashSet;
import java.util.Set;

import com.google.bankInfo.dto.BankInfoDto;

public class BankRepositoryImplimentation implements BankRepository {
	
	Set<BankInfoDto> list=new LinkedHashSet<BankInfoDto>();

	@Override
	public boolean save(BankInfoDto dto) {
		System.out.println("Save Method");
		return list.add(dto);
	}

	@Override
	public Set<BankInfoDto> getAll() {
		return list;
	}

}
