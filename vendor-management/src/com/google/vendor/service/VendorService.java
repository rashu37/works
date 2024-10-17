package com.google.vendor.service;

import java.util.List;

import com.google.vendor.dto.VendorDto;

public interface VendorService {
	
	String validate(VendorDto dto);
	
	List<VendorDto> getAll();
	
	String updateById(int vendorId,VendorDto dto);
	
	String deleteById(int vendorId, VendorDto dto);


}
