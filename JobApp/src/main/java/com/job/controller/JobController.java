package com.job.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.job.model.JobPost;
import com.job.service.JobService;

@Controller
public class JobController {
	
	@Autowired
	JobService service;
	
	@RequestMapping({"/","/home"})
	public String home() {
		return "home";
	}
	
	@RequestMapping("/about")
	public String About() {
		return "About";
	}
	
	@RequestMapping("/addjob")
	public String addJob() {
		return "addjob";
	}
	
	@RequestMapping("/handleForm")
	public String handleForm(@ModelAttribute("myJobPost") JobPost jobPost) {
		service.addJob(jobPost);
		return "success";
	}
	
	@RequestMapping("/viewalljobs")
	public String getAllJobs(Model m) {
		
		List<JobPost> jobs =  service.getJobs();
		m.addAttribute("jobPosts",jobs);
		return "viewalljobs";
	}
	
//	@GetMapping("/jobPosts")
//	@ResponseBody
	// welcome
//	public List<JobPost> viewJobs() {
//		return service.getJobs();
//	}
	
}
