package examLab.exam1.q28;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Astron {
	public static void main(String[] args) {
		Set<String> m = new TreeSet(Collections.reverseOrder());
		m.add("verbose");
		m.add("assert");
		m.add(null);
		m.add("nowarn");
		for (String string : m) {
			System.out.println(string + " ,");
		}
	}
}
