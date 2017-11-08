import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JComponent;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;


class CoinCanvas extends JComponent {

	BufferedImage heads_image = null;
	BufferedImage tails_image = null;
	boolean show_heads;

	public CoinCanvas() {
		try {
			heads_image = ImageIO.read(new File("heads.jpg"));
			tails_image = ImageIO.read(new File("tails.jpg"));
			show_heads = true;
		}
		catch (IOException e) {
			System.out.println("ERROR: " + e);
			System.exit(1);
		}
	}
	
	public void showTails() {
		show_heads = false;
	}
	
	public void showHeads() {
		show_heads = true;
	}

  @Override
	public void paintComponent(Graphics g) {
		if (show_heads) {
       g.drawImage(heads_image, 30, 30, this);
		}
		else {
			 g.drawImage(tails_image, 30, 30, this);
		}
	}
}


public class MyFourthGui {

	public MyFourthGui() {
		JFrame frame = new JFrame();
		CoinCanvas cc = new CoinCanvas();

		cc.addMouseListener(new MouseAdapter() {
				@Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Coin flipped...");
						Random r = new Random();
						double rand = r.nextDouble();  // between 0 and 1
						if (rand < 0.5) {
							cc.showHeads();
						}
						else {
							cc.showTails();
						}
						cc.repaint();
        }
    });
		frame.add(cc);
		frame.setSize(350, 350);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String args[]) {
		MyFourthGui myGUI = new MyFourthGui();
	}
}
