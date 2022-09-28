package com.nissan.app;

/*c. Create a Customer class with name, account number and balance variables and withdraw() and getBalance() methods. 
 * Create a Client class. While withdrawing, if balance goes below R.s 500, throw an exception. 
 * Use user defined exception class for implementing this program.*/

public class Customer {

	String customerName;
	int accountNumber;
	double accountBalance;

	public Customer(String customerName, int accountNumber, double accountBalance) {

		this.customerName = customerName;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}

	void withdraw(double amount) throws MinimumBalanceException{
		
			if(this.accountBalance - amount > 500) {
				this.accountBalance -= amount;
			}else {
				
				throw new MinimumBalanceException();
				}
			
	}

}
