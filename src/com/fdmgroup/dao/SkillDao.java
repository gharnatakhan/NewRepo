package com.fdmgroup.dao;

import javax.persistence.EntityManager;

import com.fdmgroup.model.GeoFlex;
import com.fdmgroup.model.Skill;

public class SkillDao {
	
	private DbConnection connection;

	public SkillDao() {
		super();
		connection = DbConnection.getInstance();
	}
	
	public Skill create(Skill skill){
		EntityManager em = connection.getEntityManager();
		em.getTransaction().begin();
		em.persist(skill);
		em.getTransaction().commit();
		em.close();
		return skill;
	}
	

}
