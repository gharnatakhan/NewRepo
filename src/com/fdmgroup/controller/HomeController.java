
package com.fdmgroup.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fdmgroup.dao.UserDao;
import com.fdmgroup.dao.JobPostingDao;
import com.fdmgroup.model.AccountManager;
import com.fdmgroup.model.Client;
import com.fdmgroup.model.JobPosting;

import com.fdmgroup.model.SalesAdministrator;
import com.fdmgroup.model.SystemAdministrator;
import com.fdmgroup.model.Trainee;
import com.fdmgroup.model.User;

@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public String showIndex(HttpSession session, @RequestParam String email, @RequestParam String password, Model model) {
		System.out.println("-- HomeController --");
		User user = (User) session.getAttribute("user");
		// Is there a logged in User
		if (user != null) {
			return redirectUser(user);
		} else if (email != null) {
			// Does a user with matching credentials exist?
			UserDao userDao = new UserDao();
			User foundUser = userDao.findByEmail(email);
			if (foundUser != null && foundUser.getPassword().equals(password)) {
				// User logs in and is added to session
				session.setAttribute("user", foundUser);
				return redirectUser(foundUser);
			}
			else {
				// User does not login
				return "index";
			}

		}

		return "index";

	}

	@RequestMapping(value = "/logout")
	public String logout(HttpServletRequest req, ModelMap model) {
		System.out.println("logout()");
		HttpSession session = req.getSession();
		session.invalidate();
		model.addAttribute("logoutMsg", "successfully logged-out");

		return "index";

	}

	@RequestMapping(value = "/jobPostings")
	public String showJobPostings(HttpSession session, Model model) {
		JobPostingDao jobPostingdao = new JobPostingDao();
		User user = (User) session.getAttribute("user");
		if(user != null ) {
			if(user.getClass() == Trainee.class) {
				//finds all job postings for trainee
				List<JobPosting> listOfJobPostings = jobPostingdao.findAll();
				model.addAttribute("listOfJobPostings",listOfJobPostings);
				return "jobPosting";
			}
		}
		
		//placeholder right now
		return "jobPosting";
	}
	
	private static String redirectUser(User user) {
			if (user.getClass() == Trainee.class) {
				// Forward to job postings
				System.out.println("Trainee signed in");
				return "redirect:/jobPostings";
			} else if (user.getClass() == AccountManager.class) {
				// Forward to AM dashboard
				System.out.println("AM signed in");
				return "redirect:/accountManagerDashboard";
			} else if (user.getClass() == SystemAdministrator.class) {
				// Forward to SystemAdmin dashboard
				System.out.println("SysAdmin signed in");
				return "redirect:/sysAdminDashboard";
			} else if (user.getClass() == SalesAdministrator.class) {
				// Forward to SalesAdmin dashboard
				System.out.println("SalesAdmin signed in");
				return "redirect:/salesAdminDashboard";
			}		
			return "index";
	}
	
	@RequestMapping("/clients")
	public String showAllClients(HttpSession session, Client client) {
		clien
	}
}
