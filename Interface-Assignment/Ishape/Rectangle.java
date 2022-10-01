package com.nissan.oops.Interface;

import com.nissan.lib.IShape;

public class Rectangle implements IShape {

	private double length;
	private double breadth;
	
	//default constructor
	public Rectangle() {
		super();
	}

	//parameterized constructor
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	//Method to calculate area of rectangle
	@Override
	public double area() {
		return this.length * this.breadth ;
	}

}
