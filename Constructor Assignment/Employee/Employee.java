package com.nissan.bean;


/*
 * Write a program that creates two classes – one is Employee and another is main method class.
Employee class contain emp_code, name, designation and salary fields and three constructors
– default constructor, second constructor contains three fields emp_code, name and
designation and if the designation is clerk set salary of Rs.5000, Rs.2000 for peon , Rs.10000
for manager and Rs.1000 for others. Third constructor contains four fields emp_code, name,
salary and designation. Display information of employee using display method.
*/
public class Employee {
	
	private int empCode;
	private String empName;
	private String designation;
	private double salary;
	
	
	public Employee(){
		
		System.out.println("Employee Created.");	
	}
	
	public Employee(int empcode, String empName, String designation, double salary) {
		this.empCode = empcode;
		this.empName = empName;
		this.designation = designation;
		this.salary = salary;
	}



	public Employee(int empCode,String empName,String designation) {
		
		this.empCode = empCode;
		this.empName = empName;
		this.designation = designation;
		
		if(this.designation.equals("clerk")) {
			this.salary = 5000;
		}else if(this.designation.equals("peon")) {
			this.salary = 2000;
		}else if(this.designation.equals("manager")) {
			this.salary = 10000;
		}else {
			this.salary = 1000;
		}
	}
	
	public void displayEmployee() {
		
		System.out.printf("\n %-15d %-15s %-15s %-20.2f",this.empCode,this.empName,this.designation,this.salary);

	}

	@Override
	public String toString() {
		return "Employee [empCode=" + empCode + ", empName=" + empName + ", designation=" + designation + ", salary="
				+ salary + "]";
	}
	
	

}
