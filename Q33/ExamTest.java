package com.Q3_5.All;

import java.util.Scanner;

public class ExamTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Java Questions
		Question[] javaQ = { new Question(1, "Java is?", "Language", "OS", "DB", "Browser", 1, 1),
				new Question(2, "JVM stands for?", "Java VM", "Virtual Machine", "Java Virtual Machine", "None", 3, 1),
				new Question(3, "Which is keyword?", "main", "class", "int", "All", 4, 1),
				new Question(4, "Extension of Java?", ".java", ".class", ".txt", ".js", 1, 1), 
				new Question(5,"OOP stands for?", "Object Oriented Programming", "Only Program", "None", "Other", 1, 1) };

		// HTML Questions
		Question[] htmlQ = {
				new Question(1, "HTML stands for?", "Hyper Text Markup Language", "High Text", "None", "Other", 1, 1),
				new Question(2, "Tag for link?", "<a>", "<p>", "<h1>", "<div>", 1, 1),
				new Question(3, "Tag for image?", "<img>", "<src>", "<image>", "<pic>", 1, 1),
				new Question(4, "Tag for paragraph?", "<p>", "<h1>", "<br>", "<div>", 1, 1),
				new Question(5, "HTML is?", "Language", "Programming Language", "Markup Language", "None", 3, 1) };

		// Create Exams
		Exam javaExam = new Exam(1, "Java Test", "Core Java", "22-04-2026", javaQ);
		Exam htmlExam = new Exam(2, "HTML Test", "Web", "22-04-2026", htmlQ);

		char choice = 0;

		do {
			System.out.println("Choose Exam:");
			System.out.println("1. Java");
			System.out.println("2. HTML");

			int opt = sc.nextInt();
			int marks = 0;

			if (opt == 1) {
				marks = javaExam.conductExam();
			} else if (opt == 2) {
				marks = htmlExam.conductExam();
			} else {
				System.out.println("Invalid choice!");
				continue;
			}

			System.out.println("\nTotal Marks: " + marks);

			if (marks >= 3) {
				System.out.println("Congratulations! You completed the test.");
			} else {
				System.out.println("Better luck next time.");
			}

			System.out.print("\nDo you want to continue? (y/n): ");
			choice = sc.next().charAt(0);

		} while (choice == 'y' || choice == 'Y');

		sc.close();
	}
}
