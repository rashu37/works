package com.google.payment.utils;

import org.springframework.beans.BeanUtils;

import com.google.payment.Entity.PaymentEntity;
import com.google.payment.dto.PaymentDto;

public class PaymentUtils {
	private PaymentUtils() {
		
	}
	
   public static PaymentEntity convertDtoToEntity(PaymentDto dto) {
		PaymentEntity entity = new PaymentEntity();
		BeanUtils.copyProperties(dto, entity);
		return entity;
	}

	public static PaymentDto convertEntityToDto(PaymentEntity entity) {
		PaymentDto dto = new PaymentDto();
		BeanUtils.copyProperties(entity, dto);
		return dto;
	}
}
