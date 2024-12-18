package com.google.games.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.games.entity.GamesEntity;

@Component
public class GamesRepoImplimention implements GamesRepository {

	@Autowired
	private EntityManagerFactory factory;
	
	@Override
	public boolean onSave(GamesEntity entity) {
     EntityManager manager= factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();
		return true;
	}

	@Override
	public List<GamesEntity> read() {
		 EntityManager manager= factory.createEntityManager();
		TypedQuery<GamesEntity> tq = manager.createNamedQuery("findAll", GamesEntity.class);
		return tq.getResultList();
	}

	@Override
	public List<GamesEntity> getBygameName(String gamename) {
		EntityManager manager=factory.createEntityManager();
		Query query=manager.createNamedQuery("findByName");
		query.setParameter("game",gamename);
		return query.getResultList();		
	}

	@Override
	public GamesEntity findById(int id) {
		EntityManager manager = factory.createEntityManager();
		GamesEntity entity = manager.find(GamesEntity.class, id);
		return entity;
	}

	@Override
	public boolean update(GamesEntity entity) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.merge(entity);
		manager.getTransaction().commit();
		manager.close();
		return true;
	}

	
	
}
