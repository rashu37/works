package com.google.complaint.service;

import java.util.List;

import com.google.complaint.dto.ComplaintDto;
import com.google.complaint.repository.ComplaintRepository;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class ComplaintServiceImplimentation implements ComplaintService {
	
	private ComplaintRepository repo;

	@Override
	public String validate(ComplaintDto dto) {
		if(dto!=null) {
			System.out.println("List is not null");
			if(repo.save(dto)) {
				System.out.println("Saved");
				return "Saved Succsesfully";
			}
		}
		return " not Saved Succsesfully";
	}

	@Override
	public List<ComplaintDto> getAll() {
	   return repo.getAll();
	}

	@Override
	public String updateById(int complaintId, ComplaintDto dto) {
		if(repo.updateById(complaintId, dto)) {
			return "Updated";
		}
		return "Not Updated";
	}

	@Override
	public String deleteById(int complaintId, ComplaintDto dto) {
		if(complaintId>0) {
		if(repo.deleteById(complaintId, dto)) {
			return "Deleted";
		}
		}
		return "Not Deleted";
	}

}
