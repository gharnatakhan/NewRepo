package com.fdmgroup.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fdmgroup.dao.AccountManagerDao;
import com.fdmgroup.model.AccountManager;
import com.fdmgroup.model.JobPosting;
import com.fdmgroup.model.User;

/**
 * Controller for AccountManager for creating Job Applications
 * @author jay.patel1 matthew mccarthy
 *
 */
@Controller
public class AccountManagerController {

	@RequestMapping(value = "/accountManagerDashboard")
	public String showCreatePosting(HttpSession session, Model model) {
		User user = (User)session.getAttribute("user");
		AccountManagerDao amDao = new AccountManagerDao();
		if(user.getClass() != AccountManager.class) {
			//If user type is not trainee then redirect to landing page depending on user
			model.addAttribute("errorMsg", "You must be an account manager to view this page.");
			return "redirect:/";
		}
		
		//jsp page with form to create a posting
		return "accountManagerDashboard";
	}
	

}
