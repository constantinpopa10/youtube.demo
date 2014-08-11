package examLab.Diagnostic.q13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {
	public void row() {
		System.out.println("Row Data");
	}

	public static class B extends A {
		public void row() throws SubClassExceptionList {
			System.out.println("Information");
		}
	}

	public static void main(String[] args) {
		A ab = new B();
		ab.row();

		Pattern pt = Pattern.compile("Sun");
		Matcher mt = pt.matcher("Sun Certified Java Programmer");

		Boolean b = mt.find();
		System.out.println("Match found: " + b);
		System.out.println(mt.group());

	}

	class SubClassExceptionList extends RuntimeException {

	}
}
