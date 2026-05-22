package com.Q4_1;

public class NonPerishable extends Product {
	String category;

	NonPerishable(int id, String name,String type, String mfgDate, String category, double price) {
		super(id, name, type, mfgDate, price);
		this.category = category;
	}

	double calculateTax() {
		return price * 0.15 + 100;
	}

	public String toString() {
		return id + " " + name + " Tax=" + calculateTax();
	}
}
