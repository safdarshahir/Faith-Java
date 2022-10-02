package com.nissan.oops;

import java.util.Scanner;

public class Student {
	
	private int studentId;
	private String studentName;
	private String address;
	private float studentGrade;
	
	public Student(int studentId) {
		super();
		this.studentId = studentId;
	}
	
	public Student(int studentId, String studentName, String address, int studentGrade) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.address = address;
		this.studentGrade = studentGrade;
	}

	//getters and setters
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getStudentGrade() {
		return studentGrade;
	}

	public void setStudentGrade(float studentGrade) {
		this.studentGrade = studentGrade;
	}
	
	//method to check whether the student is passed or not
	public boolean isPassed(float studentGrade) {
		return studentGrade>50 ? true:false;
	}
	
	public void readStudentData() {
		// TODO Auto-generated method stub
//		
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter name:");
//		
		
	}
	
	
	
	
	
	
	
	
}