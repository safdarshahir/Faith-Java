package com.nissan.app;

import java.util.Scanner;

import com.nissan.dao.CourseDao;

public class NissanCrmApp {

	public static void main(String[] args) {

		//Entry point
		mainMenu();
	}

	public static void mainMenu() {
		/* Welcome
		 * 1. Course Master --
		 * 2. Course Inquiry
		 * 3. Report Generator
		 * 4. Exit
		 * */
		System.out.println();
		System.out.println("----------------------------------------------------------------");
		System.out.println("-              Training Academy Management System              -");
		System.out.println("----------------------------------------------------------------");
		System.out.println(" 1. Course Master"
						 + "\n 2. Course Inquiry"
						 + "\n 3. Report Generator"
						 + "\n 4. Exit");
		System.out.println("----------------------------------------------------------------");
		
		System.out.print("Enter your choice:");
		
		//input from the user 
				Scanner input = new Scanner(System.in);
				switch (input.nextInt()) {
				case 1:
					//go to course master
					CourseDao.menu();
					break;
				case 2:
					//go to course Inquiry
					break;
				case 3:
					//go to report generator
					break;
				case 4:
					//Exiting application
					exitApp();
					System.exit(0);
					break;
		

				default:
					System.out.println("Invalid entry.!!!");
					break;
				}
				input.close();
	}

	private static void exitApp() {
		System.out.println("Thank You for using CRM App. \n Exiting...");
	}

}
