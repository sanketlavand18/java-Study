package com.Q4_3;

public class Player {

	int pid;
	String pname;
	String speciality;

	Player(int pid, String pname, String speciality) {
		this.pid = pid;
		this.pname = pname;
		this.speciality = speciality;
	}

	public String toString() {
		return pid + " " + pname + " " + speciality;
	}
}
