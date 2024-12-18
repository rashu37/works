package com.google.games.utils;

import org.springframework.beans.BeanUtils;

import com.google.games.dto.GamesDto;
import com.google.games.entity.GamesEntity;


public class GamesUtils {
	private GamesUtils() {
		
	}
	
	public static GamesEntity convertDtoToEntity(GamesDto dto) {
		GamesEntity entity = new GamesEntity();
		BeanUtils.copyProperties(dto, entity);
		return entity;
	}
	
	public static GamesDto convertEntityToDto(GamesEntity entity) {
		GamesDto dto=new GamesDto();
		BeanUtils.copyProperties(entity, dto);
		return dto;
	}

}
