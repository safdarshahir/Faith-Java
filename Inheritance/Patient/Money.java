package com.nissan.oops;

public class Money {
	
	private double basicFee;
	private double tax;
	
	public Money() {
		super();
	}
	
	public Money( double basicFee,double tax) {
		
		this.basicFee = basicFee;
		this.tax = tax;
	}
	
	//getter and setter 

	public double getBasicFee() {
		return basicFee;
	}

	public void setBasicFee(double basicFee) {
		this.basicFee = basicFee;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
}
