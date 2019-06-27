package com.fdmgroup.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.fdmgroup.model.AccountManager;
import com.fdmgroup.model.Client;
import com.fdmgroup.model.GeoFlex;
import com.fdmgroup.model.JobPosting;
import com.fdmgroup.model.User;

public class JobPostingDao {
	
	private DbConnection connection;
	
	private AccountManagerDao amDao = new AccountManagerDao();
	private GeoFlexDao gfDao = new GeoFlexDao();

	public JobPostingDao() {
		super();
		connection = DbConnection.getInstance();
	}
	
	public JobPosting create(JobPosting jobPosting){
		EntityManager em = connection.getEntityManager();
		em.getTransaction().begin();
		int accountManagerId = jobPosting.getAccountManager().getUserId();
		AccountManager accountManager = amDao.findbyAccountManagerId(accountManagerId);
		int geoFlexId = jobPosting.getLocation().getGeoflexId();
		GeoFlex geoFlex = gfDao.findbyGeoFlexId(geoFlexId);
		JobPosting newJobPosting = new JobPosting(jobPosting.getNumberOfPositions(), jobPosting.getClientId(), accountManager, jobPosting.getJobTitle(), geoFlex, jobPosting.getApplicationDeadline(), jobPosting.getJobDescription(), jobPosting.getWantedPreferences()) ;
		em.persist(newJobPosting);
		em.getTransaction().commit();
		em.close();
		return newJobPosting;
	}
	
	
	public List<JobPosting> findAll() {
		EntityManager em = connection.getEntityManager();
		TypedQuery<JobPosting> query = em.createNamedQuery("jobPosting.findAll", JobPosting.class);
		List<JobPosting> jobPostings = query.getResultList();
		em.close();
		return  jobPostings;
	}
	
	public JobPosting findById(int jobPostingId) {
		EntityManager em = connection.getEntityManager();
		JobPosting jobPosting = em.find(JobPosting.class, jobPostingId);
		em.close();
		return jobPosting;
	}

}
