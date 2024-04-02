package com.job.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.job.model.JobPost;

@Repository
public class JobRepo {

	
	List<JobPost> jobs = new ArrayList<JobPost>(Arrays.asList());
	
	public void addJob(JobPost job) {
		jobs.add(job);
	}

	public List<JobPost> getJobs() {
		return jobs;
	}

	public JobPost getJob(int postId) {
		for(JobPost job:jobs) {
			if(job.getPostId()==postId) {
				return job;
			}
		}
		
		return null;
	}

	public void updateJob(JobPost job) {
		
		for(JobPost jp:jobs) {
			if(jp.getPostId()==job.getPostId()) {
				jp.setPostDesc(job.getPostDesc());
				jp.setPostExp(job.getPostExp());
				jp.setPostTechStack(job.getPostTechStack());
			}
		}
		
	}
	
	public void deleteJob(int postId) {
		for(JobPost job:jobs) {
			if (job.getPostId()==postId){
				jobs.remove(job);
			}
		}
	}

}
