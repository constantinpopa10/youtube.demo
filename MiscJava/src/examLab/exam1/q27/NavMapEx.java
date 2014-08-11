package examLab.exam1.q27;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavMapEx {
	public static void main(String[] args) {
		NavigableMap<String,Integer> navmap = new TreeMap<String,Integer>();
		navmap.put("one", 1);
		navmap.put("two", 2);
		navmap.put("three", 3);
		navmap.put("four", 4);
		navmap.put("five", 5);
		navmap.put("six", 6);
		
		String[] ob = new String[]{
				navmap.lowerKey("five"),
				navmap.higherKey("five"),
				navmap.ceilingKey("five"),
				navmap.floorKey("five")				
		};
		for (String string : ob) {
			System.out.println(string + " ,");
		}
	}
}
