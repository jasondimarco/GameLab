package gamelab;

public class Combination extends Item {

	public Combination(String n, String d) {
		super(n, d);
	}
	
	@Override
	public void use() {
		Game.print("If you find a safe, try opening it!");
	}
	
}
