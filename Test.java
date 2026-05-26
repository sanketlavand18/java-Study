package com.Q15;

public class Test {

	public class ProducerConsumerTest {
		public static void main(String[] args) {
			Product p = new Product();

			ProducerThread prod = new ProducerThread(p);
			ConsumerThread cons = new ConsumerThread(p);

			prod.start();
			cons.start();
		}
	}
}
