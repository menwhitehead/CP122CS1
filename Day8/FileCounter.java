import java.io.File;

public class FileCounter {

  public static int countFiles(File current) {
    // base case
    if (current.isFile()) {
      return 1;
    }
    // recursive case (current is a folder)
    else {
      int total_count = 0;
      File[] children = current.listFiles();
      for (File child  : children) {
        int child_count = countFiles(child);
        total_count += child_count;
      }
      return total_count;
    }
  }

  public static void main(String[] args) {
    File starting_point = new File(args[0]);
    System.out.println("FILE COUNT: " + countFiles(starting_point));
  }

}





//
