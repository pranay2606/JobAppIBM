package com.job.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.job.model.JobPost;
import java.util.List;


@Repository
public interface JobRepoDb extends JpaRepository<JobPost, Integer> {
	List<JobPost> findByPostExp(int postExp);
	
	List<JobPost> findByPostDesc(String postDesc);
	
	List<JobPost> findByPostDescContains(String postDesc);
	
	@Query("select j from JobPost j where j.postDesc LIKE %?1%")
	List<JobPost> findByPostDescTest(String postDesc);
	
	
	
}
