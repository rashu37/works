package com.google.complaint.repository;

import java.util.List;

import com.google.complaint.dto.ComplaintDto;

public interface ComplaintRepository {
	
    boolean save(ComplaintDto dto);
	
	List<ComplaintDto> getAll();
	
	boolean updateById(int complaintId,ComplaintDto dto);
    
	boolean deleteById(int complaintId, ComplaintDto dto);

}
