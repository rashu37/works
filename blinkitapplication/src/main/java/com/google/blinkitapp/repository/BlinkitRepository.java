package com.google.blinkitapp.repository;

import com.google.blinkitapp.dto.BlinkitDto;

public interface BlinkitRepository {
	boolean save(BlinkitDto dto);
	
}
