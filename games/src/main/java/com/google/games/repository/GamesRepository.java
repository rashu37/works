package com.google.games.repository;

import java.util.List;

import com.google.games.entity.GamesEntity;


public interface GamesRepository {
	
	boolean onSave(GamesEntity entity);
	List<GamesEntity> read();
	List<GamesEntity> getBygameName(String gamename);
	GamesEntity findById(int id);
	boolean update(GamesEntity entity);

}
