package com.google.payment.Repository;

import java.util.List;

import com.google.payment.Entity.PaymentEntity;



public interface PaymentRepository {
         
	public boolean onSave(PaymentEntity entity);
	List<PaymentEntity> read();
	List<PaymentEntity> getByholderName(String accountHolderName);
	PaymentEntity findById(int id);
	boolean update(PaymentEntity entity);
	}
