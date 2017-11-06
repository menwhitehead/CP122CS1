
public class EnergeticZombie extends Zombie {

	// Instance variables/fields
	private double energy;

	// Constructor
	public EnergeticZombie(String new_name, double new_running_speed) {
		super(new_name, new_running_speed);
		energy = 0;
	}

	public double getEnergy() {
		return energy;
	}
	
	public void run() {
		System.out.println("Run with no parameters");
		run(1);
	}

	public void run(double seconds) {
		System.out.println("Run with a parameter:" + seconds);
		super.run(seconds);
		energy += 10;
	}
	
	public void run(String motivational_message) {
		System.out.println(motivational_message);
		run();
	}


}























//
