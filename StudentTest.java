package com.Q4_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// key = Student, value = list of skills
		HashMap<Student, ArrayList<String>> map = new HashMap<>();

		while (true) {
			System.out.println("\n1.Add Student\n2.Add Skill\n3.Delete Student");
			System.out.println("4.Delete Skill\n5.Display by Skill");
			System.out.println("6.Display by Degree\n7.Exit");

			int ch = sc.nextInt();

			switch (ch) {

			// add student
			case 1:
				System.out.print("Enter id name bdate degree marks: ");
				int id = sc.nextInt();
				String name = sc.next();
				String bd = sc.next();
				String deg = sc.next();
				double m = sc.nextDouble();

				Student s = new Student(id, name, bd, deg, m);
				map.put(s, new ArrayList<>());
				break;

			// add skill
			case 2:
				System.out.print("Enter student id: ");
				int sid = sc.nextInt();

				for (Student st : map.keySet()) {
					if (st.sid == sid) {
						System.out.print("Enter skill: ");
						String skill = sc.next();
						map.get(st).add(skill);
					}
				}
				break;

			// delete student
			case 3:
				System.out.print("Enter student id: ");
				int did = sc.nextInt();

				map.keySet().removeIf(st -> st.sid == did);
				break;

			// delete skill
			case 4:
				System.out.print("Enter student id: ");
				int sid2 = sc.nextInt();

				for (Student st : map.keySet()) {
					if (st.sid == sid2) {
						System.out.print("Enter skill to remove: ");
						String sk = sc.next();
						map.get(st).remove(sk);
					}
				}
				break;

			// display by skill
			case 5:
				System.out.print("Enter skill: ");
				String searchSkill = sc.next();

				for (Student st : map.keySet()) {
					if (map.get(st).contains(searchSkill)) {
						System.out.println(st);
					}
				}
				break;

			// display by degree
			case 6:
				System.out.print("Enter degree: ");
				String d = sc.next();

				for (Student st : map.keySet()) {
					if (st.degree.equalsIgnoreCase(d)) {
						System.out.println(st);
					}
				}
				break;

			case 7:
				System.out.println("Exit...");
				sc.close();
			}
		}
	}

}
