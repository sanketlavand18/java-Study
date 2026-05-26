package com.Q7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeCity {

	
	
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // TreeMap → sorted by city name
	        TreeMap<String, ArrayList<String>> map = new TreeMap<>();

	        while (true) {
	            System.out.println("\n1.Find Trees");
	            System.out.println("2.Delete City");
	            System.out.println("3.Add City");
	            System.out.println("4.Display All");
	            System.out.println("5.Exit");

	            int ch = sc.nextInt();

	            switch (ch) {

	                case 1: // find trees for a city
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
	                    String c = sc.next();

	                    map.remove(c);
	                    System.out.println("Deleted");
	                    break;

	                case 3: // add new entry
	                    System.out.print("Enter city: ");
	                    String newCity = sc.next();

	                    if (map.containsKey(newCity)) {
	                        System.out.println("City already exists");
	                    } else {
	                        ArrayList<String> trees = new ArrayList<>();

	                        System.out.print("How many trees? ");
	                        int n = sc.nextInt();

	                        for (int i = 0; i < n; i++) {
	                            System.out.print("Enter tree name: ");
	                            trees.add(sc.next());
	                        }

	                        map.put(newCity, trees);
	                    }
	                    break;

	                case 4: // display all (Iterator + foreach)

	                    System.out.println("Using Iterator:");
	                    Iterator<Map.Entry<String, ArrayList<String>>> it =
	                            map.entrySet().iterator();

	                    while (it.hasNext()) {
	                        Map.Entry<String, ArrayList<String>> e = it.next();
	                        System.out.println(e.getKey() + " -> " + e.getValue());
	                    }

	                    System.out.println("\nUsing for-each:");
	                    for (Map.Entry<String, ArrayList<String>> e : map.entrySet()) {
	                        System.out.println(e.getKey() + " -> " + e.getValue());
	                    }
	                    break;

	                case 5:
	                    System.out.println("Exit...");
	                    sc.close();
	            }
	        }
	    }
	}
