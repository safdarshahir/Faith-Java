package com.nissan.oops;

public class Account {
	
	private int accountNo;
	private String accountType;
	private double principal;
	private double rate;
	private int timeInYears;
	
	//default constructor
	public Account() {
		System.out.println("Account create successfully");
	}
	
	//parameterized constructor
	public Account(int accountNo, String accountType, double principal,int timeInYears) {
		super();
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.principal = principal;
		this.timeInYears = timeInYears;
		
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountType=" + accountType + ", principal=" + principal
				+ ", rate=" + rate + ", time=" + timeInYears + "]";
	}
	
	//Method to return acquired amount
	public double getAcquiredAmount() {
		
		//yearly compounding
		return this.principal * Math.pow((1+(this.rate)),(this.timeInYears));
		
		
	}
	
	//Method to return the interest amount
	public double getInterestAmount() {
		
		double totalAcquiredAmount = getAcquiredAmount();
		return totalAcquiredAmount - this.principal;
		
	}

	//getters and setters

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) throws InvalidEntryException {

		//checking if the account is saving or fixed
		if(accountType.equals("savings")) {
			this.rate = 0.04;
		}else if(accountType.equals("fixed")) {
			this.rate = 0.11;
		}else {
			//for any invalid entries
			throw new InvalidEntryException();
		}
	
	}

	public int getTimeInYears() {
		return timeInYears;
	}

	public void setTimeInYears(int timeInYears) {
		this.timeInYears = timeInYears;
	}
	
	
	
	
	
	
	

}
