
public class Chesslogic {
  
  public static final int BOARD_SIZE = 8;
  
  private String[][] board;
  

  public Chesslogic(){
    board = new String[BOARD_SIZE][BOARD_SIZE];
  }
  
  public void initBoard() {
    // Create the starting position of the game board
    for (int row = 0; row < BOARD_SIZE; row++) {
      for (int col = 0; col < BOARD_SIZE; col++) {
        addPiece(row, col, "");
      }
    }
    addPiece(6, 0, "bp");
    addPiece(6, 1, "bp");
    addPiece(6, 2, "bp");
    addPiece(6, 3, "bp");
    addPiece(6, 4, "bp");
    addPiece(6, 5, "bp");
    addPiece(6, 6, "bp");
    addPiece(6, 7, "bp");

    addPiece(0, 3, "wk");


  }
  
  public void addPiece(int row, int col, String piece) {
    board[row][col] = piece;  
  }
  
  public void removePiece(int row, int col) {
    board[row][col] = "";  
  }
  
  public String getPiece(int row, int col) {
    return board[row][col];
  }
  
  public void movePiece(int start_row, int start_col, int end_row, int end_col) {
    String current_piece = getPiece(start_row, start_col);
    removePiece(start_row, start_col);
    addPiece(end_row, end_col, current_piece);
  }

  
}

















//
