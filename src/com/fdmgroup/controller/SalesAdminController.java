package com.fdmgroup.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fdmgroup.dao.ApplicationDao;
import com.fdmgroup.dao.UserDao;
import com.fdmgroup.model.Application;
import com.fdmgroup.model.Trainee;
import com.fdmgroup.model.User;

@Controller
public class SalesAdminController {
	
	//view all trainee application. Note that we don't need this
/*	@RequestMapping(value="/applicationHistory", method=RequestMethod.GET)
	public String viewAllApplicationHistory(HttpSession session, Model model) {
		System.out.println("Show all trainees' application histories");
		
		User user = (User) session.getAttribute("user");
		UserDao userDao = new UserDao();
		List<Application> listOfApplicationHistories= userDao.findAllApplications();
		
		return "applicationHistory";
	}
	*/
	
	// view all application history by client id
	@RequestMapping(value="/applicationHistory/{firstName}")
	public String findTraineeApplicationHistory(@PathVariable String firstName, HttpSession session, Model model) {
		// need a condition that if the trainee name is equal to the name input 
		UserDao userDao = new UserDao();
		List<Application> listOfApplicationHistories = userDao.findApplicationsByTraineeId(firstName);
		model.addAttribute("listOfApplicationHistories", listOfApplicationHistories);
		
		return "applicationHistory";
	}

}
