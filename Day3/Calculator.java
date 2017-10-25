import javax.swing.JOptionPane;

public class Calculator {

  public static void main(String[] args) {

    String firstString = JOptionPane.showInputDialog("Enter first int: ");
    int firstValue = Integer.parseInt(firstString);

    String secondString = JOptionPane.showInputDialog("Enter second int: ");
    int secondValue = Integer.parseInt(secondString);
    int answer = firstValue + secondValue;    

    JOptionPane.showMessageDialog(null, "Answer is..." + answer);
  }
}
