package com.nissan.app;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.nissan.bean.CustomerAccount;

/*
 * Create an array of objects of the Customer account (Acc no, Name, Age,Place,Acc Type) and
add the detail of 5 accounts. Display the details (all or according to Account number).Able to
add 5 Customer details at a time and search the Details by Acc no.*/

public class DemoCustomerApp {

	public static void main(String[] args) {

		int noOfCustomerAccount = 0;
		CustomerAccount[] customers = new CustomerAccount[10];

		char choice;
		Scanner input = new Scanner(System.in);

		do {
			System.out.print(" 1.Add Customer" + "\n 2.Display Cutomer " + "\n 3.Search Customer" + "\n 4.Exit"
					+ "\n Enter your choice:");

			int selection = input.nextInt();
			switch (selection) {
			case 1:
				noOfCustomerAccount = addCustomerAccount(customers);
				break;
				
			case 2:
				displayCustomerAccount(customers, noOfCustomerAccount);
				break;
				
			case 3:
				
				int searchKey;
				System.out.print("Enter Account no To search:");
				searchKey = input.nextInt();
				
				if(searchCustomerAccount(customers, noOfCustomerAccount,searchKey)) {
					System.out.println("Customer Found !!!");
				}else {
					System.out.println("Customer Not Exists !!!");
				}
				break;
				
			case 4:
				
				System.out.println("Exiting...");
				System.exit(0);
				break;

			default:
				System.out.println("Invalid Entry.");
				break;
			}
			System.out.println("Display Main Menu(y/n):");
			choice = input.next().charAt(0);

		} while (choice == 'y' || choice == 'Y');
		// creating employee instance

		input.close();

	}

	// Method to add customer accounts
	private static int addCustomerAccount(CustomerAccount[] customers) {

		char choice = ' ';
		int noOfCustomerAccount = 0;

		// customer detail variables
		int accountNo;
		String customerName;
		int age;
		String customerPlace;
		int accountType;

		// input object for reading data from user
		Scanner input = new Scanner(System.in);

		try {
			do {

				customers[noOfCustomerAccount] = new CustomerAccount();
				System.out.print("Enter Account Number:");
				accountNo = input.nextInt();
				
				//checking if customer already exists
				if(searchCustomerAccount(customers, noOfCustomerAccount,accountNo)) {
					
					System.out.println("Customer Already Exists.");
					continue;
					
				}else {
					
					customers[noOfCustomerAccount].setAccountNo(accountNo);

					System.out.print("Enter your Name:");
					customerName = input.next();
					customers[noOfCustomerAccount].setCustomerName(customerName);

					System.out.print("Enter your Age:");
					age = input.nextInt();
					customers[noOfCustomerAccount].setAge(age);

					System.out.print("Enter your Address:");
					customerPlace = input.next();
					customers[noOfCustomerAccount].setCustomerPlace(customerPlace);

					System.out.print("" + "\n \t 1.Saving." + "\n \t 2.Fixed" + "\n Enter Account Type:");
					accountType = input.nextInt();

					if (accountType == 1) {
						customers[noOfCustomerAccount].setAccountType("Savings");
					} else {
						customers[noOfCustomerAccount].setAccountType("Fixed");
					}

					//incrementing customer count
					noOfCustomerAccount++;	
				}
				
				System.out.print("Continue(y/n):");
				choice = input.next().charAt(0);

			} while (choice != 'n');
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Limit Exceeded.");
		} catch (InputMismatchException e) {
			System.out.println("Invalid Entry. Exiting.");
			System.exit(1);
		}
		return noOfCustomerAccount;
	}

	// Method to search customer account
	private static boolean searchCustomerAccount(CustomerAccount[] customers, int noOfCustomerAccount,int searchKey) {
		//looping thru each customer and checking for a matching customer account number
		for (int i = 0; i < noOfCustomerAccount; i++) {
			
			if(customers[i].getAccountNo() == searchKey) {
				
				//if found
				return true;
			}	
		}
		return false;

	}

	// Method to display customer accounts
	private static void displayCustomerAccount(CustomerAccount[] customers, int noOfCustomerAccount) {

		// displaying data in table format
		System.out.println("\n Displaying CustomerAccount table:");
		System.out.print("\n ---------------------------------------------------------------------------------");
		System.out.printf("\n %-15s %-15s %-15s %-20s %-20s", "Account No", "Customer Name", "Age", "Address",
				"Account Type");
		System.out.print("\n ---------------------------------------------------------------------------------");
		for (int i = 0; i < noOfCustomerAccount; i++) {

			System.out.printf("\n %-15d %-15s %-15d %-20s %-20s", customers[i].getAccountNo(),
					customers[i].getCustomerName(), customers[i].getAge(), customers[i].getCustomerPlace(),
					customers[i].getAccountType());

		}

		System.out.print("\n ---------------------------------------------------------------------------------");

	}

}
