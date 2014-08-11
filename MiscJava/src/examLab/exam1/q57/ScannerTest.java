package examLab.exam1.q57;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ScannerTest {
	public static void main(String[] args) {
		String context="0100 55 3L 62D 127 6F (int)7";
		Scanner s = new Scanner(context);
		s.useDelimiter(Pattern.compile("\\s|L"));
		while (s.hasNextLong()) {
			System.out.println(s.nextLong() + ",");			
		}
	}
}
