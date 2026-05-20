package com.Q2.Service;

import com.Q2.model.Friend;

public class FriendService {

	// 1. Display all
	public void displayAll(Friend[] f) {
		for (Friend fr : f) {
			fr.display();
		}
	}

	// 2. Search by ID
	public void searchById(Friend[] f, int id) {
		boolean found = false;

		for (Friend fr : f) {
			if (fr.getId() == id) {
				fr.display();
				found = true;
			}
		}

		if (!found) {
			System.out.println("Friend not found");
		}
	}

	// 3. Search by Name
	public void searchByName(Friend[] f, String name) {
		boolean found = false;

		for (Friend fr : f) {
			if (fr.getName().equalsIgnoreCase(name)) {
				fr.display();
				found = true;
			}
		}

		if (!found) {
			System.out.println("Friend not found");
		}
	}

	// 4. Search by Hobby
	public void searchByHobby(Friend[] f, String hobby) {
		boolean found = false;

		for (Friend fr : f) {
			for (String h : fr.getHobbies()) {
				if (h.equalsIgnoreCase(hobby)) {
					fr.display();
					found = true;
					break;
				}
			}
		}

		if (!found) {
			System.out.println("No friend found with this hobby");
		}
	}
}
