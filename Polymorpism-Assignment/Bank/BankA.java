package com.nissan.oops;

public class BankA extends Bank{
	
	private double interestRate;

	//default constructor
	public BankA() {
		super();
		this.interestRate =0.1;
		
	}
	
	//parameterized constructor
	public BankA(double interestRate) {
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
		return "BankA [interestRate=" + interestRate + "]";
	}
	

}
