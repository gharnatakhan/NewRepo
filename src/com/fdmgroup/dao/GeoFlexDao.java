package com.fdmgroup.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.fdmgroup.model.AccountManager;
import com.fdmgroup.model.Client;
import com.fdmgroup.model.GeoFlex;
import com.fdmgroup.model.JobPosting;

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
	
	public GeoFlex findbyGeoFlexId(int id) {
		EntityManager em = connection.getEntityManager();
		GeoFlex geoFlex = em.find(GeoFlex.class, id);
		em.close();
		return geoFlex;
	}
	
	
	public List<GeoFlex> findAll() {
		EntityManager em = connection.getEntityManager();
		TypedQuery<GeoFlex> query = em.createNamedQuery("geoFlex.findAll", GeoFlex.class);
		List<GeoFlex> allGeoFlex = query.getResultList();
		em.close();
		return allGeoFlex;
	}
	

}
