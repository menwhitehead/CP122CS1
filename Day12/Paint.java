import javax.swing.JFrame;
import javax.swing.JComponent;
import java.io.File;
import java.awt.*;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;


public class Paint extends JComponent implements MouseListener {

	ArrayList<Point> points;

	public Paint() {
		points = new ArrayList<Point>();
	}
	
	@Override
	public void mouseExited(MouseEvent e) {	}
	
	@Override
	public void mouseEntered(MouseEvent e) {	}
	
	@Override
	public void mouseReleased(MouseEvent e) {	}
	
	@Override
	public void mousePressed(MouseEvent e) {	}
	
	@Override
	public void mouseClicked(MouseEvent e) {	
		System.out.println("CLICKED!");
		points.add(new Point(e.getX(), e.getY())); 
		repaint();
	}
	

	public void paintComponent(Graphics g) {
    // We can use Point objects to store (x, y) coordinates
		for (Point p : points) {
			g.fillOval((int)p.getX(), (int)p.getY(), 10, 10);
		}
	}


	public static void main(String args[]) {
		JFrame frame = new JFrame();
		Paint painter = new Paint();

    // painter needs to listen for mouse events
		painter.addMouseListener(painter);

		frame.add(painter);
		frame.setSize(600, 600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}







//
