package com.Q4_2;

import java.util.Objects;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private String dept;
	private String designation;

	public Employee(int id, String name, double salary, String dept, String designation) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
		this.designation = designation;
	}

	public int getId() {
		return id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Employee))
			return false;
		Employee emp = (Employee) o;
		return id == emp.id; // Only ID matters
	}

	@Override
	public int hashCode() {
		return Objects.hash(id); // Based on ID
	}

	@Override
	public String toString() {
		return id + " " + name + " " + salary + " " + dept + " " + designation;
	}
}
