package com.nissan.oops;

/*
 * Create a super class called Figure that stores the dimensions of various two dimensional
objects(declare two variables dim1 and dim2). It also defines a method called area() that
computes the area of an object. The program derives two sub classes from Figure. The first is
Rectangle with an overridden version of area() which returns dim1*dim2. The second is
Triangle with an overridden version of area() which returns dim1*dim2/2.
 * */

public class Figure {
	
	//dimensions
	private double dim1;
	private double dim2;
	
	//default constructor
	public Figure() {
		super();
	}

	//parameterized constructor
	public Figure(double dim1, double dim2) {
		super();
		this.dim1 = dim1;
		this.dim2 = dim2;
	}

	//default figure area
	public double area() {
		return 0;
	}
	
	@Override
	public String toString() {
		return "Figure [dim1=" + dim1 + ", dim2=" + dim2 + "]";
	}
	
	
	
	
	

}
