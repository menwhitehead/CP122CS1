import javax.swing.JOptionPane;

public class IQ {

  public static void main(String[] args) {

    String user_input = JOptionPane.showInputDialog("Enter your IQ: ");
    int iq = Integer.parseInt(user_input);

    if (iq > 150) {
      JOptionPane.showMessageDialog(null, "You're a high-iq person");
    }
    else if (iq > 125) {
      JOptionPane.showMessageDialog(null, "You're in the middle");
    }
    else {
      JOptionPane.showMessageDialog(null, "You're not a high-iq person");
    }
  }
}
