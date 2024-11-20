package gamelab;

import java.util.HashMap;

public class Room {

	private Room east; // directions options for each room
	private Room west;
	private Room north;
	private Room south;
	private Room up;
	private Room down;
	private String desc;
	private boolean lock;
	private String rname;
	
	public void setRname(String r) {
		rname = r;
	}
	
	public String getRname() {
		return rname;
	}
	
	public void setLock(boolean l) {
		lock = l;
	}
	
	public boolean getLock() {
		return lock;
	}
	
	HashMap<String, Item> item = new HashMap<>();
	
	public void setItem(Item i) {
		String n = i.getName();
		item.put(n , i);
	}
	
	public Item getItem(String n) {
		return item.get(n);
	}

	public void removeItem(String n) {
		item.remove(n);
	}
	
	public Room(String de) {
		desc = de;
	}

	public Room getExit(char c) {
		if (c == 'e') {
			return east;
		}
		else if (c == 'w') {
			return west;
		}
		else if (c == 'n') {
			return north;
		}
		else if (c == 's') {
			return south;
		}
		else if (c == 'u') {
			return up;
		}
		else if (c == 'd') {
			return down;
		}
		else {
			return null;
		}
	}	
	
	public void addExit(Room r , char c) {
		if (c == 'e') {
			east = r;
		}
		else if (c == 'w') {
			west = r;
		}
		else if (c == 'n') {
			north = r;
		}
		else if (c == 's') {
			south = r;
		}
		else if (c == 'u') {
			up = r;
		}
		else if (c == 'd') {
			down = r;
		}
	}
	
	public String toString() {
		return desc;
	}

}