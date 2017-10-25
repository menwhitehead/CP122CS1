
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

	public void consumeBrains(int brains_just_consumed) {
		brains_consumed += brains_just_consumed;
	}
	
	public boolean equals(Zombie other_zombie) {
		// return true is both zombies have the same name and # brains
		if (name.equals(other_zombie.getName())) {
			if (brains_consumed == other_zombie.getBrainsConsumed()) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}

}























//
