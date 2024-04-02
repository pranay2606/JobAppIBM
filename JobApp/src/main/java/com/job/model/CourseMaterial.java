package com.job.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class CourseMaterial {
	
	@Id
	private int materialId;
	private String content;
	
	@JoinColumn(name="course_id")
	private int courseId;
	
	@OneToOne
	private Course course;
}