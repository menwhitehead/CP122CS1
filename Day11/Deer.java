

public class Deer extends Animal {

  private int number_spots;

  public Deer(String _name, int _cuteness, int _number_spots) {
    super(_name, _cuteness);
    number_spots = _number_spots;
  }

  public int getNumberSpots() {
    return number_spots;
  }

  public void sayHello() {
    System.out.println("HELLO!");
  }

}


class Tester {

  public static void main(String[] args) {    Animal d = new Deer("Bambi", 11, 81);
    // System.out.println(d.getName() + " has " + d.getNumberSpots() + " spots");
    d.sayHello();
  }

}






//
