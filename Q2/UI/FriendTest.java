package com.Q2.UI;

import java.util.Scanner;

import com.Q2.Service.FriendService;
import com.Q2.model.Friend;

public class FriendTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of friends: ");
		int n = sc.nextInt();

		Friend[] arr = new Friend[n];
		FriendService service = new FriendService();

		// Input
		for (int i = 0; i < n; i++) {
			System.out.println("\nEnter details of Friend " + (i + 1));
			System.out.println("Enter ID: ");
			int id = sc.nextInt();
			System.out.println("Enter name: ");
			String name = sc.next();
			System.out.println("Enter lastname: ");
			String lastname = sc.next();

			System.out.print("Enter number of hobbies: ");
			int hcount = sc.nextInt();

			String[] hobbies = new String[hcount];
			System.out.println("Enter hobbies:");
			for (int j = 0; j < hcount; j++) {
				hobbies[j] = sc.next();
			}
			System.out.println("Enter mobile no: ");
			long mobno = sc.nextLong();
			System.out.println("Enter Email: ");
			String email = sc.next();
			System.out.println("Enter B-date (DD/MM/YYYY) : ");
			String bdate = sc.next();
			System.out.println("Enter Address: ");
			String address = sc.next();

			arr[i] = new Friend(id, name, lastname, hobbies, mobno, email, bdate, address);
		}

		int choice;

		do {
			System.out.println("\n1. Display All Friend");
			System.out.println("2. Search by ID");
			System.out.println("3. Search by Name");
			System.out.println("4. Search by Hobby");
			System.out.println("5. Exit");

			System.out.print("Enter choice: ");
			choice = sc.nextInt();

			switch (choice) {

			case 1 -> {
				service.displayAll(arr);
				break;
			}
			case 2 -> {
				System.out.print("Enter ID: ");
				int id = sc.nextInt();
				service.searchById(arr, id);
				break;
			}
			case 3 -> {
				System.out.print("Enter Name: ");
				String name = sc.next();
				service.searchByName(arr, name);
				break;
			}
			case 4 -> {
				System.out.print("Enter Hobby: ");
				String hobby = sc.next();
				service.searchByHobby(arr, hobby);
				break;
			}
			case 5 -> {
				System.out.println("Thank you...");
				break;
			}
			default -> {
				System.out.println("Invalid choice");
			}
			}

		} while (choice != 5);

		sc.close();
	}
}