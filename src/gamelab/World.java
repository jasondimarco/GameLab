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
		
		hall.setLock(true);
		
		
		cavern.addExit(hall, 'w');
		
		cavern.addExit(camp, 'n');
		
		cavern.addExit(crawl, 's');	
		
		Safe safe = new Safe("Safe", "It's an impressive safe!");
		cavern.setItem(safe);

		Combination combination = new Combination("Combination", "Actually very simple combination.");
		cavern.setItem(combination);
		
		cavern.setLock(true);
		
		
		camp.addExit(cavern, 's');
		
		Satchel satchel = new Satchel("Satchel", "A rugged leather satchel, worn and scuffed.");
		camp.setItem(satchel);
		
		Key key = new Key("Key", "A tarnished bronze key with a twisted stem and a handle shaped like a snake head.");
		camp.setItem(key);
		
		Item bone = new Item("Skeleton", "Remnents of what looks like the last person to reside at this camp.");
		camp.setItem(bone);
		
		Disc disc = new Disc("Disc", "Small ancient stone disc with detailed symbols.");
		camp.setItem(disc);
		
		camp.setLock(true);
		
		
		chamber.addExit(hall, 'e');
		
		NPC puppy = new NPC("puppy", "A hideous puppy wags his tail.");
		chamber.setNPC(puppy);
		
		chamber.setLock(true);
		
		
		crawl.addExit(cavern, 'n');
		
		Chest chest = new Chest("Chest", "A wooden chest, reinforced with iron bands, sitting ominously in the corner");
		crawl.setItem(chest);
		
		crawl.setLock(true);
		
		
		ladder.addExit(hall, 's');
		
		ladder.setLock(false);
		
		
		return cavern;
	}
}