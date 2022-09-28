package com.nissan.bean;
import java.util.Scanner;

// TODO Replace "is" with "is not"
public class ReplaceIs {

	public static void main(String[] args) {
		
		String text;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter Text:");
		text = input.nextLine();

		System.out.print("Text after replacing:"+replaceIs(text));
		
		input.close();

	}

	private static String replaceIs(String text) {
		// method to replace is with is not
		
		return text.replace("is", "is not");
	}

}
