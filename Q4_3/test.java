package com.Q4_3;

import java.util.ArrayList;
import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Teamclass> teams = new ArrayList<>();

		while (true) {
			System.out.println("\n1.Add Team\n2.Delete Team\n3.Delete Player");
			System.out.println("4.Display Batsman\n5.Display by Speciality");
			System.out.println("6.Add Player\n7.Modify Coach\n8.Exit");

			int ch = sc.nextInt();

			switch (ch) {

			// add team
			case 1: 
				System.out.print("Enter id, name, coach: ");
				int id = sc.nextInt();
				String name = sc.next();
				String coach = sc.next();
				teams.add(new Teamclass(id, name, coach));
				break;
			
				 // delete team
			case 2:
				System.out.print("Enter team id: ");
				int tid = sc.nextInt();
				teams.removeIf(t -> t.teamId == tid);
				break;

				// delete player
			case 3: 
				
				System.out.print("Enter player id: ");
				int pid = sc.nextInt();
				for (Teamclass t : teams) {
					t.players.removeIf(p -> p.pid == pid);
				}
				break;

				// display batsman
			case 4: 
				for (Teamclass t : teams) {
					for (Player p : t.players) {
						if (p.speciality.equalsIgnoreCase("batsman")) {
							System.out.println(p);
						}
					}
				}
				break;
				
				
				// display by speciality
			case 5: 
				System.out.print("Enter speciality: ");
				String sp = sc.next();
				for (Teamclass t : teams) {
					for (Player p : t.players) {
						if (p.speciality.equalsIgnoreCase(sp)) {
							System.out.println(p);
						}
					}
				}
				break;

				// add player
			case 6: 
				System.out.print("Enter team id: ");
				int teamid = sc.nextInt();

				for (Teamclass t : teams) {
					if (t.teamId == teamid) {
						System.out.print("Enter pid name speciality: ");
						int p = sc.nextInt();
						String pn = sc.next();
						String ps = sc.next();
						t.players.add(new Player(p, pn, ps));
					}
				}
				break;

				 // modify coach
			case 7:
				System.out.print("Enter team id: ");
				int tmid = sc.nextInt();

				for (Teamclass t : teams) {
					if (t.teamId == tmid) {
						System.out.print("Enter new coach: ");
						t.coach = sc.next();
					}
				}
				break;

			case 8:
				System.out.println("Exit...");
				sc.close();
			}
		}
	}

}

