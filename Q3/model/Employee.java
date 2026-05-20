package com.Q3.model;

public class Employee {

	private static int counter = 1;

	protected int id;
	protected String name, mobile, email, department, designation, doj;

	public Employee(String name, String mobile, String email, String department, String designation, String doj) {
		this.id = counter++;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.department = department;
		this.designation = designation;
		this.doj = doj;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public String getDesignation() {
		return designation;
	}

	public void display() {
		System.out.println(id + " " + name + " " + department + " " + designation);
	}
	

	public double calculateSalary() {
		// TODO Auto-generated method stub
		return 0;
	}
}
