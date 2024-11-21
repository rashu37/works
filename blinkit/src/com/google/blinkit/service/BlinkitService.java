package com.google.blinkit.service;

import java.util.List;

import com.google.blinkit.dto.BlinkitDto;

public interface BlinkitService {
	String onSave(BlinkitDto dto);
	List<BlinkitDto> read();
	List<BlinkitDto> search(int id);
    String deleted(int id);
    String updated(int id,BlinkitDto dto);
}
