package com.Q2.model;

public class Friend {

	private int id;
	private String name;
	String lastname;
	private String[] hobbies;
	long mobno;
	String email;
	String bdate;
	String address;

	public Friend(int id, String name, String lastname, String[] hobbies, long mobno, String email, String bdate,
			String address) {
		this.setId(id);
		this.setName(name);
		this.lastname = lastname;
		this.setHobbies(hobbies);
		this.mobno = mobno;
		this.email = email;
		this.bdate = bdate;
		this.address = address;
	}

	public void display() {
		System.out.println("ID: " + getId());
		System.out.println("Name: " + getName() + " " + lastname);

		System.out.print("Hobbies: ");
		for (String h : getHobbies()) {
			System.out.print(h + " ");
		}
		System.out.println();

		System.out.println("Mobile: " + mobno);
		System.out.println("Email: " + email);
		System.out.println("Birth Date: " + bdate);
		System.out.println("Address: " + address);
		System.out.println("------------------------");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

}
