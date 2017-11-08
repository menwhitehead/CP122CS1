import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFirstGui {

	public MyFirstGui() {
		JFrame frame = new JFrame();
		JLabel jlbHelloWorld = new JLabel("Hello World");
		frame.add(jlbHelloWorld);
		frame.setSize(200, 100);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		MyFirstGui myGUI = new MyFirstGui();
	}
}







