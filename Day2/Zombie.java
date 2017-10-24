
public class Zombie {

	// Instance variables/fields
	private String name;
	private int brains_consumed;


	// Constructor
	public Zombie(String new_name) {
		name = new_name;
		brains_consumed = 0;
	}

	// Methods
	public void groan() {
		System.out.println("grrrrrrrrrrrrrrrrrrrrrrron");
	}

	public String getName() {
		return name;
	}

	public int getBrainsConsumed() {
		return brains_consumed;
	}

	public void consumeABrain() {
		brains_consumed++;
	}

}























//
