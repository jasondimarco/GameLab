package gamelab;

public class Safe extends Item {

	public Safe(String n, String d) {
		super(n, d);
	}

	@Override
	public void open() {
		for (Item c : Game.inv)
			if (c.getName().equals("Combination")) {
				Item diamond = new Item("diamond", "Shiny.");
				Game.inv.add(diamond);
				Game.print(
						"Using the combination, you open the safe and find a diamond inside! Naturally, you pocket the diamond.");
				return;
			}
		Game.print("The safe is locked and you don't have the combination.");
	}
}
