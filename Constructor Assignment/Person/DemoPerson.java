package com.nissan.app;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.nissan.bean.Person;

/*
 * Write a program that defines two classes – one is Person and another is main method class.
Person class should have instance variables like name, age, salary of type string , int and float.
Use new operator to create a Person object and call constructor to initialize the instance
variables and display its value.
 * */

public class DemoPerson {

	public static void main(String[] args) {		

		char choice;
		int noOfPerson = 0;
		// creating Person instance
		Person[] persons = new Person[5];

		// input object for reading data from user
		Scanner input = new Scanner(System.in);
	

		try {
			do {
				System.out.print("\n Enter Person"+(noOfPerson+1)+" Name:");
				String name = input.next();
				System.out.print(" Enter Person"+(noOfPerson+1)+" age:");
				int age = input.nextInt();
				System.out.print(" Enter Person"+(noOfPerson+1)+" Salary:");
				float salary = input.nextFloat();

				// creating new person with given data
				persons[noOfPerson] = new Person(name,age,salary);

				//incrementing count of no of persons
				noOfPerson++;

				//reading choice
				System.out.print("Continue(y/n):");
				choice = input.next().charAt(0);

			} while (choice != 'n');
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Limit Exceeded.");
		}catch(InputMismatchException e) {
			System.out.println("Invalid Entry. Exiting.");
			System.exit(1);
		}
		
		
		//displaying person details in table format
		System.out.printf("\n Displaying Person table:");
		System.out.print("\n --------------------------------------------------------------------");	
		System.out.printf("\n %-20s %-20s %-20s","Name","Age","Salary");
		System.out.print("\n --------------------------------------------------------------------");	
		for (int i = 0; i < noOfPerson; i++) {
			persons[i].displayPerson();
		}
		System.out.print("\n --------------------------------------------------------------------");	

		input.close();
		

	}

}
