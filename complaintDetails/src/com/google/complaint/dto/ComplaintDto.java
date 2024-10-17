package com.google.complaint.dto;

import java.time.LocalDate;
import java.util.Date;

import lombok.Data;
@Data

public class ComplaintDto {
	
	private int complaintId;
	private String complainantName;
	private long complainantNum;
	private LocalDate complaintDate;
	private LocalDate resolvedDate;
	
	

}
