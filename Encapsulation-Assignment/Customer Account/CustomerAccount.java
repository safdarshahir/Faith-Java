package com.nissan.bean;
/*
 * Create an array of objects of the Customer account (Acc no, Name, Age,Place,Acc Type) and
add the detail of 5 accounts. Display the details (all or according to Account number).Able to
add 5 Customer details at a time and search the Details by Acc no.*/
public class CustomerAccount {
	
	//declaring customer data members
	private int accountNo;
	private String customerName;
	private int age;
	private String customerPlace;
	private String accountType;
	
	//default customer 
	public CustomerAccount() {
		super();
	}

	//parameterized customer
	public CustomerAccount(int accountNo, String customerName, int age, String customerPlace, String accountType) {
		super();
		this.accountNo = accountNo;
		this.customerName = customerName;
		this.age = age;
		this.customerPlace = customerPlace;
		this.accountType = accountType;
	}

	//getters and setters
	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCustomerPlace() {
		return customerPlace;
	}

	public void setCustomerPlace(String customerPlace) {
		this.customerPlace = customerPlace;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "CustomerAccount [accountNo=" + accountNo + ", customerName=" + customerName + ", age=" + age
				+ ", customerPlace=" + customerPlace + ", accountType=" + accountType + "]";
	}
	
	
	
	
	

	
}
