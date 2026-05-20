package com.Q3.model;

public class ContractEmployee extends Employee {

	int hours;
	double rate;

	public ContractEmployee(String name, String mobile, String email, String dept, String desig, String doj, int hours,
			double rate) {
		super(name, mobile, email, dept, desig, doj);
		this.hours = hours;
		this.rate = rate;
	}
	@Override
	public double calculateSalary() {
		return hours * rate;
	}
}
