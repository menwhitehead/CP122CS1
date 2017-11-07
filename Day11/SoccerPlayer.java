
import java.util.Random;

public class SoccerPlayer implements Comparable {
  
  private String name;
  private double speed;
  
  public SoccerPlayer(String new_name, double new_speed) {
    name = new_name;
    speed = new_speed;
  }
  
  public double getSpeed() {
    return speed;
  }
  
  public int compareTo(Object other_obj) {
    SoccerPlayer other = (SoccerPlayer) other_obj;
    if (this.speed < other.getSpeed()) {
      return -1;
    }
    else if (this.speed > other.getSpeed()) {
      return 1;
    }
    else {
      return 0;
    }
  }
  
  public String toString() {
    return "SoccerPlayer: " + name + " " + speed;
  }
  
  
  public static void main(String[] args) {
    SoccerPlayer p1 = new SoccerPlayer("Tracy", 4.2);
    SoccerPlayer p2 = new SoccerPlayer("Tracie", 4.3);
    if (p1.compareTo(p2) < 0) {
      System.out.println(p2 + " wins!");
    }
    else if (p1.compareTo(p2) > 0) {
      System.out.println(p1 + " wins!");
    }
    else {
      System.out.println(p1 + " ties " + p2);
    }

  }
  
  
}









//
