package com.Q16;

import java.util.concurrent.Callable;

public class Task implements Callable<Integer> {

	int a, b, c;

	Task(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Integer call() {
		int sum = a + b + c;
		System.out.println("Adding: " + a + " + " + b + " + " + c + " = " + sum);
		return sum;
	}
}
