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
	
	/*	public void update(User user){
	EntityManager em = connection.getEntityManager();
	User foundUser = em.find(User.class, user.getUserId());
	em.getTransaction().begin();
	
	if (user.getPassword() != null && !user.getPassword().equals(""))
		foundUser.setPassword(user.getPassword());
	if (user.getFirstname() != null && !user.getFirstname().equals(""))
		foundUser.setFirstname(user.getFirstname());
	if (user.getLastname() != null && !user.getLastname().equals(""))
		foundUser.setLastname(user.getLastname());

	em.getTransaction().commit();
	em.close();
}*/
	/*public void update(User user){
	}
	}*/
	
}
