package com.nissan.app;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.nissan.oops.Money;
import com.nissan.oops.Patient;

public class DemoHospitalApp {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Patient patient = new Patient(101);
		
		System.out.println("Enter name");
		patient.setName("May");
		
		System.out.println("Enter Age:");
		patient.setAge(34);
		
		System.out.println("Enter hospital:");
		patient.setHospital("TSC");
		
		System.out.println("Enter date of Joining:");
		patient.setJoiningDate(formatter.parse("10/09/2000"));
		
		System.out.println("Enter address:");
		patient.setPatientAddress("Trivandrum");
		
		//Making money object to calculate fees
		
		Money money = new Money(1200,50);
		patient.calculateMedicalFee(money);
		
		System.out.println(patient.toString());
		
		
		
		
	}

}
