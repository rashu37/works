package com.google.blinkit.service;

import java.util.List;

import com.google.blinkit.dto.BlinkitDto;
import com.google.blinkit.repo.BlinkitRepo;
import com.google.blinkit.repo.BlinkitRepoImpl;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BlinkitServiceImpl implements BlinkitService {
	private BlinkitRepo repo;

	@Override
	public String onSave(BlinkitDto dto) {
		if(dto!=null) {
			if(repo.save(dto)) {
				return "Saved Successfully";
			}
		}
		return "Not Saved Successfully";
	}

	@Override
	public List<BlinkitDto> read() {
		return repo.read();
		
		
	}

	@Override
	public  List<BlinkitDto> search(int id) {
		if(repo.search(id)) {
			return repo.read(); 
		}
		return null;
		
	}

	@Override
	public String deleted(int id) {
		if(repo.delete(id)) {
			return "Deleted Successfully";
		}
		return "Not Deleted Successfully";
	}

	@Override
	public String updated(int id, BlinkitDto dto) {
		if(repo.update(id, dto)) {
			return "Updated Successfully"; 
		}
		return "Not Updated";
	}

	
}
