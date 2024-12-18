package com.google.payment.service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.payment.Entity.PaymentEntity;
import com.google.payment.Repository.PaymentRepository;
import com.google.payment.dto.PaymentDto;
import com.google.payment.utils.PaymentUtils;


@Component
public class PaymentServiceImplimentation implements PaymentService {

	@Autowired
	private PaymentRepository repo;

	@Override
	public String onSave(PaymentDto dto) {
		PaymentEntity payment = new PaymentEntity();

		if (dto != null) {
			if (dto.getPaymentAmount() > 0) {
				if (!dto.getBankName().isEmpty()) {
					BeanUtils.copyProperties(dto, payment);
					repo.onSave(payment);
					return "Done";
				} else {
					System.out.println("Provide Bank Name");
				}
			} else {
				System.out.println("Amount should be Greater than 100");
			}
		}
		return "Not Done";

	}

	@Override
	public List<PaymentDto> read() {
		List<PaymentEntity> entity = repo.read();
		return entity.stream().map(PaymentUtils::convertEntityToDto).collect(Collectors.toList());
	}

	@Override
	public List<PaymentDto> getByHolderName(String accountHolderName) {
		if (accountHolderName!= null) {
			List<PaymentEntity> listEntities = repo.getByholderName(accountHolderName);
			if (listEntities != null) {
				return listEntities.stream().map(PaymentUtils::convertEntityToDto).collect(Collectors.toList());
			}
		}
		return Collections.emptyList();
	}

	@Override
	public PaymentDto findById(int id) {
		if (id > 0) {
			PaymentEntity entity = repo.findById(id);
			return PaymentUtils.convertEntityToDto(entity);
		}
		return null;
	}

	@Override
	public boolean update(PaymentDto dto) {
		if (dto != null) {
			if (repo.update(PaymentUtils.convertDtoToEntity(dto))) {
				return true;
			}
		}
		return false;
	}

}
