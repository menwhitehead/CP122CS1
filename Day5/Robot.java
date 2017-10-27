// Include the libraries necessary for graphics
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

class Robot {

    // instance variables
    private String name;
    private int x;
    private int y;
    private int size;

    // constructor
    public Robot(String _name, int _x, int _y, int _size) {
        name = _name;
        x = _x;
        y = _y;
        size = _size;
    }

    public void draw(Graphics g) {
      Random r = new Random();
      int red = r.nextInt(256);
      int green = r.nextInt(256);
      int blue = r.nextInt(256);
      Color c = new Color(red, green, blue);
      g.setColor(c);
      g.fillRect(x, y, size, size);
      g.fillRect(x-size, y+size, 3*size, 3*size);
    }


}
