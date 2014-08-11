package examLab.exam3.q44;

public class IntTest {
	public static void main(String[] args) {
		int a = 1, b = 2, c = 3;
		int[] d = { 0, a, b };
		do {
			for (int e : d) {
				a += e + ++b;
				c -= b;
			}
		} while (a < c);
		System.out.println(a+" "+b+" "+c);
	}

}
