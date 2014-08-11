package examLab.exam1.q16;

/**
 * @author Costi
 * 
 */
public class Stgs {
	public static void main(String[] args) {
		String[] st = new String[] { "Java", "Language" };
		StringBuilder sb = new StringBuilder(st[0]);
		
		System.out.println(sb.codePointCount(0, sb.length()));
	}
}
