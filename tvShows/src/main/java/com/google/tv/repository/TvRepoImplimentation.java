package com.google.tv.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.tv.entity.TvEntity;

@Component
public class TvRepoImplimentation implements TVRepository{
	
	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean onSave(TvEntity entity) {
		 EntityManager manager= factory.createEntityManager();
			
			manager.getTransaction().begin();
			manager.persist(entity);
			manager.getTransaction().commit();
			manager.close();
			return false;
	}

	@Override
	public List<TvEntity> read() {
		EntityManager manager= factory.createEntityManager();
		TypedQuery<TvEntity> tq = manager.createNamedQuery("findAll", TvEntity.class);
		return tq.getResultList();
	}

	@Override
	public List<TvEntity> getByShowName(String  title) {
		EntityManager manager=factory.createEntityManager();
		Query query=manager.createNamedQuery("findByTitle");
		query.setParameter("showName",  title);
		return query.getResultList();
	}

	@Override
	public TvEntity findById(int id) {
		EntityManager manager = factory.createEntityManager();
		TvEntity entity = manager.find(TvEntity.class, id);
		return entity;
	}

	@Override
	public boolean update(TvEntity entity) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.merge(entity);
		manager.getTransaction().commit();
		manager.close();
		return true;
	}

}
