

public class MultiplicationTable {
  
  public static void main(String[] args) {
    int[][] mult_table = new int[12][12];
    
    for (int row = 0; row < 12; row++) {
      for (int col = 0; col < 12; col++) {
        mult_table[row][col] = (row + 1) * (col + 1);
      }
    }
    
    for (int row = 0; row < 12; row++) {
      for (int col = 0; col < 12; col++) {
        System.out.printf("%5d", mult_table[row][col]);
      }
      System.out.println();
    }
    
  }
  
}
