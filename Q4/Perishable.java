package com.Q4_1;

public class Perishable extends Product {
	String expDate;

	Perishable(int id, String name,String type, String mfgDate, String expDate, double price) {
		super(id, name, type, mfgDate, price);
		this.expDate = expDate;
	}

	double calculateTax() {
		return price * 0.05;
	}

	public String toString() {
		return id + " " + name + " Tax=" + calculateTax();
	}
}
