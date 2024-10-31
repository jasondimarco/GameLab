package gamelab;

public class Item {

	private String name; // Item's name
	private String desc; // Item's description
	
	public void open() {
		Game.print("You can't open that!");
	}
	
	public void use() {
		Game.print("You can't use that!");
	}
	
	public Item (String n, String d) {
		name = n;
		desc = d;
	}
	
	public void setDesc(String d) {
		desc = d;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public String toString() {
		return name;
	}
}
