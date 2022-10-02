package com.nissan.oops;
import java.util.Scanner;

public class Person {
	
	private String name;
	private int age;

	
	public Person() {
		System.out.println("Person Created Succesfully.");
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	
	}
	
	
	public void displayPerson() {
		System.out.printf("\n %-20s %-20d",this.name,this.age);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	//custom method
	
	public void readData() throws InvalidEntryException{
		
		Scanner input = new Scanner(System.in);
		this.name = input.next();
		this.age = input.nextInt();
		input.close();
	}
}
