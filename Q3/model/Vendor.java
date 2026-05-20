package com.Q3.model;

public class Vendor extends Employee {

	int noOfEmp;
	double amount;

	public Vendor(String name, String mobile, String email, String dept, String desig, String doj, int noOfEmp,
			double amount) {
		super(name, mobile, email, dept, desig, doj);
		this.noOfEmp = noOfEmp;
		this.amount = amount;
	}
	@Override
	public double calculateSalary() {
		return amount + (amount * 0.18);
	}

}
