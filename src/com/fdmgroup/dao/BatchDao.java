package com.fdmgroup.dao;

import javax.persistence.EntityManager;

import com.fdmgroup.model.Batch;

public class BatchDao {
	private DbConnection connection;
	
	public BatchDao() {
		super();
		connection = DbConnection.getInstance();
	}
	
	public Batch create(Batch batch){
		EntityManager em = connection.getEntityManager();
		em.getTransaction().begin();
		em.persist(batch);
		em.getTransaction().commit();
		em.close();
		return batch;
	}
}
