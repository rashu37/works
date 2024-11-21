package com.google.enquiry.servlets;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class EnquiryDto {
	private String yourName;
	private long contactNumber;
	private String emailAddress;
	private String description;
	

}
