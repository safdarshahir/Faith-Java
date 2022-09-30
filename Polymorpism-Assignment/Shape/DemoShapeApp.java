package com.nissan.app;

import com.nissan.oops.Rectangle;
import com.nissan.oops.Shape;
import com.nissan.oops.Square;
/*
 * Create a Shape class with area() method. Create two sub classes Rectangle and Square,
override the area method. Create another class with main() method and a calculateArea()
method. calculateArea() method accept Shape object as parameter. Create Rectangle object
and Square object and pass it into calculateArea() method one object at a time and execute
the corresponding area() method.
 * */

// Shape app : demonstration of overriding and overloading 
public class DemoShapeApp {

	public static void main(String[] args) {

		Shape newShape = new Shape();		
		Square newSquare  = new Square(10);
		Rectangle newRectangle = new Rectangle(10,20);
		System.out.println(newSquare);
		
		//calling overloaded methods
		newShape.calculateArea(newShape);
		newShape.calculateArea(newSquare);
		newShape.calculateArea(newRectangle);
	}

}
