package com.xworkz.bank.utils;

import org.springframework.beans.BeanUtils;

import com.xworkz.bank.Dto.BankDto;
import com.xworkz.bank.entity.BankEntity;

public class BankUtils {
	
	private BankUtils() {
		
	}
	
	public static BankEntity convertDtoToEntity(BankDto dto) {
		BankEntity entity = new BankEntity();
		BeanUtils.copyProperties(dto, entity);
		return entity;
	}

	public static BankDto convertEntityToDto(BankEntity entity) {
		BankDto dto = new BankDto();
		BeanUtils.copyProperties(entity, dto);
		return dto;
	}
}
