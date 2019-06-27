package com.fdmgroup.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fdmgroup.dao.ClientDao;
import com.fdmgroup.dao.JobPostingDao;
import com.fdmgroup.dao.PreferenceDao;
import com.fdmgroup.model.AccountManager;
import com.fdmgroup.model.Client;
import com.fdmgroup.model.JobPosting;
import com.fdmgroup.model.User;

@Controller
public class CreateJobPostingController {
	
	@RequestMapping("/createPosting")
	public String showCreateJobPosting(Model model, HttpSession session, JobPosting jobPosting) {
		User user = (User)session.getAttribute("user");
		if(user.getClass() != AccountManager.class) {
			//If user type is not trainee then redirect to landing page depending on user
			model.addAttribute("errorMsg", "You must be an account manager to view this page.");
			return "redirect:/";
		}
//		GeoFlexDao geoFlexDao = new GeoFlexDao();
//		List<GeoFlex> geoflexs = geoFlexDao.findAll();
//		model.addAttribute("geoflexs", geoFlexs);
		ClientDao clientDao = new ClientDao();
		List<Client> clients = clientDao.findAll();
		model.addAttribute("clients", clients);
		PreferenceDao pDao = new PreferenceDao();
//		List<Preference> preferences = pDao.findAll();
		//jsp page with form to create a posting
		return "createJobPosting";
	}
	
	//Method that handles the request for createJobPosting form
	@RequestMapping(value="/createPostingForm", method=RequestMethod.POST)
	public String createJobPosting(@Valid @ModelAttribute("jobPosting")JobPosting jobPosting, Model model, BindingResult br, HttpSession session) {
		System.out.println("createPostingForm called");
		AccountManager user = (AccountManager)session.getAttribute("user");
		if (br.hasErrors()) {
			return "createJobPosting";
		}
		System.out.println("JobPosting:" + jobPosting.toString());
		jobPosting.setAccountManager(user);
		JobPostingDao jobPostingDao = new JobPostingDao();
		jobPostingDao.create(jobPosting);
		return "redirect:/";

	}
}
