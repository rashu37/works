package com.google.vendor.service;

import java.util.List;

import com.google.vendor.dto.VendorDto;
import com.google.vendor.repository.VendorRepo;
import com.google.vendor.repository.VendorRepoImpl;

import lombok.AllArgsConstructor;
 @AllArgsConstructor
public class VendorServiceImpl implements VendorService{
	
	private VendorRepo vendorRepo;
	//VendorRepo vendorRepo =new VendorRepoImpl();

	@Override
	public String validate(VendorDto dto) {
		if(dto!=null) {
			System.out.println("List is not null");
			if(vendorRepo.save(dto)) {
				System.out.println("Saved");
				return "Saved Succsesfully";
			}
		}
		return " not Saved Succsesfully";
	}

	@Override
	public List<VendorDto> getAll() {
		return vendorRepo.getAll();
	}

	@Override
	public String updateById(int vendorId, VendorDto dto) {
		if(vendorRepo.updateById(vendorId, dto)) {
			return "Updated";
		}
		return "Not Updated";
	}

	@Override
	public String deleteById(int vendorId, VendorDto dto) {
		if(vendorRepo.deleteById(vendorId, dto)) {
			return "Deleted";
		}
		return "Not Deleted";
	}

}
