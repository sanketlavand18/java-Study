package com.Q3_4.model;

public abstract class Customer {

	protected int id;
	protected String name, email, creditClass, plan;
	protected double discount;

	public Customer(int id, String name, String email, String creditClass, double discount, String plan) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.creditClass = creditClass;
		this.discount = discount;
		this.plan = plan;
	}

	public abstract void display();
}