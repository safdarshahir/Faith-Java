package com.nissan.oops;

public class Rectangle {
	
	private double length, breadth;
	
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
	
	//method for calculating area
	public double area() {
		return this.length * this.breadth;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + ", area()=" + area() + "]";
	}
	
	
	
}
