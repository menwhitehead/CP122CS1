

// This is the parent/super class
public class Person {

	// Instance variables/fields
	private String name;
	private double running_speed;
	private double distance_run;

	// Constructor
	public Person(String new_name, double new_running_speed) {
		name = new_name;
		running_speed = new_running_speed;
		distance_run = 0.0;
	}

	public String getName() {
		return name;
	}

	public double getRunningSpeed() {
		return running_speed;
	}

	public double getDistanceRun() {
		return distance_run;
	}

	public void run(double seconds) {
		distance_run += running_speed * seconds;
	}


}























//
