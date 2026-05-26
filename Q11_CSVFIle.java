package com.Demo.Assignment1;

public class Q11_CSVFIle {

	int id;
	String name;
	String degree;
	String email;

	public Q11_CSVFIle(int id, String name, String degree, String email) {
		this.id = id;
		this.name = name;
		this.degree = degree;
		this.email = email;
	}

	// Convert to CSV format
	public String toCSV() {
		return id + "," + name + "," + degree + "," + email;
	}

	public void display() {
		System.out.println(id + " " + name + " " + degree + " " + email);
	}

}
