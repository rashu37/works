package com.google.tv.service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.google.tv.dto.TvDto;
import com.google.tv.entity.TvEntity;
import com.google.tv.repository.TVRepository;
import com.google.tv.utils.TvUtils;

@Component
public class TvServiceImplimentation implements TvService {
	
	@Autowired
	private TVRepository repo;

	@Override
	public String onSave(TvDto dto) {
		TvEntity tv=new TvEntity();
		if(dto!=null) {
			if(!dto.getTitle().isEmpty()) {
				BeanUtils.copyProperties(dto, tv);
				repo.onSave(tv);
				return "Done";
			}
			}
		return "Not Done";
	}

	@Override
	public List<TvDto> read() {
		List<TvEntity> entity=repo.read();
		return entity.stream().map(this::todto).collect(Collectors.toList());
		
		}
	
	public TvDto todto(TvEntity entity) {
		TvDto dto=new TvDto();
		BeanUtils.copyProperties(entity, dto);
		return dto;
		}

	@Override
	public List<TvDto> getByShowName(String  title) {
		if ( title != null) {
			List<TvEntity> listOfEntities = repo.getByShowName( title);
			if (listOfEntities != null) {
				return listOfEntities.stream()
						.map(TvUtils::convertEntityToDto)
						.collect(Collectors.toList());
			}
		}
		return Collections.emptyList();
	}

	@Override
	public TvDto findById(int id) {
		if (id > 0) {
			TvEntity entity = repo.findById(id);
			return TvUtils.convertEntityToDto(entity);
		}
		return null;
	}

	@Override
	public boolean update(TvDto dto) {
		if (dto != null) {
			if (repo.update(TvUtils.convertDtoToEntity(dto))) {
				return true;
			}
		}
		return false;
	}


}
