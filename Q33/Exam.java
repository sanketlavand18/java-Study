package com.Q3_5.All;

import java.util.Scanner;

public class Exam {

	int examid;
	String name, topic, date;
	Question[] questions;

	Exam(int examid, String name, String topic, String date, Question[] questions) {
		this.examid = examid;
		this.name = name;
		this.topic = topic;
		this.date = date;
		this.questions = questions;
	}

	public int conductExam() {
		Scanner sc = new Scanner(System.in);
		int score = 0;

		for (Question q : questions) {
			System.out.println("Q" + q.qno + ": " + q.question);
			System.out.println("1. " + q.opt1);
			System.out.println("2. " + q.opt2);
			System.out.println("3. " + q.opt3);
			System.out.println("4. " + q.opt4);

			System.out.print("Enter answer: ");
			int userAns = sc.nextInt();

			if (userAns == q.ans) {
				score += q.marks;
			}
		}
		sc.close();
		return score;

	}

}
