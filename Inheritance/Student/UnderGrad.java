package com.nissan.oops;

//class for undergraduate students
public class UnderGrad extends Student{

	public UnderGrad(int studentId) {
		super(studentId);
	}
	
	public boolean isPassed(float studentGrade) {
		return studentGrade > 70.0 ? true : false;
		
		
	}
	
	
	
	

}
