package com.xworkz.bank.service; 

import java.util.List;


import com.xworkz.bank.Dto.BankDto;

public interface BankService {
	
	public String onSave(BankDto dto);
	List<BankDto> read();
	List<BankDto> getByHolderName(String accountHolderName);
	BankDto findById(int id);
    boolean update(BankDto dto);
}
