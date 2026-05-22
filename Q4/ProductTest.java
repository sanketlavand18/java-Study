package com.Q4_1;

public class ProductTest {
	public static void main(String[] args) {

		Product p1 = new Perishable(1, "Milk","Perishable", "20-04-2026", "25-04-2026", 50);
		Product p2 = new NonPerishable(2, "Chair","NonPerishable", "10-04-2026", "Furniture", 1000);

		System.out.println(p1);
		System.out.println(p2);
	}

}
