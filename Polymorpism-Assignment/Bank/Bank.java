package com.nissan.oops;

public class Bank {
	
	private double interestRate;

	//default constructor
	public Bank() {
		super();
		this.interestRate =0.03;
		
	}
	
	//parameterized constructor
	public Bank(double interestRate) {
		super();
		this.interestRate = interestRate;
	}

	//Method for calculating Interest
	public double Interest(double principal, int timeInYear) {
		
		double acquiredAmount = principal * (1+ this.interestRate * timeInYear);
		double interestAmount = acquiredAmount - principal;
		return interestAmount;
	}
	
	@Override
	public String toString() {
		return "Bank []";
	}
	
	
	
	
}
