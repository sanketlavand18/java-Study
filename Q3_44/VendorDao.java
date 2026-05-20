package com.Q3_4.dao;

import com.Q3_4.model.Vendor;

public class VendorDao {

	public static Vendor[] ven = new Vendor[50];
	public static int count = 0;

	public static void add1(Vendor v) {
		ven[count++] = v;
	}
}
