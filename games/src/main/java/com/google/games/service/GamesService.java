package com.google.games.service;

import java.util.List;

import com.google.games.dto.GamesDto;


public interface GamesService {
	public String onSave(GamesDto dto);
	List<GamesDto> read();
	List<GamesDto> getByGameName(String gamename);
	GamesDto findById(int id);
    boolean update(GamesDto dto);
}
