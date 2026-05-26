package com.Demo.Assignment1;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Q14_OStram {

	public static void main(String[] args) {

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.dat"))) {

			// Read object (ArrayList)
			ArrayList<Q11_CSVFIle> list = (ArrayList<Q11_CSVFIle>) ois.readObject();

			// Display data
			System.out.println("Student List:");
			for (Q11_CSVFIle s : list) {
				s.display();
			}

		} catch (Exception e) {
			System.out.println("Error reading object file");
		}
	}
}
