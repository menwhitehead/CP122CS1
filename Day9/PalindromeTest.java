import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PalindromeTest {

  @Test
  public void checkPalindrome1() {
    boolean result = Palindrome.isPalindrome("eve");
    assertEquals(true, result);
  }
  
  @Test
  public void checkPalindrome2() {
    boolean result = Palindrome.isPalindrome("dog");
    assertEquals(false, result);
  }
  
  @Test
  public void checkPalindrome3() {
    boolean result = Palindrome.isPalindrome("racecar");
    assertEquals(true, result);
  }
  
  @Test
  public void checkPalindrome4() {
    boolean result = Palindrome.isPalindrome("");
    assertEquals(true, result);
  }
  
  @Test
  public void checkPalindrome5() {
    boolean result = Palindrome.isPalindrome("abc c ba");
    assertEquals(false, result);
  }


}







//
