package com.google.payment.dto;

import java.time.LocalDateTime;

import lombok.Data;


@Data
public class PaymentDto {
	
	
	private int id;
	private String accountHolderName;
	private String paymentType;
	private int paymentAmount;
	private String fromUpi;
	private String toUpi;
	private String bankName;
	private LocalDateTime createdOn;
	private String createdBy;
	

}
