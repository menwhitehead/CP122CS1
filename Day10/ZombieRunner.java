import java.util.ArrayList;

public class ZombieRunner {

	public static void main(String[] args) {
		ArrayList<Person> people = new ArrayList<Person>();
		Zombie z = new Zombie("Margaret", 7.2);
		Student s = new Student("Zim", 7.1, "CS");
		Person per = new Person("Percy", 7.0);

		people.add(z);
		people.add(s);
		people.add(per);

		for (Person p : people) {
			System.out.println(p.getName());
		}

	}

}


















//
