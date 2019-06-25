package com.fdmgroup.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public String showIndex() {
		return "index";
		
	}

    @RequestMapping(value="/logout")
    public String logout(HttpServletRequest req, ModelMap model) {
           System.out.println("logout()");
         HttpSession session = req.getSession();
         session.invalidate();
         model.addAttribute("logoutMsg", "successfully logged-out");
         
         return "index";

    }

}
