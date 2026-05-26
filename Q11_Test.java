package com.Demo.Assignment1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Q11_Test {

	public static void main(String[] args) {

		ArrayList<Q11_CSVFIle> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		int choice;

		do {
			System.out.println("1 Add Student");
			System.out.println("2 Exit");

			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter ID:");
				int id = sc.nextInt();

				System.out.println("Enter Name:");
				String name = sc.next();

				System.out.println("Enter Degree:");
				String degree = sc.next();

				System.out.println("Enter Email:");
				String email = sc.next();

				list.add(new Q11_CSVFIle(id, name, degree, email));
				break;

			case 2:
				try (FileWriter fw = new FileWriter("students.csv", true)) { // append = true

					for (Q11_CSVFIle s : list) {
						fw.write(s.toCSV() + "\n");
					}

					System.out.println("Data saved to students.csv");

				} catch (IOException e) {
					System.out.println("Error writing file");
				}
			}

		} while (choice != 2);

		sc.close();
	}
}
