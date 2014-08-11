package heinz.newsletter192_thisEscape;

public class ThisEscapeTest {
	  public static void main(String[] args) {
	    EventSource2 es = new EventSource2();
	    es.start();
	    while(true) {
	      new ThisEscape(es);
	    }
	  }
	}