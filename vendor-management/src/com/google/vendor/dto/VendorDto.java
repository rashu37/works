package com.google.vendor.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class VendorDto {

	private int vendorId;
	private String vendorName;
	private String productName;
	private String email;
	private long vendorNum;
	
	
}
