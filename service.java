package com.Q9_Service;

import java.util.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.Q9_model.Product1;

public class service {

	private static List<Product1> productList = new ArrayList<>();
	private HashMap<String, List<Product1>> cartMap = new HashMap<>();

	// Static block for products
	static {
		productList.add(new Product1(1, "Laptop", 50000, 10));
		productList.add(new Product1(2,"mobile",35000,25));
		productList.add(new Product1(3, "Headphones", 2000, 20));
		productList.add(new Product1(4, "Keyboard", 1500, 25));
		productList.add(new Product1(5, "Mouse", 800, 30));
		productList.add(new Product1(6, "Monitor", 12000, 10));
		productList.add(new Product1(7, "Printer", 7000, 8));
		productList.add(new Product1(8, "Tablet", 18000, 12));
		productList.add(new Product1(9, "Speaker", 3000, 18));
		productList.add(new Product1(10, "Charger", 500, 40));
	}

	// Display products
	public void displayProducts() {
		System.out.println("\nAvailable Products:");
		for (Product1 p : productList) {
			System.out.println(p);
		}
	}

	// Add to cart
	public void addToCart(String username, int productId, int qty) {

		Product1 selected = null;

		for (Product1 p : productList) {
			if (p.getId() == productId) {
				selected = p;
				break;
			}
		}

		if (selected == null) {
			System.out.println("Invalid Product ID!");
			return;
		}

		if (qty <= 0 || qty > selected.getQuantity()) {
			System.out.println("Invalid Quantity!");
			return;
		}

		List<Product1> userCart = cartMap.getOrDefault(username, new ArrayList<>());

		boolean found = false;

		for (Product1 p : userCart) {
			if (p.getId() == productId) {
				p.setQuantity(p.getQuantity() + qty);
				found = true;
				break;
			}
		}

		if (!found) {
			userCart.add(new Product1(productId, selected.getName(), selected.getPrice(), qty));
		}

		selected.setQuantity(selected.getQuantity() - qty);
		cartMap.put(username, userCart);

		System.out.println("Product added to cart!");
	}

	// View cart
	public void viewCart(String username) {
		List<Product1> cart = cartMap.get(username);

		if (cart == null || cart.isEmpty()) {
			System.out.println("Cart is empty!");
			return;
		}

		double total = 0;
		System.out.println("\nCart Details:");
		for (Product1 p : cart) {
			double amt = p.getPrice() * p.getQuantity();
			total += amt;
			System.out.println(
					p.getName() + " | Qty: " + p.getQuantity() + " | Price: ₹" + p.getPrice() + " | Total: ₹" + amt);
		}

		System.out.println("Total Amount: ₹" + total);
	}

	// Remove product
	public void removeFromCart(String username, int productId) {
		List<Product1> cart = cartMap.get(username);

		if (cart == null) {
			System.out.println("Cart not found!");
			return;
		}

		Iterator<Product1> it = cart.iterator();

		while (it.hasNext()) {
			Product1 p = it.next();
			if (p.getId() == productId) {
				// restore stock
				for (Product1 prod : productList) {
					if (prod.getId() == productId) {
						prod.setQuantity(prod.getQuantity() + p.getQuantity());
					}
				}
				it.remove();
				System.out.println("Product removed!");
				return;
			}
		}

		System.out.println("Product not found in cart!");
	}

	// Update quantity
	public void updateQuantity(String username, int productId, int newQty) {
		List<Product1> cart = cartMap.get(username);

		if (cart == null)
			return;

		for (Product1 p : cart) {
			if (p.getId() == productId) {
				int diff = newQty - p.getQuantity();

				for (Product1 prod : productList) {
					if (prod.getId() == productId) {
						if (diff > prod.getQuantity()) {
							System.out.println("Not enough stock!");
							return;
						}
						prod.setQuantity(prod.getQuantity() - diff);
					}
				}

				p.setQuantity(newQty);
				System.out.println("Quantity updated!");
				return;
			}
		}
	}

	// Deliver cart
	public void deliverCart(String username) {
		List<Product1> cart = cartMap.get(username);

		if (cart == null || cart.isEmpty()) {
			System.out.println("Cart empty!");
			return;
		}

		double total = 0;

		System.out.println("\nFinal Bill:");
		for (Product1 p : cart) {
			double amt = p.getPrice() * p.getQuantity();
			total += amt;
			System.out.println(p.getName() + " | " + p.getQuantity() + " | ₹" + p.getPrice() + " | ₹" + amt);
		}

		System.out.println("Total Amount: ₹" + total);
		System.out.println("Order Delivered!");

		cartMap.remove(username);
	}

	public Set<String> getAllUsers() {
		return cartMap.keySet();
	}
}
