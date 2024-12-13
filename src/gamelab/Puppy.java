package gamelab;

public class Puppy extends NPC {

	public Puppy() {
		super("puppy", "A hideous puppy wags his tail.");
	}
	
	@Override
	public void talk() {
		say("Hi! I'm an adorable puppy!");
		String[] options = {
				"Yes you are! Who's a good boy?",
				"Ew, no. You're actually kinda hideous."
		};
		getResponse(options);
	}
	
	@Override
	public void response(int option) {
		switch (option) {
				case 1:
					say("I am!  I'm a good boy!");
					break;
				case 2:
					say("I am adorable! Why are you so mean?");
					Game.print("The puppy bites you. You deserve it.");
					break;
		}
	}
}