package heinz.newsletter163_effectiveJavaReview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BrokenComparatorTest {
	public static Comparator<Integer> naturalOrder = new Comparator<Integer>() {
		public int compare(Integer first, Integer second) {
			return first < second ? -1 : (first == second ? 0 : 1);
		}
	};
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(33);
		list.add(2);
		list.add(-1);
		list.add(101);
		Collections.sort(list, naturalOrder);
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}
}
