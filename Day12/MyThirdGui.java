import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MyThirdGui {

	public MyThirdGui() {
		JFrame frame = new JFrame();
		JButton button = new JButton("Click me or die.");

		// Add a new ActionListener onto this button
		button.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent event){
    			System.out.println("You just clicked me, so you don't have to die.");
    			// System.out.println(event);
        }
    });

		frame.add(button);
		frame.setSize(300, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		MyThirdGui myGUI = new MyThirdGui();
	}
}
