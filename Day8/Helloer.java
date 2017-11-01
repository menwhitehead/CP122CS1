

public class Helloer {

  public void sayWord(String word) {
    System.out.println(word);
    sayWord(word);
  }

  public static void main(String[] args) {
    Helloer h = new Helloer();
    h.sayWord("word");
  }

}
