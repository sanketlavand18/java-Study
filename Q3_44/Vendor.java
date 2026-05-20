package com.Q3_4.model;

import java.util.List;

public class Vendor {

	int id;
	String name, email, phone;
	List<String> products;

	public Vendor(int id, String name, String email, String phone, List<String> products) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.products = products;
	}

	public void display() {
		System.out.println(id + " " + name + " " + products);
	}
}