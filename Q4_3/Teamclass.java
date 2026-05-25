package com.Q4_3;

import java.util.ArrayList;

public class Teamclass {

	int teamId;
	String tname;
	String coach;
	ArrayList<Player> players;

	Teamclass(int teamId, String tname, String coach) {
		this.teamId = teamId;
		this.tname = tname;
		this.coach = coach;
		players = new ArrayList<>();
	}

	public String toString() {
		return teamId + " " + tname + " Coach: " + coach;
	}
}
