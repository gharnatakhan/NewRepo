package com.fdmgroup.dao;

import javax.persistence.EntityManager;

import com.fdmgroup.model.Client;
import com.fdmgroup.model.GeoFlex;

public class GeoFlexDao {
	
	private DbConnection connection;

	public GeoFlexDao() {
		super();
		connection = DbConnection.getInstance();
	}
	
	public GeoFlex create(GeoFlex geoFlex){
		EntityManager em = connection.getEntityManager();
		em.getTransaction().begin();
		em.persist(geoFlex);
		em.getTransaction().commit();
		em.close();
		return geoFlex;
	}
	

}
