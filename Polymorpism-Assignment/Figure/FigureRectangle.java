package com.nissan.oops;

public class FigureRectangle extends Figure{

	//dimensions
	private double dim1;
	private double dim2;
	
	//default constructor
	public FigureRectangle() {
		super();
	}
	
	
	public FigureRectangle(double dim1, double dim2) {
		super();
		this.dim1 = dim1;
		this.dim2 = dim2;
	}


	//method to calculate area of rectangle
	public double area() {
		
		return this.dim1 * this.dim2;
	}
	
}
