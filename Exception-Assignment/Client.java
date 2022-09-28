package com.nissan.app;

public class Client {

	public static void main(String[] args) {
		
		Customer customer = new Customer("Safdar",1148,2000);
		
		try {

			customer.withdraw(1600);
		}catch(MinimumBalanceException e) {
			
			System.out.println("Invalid Entry.");
			
		}catch(Exception e) {
			
			System.out.println("Message"+e);
		}

	}

}
