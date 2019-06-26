package com.fdmgroup.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fdmgroup.model.AccountManager;
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
	public String showAccountManagerById(@PathVariable String name, HttpSession session, Model model) {
		User user = (User)session.getAttribute("user");
		AccountManagerDao amDao = new AccountManagerDao();
		
		if(user.getClass() != Trainee.class) {
			//if user type is not trainee then redirect to landing page depending on user
			model.addAttribute("errorMsg", "You must be a trainee to view this page.");
			return "redirect:/";
		}
		// finds account managers by id
		AccountManager accountManager = amDao.findbyAccountManagerName(name);
		model.addAttribute("accountManager", accountManager);
		return "accountManagers";
	}
}
