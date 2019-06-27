package com.fdmgroup.dao;

import javax.persistence.EntityManager;

import com.fdmgroup.model.JobPosting;
import com.fdmgroup.model.Preference;

public class PreferenceDao {
	
	private DbConnection connection;

	public PreferenceDao() {
		super();
		connection = DbConnection.getInstance();
	}
	
	public Preference create(Preference preference){
		EntityManager em = connection.getEntityManager();
		em.getTransaction().begin();
		em.persist(preference);
		em.getTransaction().commit();
		em.close();
		return preference;
	}

}
