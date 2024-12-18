package com.google.tv.repository;

import java.util.List;
import com.google.tv.entity.TvEntity;


public interface TVRepository {
	
	boolean onSave(TvEntity entity);
	List<TvEntity> read();
	List<TvEntity> getByShowName(String  title);
	TvEntity findById(int id);
	boolean update(TvEntity entity);

}
