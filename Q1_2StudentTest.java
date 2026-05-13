package com.Demo.Assignment1;

import java.util.Scanner;

public class Q1_2StudentTest {

	public static void main(String[] args) {

		int n;
		System.out.println("enter the student number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		Q1_2Student[] s = new Q1_2Student[n];
		for (int i = 0; i < n; i++) {
			s[i] = new Q1_2Student();
			s[i].set();
		}
		for (int i = 0; i < s.length; i++) {

			s[i].display();
		}

	}

}
