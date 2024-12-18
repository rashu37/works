package com.xworkz.bank.resources;

import java.util.List;

import com.xworkz.bank.entity.BankEntity;

public interface BankRepository {
	
    
	public boolean onSave(BankEntity entity);
	List<BankEntity> read();
	List<BankEntity> getByholderName(String accountHolderName);
	BankEntity findById(int id);
	boolean update(BankEntity entity);

}
