package com.Q3_4.service;

import com.Q3_4.dao.CustomerDao;

public class CustomerService {
	
		public void displayAllCustomers() {
			for (int i = 0; i < CustomerDao.count; i++) {
				CustomerDao.cust[i].display();
			}
		}
	}


