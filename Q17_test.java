package com.Q17;

import java.util.Scanner;

public class Q17_test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Grade (DISTINCTION, FIRST, SECOND, PASS, FAIL): ");
		String input = sc.next().toUpperCase();

		try {
			Grade g = Grade.valueOf(input);

			System.out.println("Minimum Marks: " + g.getMin());
			System.out.println("Maximum Marks: " + g.getMax());

		} catch (IllegalArgumentException e) {
			System.out.println("Invalid Grade Entered!");
		}

		sc.close();
	}
}
