package com.nissan.app;

import java.util.Scanner;

/*a. Write a program that collects information of employees in an organization. 
 * When the user gives the input make sure that employee’s age should be between 18 and 60. 
 * If otherwise, throw exception.
*/

public class AgeLimitException {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		try {

			int empAge;
			String empName;

			System.out.print("Enter Employee name: ");
			empName = input.next();
			System.out.print("Enter Employee age: ");
			empAge = input.nextInt();
			if (empAge > 16 && empAge < 60) {

				System.out.print("Employe Name: " + empName);
				System.out.print("Employee age: " + empAge);
			} else {

				throw new Exception();
			}

		} catch (Exception e) {

			System.out.print("Sorry Invalid Age Entry");
		} finally {

			input.close();

		}

	}

}
