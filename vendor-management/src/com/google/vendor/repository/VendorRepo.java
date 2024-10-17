package com.google.vendor.repository;

import java.util.List;

import com.google.vendor.dto.VendorDto;

public interface VendorRepo {
	
	boolean save(VendorDto dto);
	
	List<VendorDto> getAll();
	
	boolean updateById(int vendorId,VendorDto dto);
    
	boolean deleteById(int vendorId, VendorDto dto);
}
