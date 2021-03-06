package com.fdmgroup.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fdmgroup.dao.JobPostingDao;
import com.fdmgroup.model.JobPosting;

/**
 * 
 * @author jay.patel1
 * Controller for showing JobPostings
 */
@Controller
public class JobPostingController {

	@RequestMapping(value = "/jobPostings")
	public String showAllJobPostings(HttpSession session, Model model) {
		JobPostingDao jobPostingDao = new JobPostingDao();

		// finds all job postings
		List<JobPosting> listOfJobPostings = jobPostingDao.findAll();
		model.addAttribute("listOfJobPostings", listOfJobPostings);
		return "jobPostings";
	}
	
	@RequestMapping(value = "/jobPostings/{type}/{id}")
	public String findJobPosting(@PathVariable String type, @PathVariable int id, HttpSession session, Model model) {
		JobPostingDao jobPostingDao = new JobPostingDao();

		// finds all job postings by client id 
		if(type.equals("Client")) {
			List<JobPosting> listOfJobPostings = jobPostingDao.findByClientId(id);
			model.addAttribute("listOfJobPostings", listOfJobPostings);
		}
		if(type.equals("AccountManager")) {
			List<JobPosting> listOfJobPostings = jobPostingDao.findByAccountManagerId(id);
			model.addAttribute("listOfJobPostings", listOfJobPostings);
		}
		
		return "jobPostings";
	}
}
