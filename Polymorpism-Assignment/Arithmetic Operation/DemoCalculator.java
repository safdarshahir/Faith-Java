package com.nissan.app;
import com.nissan.oops.Calculator;

/*
 * Write a java program to perform the arithmetic operations using the concept of method
overloading.
*/
public class DemoCalculator {

	public static void main(String[] args) {

		Calculator calc = new Calculator();
		
		try {
			//addition two integers
			System.out.println("Adding two integer(1+2) ="+calc.add(1, 2));
			
			//addition two floats
			System.out.println("Adding two floats(20.5 + 30.56) ="+calc.add(20.5f, 30.56f));
			
			
		} catch (ArithmeticException e) {
			System.out.println("Sorry Cant divide by 0");
		}
		

	}

}
