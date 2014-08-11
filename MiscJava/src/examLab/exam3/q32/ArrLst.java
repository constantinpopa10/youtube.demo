package examLab.exam3.q32;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrLst {
	public static void main(String[] args) {
		List<String> st = new ArrayList<>();
		int i = 0;
		String s = new String("Immutable ");
		st.add("Hello ");
		st.add(s);
		st.add("World ");
		
		Collections.sort(st);
		
		i= Collections.binarySearch(st, s);
		System.out.println(st.get(i));
		
		i=Collections.binarySearch(st, "World ");
		System.out.println(st.get(i));
	}
}
