package com.google.vendor.repository;

import java.util.ArrayList;
import java.util.List;

import com.google.vendor.dto.VendorDto;

public class VendorRepoImpl implements  VendorRepo{
	
	List<VendorDto> list=new ArrayList<VendorDto>();

	@Override
	public boolean save(VendorDto dto) {
		System.out.println("Save Method");
		return list.add(dto);
	}

	@Override
	public List<VendorDto> getAll() {
		return list;
	}

	@Override
	public boolean updateById(int vendorId, VendorDto dto) {
		if(!list.isEmpty()) {
			for (int i = 0; i <list.size(); i++) {
				if(list.get(i).getVendorId()==vendorId) {
					list.set(i, dto);
					//list.get(i).setVendorName("kalki");
					//list.get(i).setVendorName(dto.getVendorName());
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean deleteById(int vendorId, VendorDto dto) {
		if(!list.isEmpty()) {
			for (int i = 0; i <list.size(); i++) {
				if(list.get(i).getVendorId()==vendorId) {
			      list.remove(i);
					return true;
				}
			}
		}
		
		return false;
	}

}
