package com.Q3.model;

public class SalariedEmployee extends Employee {

	double basic;

	public SalariedEmployee(String name, String mobile, String email, String dept, String desig, String doj,
			double basic) {
		super(name, mobile, email, dept, desig, doj);
		this.basic = basic;
	}
	@Override
	public double calculateSalary() {
		double da = 0.10 * basic;
		double hra = 0.15 * basic;
		double pf = 0.12 * basic;

		return basic + da + hra - pf;
	}
	

}
