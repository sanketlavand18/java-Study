package com.Q3_4.UI;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.Q3_4.dao.CustomerDao;
import com.Q3_4.dao.VendorDao;
import com.Q3_4.model.CompanyCustomer;
import com.Q3_4.model.IndividualCustomer;
import com.Q3_4.model.Vendor;
import com.Q3_4.service.CustomerService;
import com.Q3_4.service.vendorService;

public class TestTelecom {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		CustomerService cs = new CustomerService();
		vendorService vs = new vendorService();

		int choice;

		do {
			System.out.println("1 Add Customer");
			System.out.println("2 Add Vendor");
			System.out.println("3 Display Customers");
			System.out.println("4 Display Vendors");
			System.out.println("5 Exit");

			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("1 Individual 2 Company");
				int type = sc.nextInt();

				System.out.println("Enter id, name, email:");
				int id = sc.nextInt();
				String name = sc.next();
				String email = sc.next();

				System.out.println("Enter creditClass, discount, plan:");
				String cc = sc.next();
				double dis = sc.nextDouble();
				String plan = sc.next();

				if (type == 1) {
					System.out.println("Enter phone:");
					String ph = sc.next();

					CustomerDao.add(new IndividualCustomer(id, name, email, cc, dis, plan, ph));

				} else {
					System.out.println("Enter manager, creditLine, extensions:");
					String m = sc.next();
					double cl = sc.nextDouble();
					int ext = sc.nextInt();

					List<String> nums = Arrays.asList("1111", "2222");

					CustomerDao.add(new CompanyCustomer(id, name, email, cc, dis, plan, m, cl, ext, nums));
				}
				break;

			case 2:
				System.out.println("Enter id, name, email, phone:");
				int vid = sc.nextInt();
				String vname = sc.next();
				String vemail = sc.next();
				String phone = sc.next();

				List<String> products = Arrays.asList("SIM", "Router");

				VendorDao.add1(new Vendor(vid, vname, vemail, phone, products));
				break;

			case 3:
				cs.displayAllCustomers();
				break;

			case 4:
				vs.displayAllVendors();
				break;

			}

		} while (choice != 5);
		System.out.println("Thank you ......");

		sc.close();
	}
}
