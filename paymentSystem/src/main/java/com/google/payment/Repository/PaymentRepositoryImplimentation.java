package com.google.payment.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.google.payment.Entity.PaymentEntity;


@Component
public class PaymentRepositoryImplimentation implements PaymentRepository {
	
	@Autowired
	private EntityManagerFactory factory;

	
	@Override
	public boolean onSave(PaymentEntity entity) {
		System.out.println("Payment repo Implimentation");
		System.out.println(entity);
		EntityManager manager= factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();
		return true;
	}


	@Override
	public List<PaymentEntity> read() {
		EntityManager manager=factory.createEntityManager();
		TypedQuery<PaymentEntity> tq = manager.createNamedQuery("findAll", PaymentEntity.class);
		return tq.getResultList();
	}


	@Override
	public List<PaymentEntity> getByholderName(String accountHolderName) {
		EntityManager manager=factory.createEntityManager();
		Query query=manager.createNamedQuery("findByName");
		query.setParameter("name",accountHolderName);
		return query.getResultList();
	}

    @Override
	public PaymentEntity findById(int id) {
		EntityManager manager = factory.createEntityManager();
		PaymentEntity entity = manager.find(PaymentEntity.class, id);
		return entity;
	}
    
   @Override
	public boolean update(PaymentEntity entity) {
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.merge(entity);
		manager.getTransaction().commit();
		manager.close();
		return true;
	}
	
	

}
