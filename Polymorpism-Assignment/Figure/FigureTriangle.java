package com.nissan.oops;

public class FigureTriangle extends Figure{
	
	//dimensions
	private double dim1;
	private double dim2;

	//constructor
	public FigureTriangle() {
		super();
	}
	
	
	public FigureTriangle(double dim1, double dim2) {
		super();
		this.dim1 = dim1;
		this.dim2 = dim2;
	}


	//Method to calculate area of triangle
	public double area(){
		return this.dim1 * this.dim2 / 2;
		
	}
	
	

}
