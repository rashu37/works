package com.google.blood.service;

import java.util.List;

import com.google.blood.dto.BloodManagementDto;
import com.google.blood.repository.BloodManagementRepo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BloodServiceImplimentation implements BloodService {
	private BloodManagementRepo repo;

	@Override
	public String onSave(BloodManagementDto dto) {
		if (dto != null) {
			if (repo.save(dto)) {
				return "Saved Successfully";
			}
		}
		return "Not Saved Successfully";
	}

	@Override
	public List<BloodManagementDto> read() {
		return repo.read();

	}

	@Override
	public String delete(int id) {
		if (repo.delete(id)) {
			return "Deleted Successfully";
		}
		return "Not Deleted Successfully";
	}

	@Override
	public BloodManagementDto search(int id) {
		return repo.search(id);
	}

	@Override
	public String update(int id, BloodManagementDto dto) {
		if (repo.update(id, dto)) {
			return "Updated successfully";
		}
		return "Not Updated successfully";
	}

}
