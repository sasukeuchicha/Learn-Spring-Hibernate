package com.hibernate.hibernateLearn;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {

	private String Course;
	private String Duration;
	
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Certificate(String course, String duration) {
		super();
		Course = course;
		Duration = duration;
	}

	public String getDuration() {
		return Duration;
	}
	public void setDuration(String duration) {
		Duration = duration;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	
}
