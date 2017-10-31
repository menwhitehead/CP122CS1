import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.PrintWriter;

public class WikiReader {

  public int getWordCount(String target_word) {
    int target_word_count = 0;
    int total_word_count = 0;
    try {
      File current_file = new File("/home/mwhitehead/Desktop/wikipedia.txt");
      Scanner my_scanner = new Scanner(current_file);
      while (my_scanner.hasNext()) {
        String token = my_scanner.next();
        total_word_count++;
        if (total_word_count % 1000000 == 0) {
          System.out.println(total_word_count);
        }
        if (token.equals(target_word)) {
          target_word_count++;
        }
      }
    }
    catch (FileNotFoundException e) {
      System.out.println("ERROR: " + e);
      System.exit(1);
    }
    return target_word_count;
  }


  public static void main(String[] args) {
    WikiReader wr = new WikiReader();
    int final_count = wr.getWordCount("dog");
    try {
      PrintWriter pw = new PrintWriter("output.txt");
      pw.write("Found dog " + final_count + " times.\n");
      pw.write("Done!");
      pw.flush();
      pw.close();
    }
    catch (FileNotFoundException e) {
      System.out.println("ERRORROROROR: " + e);
    }
  }
}









//
