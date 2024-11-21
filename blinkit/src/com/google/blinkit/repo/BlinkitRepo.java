package com.google.blinkit.repo;

import java.util.List;

import com.google.blinkit.dto.BlinkitDto;

public interface BlinkitRepo {
	
	boolean save(BlinkitDto dto);
	List<BlinkitDto> read();
	boolean search(int id);
	boolean delete(int id);
	boolean update(int id,BlinkitDto dto);

}
