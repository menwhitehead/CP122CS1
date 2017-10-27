// Include the libraries necessary for graphics
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

// Create a subclass of JComponent
// This will allow us to draw graphics
class RobotComponent extends JComponent{

    private ArrayList<Robot> robots;

    public RobotComponent(int number_robots) {
      Random r = new Random();
      robots = new ArrayList<Robot>();
      for (int i = 0; i < number_robots; i++) {
        robots.add(new Robot("Robo", r.nextInt(800), r.nextInt(800), r.nextInt(25)));
      }
    }

    // This special method is automatically called when the scene needs to be drawn.
    public void paintComponent(Graphics g) {
      // for (Robot current_robot : robots) {
      //   current_robot.draw(g);
      // }
      
      for (int i = 0; i < robots.size(); i++) {
        Robot current_robot = robots.get(i);
        current_robot.draw(g);
      }
        // robot.draw(g);
    }

    public static void main(String[] args) {
        int WINDOW_WIDTH = 800;
        int WINDOW_HEIGHT = 800;

        JFrame frame = new JFrame();
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setTitle("Robots!");

        RobotComponent rc = new RobotComponent(1000);

        frame.add(rc);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
