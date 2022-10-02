package com.nissan.app;
import java.util.Scanner;

import com.nissan.oops.Grad;
import com.nissan.oops.UnderGrad;

public class Test {

	public static void main(String[] args) {

		int studentType;
		char choice;
		
		Grad gradStudent;
		UnderGrad underGradStudent;
		
		Scanner input = new Scanner(System.in);
		
		do {
			
			System.out.println(""
					+ "1.Graduate Student Entry \n "
					+ "2.Under-Graduate Student Entry \n "
					+ "3.Exit \n"
					+ "Enter your choice:");
			studentType = input.nextInt();
			
			switch (studentType) {
			case 1:
//					readStudentData(gradStudent);
					gradStudent = new Grad(1001);
					gradStudent.setStudentName("safdar");
					gradStudent.setAddress("Thalassery");
					gradStudent.setStudentGrade(73);
					
					if(gradStudent.isPassed(gradStudent.getStudentGrade())) {
						System.out.println("Passed");
					}else {
						
						System.out.println("Failed");
					}
					
				break;

			case 2:
//				readStudentData(gradStudent);
				underGradStudent = new UnderGrad(1002);
				underGradStudent.setStudentName("sarfaraz");
				underGradStudent.setAddress("Thalassery");
				underGradStudent.setStudentGrade(73);
				
				if(underGradStudent.isPassed(underGradStudent.getStudentGrade())) {
					System.out.println("Passed");
				}else {
					
					System.out.println("Failed");
				}
				break;
				
			case 3:
				System.out.println("Exiting");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Entry.\n Try again.");
				break;
			}
			System.out.print("Continue(y/n):");
			choice = input.next().charAt(0);
			
		} while (choice =='y' || choice =='Y');
		input.close();
	}

}
