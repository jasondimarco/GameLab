package gamelab;

public class Satchel extends Item {

	public Satchel(String n, String d) {
		super(n,d);
	}
	
	@Override
	public void open() {
		Item note = new Item("Note","Haha I left that fool's glasses in some chest! I won't even hide this note because he can't read it! Hahahah!");
		Game.inv.add(note);
		Game.print("You open the satchel and pull out an old piece of paper.");
		return;
	}
}
