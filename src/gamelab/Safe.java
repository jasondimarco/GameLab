package gamelab;

public class Safe extends Item {

	public Safe(String n, String d) {
		super(n, d);
	}
	
	@Override
	public void open() {
		if (Game.inv.get(combination).equals(null)) {
			Item diamond = new Item("diamond", "Shiny.");
			Game.inv.add(diamond);
			Game.print("Using the combination, you open the safe and find a diamond inside! Naturally, you pocket the diamond.");
		} else {
			Game.print("The safe is locked and you don't have the combination.");
		}
	}
}
