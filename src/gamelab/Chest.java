package gamelab;

public class Chest extends Item {

	public Chest(String n, String d) {
		super(n, d);
	}

	@Override
	public void open() {
		for (Item c : Game.inv)
			if (c.getName().equals("Key")) {
				Item glasses = new Item("glasses", "tattered but not broken pair of bifocals.");
				Game.inv.add(glasses);
				Game.print(
						"You turn the key hear a click and lift the lid to find a dusty pair of glasses inside. You take them.");
				return;
			}
		Game.print("The chest is locked but it looks like there's a keyhole.");
	}
}
