package com.nissan.app;

//Account Structure
public class Account {

	private final int ACCOUNT_PIN = 9898;
	final double MIN_BALANCE = 5000;
	double Amount;

	Account(double Amount) {

		// checking whether the amount entered is less than minimum balance
		if (checkMinBalance(Amount)) {
			this.Amount = Amount;
		} else {
			System.out.println("Amount less than minimum balance(5000).\n Exiting...");
			System.exit(0);
		}

	}

	// Method to check minimum balance
	boolean checkMinBalance(double Amount) {

		return (Amount >= MIN_BALANCE);

	}

	// Return the Ledger Balance
	double getLedgerBalance() {

		return this.Amount;
	}

	// Return the Available Balance
	double getAvailableBalance() {

		if (this.Amount < MIN_BALANCE) {
			return getLedgerBalance();
		} else {
			return this.Amount - MIN_BALANCE;
		}

	}

	// Method checking pin
	boolean checkPin(int pin) {

		return pin == ACCOUNT_PIN ? true : false;

	}
}
