package examLab.exam2.q9;

import java.util.HashSet;
import java.util.Set;

public class Printf {
	public static void main(String[] args) {
		System.out.printf("45%2$b%3$+05d",978,654,321,111);
		Set<String> la = new HashSet<>();
		la.add("Pascal");
		la.add("BASIC");
		la.add("C++");
		for (Object string : la) {
			System.out.println(string.toString());
		}
		
	}
}
