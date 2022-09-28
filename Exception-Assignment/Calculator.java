package com.nissan.app;
import java.util.Scanner;

/*d. You are working as a software developer in XYZ Company. You are assigned a project to create a calculator. 
 * While working on this project, you must have to take care of a crucial point that 
 * a user may try to divide any number with zero, which is illegal and will lead to program interruption. 
 * By keeping this situation in mind, you created a method zeromap() inside the Calculator class to overcome 
 * the program interruption when a user will divide a number by zero.
In this task, you will create the Calculator class in which a method named zeromap() is created. 
In this method zeromap, two variables of type integer are declared.
 After that the code to divide two numbers is written in the zeromap() method along with the implementation of appropriate exception handling techniques.
  Inside main() method, an object c of Calculator class is created and used to invoke the zeromap() method.*/

public class Calculator {

	public static void main(String[] args) {
			zeroMap();
	}

	// Method to divide 2 number in calculator class
	private static void zeroMap(){
		try{
			
		int firstNumber, secondNumber;
		Scanner input  = new Scanner(System.in);
		
		System.out.print("Enter First Number:");
		firstNumber = input.nextInt();
		
		System.out.print("Enter Second Number:");
		secondNumber = input.nextInt();
	
		double divisionResult = firstNumber / secondNumber;
		
		System.out.println("Result after division: "+divisionResult);
		input.close();
	}
		catch (ArithmeticException em) {
			
			System.out.println("Sorry!! Invalid entry.");
		}
		
	}

}
