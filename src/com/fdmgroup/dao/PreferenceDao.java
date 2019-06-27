package com.fdmgroup.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.fdmgroup.model.JobPosting;
import com.fdmgroup.model.Preference;
import com.fdmgroup.model.User;

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
	
	public List<Preference> findAll() {
		EntityManager em = connection.getEntityManager();
		TypedQuery<Preference> query = em.createNamedQuery("preference.findAll", Preference.class);
		List<Preference> preferences= query.getResultList();
		em.close();
		return preferences;
	}

}
