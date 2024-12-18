package com.google.payment.Entity;

import java.time.LocalDateTime;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Entity
@NamedQueries({
    @NamedQuery(name = "findAll", query = "SELECT e FROM PaymentEntity e"),
    @NamedQuery(name = "findByName", query = "SELECT entity from PaymentEntity entity WHERE entity.accountHolderName=:name")
})

public class PaymentEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="account_holdername")
	private String accountHolderName;
	
	@Column(name="payment_type")
	private String paymentType;
	
	@Column(name="payment_Amount")
	private int paymentAmount;
	
	@Column(name="payment_fromupi")
	private String fromUpi;
	
	@Column(name="payment_toupi")
	private String toUpi;
	
	@Column(name="payment_bankName")
	private String bankName;
	
	@Column(name="createdOn")
	private LocalDateTime createdOn;
	
	@Column(name="createdBy")
	private String createdBy;

}
