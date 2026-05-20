package com.Q3_4.model;

public class IndividualCustomer extends Customer {

	String phone;

	public IndividualCustomer(int id, String name, String email, String creditClass, double discount, String plan,
			String phone) {

		super(id, name, email, creditClass, discount, plan);
		this.phone = phone;
	}

	public void display() {
		System.out.println(id + " " + name + " " + phone);
	}
}
