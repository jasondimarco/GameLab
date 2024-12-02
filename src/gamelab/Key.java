package gamelab;

public class Key extends Item {
	
	public Key(String n, String d) {
		super(n, d);
	}
	
	@Override
	public void use() {
		Game.print("This looks like something that would open a chest!");
	}
	
}
