package com.nissan.bean;

import java.util.Scanner;

// TODO Sum of digits of number
public class DemoSumofNumber {

	public static void main(String[] args) {

		String numberInString;
		int sumOfDigits =0;
		Scanner input = new Scanner(System.in);

	
		System.out.print("Enter a number:");
		numberInString = input.nextLine();

		//taking each character and subtracting it with 0 to get integer number
		for (int i = 0; i < numberInString.length(); i++) {
			sumOfDigits += numberInString.charAt(i)-'0';
		}
		
		System.out.println("Sum digit in "+numberInString+" :"+sumOfDigits);
		input.close();
	}

}
