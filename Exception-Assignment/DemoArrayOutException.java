package com.nissan.app;

/*
 * b. Create an array having 10 elements. Try to print the element in the 11th position. 
 * Catch the appropriate exception.
 * */

public class DemoArrayOutException {

	public static void main(String[] args){
		
		try {
			
			int marks[] = {10,20,30,40,50,60,70,80,90,100};
			int position = 11;
			System.out.println(marks[position-1]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Cant access the given position.");
		}
	}

}
