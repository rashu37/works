package com.google.tv.utils;

import org.springframework.beans.BeanUtils;

import com.google.tv.dto.TvDto;
import com.google.tv.entity.TvEntity;


public class TvUtils {
	
	private TvUtils() {
		
	}

	public static TvEntity convertDtoToEntity(TvDto dto) {
		TvEntity entity = new TvEntity();
		BeanUtils.copyProperties(dto, entity);
		return entity;
	}

	public static TvDto convertEntityToDto(TvEntity entity) {
		TvDto dto = new TvDto();
		BeanUtils.copyProperties(entity, dto);
		return dto;
	}
}
