package com.Q8;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeExtra {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        TreeMap<String, ArrayList<String>> map = new TreeMap<>();

	        while (true) {
	            System.out.println("\n1.Find Trees");
	            System.out.println("2.Delete City");
	            System.out.println("3.Add City");
	            System.out.println("4.Display All");
	            System.out.println("5.Add Tree to Existing City");
	            System.out.println("6.Find Cities by Tree");
	            System.out.println("7.Exit");

	            int ch = sc.nextInt();

	            switch (ch) {

	                case 1: // find trees
	                    System.out.print("Enter city: ");
	                    String city = sc.next();

	                    if (map.containsKey(city)) {
	                        System.out.println("Trees: " + map.get(city));
	                    } else {
	                        System.out.println("City not found");
	                    }
	                    break;

	                case 2: // delete city
	                    System.out.print("Enter city: ");
	                    map.remove(sc.next());
	                    System.out.println("Deleted");
	                    break;

	                case 3: // add city
	                    System.out.print("Enter city: ");
	                    String newCity = sc.next();

	                    if (map.containsKey(newCity)) {
	                        System.out.println("City already exists");
	                    } else {
	                        ArrayList<String> trees = new ArrayList<>();

	                        System.out.print("How many trees? ");
	                        int n = sc.nextInt();

	                        for (int i = 0; i < n; i++) {
	                            System.out.print("Enter tree: ");
	                            trees.add(sc.next());
	                        }

	                        map.put(newCity, trees);
	                    }
	                    break;

	                case 4: // display all
	                    for (Map.Entry<String, ArrayList<String>> e : map.entrySet()) {
	                        System.out.println(e.getKey() + " -> " + e.getValue());
	                    }
	                    break;

	                case 5: // add new tree in existing list
	                    System.out.print("Enter city: ");
	                    String c = sc.next();

	                    if (map.containsKey(c)) {
	                        System.out.print("Enter tree name: ");
	                        String t = sc.next();
	                        map.get(c).add(t);
	                        System.out.println("Tree added");
	                    } else {
	                        System.out.println("City not found");
	                    }
	                    break;

	                case 6: // find cities by tree
	                    System.out.print("Enter tree name: ");
	                    String tree = sc.next();

	                    boolean found = false;

	                    for (Map.Entry<String, ArrayList<String>> e : map.entrySet()) {
	                        if (e.getValue().contains(tree)) {
	                            System.out.println(e.getKey());
	                            found = true;
	                        }
	                    }

	                    if (!found) {
	                        System.out.println("Tree not found in any city");
	                    }
	                    break;

	                case 7:
	                    System.out.println("Exit...");
	                    sc.close();;
	            }
	        }
	    }
	
}
