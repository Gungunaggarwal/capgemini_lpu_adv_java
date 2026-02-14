package com.practice;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;

import javax.persistence.Id;

@Entity
@Table(name="student_info")
public class Student {
	@Id
	@Column(name = "student_ID")
	private int id;
	@Column(name = "student_name")
	private String name;
	@Column(name = "student_percentage")
	private double percentage;
	@Column(name = "student_job")
	private String job;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	

}
