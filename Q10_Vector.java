package com.Demo.Assignment1;

import java.util.Enumeration;
import java.util.Vector;

public class Q10_Vector {

	public static void main(String[] args) {

		Vector<String> v = new Vector<>();

		v.add("Hitman");
		v.add("Gabbar");
		v.add("King");
		v.add("Thalapathy");

		// Get Enumeration
		Enumeration<String> e = v.elements();

		// Traverse using Enumeration
		System.out.println("Vector Elements:");
		while (e.hasMoreElements()) {
			String item = e.nextElement();
			System.out.println(item);
		}
	}

}
