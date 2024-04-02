package com.job.model;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity
public class JobPost {
	@Id
	private int postId;
	private String postProfile;
	@Column(name = "postdesc")
	private String postDesc;
	private int postExp;
	private String prevCompany;
	private List<String> postTechStack;
	
	
	
	
	public JobPost() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JobPost(int postId, String postProfile, String postDesc, int postExp, String prevCompany,
			List<String> postTechStack) {
		super();
		this.postId = postId;
		this.postProfile = postProfile;
		this.postDesc = postDesc;
		this.postExp = postExp;
		this.prevCompany = prevCompany;
		this.postTechStack = postTechStack;
	}
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public String getPostProfile() {
		return postProfile;
	}
	public void setPostProfile(String postProfile) {
		this.postProfile = postProfile;
	}
	public String getPostDesc() {
		return postDesc;
	}
	public void setPostDesc(String postDesc) {
		this.postDesc = postDesc;
	}
	public int getPostExp() {
		return postExp;
	}
	public void setPostExp(int postExp) {
		this.postExp = postExp;
	}
	public String getPrevCompany() {
		return prevCompany;
	}
	public void setPrevCompany(String prevCompany) {
		this.prevCompany = prevCompany;
	}
	public List<String> getPostTechStack() {
		return postTechStack;
	}
	public void setPostTechStack(List<String> postTechStack) {
		this.postTechStack = postTechStack;
	}
	@Override
	public String toString() {
		return "JobPost [postId=" + postId + ", postProfile=" + postProfile + ", postDesc=" + postDesc + ", postExp="
				+ postExp + ", prevCompany=" + prevCompany + ", postTechStack=" + postTechStack + "]";
	}
	
	
}
