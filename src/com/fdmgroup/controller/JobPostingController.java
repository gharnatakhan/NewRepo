package com.fdmgroup.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
		JobPostingDao jobPostingdao = new JobPostingDao();

		// finds all job postings for any user type
		List<JobPosting> listOfJobPostings = jobPostingdao.findAll();
		model.addAttribute("listOfJobPostings", listOfJobPostings);
		return "jobPostings";
	}
}
