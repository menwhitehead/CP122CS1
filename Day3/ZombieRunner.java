import java.util.Scanner;

public class ZombieRunner {

	public static void main(String[] args){
		Scanner my_scanner = new Scanner(System.in);
		System.out.print("Please enter a zombie name: ");
		String name = my_scanner.nextLine();
		
		Zombie my_zombie = new Zombie(name);
		my_zombie.consumeBrains(7);
		
		System.out.print("Please enter a zombie name: ");
		String name2 = my_scanner.nextLine();
		
		Zombie my_zombie2 = new Zombie(name2);
		my_zombie2.consumeBrains(8);
		
		if (my_zombie.getBrainsConsumed() > my_zombie2.getBrainsConsumed()) {
			System.out.println(my_zombie.getName() + " has consumed more brains");
		}
		else {
			System.out.println(my_zombie2.getName() + " has consumed the same or more brains");
		}
	}

}























//
