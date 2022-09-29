package com.nissan.bean;

public class Person {
	
	private String name;
	private int age;
	private float salary;
	
	public Person() {
		System.out.println("Person Created Succesfully.");
	}

	public Person(String name, int age, float salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public void displayPerson() {
		System.out.printf("\n %-20s %-20d %-20.2f",this.name,this.age,this.salary);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	

}
