

public class Armor {

  private int protection_level;
  private int value;
  
  public Armor(int _protection_level, int _value) {
    protection_level = _protection_level;
    value = _value;
  }
  
  public int getSellValue() {
    return value;
  }
  
  public int getBuyValue() {
    return 2*value;
  }

}
