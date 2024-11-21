package com.google.blinkitapp.service;


import com.google.blinkitapp.dto.BlinkitDto;
import com.google.blinkitapp.repository.BlinkitRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BlinkitServiceImplimentation implements BlinkitService {
	private BlinkitRepository repo;
	
	@Override
	public String onSave(BlinkitDto dto) {
		
		if(dto!=null) {
			if(repo.save(dto)) {
				return "Saved Successfully";
			}
		}
		return "Not Saved Successfully";
	}

}
