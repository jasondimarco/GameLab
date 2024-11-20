package gamelab;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	
	public static void main(String[] args) {
		runGame();
	}
	
	public static ArrayList<Item> inv = new ArrayList<Item>();
	
	public static Room currentRoom = World.buildWorld();
			
	public static void print(Object obj) {
		System.out.println(obj.toString());
	}
	
	public static void runGame() {

		Scanner input = new Scanner(System.in);
		
		String command;
		do {			
			System.out.println(currentRoom);
			System.out.print("What do you want to do? ");
			command = input.nextLine();
			String[] words = command.split(" ");

			switch(words[0]) {
			case "e":
			case "w":
			case "n":
			case "s":
			case "u":
			case "d":
				currentRoom = currentRoom.getExit(command.charAt(0));
				break;
			case "x":
			System.out.println("Bye! Thanks for walking through my game.");
				break;
			case "take":
				Item i = currentRoom.getItem(words[1]); // checks for item in room
				System.out.println("You want to take the " + words[1]);
				if (i == null) {
					System.out.println("Theres nothing here.");
				} else {
					currentRoom.removeItem(words[1]);
					inv.add(i); // takes item from room
					System.out.println("You picked up the " + i.getName());
				}
				break;
			case "i":
				System.out.println("You are carrying:");
				for(Item it : inv) { // prints items in inventory
					System.out.println(it);
				}
				break;
			case "look":
				Item l = currentRoom.getItem(words[1]);
				if (l != null) {
					System.out.println(l.getDesc());
				} else {
					for (Item c : inv) {
						if (words[1].equals(c.getName())) {
							System.out.println(c.getDesc());
							break;
						} else {
							System.out.println("I don't see that anywhere!");
						}
					}
				}
				break;
			case "use":
				Item u = currentRoom.getItem(words[1]);
				System.out.println("You want to use the " + words[1]);
				for (Item se : inv) {
					if (words[1].equals(se.getName())) {
						se.use();
						break;
					} else {
						u.use();
						break;
					}
				}
				break;
			case "open":
				Item o = currentRoom.getItem(words[1]); // checks for item in room
				System.out.println("You want to open the " + words[1]);
				if (o == null) {
					System.out.println("Theres nothing here.");
				} else {
					o.open();
				}
				break;
			default:
				System.out.println("I don't know what you mean.");
			}
			
		} while (!command.equals("x"));

		input.close();
	}
}