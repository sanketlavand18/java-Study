package com.Q3_4.model;

import java.util.List;

public class CompanyCustomer extends Customer {

	String manager;
	double creditLine;
	int extensions;
	List<String> numbers;

	public CompanyCustomer(int id, String name, String email, String creditClass, double discount, String plan,
			String manager, double creditLine, int extensions, List<String> numbers) {

		super(id, name, email, creditClass, discount, plan);
		this.manager = manager;
		this.creditLine = creditLine;
		this.extensions = extensions;
		this.numbers = numbers;
	}

	public void display() {
		System.out.println(id + " " + name + " Manager:" + manager);
	}
}
