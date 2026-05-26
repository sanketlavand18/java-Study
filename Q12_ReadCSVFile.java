package com.Demo.Assignment1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Q12_ReadCSVFile {

	public static void main(String[] args) {

		ArrayList<Q11_CSVFIle> list = new ArrayList<>();

		try {
			BufferedReader br = new BufferedReader(new FileReader("students.csv"));

			String line;

			while ((line = br.readLine()) != null) {

				// Split CSV line
				String[] data = line.split(",");

				int id = Integer.parseInt(data[0]);
				String name = data[1];
				String degree = data[2];
				String email = data[3];

				// Create object and add to list
				list.add(new Q11_CSVFIle(id, name, degree, email));
			}

			br.close();

		} catch (IOException e) {
			System.out.println("Error reading file");
		}

		// Display all students
		System.out.println("\nStudent List:");
		for (Q11_CSVFIle s : list) {
			s.display();
		}
	}
}
