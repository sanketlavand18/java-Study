package com.Q16;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Q16Test {
	public static void main(String[] args) throws Exception {

		List<Integer> numbers = new ArrayList<>();
		for (int i = 1; i <= 51; i++) {
			numbers.add(i);
		}

		ExecutorService service = Executors.newFixedThreadPool(5);

		List<Future<Integer>> futures = new ArrayList<>();

		for (int i = 0; i < numbers.size(); i += 3) {
			int a = numbers.get(i);
			int b = numbers.get(i + 1);
			int c = numbers.get(i + 2);

			Task task = new Task(a, b, c);
			Future<Integer> future = service.submit(task);
			futures.add(future);
		}

		int finalSum = 0;
		for (Future<Integer> f : futures) {
			finalSum += f.get(); 
		}

		service.shutdown();

		System.out.println("\nFinal Addition of 51 numbers = " + finalSum);
	}
}
