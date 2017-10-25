import javax.swing.JOptionPane;

public class Login {

	public static void main(String[] args){
		// Create a pop-up window
		String prompt = "Please enter your username";
		String username = JOptionPane.showInputDialog(prompt);

		String prompt2 = "Please enter your password";
		String password = JOptionPane.showInputDialog(prompt2);

		JOptionPane.showMessageDialog(null, "Logged in!");
	}

}























//
