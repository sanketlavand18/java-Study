package com.Q9_test;

import java.util.Scanner;

import com.Q9_Service.service;

public class test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		service service = new service();

		while (true) {
			try {
				System.out.println("1. Buy Products");
				System.out.println("2. View Cart");
				System.out.println("3. Send Delivery");
				System.out.println("4. Exit");

				System.out.print("Enter choice: ");
				int choice = sc.nextInt();

				switch (choice) {

				case 1:
					System.out.print("Enter username: ");
					String user = sc.next();

					service.displayProducts();

					System.out.print("Enter Product ID: ");
					int pid = sc.nextInt();

					System.out.print("Enter Quantity: ");
					int qty = sc.nextInt();

					service.addToCart(user, pid, qty);
					break;

				case 2:
					System.out.print("Enter username: ");
					user = sc.next();

					service.viewCart(user);

					System.out.println("1.Remove 2.Update 3.Back");
					int opt = sc.nextInt();

					if (opt == 1) {
						System.out.print("Enter Product ID: ");
						pid = sc.nextInt();
						service.removeFromCart(user, pid);

					} else if (opt == 2) {
						System.out.print("Enter Product ID: ");
						pid = sc.nextInt();

						System.out.print("Enter New Quantity: ");
						qty = sc.nextInt();

						service.updateQuantity(user, pid, qty);
					}
					break;

				case 3:
					System.out.println("Users:");
					for (String u : service.getAllUsers()) {
						System.out.println(u);
					}

					System.out.print("Enter username: ");
					user = sc.next();

					service.deliverCart(user);
					break;

				case 4:
					System.out.println("Exiting...");
					System.exit(0);

				default:
					System.out.println("Invalid choice!");
				}

			} catch (Exception e) {
				System.out.println("Invalid input! Try again.");
				sc.nextLine(); // clear buffer
			}
		}
	}
}
