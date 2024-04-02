package com.job.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.job.model.JobPost;
import com.job.service.JobService;

@RestController
public class JobRestController {
	
	@Autowired
	JobService service;
	
	@GetMapping("/jobPosts")
	public List<JobPost> viewJobs() {
		return service.getJobs();
	}
	
	@GetMapping("/jobPost/{postId}")
	public Optional<JobPost> viewJob(@PathVariable int postId){
		
		return service.getJob(postId);
	}
	
	@GetMapping("/jobPosts/exp/{postExp}")
	public List<JobPost> findPostExp(@PathVariable int postExp){
		return service.postExp(postExp);
	}
	@GetMapping("/jobPosts/desc/{postDesc}")
	public List<JobPost> findPostDesc(@PathVariable String postDesc){
		return service.postDesc(postDesc);
	}
	
	@GetMapping("/jobPosts/desc1/{postDesc1}")
	public List<JobPost> findPostDesc1(@PathVariable String postDesc1){
		return service.postDesc1(postDesc1);
	}
	
	@PostMapping("/jobPosts")
	public String putJob(@RequestBody JobPost job) {
		System.out.println("Before Executing Post Mapping");
		service.addJob(job);
		System.out.println("After Executing Post Mapping");
		return "success";
		
	}
	
	@PutMapping("/jobPosts")
	public JobPost updateJob(@RequestBody JobPost job) {
		service.updateJob(job);
		return job;
	}
	
	@DeleteMapping("/jobPosts/{postId}")
	public String deleteJob(@PathVariable int postId) {
		service.deleteJob(postId);
		return "deleted";
	}
	
	
	
}
