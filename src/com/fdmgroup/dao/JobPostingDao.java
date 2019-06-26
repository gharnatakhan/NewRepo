package com.fdmgroup.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.fdmgroup.model.JobPosting;
import com.fdmgroup.model.User;

public class JobPostingDao {
	
	private DbConnection connection;

	public JobPostingDao() {
		super();
		connection = DbConnection.getInstance();
	}
	
	
	public List<JobPosting> findAll() {
		EntityManager em = connection.getEntityManager();
		TypedQuery<JobPosting> query = em.createNamedQuery("jobPosting.findAll", JobPosting.class);
		List<JobPosting> jobPostings = query.getResultList();
		em.close();
		return  jobPostings;
	}

}
