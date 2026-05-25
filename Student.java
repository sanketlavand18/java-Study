package com.Q4_4;

public class Student {

	int sid;
	String name;
	String bdate;
	String degree;
	double marks;

	Student(int sid, String name, String bdate, String degree, double marks) {
		this.sid = sid;
		this.name = name;
		this.bdate = bdate;
		this.degree = degree;
		this.marks = marks;
	}

	public boolean equals(Object o) {
		Student s = (Student) o;
		return this.sid == s.sid;
	}

	public int hashCode() {
		return sid;
	}

	public String toString() {
		return sid + " " + name + " " + degree + " " + marks;
	}
}
