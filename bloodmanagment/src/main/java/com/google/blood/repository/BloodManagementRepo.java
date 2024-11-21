package com.google.blood.repository;

import java.util.List;

import com.google.blood.dto.BloodManagementDto;

public interface BloodManagementRepo {
	
	boolean save(BloodManagementDto dto);
	List<BloodManagementDto> read();
	boolean delete(int id);
	BloodManagementDto search(int id);
	boolean update(int id, BloodManagementDto dto);
	

}
