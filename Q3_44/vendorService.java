package com.Q3_4.service;

import com.Q3_4.dao.VendorDao;

public class vendorService {

	public void displayAllVendors() {
		for (int i = 0; i < VendorDao.count; i++) {
			VendorDao.ven[i].display();
		}
	}
}
