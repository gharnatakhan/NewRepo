package com.fdmgroup.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fdmgroup.model.Client;
import com.fdmgroup.model.User;

@Controller
public class ClientController {

	@RequestMapping("/clients")
	public String showAllClients(HttpSession session, Client client) {
		User user = (User) session.getAttribute("client");
		if (user != empty) {
			// get all the clients and store in the list of string
			List<String> listOfClients = clientDao.findAll();
		}
	}
}
