package com.google.games.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.games.dto.GamesDto;
import com.google.games.entity.GamesEntity;
import com.google.games.repository.GamesRepository;
import com.google.games.utils.GamesUtils;


@Component
public class GameServiceImplimentation implements GamesService {
	
	@Autowired
	private GamesRepository repo;

	@Override
	public String onSave(GamesDto dto) {
		GamesEntity games=new GamesEntity();
		if(dto!=null) {
			BeanUtils.copyProperties(dto, games);
			repo.onSave(games);
			return "Done";
		}
		return "Not Done";
	}


	@Override
	public List<GamesDto> read() {
		List<GamesEntity> entity=repo.read();
		return entity.stream().map(GamesUtils::convertEntityToDto).collect(Collectors.toList());
	}
    
	@Override
	public List<GamesDto> getByGameName(String gamename) {
		if(gamename!=null) {
			List<GamesEntity> listOfEntities=repo.getBygameName(gamename);
			if(listOfEntities!=null) {
				return listOfEntities.stream().map(GamesUtils::convertEntityToDto).collect(Collectors.toList());
			}
		}
		return Collections.emptyList();
	}


	@Override
	public GamesDto findById(int id) {
		if (id > 0) {
			GamesEntity entity = repo.findById(id);
			return GamesUtils.convertEntityToDto(entity);
		}
		return null;
	}


	@Override
	public boolean update(GamesDto dto) {
		if (dto != null) {
			if (repo.update(GamesUtils.convertDtoToEntity(dto))) {
				return true;
			}
		}
		return false;
	}

	
}
