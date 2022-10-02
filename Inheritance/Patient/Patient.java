package com.nissan.oops;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Patient extends Person{
	
	//data members
	private int patientNo;
	private String hospital;
	private Date joiningDate;
	private String patientAddress;
	private double medicalFees;
	
	// constructors
	public Patient(int patientNo) {
		this.patientNo = patientNo;
	}
	
	public Patient(int patientNo, String hospital, Date joiningDate, String patientAddress, double medicalFees) {
		super();
		this.patientNo = patientNo;
		this.hospital = hospital;
		this.joiningDate = joiningDate;
		this.patientAddress = patientAddress;
		this.medicalFees = medicalFees;
	}
	
	//getter and setters

	public int getPatientNo() {
		return patientNo;
	}

	public void setPatientNo(int patientNo) {
		this.patientNo = patientNo;
	}

	public String getHospital() {
		return hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getPatientAddress() {
		return patientAddress;
	}

	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}

	public double getMedicalFees() {
		return medicalFees;
	}

	public void setMedicalFees(double medicalFees) {
		this.medicalFees = medicalFees;
	}
	
	//overriding toString

	@Override
	public String toString() {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		
		return "Patient [patientNo=" + patientNo + ", hospital=" + hospital + ", joiningDate=" + formatter.format(joiningDate)
				+ ", patientAddress=" + patientAddress + ", medicalFees=" + medicalFees + "]" + super.toString();
	}
	
	//custom method to calculate the medical fee
	public void calculateMedicalFee(Money money) {
		
		this.medicalFees  = money.getBasicFee() + money.getTax();
	}

	

}
