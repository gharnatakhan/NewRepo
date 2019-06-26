package com.fdmgroup.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.fdmgroup.model.AccountManager;

import com.fdmgroup.model.Trainee;

public class TestingApp {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("cauldron");
		EntityManager em = emf.createEntityManager();
		
		
		
		em.getTransaction().begin();
		
		Trainee trainee = new Trainee("trainee", "lastname", "@", "kys", "path", "pwd");
		em.persist(trainee);
		
		AccountManager accountmanager = new AccountManager("firstname", "last", "email", "ee", "path", "pwd");
		em.persist(accountmanager);
		
		System.out.println("Data stored");
		
		em.getTransaction().commit();
		em.close();
		emf.close();

	}
	
}

