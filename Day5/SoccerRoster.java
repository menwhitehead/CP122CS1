
import java.util.Random;

public class SoccerRoster {
  
  public static final int ROSTER_SIZE = 20;
    
  private double[] speeds;
  
  public SoccerRoster() {
    speeds = new double[SoccerRoster.ROSTER_SIZE];
  }
  
  public void createRandomSpeeds() {
    Random r = new Random();
    for (int i = 0; i < speeds.length; i++) {
      speeds[i] = 10.5 + r.nextDouble() * 4.5;
    }
  }
  
  public String toString() {
    String result = "";
    for (int i = 0; i < speeds.length; i++) {
      result += speeds[i] + "\n";
    }
    return result;
  }
  

  
  
  public static void main(String[] args) {
    // System.out.println(args[1]);
    SoccerRoster sr = new SoccerRoster();
    sr.createRandomSpeeds();
    System.out.println(sr);
  }
  
  
}
