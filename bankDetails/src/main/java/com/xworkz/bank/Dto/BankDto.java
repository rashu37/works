package com.xworkz.bank.Dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class BankDto {
   
	private int id;
	private long accountNumber;
	private String accountHolderName;
	private String accountType;
	private int balance;
	private LocalDateTime createdOn;
	private String createdBy;

}
