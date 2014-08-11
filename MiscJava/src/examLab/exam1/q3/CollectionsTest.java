package examLab.exam1.q3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class CollectionsTest {
	public static void main(String[] args) {
		Collections.reverse(new ArrayList(){{add(2);add(3);}});
		Collections.reverseOrder();
		Arrays.asList(new String[]{"blah", "hey", "yo"});
		String[] s = new String[]{"blah", "hey", "yo"};
		
		List<String> lst1 = new Vector<String>();
		List<String> lst2 = new Vector<String>();
		
		
	}
}
