package com.nissan.oops;

public class BankC extends Bank{
	
	private double interestRate;

	//default constructor
	public BankC() {
		super();
		this.interestRate =0.07;
		
	}
	
	//parameterized constructor
	public BankC(double interestRate) {
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
		return "BankC [interestRate=" + interestRate + "]";
	}
	

}
