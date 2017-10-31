import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Heartrate {
  
    ArrayList<HeartratePoint> data;
    
    public Heartrate() {
      data = new ArrayList<HeartratePoint>();
    }
    
    public void readHeartrateData(String filename) {
      try {
        File current_file = new File(filename);
        Scanner my_scanner = new Scanner(current_file);
        while (my_scanner.hasNextInt()) {
          int time = my_scanner.nextInt();
          int heart_rate = my_scanner.nextInt();
          HeartratePoint current_point = new HeartratePoint(time, heart_rate);
          data.add(current_point);
        }
      }
      catch (FileNotFoundException e) {
        System.out.println("ERROR: " + e);
        System.exit(1);
      }
    }
    
    public double getAverageHeartRate() {
      double heart_rate_sum = 0.0;
      for (int i = 0; i < data.size(); i++) {
        HeartratePoint current_point = data.get(i);
        heart_rate_sum += current_point.getHeartRate();
      }
      return heart_rate_sum / data.size();
    }
    
    
    public static void main(String[] args) {
      Heartrate hr = new Heartrate();
      hr.readHeartrateData("heartrater.txt");
      System.out.println(hr.getAverageHeartRate());
    }
    
    
    
}







//
