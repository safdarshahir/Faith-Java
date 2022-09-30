package com.nissan.oops;

public class Calculator {
	
	public Calculator() {
		super();
	}
	
	
	//addition
	public float add(int operandOne, int operandTwo){
		return (float)(operandOne + operandTwo);
	}
	
	public int add(float operandOne, float operandTwo){
		return (int)(operandOne + operandTwo);
	}
	
	//subtraction
	public float subtract(int operandOne, int operandTwo){
		return (float)(operandOne - operandTwo);
	}
	
	public int subtract(float operandOne, float operandTwo){
		return (int)(operandOne - operandTwo);
	}
	
	//division
	public float divide (int operandOne, int operandTwo) throws ArithmeticException{
		return (float)(operandOne / operandTwo);
	}
	
	public int divide(float operandOne, float operandTwo) throws ArithmeticException{
		return (int)(operandOne / operandTwo);
	}
	
	// multiplication
	public float multiply(int operandOne, int operandTwo){
		return (float)(operandOne * operandTwo);
	}
	
	public int multiply(float operandOne, float operandTwo){
		return (int)(operandOne * operandTwo);
	}

}
