package com.Q3.Dao;

import com.Q3.model.Employee;

public class EmployeeDao {

	public static Employee[] emp = new Employee[50];
	public static int count = 0;

	public static void add(Employee e) {
		emp[count++] = e;
	}

	public static Employee[] getAll() {
		return emp;
	}
}
