import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

class TrustLink {
  
  private int truster;
  private int trustee;
  
  public TrustLink(int _truster, int _trustee) {
    truster = _truster;
    trustee = _trustee;
  }
  
  public int getTruster() {
    return truster;
  }
  
  public int getTrustee() {
    return trustee;
  }
  
}


public class Datamining {
  
  private ArrayList<TrustLink> links;
  
  public Datamining() {
    links = new ArrayList<TrustLink>();
  }
  
  public ArrayList<Integer> getTrustedBy(int truster) {
    ArrayList<Integer> trustees = new ArrayList<Integer>();
    for (int i = 0; i < links.size(); i++) {
      if (links.get(i).getTruster() == truster) {
        trustees.add(links.get(i).getTrustee());
      }
    }
    return trustees;
  }
  
  public ArrayList<Integer> getTrustersOf(int trustee) {
    ArrayList<Integer> trusters = new ArrayList<Integer>();
    for (int i = 0; i < links.size(); i++) {
      if (links.get(i).getTrustee() == trustee) {
        trusters.add(links.get(i).getTruster());
      }
    }
    return trusters;
  }
  
  public int getMostTrusted() {
    // Create a giant list of trust counts (1 for each user)
    int[] trust_counts = new int[75888];
    
    // Go through all links and update trust counts accordingly
    for (int i = 0; i < links.size(); i++) {
      int trustee = links.get(i).getTrustee();
      trust_counts[trustee]++;
    }
    
    // Now trust counts are populated
    int current_biggest = trust_counts[0];
    int current_biggest_id = 0;
    for (int i = 1; i < trust_counts.length; i++) {
      if (trust_counts[i] > current_biggest) {
        current_biggest = trust_counts[i];
        current_biggest_id = i;
      }
    }
    return current_biggest_id;
  }
  

  public void loadDataset(String filename) {
    try {
      File f = new File(filename);
      Scanner my_scanner = new Scanner(f);
      while (my_scanner.hasNextInt()) {
        int truster = my_scanner.nextInt();
        int trustee = my_scanner.nextInt();
        TrustLink tl = new TrustLink(truster, trustee);
        links.add(tl);
      }
    }
    catch (FileNotFoundException e) {
      System.out.println("ERROR: " + e);
    }
    
  }



  public static void main(String[] args) {
      Datamining dm = new Datamining();
      dm.loadDataset("epinions.txt");
      ArrayList<Integer> results = dm.getTrustedBy(5117);
      System.out.println(results);
      ArrayList<Integer> results2 = dm.getTrustersOf(18);
      System.out.println(results2);
      
      int most_trusted = dm.getMostTrusted();
      System.out.println("Most trusted is: " + most_trusted);


  }


}







//
