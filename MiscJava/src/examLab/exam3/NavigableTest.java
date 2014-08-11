package examLab.exam3;

import java.util.HashMap;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class NavigableTest {
	public static void main(String[] args) {
		NavigableMap<Integer, String> nvs = new TreeMap<Integer, String>();
		nvs.put(1, "one");
		nvs.put(2, "two");
		nvs.put(3, "three");
		nvs.put(4, "four");
		NavigableSet nss = (NavigableSet) nvs.keySet();
		HashMap hm = new HashMap();
		Set hms = hm.keySet();
	}
}
