package gamelab;

public class Disc extends Item { // this is my Key Item for Step 4

	public Disc(String n, String d) {
		super(n, d);
	}
	
	@Override
	public void use() {
		Game.print("I wonder what these ancient symbols mean!");
	}
	
}
