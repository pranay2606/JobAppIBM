package com.job.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.job.model.JobPost;
import com.job.repository.JobRepo;
import com.job.repository.JobRepoDb;

@Service
public class JobService {

	@Autowired
	JobRepoDb repo;
	//JobRepo repo;
	
	public void addJob(JobPost job) {
		repo.save(job);
	}

	public List<JobPost> getJobs() {
		return repo.findAll();
		
	}

	public Optional<JobPost> getJob(int postId) {
		return repo.findById(postId);
		
	}

	public void updateJob(JobPost job) {
		repo.save(job);
		
	}
	
	public void deleteJob(int postId) {
		repo.deleteById(postId);
	}

	public List<JobPost> postExp(int postExp) {
		return repo.findByPostExp(postExp);
		
	}
	
	public List<JobPost> postDesc(String postDesc){
		return repo.findByPostDescContains(postDesc);
	}

	public List<JobPost> postDesc1(String postDesc1) {
		return repo.findByPostDescTest(postDesc1);
	}
	
}
