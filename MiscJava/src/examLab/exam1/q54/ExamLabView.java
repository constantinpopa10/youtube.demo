package examLab.exam1.q54;

import java.math.BigDecimal;

public class ExamLabView {
	public static void main(String[] args) {
		String a = "a";
		Object b = new StringBuilder("b");
		Object c = new StringBuilder("c");
		
		Object d = a+b;
		Object e = c+a;
		
		Boolean b1 = new Boolean(d instanceof String);
		Boolean b2 = new Boolean(d instanceof StringBuilder);
		Boolean b3 = new Boolean(e instanceof String);
		Boolean b4 = new Boolean(e instanceof StringBuilder);
		System.out.println(b1 + ", " + b2+", "+b3+", "+b4);
		
		String i0 = "0";
		BigDecimal i1 = new BigDecimal("2");
		BigDecimal i2 = new BigDecimal("4");
		String i3 = i0 + i2;
	}
}
