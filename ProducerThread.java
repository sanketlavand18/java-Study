package com.Q15;

import java.io.BufferedReader;
import java.io.FileReader;

public class ProducerThread extends Thread {

	Product p;

	ProducerThread(Product p) {
		this.p = p;
	}

	public void run() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("productdata.dat"));
			String line;

			while ((line = br.readLine()) != null) {
				p.put(line);
			}

			p.put("END");
			br.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
