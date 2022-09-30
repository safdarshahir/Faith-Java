package com.nissan.app;
import java.util.Scanner;

import com.nissan.oops.Bank;
import com.nissan.oops.BankA;
import com.nissan.oops.BankB;
import com.nissan.oops.BankC;
/*
 * Write a java program to perform the concept of method
overriding for calculating simple interest of 3 banks A,B,C. using dynamic method dispatch
Bank A’s rate of interest-10%, Bank’s B rate of interest-9%, Bank’C rate of interest -7%
*/
//Demo of bank application with different interest rates

public class DemoBankApp {

	public static void main(String[] args) {

		//Declaring variables
		char choice;
		String bankName;
		double principal;
		int timeInYears;
		

		// creating bank object
		Bank bank;
		
		//creating input object for reading input from user
		Scanner input = new Scanner(System.in);
		Scanner readLine = new Scanner(System.in);

		do {

			
			//reading input from user 
			
			System.out.print("Enter Bank Name:");
			bankName = readLine.nextLine();

			System.out.print("Enter principal:");
			principal = input.nextDouble();
			
			System.out.print("Enter Time in Year:");
			timeInYears = input.nextInt();

			//checking banks name and calling corresponding banks object
			
			if(bankName.equals("a")){
				
				bank = new BankA();
				System.out.println("Your Interest Amount:" + bank.Interest(principal, timeInYears));
				
			}else if(bankName.equals("b")) {
				
				bank = new BankB();
				System.out.println("Your Interest Amount:" + bank.Interest(principal, timeInYears));
			}else if(bankName.equals("c")) {
				
				bank = new BankC();
				System.out.println("Your Interest Amount:" + bank.Interest(principal, timeInYears));
			}else {
				
				bank = new Bank();
				System.out.println("Your Interest Amount:" + bank.Interest(principal, timeInYears));
				
			}
			
			System.out.print("Continue(y/n):");
			choice = input.next().charAt(0);

		} while (choice == 'y' || choice == 'Y');
		input.close();
		readLine.close();

	}

}
