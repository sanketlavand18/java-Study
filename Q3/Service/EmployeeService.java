package com.Q3.Service;

import com.Q3.Dao.EmployeeDao;
import com.Q3.model.Employee;

public class EmployeeService {

	public void displayAll() {
		for (int i = 0; i < EmployeeDao.count; i++) {
			EmployeeDao.emp[i].display();
		}
	}

	public void searchById(int id) {
		for (int i = 0; i < EmployeeDao.count; i++) {
			if (EmployeeDao.emp[i].getId() == id) {
				EmployeeDao.emp[i].display();
			}
		}
	}

	public void searchByName(String name) {
		for (int i = 0; i < EmployeeDao.count; i++) {
			if (EmployeeDao.emp[i].getName().equalsIgnoreCase(name)) {
				EmployeeDao.emp[i].display();
			}
		}
	}

	// 🔥 FIXED METHOD
	public void calculateByDesignation(String desig) {
		for (int i = 0; i < EmployeeDao.count; i++) {
			Employee e = EmployeeDao.emp[i];

			if (e.getDesignation().equalsIgnoreCase(desig)) {
				System.out.println("Salary: " + e.calculateSalary());
			}
		}
	}

	// 🔥 NEW METHOD (Question requirement)
	public void displayByType(int type) {
		for (int i = 0; i < EmployeeDao.count; i++) {

			if (type == 1 && EmployeeDao.emp[i] instanceof com.Q3.model.SalariedEmployee) {
				EmployeeDao.emp[i].display();
			} else if (type == 2 && EmployeeDao.emp[i] instanceof com.Q3.model.ContractEmployee) {
				EmployeeDao.emp[i].display();
			} else if (type == 3 && EmployeeDao.emp[i] instanceof com.Q3.model.Vendor) {
				EmployeeDao.emp[i].display();
			}
		}
	}

	// 🔥 NEW METHOD (Department filter)
	public void displayByDepartment(String dept) {
		int count = 0;

		for (int i = 0; i < EmployeeDao.count && count < 5; i++) {
			if (EmployeeDao.emp[i].getDepartment().equalsIgnoreCase(dept)) {
				EmployeeDao.emp[i].display();
				count++;
			}
		}
	}
}