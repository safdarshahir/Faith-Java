package com.nissan.oops.Interface;

import com.nissan.lib.IShape;

public class Square implements IShape {

	private double sideLength;
	
	//default constructor
	public Square() {
		super();
	}

	//parameterized constructors-
	public Square(double sideLength) {
		super();
		this.sideLength = sideLength;
	}

	//Method to calculate area of triangle
	@Override
	public double area() {
		return 0.5 * this.sideLength * this.sideLength;
	}

}
