package com.fdmgroup.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fdmgroup.dao.ClientDao;
import com.fdmgroup.model.Client;
import com.fdmgroup.model.User;

@Controller
public class ViewClientController {
	
	@RequestMapping(value="/clients", method= RequestMethod.POST)
	public String showAllClients(HttpSession session, Model model) {
		User user = (User) session.getAttribute("user");
		if (user== null) {
			
			System.out.println("Inside showAllClients");
			// get all the clients and store in the list of string
			List<Client> listOfClients = new ArrayList<Client>();
			ClientDao cDao = new ClientDao();
			
			//Need to change after the confirmation from dao
			listOfClients = cDao.findAll();
			System.out.println(listOfClients.size());
			model.addAttribute("AllClient", listOfClients);
			System.out.println("Exiting showAllClient..");
			}
		return "index";
	}

}
