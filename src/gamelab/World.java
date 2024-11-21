package gamelab;

public class World {
	// Builds the game world.
	// Returns the room the player starts in.
	
	public static Room buildWorld() {
		Room cavern = new Room("Cavern", "A massive cave opening with a bridge over a chasm.");
		Room chamber = new Room("Chamber", "A small dark cave pocket with a stream running through.");
		Room camp = new Room("Camp", "Spacious cliff ledge with an old fire pit.");
		Room hall = new Room("Hall", "A long rocky corridor with a dead-end marked with elaborate carvings.");
		Room crawl = new Room("Crawlspace", "What a dingy and cramped space!");
		Room ladder = new Room("Exit", "Small space with a ladder leading to the ceiling.");

		
		hall.addExit(cavern, 'e');
		
		hall.addExit(chamber, 'w');
		
		hall.addExit(ladder, 'n');
		
		hall.setLock(false);
		
		
		cavern.addExit(hall, 'w');
		
		cavern.addExit(camp, 'n');
		
		cavern.addExit(crawl, 's');	
		
		Safe safe = new Safe("Safe", "It's an impressive safe!");
		cavern.setItem(safe);

		Combination combination = new Combination("Combination", "Actually very simple combination.");
		cavern.setItem(combination);
		
		cavern.setLock(false);
		
		
		camp.addExit(cavern, 's');
		
		Item satchel = new Item("Satchel", "A rugged leather satchel, worn and scuffed.");
		camp.setItem(satchel);
		
		Item key = new Item("Key", "A tarnished bronze key with a twisted stem and a handle shaped like a snake head.");
		camp.setItem(key);
		
		Item bone = new Item("Skeleton", "Remnents of what looks like the last person to reside at this camp.");
		camp.setItem(bone);
		
		Item disc = new Item("Disc", "Small ancient stone disc with detailed symbols.");
		camp.setItem(disc);
		
		camp.setLock(false);
		
		
		chamber.addExit(hall, 'e');
		
		chamber.setLock(false);
		
		
		crawl.addExit(cavern, 'n');
		
		Item chest = new Item("Chest", "A wooden chest, reinforced with iron bands, sitting ominously in the corner");
		crawl.setItem(chest);
		
		crawl.setLock(false);
		
		
		ladder.addExit(hall, 's');
		
		ladder.setLock(true);
		
		
		return cavern;
	}
}