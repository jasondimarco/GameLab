package gamelab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.io.*;

public class Game {

	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// call method to read room description file
		gamegui = new GameGUI();
		print(currentRoom);
		try {
			Scanner input = new Scanner(new File("RoomDescription.txt"));
			while(input.hasNextLine()) {
				Thread.sleep(1000); // sleep for 1 second
				String line = input.nextLine();
				System.out.println(line);
			}
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!!!");
		} catch (InterruptedException ex) {
			System.out.println("Bummer.");
		}
	}
	
	HashMap<String,Room> roomdesc = new HashMap<>();
	
	
	
	private static GameGUI gamegui;
	
	public static void print(Object obj) {
		gamegui.texta.append(obj.toString()+"\n");
	}
	
	public static ArrayList<Item> inv = new ArrayList<Item>();
	
	public static Room currentRoom = World.buildWorld();
		
	public static void processCommand(String command) {
		
		String[] words = command.split(" ");

		switch(words[0]) {
		case "e":
		case "w":
		case "n":
		case "s":
		case "u":
		case "d":
			Room nextRoom = currentRoom.getExit(command.charAt(0));
			if (nextRoom.getLock().equals(true)) {
				currentRoom = nextRoom;
			} else {
				System.out.println("Its locked!");
			}
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
		case "talk":
			NPC n = currentRoom.getNPC(words[1]);
			n.talk();
			break;
		default:
			System.out.println("I don't know what you mean.");
		}

		input.close();
	}
}