package com.Q15;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class ConsumerThread extends Thread {

	Product p;

	ConsumerThread(Product p) {
		this.p = p;
	}

	public void run() {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("productamount.dat"));

			while (true) {
				String data = p.get();

				if (data.equals("END"))
					break;

				String[] arr = data.split(":");

				int id = Integer.parseInt(arr[0]);
				String pname = arr[1];
				int qty = Integer.parseInt(arr[2]);
				double price = Double.parseDouble(arr[3]);

				double amount = qty * price + (0.10 * price);

				String output = id + ":" + pname + ":" + qty + ":" + price + ":" + amount;

				bw.write(output);
				bw.newLine();
			}

			bw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
