package com.google.complaint.service;

import java.util.List;

import com.google.complaint.dto.ComplaintDto;

public interface ComplaintService {

	
   String validate(ComplaintDto dto);
	
	List<ComplaintDto> getAll();
	
	String updateById(int complaintId,ComplaintDto dto);
    
	String deleteById(int complaintId, ComplaintDto dto);

}
