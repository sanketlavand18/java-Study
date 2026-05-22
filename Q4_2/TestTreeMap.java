package com.Q4_2;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
	
	    public static void main(String[] args) {

	        TreeMap<Integer, Employee> map = new TreeMap<>();

	        map.put(3, new Employee(3, "Rahul", 55000, "Sales", "Executive"));
	        map.put(1, new Employee(1, "Amit", 50000, "IT", "Developer"));
	        map.put(2, new Employee(2, "Neha", 60000, "HR", "Manager"));

	        System.out.println("Employees in TreeMap are Sorted by ID:");

	        for (Map.Entry<Integer, Employee> entry : map.entrySet()) {
	            System.out.println(entry.getValue());
	        }
	    }
	
	

}
