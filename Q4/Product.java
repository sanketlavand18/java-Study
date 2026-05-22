package com.Q4_1;

public abstract class Product {

	int id;
	String name;
	String type;
	double price;
	String mfgDate;

	Product(int id, String name, String type, String mfgDate, double price) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.mfgDate = mfgDate;
		this.price = price;
	}

	abstract double calculateTax();
}
