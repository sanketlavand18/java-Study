package com.Q4_2;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<Employee> set = new HashSet<>();

		set.add(new Employee(1, "hitman", 50000, "cricketer", "leader"));
		set.add(new Employee(2, "Gabbar", 60000, "cricketer", "player"));
		set.add(new Employee(1, "hitman", 70000, "cricketer", "player")); 

		System.out.println("Employees in HashSet:");
		for (Employee e : set) {
			System.out.println(e);
		}
	}
}
