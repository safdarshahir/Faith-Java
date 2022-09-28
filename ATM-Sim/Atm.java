package com.nissan.app;

import java.util.Scanner;

//implement ATM functions
public class Atm {

	public static void main(String[] args) {

		int pin;
		Scanner read = new Scanner(System.in);

		// loading user account
		Account userAccount = loadAccount();

		// reading pin from user
		System.out.print("Enter your 4 digit Pin:");
		pin = read.nextInt();

		// checking entered pin
		if (!userAccount.checkPin(pin)) {

			System.out.println("Invalid Pin. Try Again!!");

		} else {

			printMenu(userAccount);
		}

		read.close();
	}

	// Printing the menu
	private static void printMenu(Account userAccount) {
		Scanner read = new Scanner(System.in);
		char choice;

		do {

			System.out.print(" 1. Deposit \n 2. Withdraw \n 3. Show Balance \n 4. Exit \n Enter your choice: ");
			choice = read.next().charAt(0);
			switch (choice) {

			case '1':
				depositAmount(userAccount);
				break;

			case '2':
				withdrawAmount(userAccount);
				break;

			case '3':
				displayBalance(userAccount);
				break;

			case '4':
				System.out.println("Exiting...");
				break;

			default:
				System.out.println("Invalid Entry");
				break;
			}

		} while (choice != '4');
	}

	// Method to load an account with initial amount
	private static Account loadAccount() {

		double initialAmount = 6000;
		Account newAccount = new Account(initialAmount);
		return newAccount;
	}

	// Method to display balance
	private static void displayBalance(Account newAccount) {

		System.out.println("Your Ledger Balance : " + newAccount.getLedgerBalance());
		System.out.println("Your Available Balance : " + newAccount.getAvailableBalance());

	}

	// Method to with draw amount
	private static void withdrawAmount(Account newAccount) {

		double withDrawAmount;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Amount to Withdraw:");
		withDrawAmount = input.nextDouble();

		// checking for insufficient amounts
		if (withDrawAmount > newAccount.Amount) {

			System.out.println("Insufficient Balance.");
		} else {

			newAccount.Amount -= withDrawAmount;
			System.out.println("Please collect your cash.");
		}
	}

	// Method to deposit amount to account
	private static void depositAmount(Account newAccount) {

		double depositAmount;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Amount to Deposit:");
		depositAmount = input.nextDouble();

		// checking invalid entered amount
		if (depositAmount < 0 || depositAmount == 0) {
			System.out.println("Invalid Amount.");
		} else {

			newAccount.Amount += depositAmount;
			System.out.println("Amount Deposited.");
		}
	}
}
