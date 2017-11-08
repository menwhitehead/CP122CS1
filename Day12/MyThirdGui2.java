import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


class ClickListener implements ActionListener {
	public void actionPerformed(ActionEvent event){
		// System.out.println("You just clicked me, so you don't have to die.");
		System.out.println(event);
	}
}

public class MyThirdGui2 {

	public MyThirdGui2() {
		JFrame frame = new JFrame();
		JButton button = new JButton("Click me or die.");

		// Add a new ActionListener onto this button
		ClickListener cl = new ClickListener();
		button.addActionListener(cl);

		frame.add(button);
		frame.setSize(300, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		MyThirdGui2 myGUI = new MyThirdGui2();
	}
}
