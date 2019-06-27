package com.fdmgroup.dao;

import javax.persistence.EntityManager;

import com.fdmgroup.model.Trainee;
import com.fdmgroup.model.User;

public class TraineeDao {
	
	private DbConnection connection;
	
	public TraineeDao() {
		super();
		connection = DbConnection.getInstance();
	}
	
	public Trainee findById(int id) {
		EntityManager em = connection.getEntityManager();
		Trainee Foundtrainee = em.find(Trainee.class, id);
		em.close();
		return Foundtrainee;
	}
	
	public void update(Trainee trainee, String new_status){
		System.out.println("Entering trainee update");
		EntityManager em = connection.getEntityManager();
		Trainee foundUser = em.find(Trainee.class, trainee);
		em.getTransaction().begin();
				
		foundUser.setStatus(new_status);
		System.out.println("Exiting update in Trainee");
		
		em.getTransaction().commit();
		em.close();
	}

}
