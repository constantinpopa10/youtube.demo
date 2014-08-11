package examLab.exam1.q25;

public class TestNumber {
	public static void main(String[] args) {
		System.out.println(getNumber(5) + getNumber(5));
	}

	private static String getNumber(int x) {
		try {
			return "" + (x - 2);

		} finally {
			return "" + (x + 2);
		}
	}
}
