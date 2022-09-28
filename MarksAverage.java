package com.nissan.bean;

import java.util.Scanner;

// TODO ENter the marks of 10 student and find the average
public class MarksAverage {

	public static void main(String[] args) {

		// declaring marks array and no of students in the class
		double marks[] = new double[20];
		int noOfStudents = 10;

		// Input object for reading from user
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < noOfStudents; i++) {

			System.out.print("Enter mark of student " + (i + 1) + ":");
			marks[i] = input.nextDouble();
		}

		System.out.println("Average mark of students:" + findAverage(marks, noOfStudents));

		input.close();
	}

	private static double findAverage(double[] marks, int noOfStudents) {
		// TODO method to find the average mark of students

		double sumOfMarks = 0;
		for (int i = 0; i < 10; i++) {

			sumOfMarks += marks[i];

		}
		return sumOfMarks / noOfStudents;

	}

}
