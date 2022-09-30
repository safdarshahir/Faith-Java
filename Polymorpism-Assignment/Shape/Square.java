package com.nissan.oops;

public class Square extends Shape{
	//value of squares side
	private double side;
	
	//default constructor
	public Square() {
		super();
	}
	
	//parameterized constructor
	public Square(double side) {
		super();
		this.side = side;
	}
	
	//method for calculating area of rectangle
	public double area() {
		return this.side * this.side ;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + " Area="+area()+" ]";
	}
	
	
}
