package com.fdmgroup.service;

import com.fdmgroup.model.JobPosting;

public interface AccountManagerServiceI extends UserServiceI{
	void viewAllTrainees();
	
	void viewMyPostings();

	boolean modifyJobPosting(JobPosting jp);
	
	boolean removeJobPosting(JobPosting jp);
}
