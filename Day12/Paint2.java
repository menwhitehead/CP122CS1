import javax.swing.JFrame;
import javax.swing.JComponent;
import java.io.File;
import java.awt.*;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;



public class Paint2 extends JComponent implements MouseMotionListener {

	ArrayList<Point> points;
  int point_size = 10;

	public Paint2() {
		points = new ArrayList<Point>();
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {	
		// System.out.println("CLICKED!");
		// points.add(new Point(e.getX(), e.getY())); 
		// repaint();
	}	
	
	@Override
	public void mouseDragged(MouseEvent e) {	
		System.out.println("CLICKED!");
		points.add(new Point(e.getX(), e.getY())); 
		repaint();
	}

	public void paintComponent(Graphics g) {
		// for (Point p : points) {
		for (int i = 1; i < points.size(); i++) {
			Point start = points.get(i-1);
			Point end = points.get(i);
			// g.fillOval((int)p.getX(), (int)p.getY(), point_size, point_size);
			g.drawLine((int)start.getX(), (int)start.getY(), (int)end.getX(), (int)end.getY());
		}
	}


	public static void main(String args[]) {
		JFrame frame = new JFrame();
		Paint2 painter = new Paint2();

        // We need a listener for the moving mouse
		painter.addMouseMotionListener(painter);
		frame.add(painter);
		frame.setSize(600, 600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
