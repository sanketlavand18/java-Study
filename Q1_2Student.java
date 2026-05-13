package com.Demo.Assignment1;

import java.util.Scanner;

public class Q1_2Student {

	int stuid;
	String name;
	int m1;
	int m2;
	int m3;

	public void set() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id:");
		stuid = sc.nextInt();
		System.out.println("enter name:");
		name = sc.next();
		System.out.println("enter m1:");
		m1 = sc.nextInt();
		System.out.println("enter m2:");
		m2 = sc.nextInt();
		System.out.println("enter m3:");
		m3 = sc.nextInt();
		System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
	}

	public void display() {
		System.out.println("id is : " + stuid);
		System.out.println("name is : " + name);
		System.out.println("m1 is : " + m1);
		System.out.println("m2 is : " + m2);
		System.out.println("m3 is : " + m3);
		System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");

	}

}
