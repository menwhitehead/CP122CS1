import javax.swing.JFrame;
import javax.swing.JButton;

public class MySecondGui {

	public MySecondGui() {
		JFrame frame = new JFrame();
		JButton button = new JButton("Click me or die.");
		frame.add(button);
		frame.setSize(300, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		MySecondGui myGUI = new MySecondGui();
	}
}
