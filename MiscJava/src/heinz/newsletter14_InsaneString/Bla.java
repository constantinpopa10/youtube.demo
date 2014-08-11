package heinz.newsletter14_InsaneString;

public class Bla {
	  private char[] c1 = "hello".toCharArray();
	  private final char[] c2 = "bye".toCharArray();
	  public String toString() {
	    return c1.toString() + ", " + c2.toString();
	  }
	}