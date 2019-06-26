package com.fdmgroup.service;

import com.fdmgroup.model.Batch;
import com.fdmgroup.model.Trainee;;

public interface SalesAdminServiceI extends UserServiceI{
	Batch createBatch();
	
	boolean addUserToBatch(Trainee trainee, Batch b);
	
	boolean removeUserFromBatch(Trainee trainee, Batch b);
	
	void viewAllUsers();
	
	void viewTraineeApplicationHistory();
	
	void updateTraineeStatus(Trainee trainee);
}
