package com.nissan.bean;

import java.util.Scanner;

//largest common prefix
public class LargestCommonPrefix {

	public static void main(String[] args) {

		String stringOne;
		String stringTwo;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter String one:");
		stringOne = input.nextLine();
		System.out.print("Enter String Two:");
		stringTwo = input.nextLine();


		int smallestStringLength = Math.min(stringOne.length(), stringTwo.length());

		StringBuilder commonString = new StringBuilder();

		for (int i = 0; i < smallestStringLength; i++) {

			char c = stringOne.charAt(i);

			if (c == stringTwo.charAt(i)) {
				
				commonString.append(c);
				
			} else {
				break;
			}

		}
		
		if(commonString.length() == 0) {
			System.out.println(stringOne+" and "+stringTwo+" has no common prefixes");
		}else {
			
			System.out.println("Largest Common Prefix: "+commonString);
		}

		input.close();

	}
}
