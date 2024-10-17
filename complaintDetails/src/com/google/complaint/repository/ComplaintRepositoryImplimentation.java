package com.google.complaint.repository;

import java.util.LinkedList;
import java.util.List;

import com.google.complaint.dto.ComplaintDto;

public class ComplaintRepositoryImplimentation implements ComplaintRepository {
	
	List<ComplaintDto> listDto=new LinkedList<ComplaintDto>();
	
	@Override
	public boolean save(ComplaintDto dto) {
		return listDto.add(dto);
	}

	@Override
	public List<ComplaintDto> getAll() {
		return listDto;
	}

	@Override
	public boolean updateById(int complaintId, ComplaintDto dto) {
		if(!listDto.isEmpty()) {
			for (int i = 0; i <listDto.size(); i++) {
				if(listDto.get(i).getComplaintId()==complaintId) {
					//listDto.get(i).setComplainantName("Manisha");
					listDto.set(i, dto);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean deleteById(int complaintId, ComplaintDto dto) {
		if(!listDto.isEmpty()) {
			for (int i = 0; i <listDto.size(); i++) {
				if(listDto.get(i).getComplaintId()==complaintId) {
			      listDto.remove(i);
					
				}
			}
			return true;
		}
		
		return false;
	}


}
