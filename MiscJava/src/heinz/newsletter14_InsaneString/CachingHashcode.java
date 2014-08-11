package heinz.newsletter14_InsaneString;

public class CachingHashcode {
	  public static void main(String[] args) {
	    java.util.Map<String, String> map = new java.util.HashMap<String, String>();
	    map.put("hi there", "You found the value");
	    map.put("hi there2", "You found the value2");
	    new Warper();
	    System.out.println(map.get("hi there"));
	    System.out.println(map);
	  }
	
	@SuppressWarnings("unused")
	private static final String greeting = "hi there";
	}