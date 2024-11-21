package com.google.blood.service;

import java.util.List;


import com.google.blood.dto.BloodManagementDto;

public interface BloodService {
	String onSave(BloodManagementDto dto);
	List<BloodManagementDto> read();
	String delete(int id);
	BloodManagementDto search(int id);
	String update(int id,BloodManagementDto dto);
}
