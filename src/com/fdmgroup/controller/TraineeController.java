package com.fdmgroup.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fdmgroup.dao.JobPostingDao;
import com.fdmgroup.model.AccountManager;
import com.fdmgroup.model.Application;
import com.fdmgroup.model.JobPosting;
import com.fdmgroup.model.Trainee;
import com.fdmgroup.model.User;

/**
 * Controller for Trainee related processing
 * @author jay.patel1
 *
 */
@Controller
public class TraineeController {

	@RequestMapping(value = "/accountManagers")
	public String showAllAccountManagers(HttpSession session, Model model) {
		User user = (User)session.getAttribute("user");
		AccountManagerDao amDao = new AccountManagerDao();
		if(user.getClass() != Trainee.class) {
			//if user type is not trainee then redirect to landing page depending on user
			model.addAttribute("errorMsg", "You must be a trainee to view this page.");
			return "redirect:/";
		}
		// finds all account managers
		List<AccountManager> listofAccountManagers = amDao.findAll();
		model.addAttribute("listofAccountManagers", listofAccountManagers);
		return "accountManagers";
	}
	
	@RequestMapping(value = "/accountManagers/{id}")
	public String showAccountManagerById(@PathVariable int id, HttpSession session, Model model) {
		User user = (User)session.getAttribute("user");
		AccountManagerDao amDao = new AccountManagerDao();
		
		if(user.getClass() != Trainee.class) {
			//if user type is not trainee then redirect to landing page depending on user
			model.addAttribute("errorMsg", "You must be a trainee to view this page.");
			return "redirect:/";
		}
		// finds account managers by id
		AccountManager accountManager = amDao.findbyAccountManagerId(id);
		model.addAttribute("accountManager", accountManager);
		return "accountManagers";
	}
	
	@RequestMapping(value = "/accountManagers/{name}")
	public String showAccountManagerByName(@PathVariable String name, HttpSession session, Model model) {
		User user = (User)session.getAttribute("user");
		AccountManagerDao amDao = new AccountManagerDao();
		
		if(user.getClass() != Trainee.class) {
			//if user type is not trainee then redirect to landing page depending on user
			model.addAttribute("errorMsg", "You must be a trainee to view this page.");
			return "redirect:/";
		}
		// finds account managers by name
		List<AccountManager> listofAccountManagers = amDao.findbyAccountManagerName(name);
		model.addAttribute("listofAccountManagers", listofAccountManagers);
		return "accountManagers";
	}
	
	@RequestMapping(value = "/submitApplication")
	public String applytoJobPosting(@RequestParam int jobId , @RequestParam String elevatorPitch, HttpSession session,Model model) {
		User user = (User)session.getAttribute("user");
		JobPostingDao jobDao = new JobPostingDao();
		ApplicationDao appDao = new ApplicationDao();
		
		if(user.getClass() != Trainee.class) {
			//if user type is not trainee then redirect to landing page depending on user
			model.addAttribute("errorMsg", "You must be a trainee to submit an application.");
			return "redirect:/";
		}
		
		JobPosting foundJob = jobDao.findById(jobId);
		if(foundJob != null) {
			//need to change constructor for app to not include id
			Application app = new Application(0,user.getUserId(), foundJob.getJobPostingId(), elevatorPitch);
			//persist application into DB
			appDao.create(app);
			model.addAttribute("infoMsg", "Successfully applied to job.");
		}
		
		//redirect to landing page after application
		return "redirect:/";
	}
}
