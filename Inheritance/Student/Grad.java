package com.nissan.oops;

//class for graduate students
public class Grad extends Student{

	public Grad(int studentId) {
		super(studentId);
	}
	
	public boolean isPassed(float studentGrade) {
		return studentGrade > 80.0 ? true : false;
		
		
	}
	
	
	
	

}
