package com.fdmgroup.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.fdmgroup.model.Client;
import com.fdmgroup.model.JobPosting;
import com.fdmgroup.model.User;

public class JobPostingDao {
	
	private DbConnection connection;

	public JobPostingDao() {
		super();
		connection = DbConnection.getInstance();
	}
	
	public JobPosting create(JobPosting jobPosting){
		EntityManager em = connection.getEntityManager();
		em.getTransaction().begin();
		em.persist(jobPosting);
		em.getTransaction().commit();
		em.close();
		return jobPosting;
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
