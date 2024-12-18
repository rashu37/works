package com.xworkz.bank.service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.bank.Dto.BankDto;
import com.xworkz.bank.entity.BankEntity;
import com.xworkz.bank.resources.BankRepository;
import com.xworkz.bank.utils.BankUtils;
import com.xworkz.bank.utils.BankValidations;

@Component
public class BankServiceImplimentation implements BankService {
	
	@Autowired
	private BankRepository repo;

	
	@Override
	public String onSave(BankDto dto) {
		BankEntity bank=new BankEntity();
		if(dto!=null) {
			if(BankValidations.number(dto.getAccountNumber())) {
				BeanUtils.copyProperties(dto, bank);
				repo.onSave(bank);
			   return "Done";
				}else{
					System.out.println("Account Number should be 10 digits");
				}
			}
		
		return "Not Done";
	}

	@Override
	public List<BankDto> read() {
		List<BankEntity> entity=repo.read();
		return entity.stream().map(BankUtils::convertEntityToDto).collect(Collectors.toList());
		
	}

	@Override
	public List<BankDto> getByHolderName(String accountHolderName) {
		if (accountHolderName!= null) {
			List<BankEntity> listEntities = repo.getByholderName(accountHolderName);
			if (listEntities != null) {
				return listEntities.stream().map(BankUtils::convertEntityToDto).collect(Collectors.toList());
			}
		}
		return Collections.emptyList();
	}

	@Override
	public BankDto findById(int id) {
		if(id>0) {
			BankEntity entity=repo.findById(id);
			return BankUtils.convertEntityToDto(entity);
			}
		return null;
	}

	@Override
	public boolean update(BankDto dto) {
		if(dto!=null) {
			if(repo.update(BankUtils.convertDtoToEntity(dto))) {
				return true;
			}
		}
		return false;
	}

}
