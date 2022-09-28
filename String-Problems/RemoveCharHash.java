package com.nissan.bean;

import java.util.Scanner;

// TODO remove # and left and char of #
public class RemoveCharHash {

	public static void main(String[] args) {

		String inputText;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Text:");
		inputText = input.nextLine();

		System.out.print("Text after removing # and left and right of # chars:" + removeHash(inputText));

		input.close();

	}

	private static StringBuilder removeHash(String text) {

		// TODO removing # and left and right characters of #

		StringBuilder resultString = new StringBuilder();
		int lengthOftext = text.length();

		if (checkIfHash(text, lengthOftext)) {
			resultString.append("");
			return resultString;
		} else {

			for (int i = 0; i < text.length(); i++) {

				if (text.charAt(i) == '#') {
					continue;
				}
				if (text.charAt(i) != '#' && text.charAt(i - 1) == '#') {

					continue;
				}
				if (text.charAt(i) != '#' && text.charAt(i + 1) == '#') {

					continue;
				}

				resultString.append(text.charAt(i));

			}

		}

		return resultString;

	}

	private static boolean checkIfHash(String text, int lengthOftext) {
		// TODO Checking whether if the entire text is #

		for (int i = 0; i < lengthOftext; i++) {

			if (text.charAt(i) == '#') {
				continue;
			} else {
				return false;
			}

		}

		return true;

	}

}
