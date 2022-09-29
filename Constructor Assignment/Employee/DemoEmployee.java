package com.nissan.app;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.nissan.bean.Employee;

/*
 * Write a program that creates two classes – one is Employee and another is main method class.
Employee class contain emp_code, name, designation and salary fields and three constructors
– default constructor, second constructor contains three fields emp_code, name and
designation and if the designation is clerk set salary of Rs.5000, Rs.2000 for peon , Rs.10000
for manager and Rs.1000 for others. Third constructor contains four fields emp_code, name,
salary and designation. Display information of employee using display method.
*/

public class DemoEmployee {

	public static void main(String[] args) {

		char choice;
		int noOfEmployee = 0;
		// creating employee instance
		Employee[] employees = new Employee[5];

		// input object for reading data from user

		Scanner input = new Scanner(System.in);
		Scanner readLine = new Scanner(System.in);

		try {
			do {

				System.out.print("Enter Employee Id:");
				int empCode = input.nextInt();
				System.out.print("Enter Employee Name:");
				String empName = input.next();
				System.out.print("Enter Employee Designation:");
				String designation = input.next();
				System.out.print("Enter Employee Salary:");
				String salary = readLine.nextLine();

				// checking whether salary is not entered
				if (salary.equals("")) {
					employees[noOfEmployee] = new Employee(empCode, empName, designation);
				} else {
					employees[noOfEmployee] = new Employee(empCode, empName, designation, Double.parseDouble(salary));
				}

				noOfEmployee++;

				System.out.print("Continue(y/n):");
				choice = input.next().charAt(0);

			} while (choice != 'n');
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Limit Exceeded.");
		} catch (InputMismatchException e) {
			System.out.println("Invalid Entry. Exiting.");
			System.exit(1);
		}

		//displaying data in table format
		System.out.println("\n Displaying Employee table:");
		System.out.print("\n --------------------------------------------------------------------");
		System.out.printf("\n %-15s %-15s %-15s %-20s", "Emp Id", "Employee Name", "Designation", "Salary");
		System.out.print("\n --------------------------------------------------------------------");
		for (int i = 0; i < noOfEmployee; i++) {
			employees[i].displayEmployee();
		}

		System.out.print("\n --------------------------------------------------------------------");
		input.close();
		readLine.close();
	}

}
