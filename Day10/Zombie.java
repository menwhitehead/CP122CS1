
public class Zombie extends Person {

	// Instance variables/fields
	private int brains_consumed;

	// Constructor
	public Zombie(String new_name, double new_running_speed) {
		super(new_name, new_running_speed);
		brains_consumed = 0;
	}

	// Methods
	public void groan() {
		System.out.println("grrrrrrrrrrrrrrrrrrrrrrron");
	}
	
	public String getName() {
		return super.getName() + "!";
	}

	public int getBrainsConsumed() {
		return brains_consumed;
	}

	public void consumeBrains(int brains_just_consumed) {
		brains_consumed += brains_just_consumed;
	}


}























//
