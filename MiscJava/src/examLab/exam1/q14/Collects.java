package examLab.exam1.q14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Collects {
	public static void main(String[] args) {
		List<String> hydrocarbon = new ArrayList<>();
		hydrocarbon.add("CH4");
		hydrocarbon.add("C2H6");
		hydrocarbon.add("C2H4");
		hydrocarbon.add("COOH");
		Collections.sort(hydrocarbon);
		for (String string : hydrocarbon) {
			System.out.println(string+",");
		}
	}
}
