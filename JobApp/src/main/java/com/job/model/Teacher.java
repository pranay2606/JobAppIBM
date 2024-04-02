package com.job.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Teacher {
	
	@Id
	private int teacherId;
	private String tname;
	private String temail;
	
	
	@Column
	@OneToMany(targetEntity = Course.class, cascade = CascadeType.ALL)
	@JoinColumn(name="tid",referencedColumnName = "teacherId")
	private List<Course> course;
	
}