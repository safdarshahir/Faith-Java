package com.nissan.oops;

public class BankB extends Bank{

	private double interestRate;

	//default constructor
	public BankB() {
		super();
		this.interestRate =0.09;
		
	}
	
	//parameterized constructor
	public BankB(double interestRate) {
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
		return "BankB [interestRate=" + interestRate + "]";
	}
	
	
	
}
