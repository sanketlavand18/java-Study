package com.Q15;

public class Product {

	String data;
	boolean available = false;

	// Producer puts data
	synchronized void put(String d) {
		try {
			while (available)
				wait();

			data = d;
			available = true;
			notify();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	synchronized String get() {
		try {
			while (!available)
				wait();

			available = false;
			notify();
			return data;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
