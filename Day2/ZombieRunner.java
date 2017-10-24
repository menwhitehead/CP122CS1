

public class ZombieRunner {

	public static void main(String[] args){
		Zombie my_zombie = new Zombie("Margaret");
		my_zombie.groan();
		System.out.println("Zombie's name is " + my_zombie.getName());
		my_zombie.consumeABrain();
		System.out.println("Zombie has consumed " + my_zombie.getBrainsConsumed() + " brains");
	}

}























//
