package com.Q3.UI;

import java.util.Scanner;

import com.Q3.Dao.EmployeeDao;
import com.Q3.Service.EmployeeService;
import com.Q3.model.ContractEmployee;
import com.Q3.model.SalariedEmployee;
import com.Q3.model.Vendor;

public class EmployeeTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		EmployeeService service = new EmployeeService();

		int choice;

		do {
			System.out.println("\n1 Add Employee");
			System.out.println("2 Display Employee by Type");
			System.out.println("3 Search by ID");
			System.out.println("4 Search by Name");
			System.out.println("5 Salary by Designation");
			System.out.println("6 Display Employees by Department");
			System.out.println("7 Exit");

			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("1.Salaried 2.Contract 3.Vendor");
				int type = sc.nextInt();

				System.out.println("Enter Name:");
				String name = sc.next();
				System.out.println("Enter Mob.No: ");
				String mob = sc.next();
				System.out.println("Enter Email: ");
				String email = sc.next();
				System.out.println("Enter Dept: ");
				String dept = sc.next();
				System.out.println("Enter Designation: ");
				String desig = sc.next();
				System.out.println("Enter Date of joining: ");
				String doj = sc.next();

				if (type == 1) {
					System.out.println("Basic salary:");
					double basicsal = sc.nextDouble();
					EmployeeDao.add(new SalariedEmployee(name, mob, email, dept, desig, doj, basicsal));
				} else if (type == 2) {
					System.out.println("Enter hour:");
					int h = sc.nextInt();
					System.out.println("Enter rate:");
					double r = sc.nextDouble();
					EmployeeDao.add(new ContractEmployee(name, mob, email, dept, desig, doj, h, r));
				} else {
					System.out.println("enter No.of employee:");
					int no = sc.nextInt();
					System.out.println("enter amount:");
					double amt = sc.nextDouble();
					EmployeeDao.add(new Vendor(name, mob, email, dept, desig, doj, no, amt));
				}
				break;

			case 2:
				System.out.println("1.Salaried 2.Contract 3.Vendor");
				int t = sc.nextInt();
				service.displayByType(t);
				break;

			case 3:
				System.out.println("Enter ID:");
				service.searchById(sc.nextInt());
				break;

			case 4:
				System.out.println("Enter Name:");
				service.searchByName(sc.next());
				break;

			case 5:
				System.out.println("Enter Designation:");
				service.calculateByDesignation(sc.next());
				break;
			case 6:
				System.out.println("Enter Department:");
				String d = sc.next();
				service.displayByDepartment(d);
				break;

			}

		} while (choice != 7);
		System.out.println("Thank you for visiting....");

		sc.close();
	}

}
