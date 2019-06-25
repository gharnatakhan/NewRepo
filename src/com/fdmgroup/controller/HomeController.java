
package com.fdmgroup.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fdmgroup.dao.UserDao;
import com.fdmgroup.model.AccountManager;
import com.fdmgroup.model.SalesAdministrator;
import com.fdmgroup.model.SystemAdministrator;
import com.fdmgroup.model.Trainee;
import com.fdmgroup.model.User;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public String showIndex(HttpSession session, @RequestParam String email, @RequestParam String password) {
		System.out.println("-- HomeController --");
		UserDao dao = new UserDao();
		User foundUser = UserDao.findByEmail(email);
		if (foundUser.getPassword().equals(password) ) {
			
		}
		User user = (User) session.getAttribute("user");

			
		
		return "index";
	}

	private static void redirectUser() {
		
	}

}
