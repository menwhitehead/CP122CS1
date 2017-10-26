import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Checkerboard extends JComponent {

  public Checkerboard(){
  }

  public void paintComponent(Graphics g) {
    
    int width = getWidth();
    int height = getHeight();
    
    int cell_width = width / 8;
    int cell_height = height / 8;
    
    for (int col = 0; col < 8; col++) {
      for (int row = 0; row < 8; row++) {

        if ((row + col) % 2 == 0) {
          g.setColor(Color.BLACK);
        } 
        else {
          g.setColor(Color.WHITE);
        }

        g.fillRect(col*cell_width, row*cell_height, cell_width, cell_height);
      }
    }

  }

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setSize(400, 400);
    frame.setTitle("Checkerboard!");

    Checkerboard checkers = new Checkerboard();
    frame.add(checkers);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
