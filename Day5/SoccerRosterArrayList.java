import java.util.ArrayList;
import java.util.Random;

public class SoccerRosterArrayList {
      
  private ArrayList<SoccerPlayer> players;
  
  public SoccerRosterArrayList() {
    players = new ArrayList<SoccerPlayer>();
  }
  
  public SoccerPlayer createRandomPlayer() {
    Random r = new Random();
    double new_speed = 10.5 + r.nextDouble() * 4.5;
    String new_name = "player" + r.nextInt(10000);
    return new SoccerPlayer(new_name, new_speed);
  }
  
  
  public void createRandomRoster(int roster_size){
    for (int i = 0; i < roster_size; i++) {
      SoccerPlayer current_player = createRandomPlayer();
      players.add(current_player);
    }
  }
  
  public String toString() {
    String result = "";
    for (int i = 0; i < players.size(); i++) {
      result += players.get(i) + "\n";
    }
    return result;
  }
  

  public static void main(String[] args) {
    // System.out.println(args[1]);
    SoccerRosterArrayList sr = new SoccerRosterArrayList();
    sr.createRandomRoster(20000);
    System.out.println(sr);
  }
  
  
}
