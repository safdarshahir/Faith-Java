package com.nissan.bean;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Course {

	private int courseCode;
	private String courseName;
	private String description;
	private String duration;
	private float fees;
	private HashSet<String> qualification;
	
	//default constructor
	public Course() {
		super();
	}

	//parameterized constructor
	public Course(int courseCode, String courseName, String description, String duration, float fees,
			HashSet<String> qualification) {
		super();
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.description = description;
		this.duration = duration;
		this.fees = fees;
		this.qualification = qualification;
	}

	//getters and setters
	public int getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(int courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		
		this.description = description;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}

	public HashSet<String> getQualification() {
		return qualification;
	}

	public void setQualification(HashSet<String> qualification) {
		this.qualification = qualification;
	}

	//overriding ToString
	@Override
	public String toString() {
		return "Course [courseCode=" + courseCode + ", courseName=" + courseName + ", description=" + description
				+ ", duration=" + duration + ", fees=" + fees + ", qualification=" + qualification + "]";
	}
	
	//generate course code
	
	public static int generateCourseCode() {
		
		Random rndCourseCode = new Random(System.currentTimeMillis());
		return ((1+rndCourseCode.nextInt(2))*10000+rndCourseCode.nextInt(10000));
	}
	
	
	
	
	
	
}
