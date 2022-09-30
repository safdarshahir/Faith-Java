package com.nissan.app;
import java.util.Scanner;

import com.nissan.oops.Figure;
import com.nissan.oops.FigureRectangle;
import com.nissan.oops.FigureTriangle;

/*
 * Create a super class called Figure that stores the dimensions of various two dimensional
objects(declare two variables dim1 and dim2). It also defines a method called area() that
computes the area of an object. The program derives two sub classes from Figure. The first is
Rectangle with an overridden version of area() which returns dim1*dim2. The second is
Triangle with an overridden version of area() which returns dim1*dim2/2.
 * */

public class DemoFigure {

	public static void main(String[] args) {
		
		//declaring required variables
		double dim1,dim2;
		Figure figure;
		int figureType;
		char choice;
		
		Scanner input = new Scanner(System.in);

		do {		
			//reading input from user 
			System.out.print("\n Enter dimension 1:");
			dim1 = input.nextDouble();
			
			System.out.print(" Enter dimension 2:");
			dim2 = input.nextDouble();

			System.out.print(" Calculate Area..."
					+ "\n \t 1. Triangle"
					+ "\n \t 2. Rectangle"
					+ "\n \t 3. Exit"
					+ "\n Select an Option:");

			figureType = input.nextInt();

			//checking figure type
			switch (figureType) {
			case 1:
				figure = new FigureTriangle(dim1,dim2);
				System.out.println("Area of Triangle:"+figure.area());
				break;
			case 2:
				figure = new FigureRectangle(dim1,dim2);
				System.out.println("Area of Rectangle:"+figure.area());
				break;
			case 3:
				System.out.println("Exiting...");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Entry...");
				break;
			}
			System.out.print("Continue(y/n):");
			choice = input.next().charAt(0);

		} while (choice == 'y' || choice == 'Y');
		input.close();		
		
	}
}
