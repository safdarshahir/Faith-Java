package com.nissan.app;

import java.util.Scanner;

import com.nissan.lib.IShape;
import com.nissan.oops.Interface.Rectangle;
import com.nissan.oops.Interface.Square;


/*
 * Create a Shape interface with area() method. Create two implemented classes Rectangle and
Square, override the area method. Create another class with main() method and a
calculateArea() method. calculateArea() method accept Shape object as parameter. Create
Rectangle object array and Square object array and pass it into calculateArea() method one
object at a time and execute the corresponding area() method. 

 * */

public class DemoIShapeApp {

	public static void main(String[] args) {
		
		//Declaring variables
		IShape shape;
		int figureType;
		char choice;
		
		// shape variables
		double sideLength,breadth;
		
		//input object
		Scanner input = new Scanner(System.in);

		do {		
		
		    //Printing menu
			System.out.print(" Calculate Area..."
					+ "\n \t 1. Square"
					+ "\n \t 2. Rectangle"
					+ "\n \t 3. Exit"
					+ "\n Select an Option:");

			figureType = input.nextInt();

			//checking figure type
			switch (figureType) {
			
			//case for square
			case 1:

				//reading input from user 
				System.out.print("\n Enter side length:");
				sideLength = input.nextDouble();
				shape = new Square(sideLength);
				System.out.println("Area of Square:"+calculateArea(shape));
				break;
				
			//case for rectangle
			case 2:
				
				System.out.print("\n Enter side length:");
				sideLength = input.nextDouble();
				
				System.out.print("\n Enter breadth:");
				breadth = input.nextDouble();
				
				shape = new Rectangle(sideLength,breadth);
				System.out.println("Area of rectangle:"+calculateArea(shape));
				break;
				
			//case for exiting
			case 3:
				
				System.out.println("Exiting...");
				System.exit(0);
				break;
				
			default:
				
				System.out.println("Invalid Entry...");
				break;
				
			}
			
			//getting user choice to continue
			System.out.print("Continue(y/n):");
			choice = input.next().charAt(0);

		} while (choice == 'y' || choice == 'Y');
		input.close();		
	}

	//Method to calculate area of shape according to the shape
	private static double calculateArea(IShape shape) {
		return shape.area();
	}
	


}
