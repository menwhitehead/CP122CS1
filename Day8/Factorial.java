

public class Factorial {
  
  public static int factorial(int n) {
    // Base case
    if (n == 1) {
      return 1;
    }
    // Recursive case (n > 1)
    else {
      return n * factorial(n-1);
    }
  }

  public static void main(String[] args) {
    int x = Integer.parseInt(args[0]);
    System.out.println(Factorial.factorial(x));
  }
}
