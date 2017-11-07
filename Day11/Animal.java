

public abstract class Animal {

  private String name;
  private int cuteness;

  public Animal(String _name, int _cuteness) {
    name = _name;
    cuteness = _cuteness;
  }

  public int getCuteness() {
    return cuteness;
  }

  public String getName() {
    return name;
  }

  public abstract void sayHello();

}


// class Tester {
// 
//   public static void main(String[] args) {
//     Animal a = new Animal("Bambi", 11);
//   }
// 
// }
