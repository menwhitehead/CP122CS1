import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Chessboard extends JComponent {

  private Chesslogic game_board;
  BufferedImage[] images;

  public Chessboard(){
    game_board = new Chesslogic();
    game_board.initBoard();
    game_board.removePiece(6, 0);
    
    images = new BufferedImage[2];
    images[0] = loadImage("black_pawn.gif");
    images[1] = loadImage("white_king.gif");
  }

  // Load a new image from a file so it can
  // be drawn in the paintComponent method
  public BufferedImage loadImage(String filename) {
      BufferedImage img = null;
      try {
          img = ImageIO.read(new File(filename));
      } catch (IOException e) {
          System.out.println("Could not read image! " + filename);
      }
      return img;
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
        
        
        // What image to draw?
        String current_piece = game_board.getPiece(row, col);
        if (current_piece.equals("bp")) {
          g.drawImage(images[0], col*cell_width, row*cell_height, null);
        }
        else if (current_piece.equals("wk")) {
          g.drawImage(images[1], col*cell_width, row*cell_height, null);
        }

      }
    }

  }

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    frame.setSize(400, 400);
    frame.setTitle("Chess!!!");

    Chessboard chess = new Chessboard();
    frame.add(chess);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}







//
