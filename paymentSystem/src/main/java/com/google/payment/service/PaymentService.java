package com.google.payment.service;

import java.util.List;

import com.google.payment.dto.PaymentDto;



public interface PaymentService {
	
	public String onSave(PaymentDto dto);
	List<PaymentDto> read();
	List<PaymentDto> getByHolderName(String accountHolderName);
	PaymentDto findById(int id);
    boolean update(PaymentDto dto);

}
