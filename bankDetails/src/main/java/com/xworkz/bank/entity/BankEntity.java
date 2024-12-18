package com.xworkz.bank.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table
@NamedQueries({
@NamedQuery(name="findAll", query="select b from BankEntity b"),
@NamedQuery(name = "findByName", query = "SELECT entity from BankEntity entity WHERE entity.accountHolderName=:name")
})
public class BankEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	
	@Column(name="b_accountNumber")
	private long accountNumber;
	
	@Column(name="b_accountHolderName")
	private String accountHolderName;
	
	@Column(name="b_accountType")
	private String accountType;
	
	@Column(name="b_balance")
	private int balance;
	
	@Column(name="cretedOn")
	private LocalDateTime createdOn;
	
	@Column(name="createdBy")
	private String createdBy;
}
