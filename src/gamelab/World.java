package gamelab;

public class World {
	// Builds the game world.
	// Returns the room the player starts in.
	
	public static Room buildWorld() {
		Room cavern = new Room("Cavern, a massive cave opening with a bridge over chasm.");
		Room chamber = new Room("Chamber, a small dark cave pocket with a stream running through.");
		Room camp = new Room("Camp, spacious cliff ledge with an old fire pit.");
		Room hall = new Room("Hall, a long rocky corridor.");
		Room crawl = new Room("Crawlspace, what a dingy and cramped space!");

		
		hall.addExit(cavern, 'e');
		
		hall.addExit(chamber, 'w');
		
		
		cavern.addExit(hall, 'w');
		
		cavern.addExit(camp, 'n');
		
		cavern.addExit(crawl, 's');	
		
		Safe safe = new Safe("Safe", "It's an impressive safe!");
		cavern.setItem(safe);

		Combination combination = new Combination("Combination", "Actually very simple combination.");
		cavern.setItem(combination);
		
		camp.addExit(cavern, 's');
		
		Item satchel = new Item("Satchel", "A rugged leather satchel, worn and scuffed.");
		camp.setItem(satchel);
		
		Item key = new Item("Key", "A tarnished bronze key with a twisted stem and a handle shaped like a snake head.");
		camp.setItem(key);
		
		Item bone = new Item("Skeleton", "Remnents of what looks like the last person to reside at this camp.");
		camp.setItem(bone);
		
		
		chamber.addExit(hall, 'e');
		
		
		crawl.addExit(cavern, 'n');
		
		Item chest = new Item("Chest", "A wooden chest, reinforced with iron bands, sitting ominously in the corner");
		crawl.setItem(chest);
		
		
		return cavern;
	}
}