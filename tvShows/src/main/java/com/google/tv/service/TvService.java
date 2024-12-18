package com.google.tv.service;

import java.util.List;


import com.google.tv.dto.TvDto;


public interface TvService {
	public String onSave(TvDto dto);
	List<TvDto> read();
	List<TvDto> getByShowName(String  title);
	TvDto findById(int id);
    boolean update(TvDto dto);

}
