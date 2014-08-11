package examLab.exam1.q37;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetTest {
	
	public static void main(String[] args) {
		NavigableSet<Integer> items = new TreeSet<Integer>(Collections.reverseOrder());
		items.add(8);
		items.add(4);
		items.add(12);
		items.add(9);
		items.add(6);
		NavigableSet<Integer> dups = items.subSet(4, true, 9, true);
		
		
		for (Integer integer : dups) {
			System.out.println(integer + " ");
		}
	}
	
}
