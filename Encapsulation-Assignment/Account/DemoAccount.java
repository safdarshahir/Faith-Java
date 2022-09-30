package com.nissan.app;

import java.util.Scanner;
import com.nissan.oops.Account;
/*
 * A bank has two kinds of accounts, savings and fixed deposit. The interest rates for these are
4% and 11%respectively. Customer account interest needs to be implemented. Implement a
solution to print the interest on the basis of principle, time, & rate given by the user. Design
an appropriate class and method to implement this.
 * */
public class DemoAccount {

	public static void main(String[] args) {
		// creating Account instance
		Account[] accounts = new Account[5];

		int noOfAccounts = addAccounts(accounts);
		displayAccounts(accounts,noOfAccounts);

	}

	private static int addAccounts(Account[] accounts) {
		
		int noOfAccounts = 0;
		char choice;
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		try {
			do {

				accounts[noOfAccounts] = new Account();
				System.out.print("Enter Account no.:");
				int accNo = input.nextInt();
				accounts[noOfAccounts].setAccountNo(accNo);
				
				System.out.print("Enter Account Type (savings/fixed):");
				String accType = input.next();
				accounts[noOfAccounts].setAccountType(accType);
				
				System.out.print("Enter principal amount:");
				double principal = input.nextDouble();
				accounts[noOfAccounts].setPrincipal(principal);
				
				System.out.print("Enter Time (in Years):");
				int timeInYears = input.nextInt();
				accounts[noOfAccounts].setTimeInYears(timeInYears);

				
				noOfAccounts++;

				System.out.print("Continue(y/n):");
				choice = input.next().charAt(0);

			} while (choice != 'n');
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Limit Exceeded.");
		}
		
		return noOfAccounts;
	}

	private static void displayAccounts(Account[] accounts, int noOfAccounts) {
		// TODO Auto-generated method stub
		
		//displaying data in table format
				System.out.println("\n Displaying Account table:");
				System.out.print("\n -----------------------------------------------------------------------------------------");
				System.out.printf("\n %-15s %-15s %-20s %-20s %-20s", "Account No.", "Account Type", "Prinicpal Amount", "Acquired Amount","Interest Amount");
				System.out.print("\n -----------------------------------------------------------------------------------------");
				for (int i = 0; i < noOfAccounts; i++) {
					System.out.printf("\n %-15d %-15s %-20.2f %-20.2f %-20.2f",
										accounts[i].getAccountNo(),
										accounts[i].getAccountType(),
										accounts[i].getPrincipal(),
										accounts[i].getAcquiredAmount(),
										accounts[i].getInterestAmount());
				}

				System.out.print("\n -----------------------------------------------------------------------------------------");
				
		
	}

}
