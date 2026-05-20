package com.Q3_4.dao;

import com.Q3_4.model.Customer;

public class CustomerDao {

	public static Customer[] cust = new Customer[50];
	public static int count = 0;

	public static void add(Customer c) {
		cust[count++] = c;
	}
}
