package com.google.productinfo.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.google.productinfo.constant.BrandNames;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString
public class ProductInfoDto {
	
	private String productName;
	private String brand;
	private int price;
	private long productId;
	private LocalDate manufacturedate;
	private LocalDateTime delivaryDateTime;

}
