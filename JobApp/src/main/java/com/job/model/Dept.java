package com.job.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
public class Dept {
	
	@Id
	private int deptno;
	private String dname;
	private String loc;
	
	@OneToMany(mappedBy = "dept")
	private List<Employee> emp;
}
