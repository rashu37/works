package com.xworkz.bank.resources;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.bank.entity.BankEntity;

@Component
public class BankRepoImplimentation implements BankRepository {
	
	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean onSave(BankEntity entity) {
        EntityManager manager= factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();
		return true;
	}

	@Override
	public List<BankEntity> read() {
		EntityManager manager=factory.createEntityManager();
		TypedQuery<BankEntity> tq = manager.createNamedQuery("findAll", BankEntity.class);
		return tq.getResultList();
	}

	@Override
	public List<BankEntity> getByholderName(String accountHolderName) {
		EntityManager manager=factory.createEntityManager();
		Query query=manager.createNamedQuery("findByName");
		query.setParameter("name",accountHolderName);
		return query.getResultList();
	}

	@Override
	public BankEntity findById(int id) {
		EntityManager manager=factory.createEntityManager();
		BankEntity entity=manager.find(BankEntity.class,id);
		return entity;
	}

	@Override
	public boolean update(BankEntity entity) {
		EntityManager manager=factory.createEntityManager();
		manager.getTransaction().begin();
		manager.merge(entity);
		manager.getTransaction().commit();
		manager.close();
		return true;
	}

}
