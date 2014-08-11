package examLab.exam3;

public class ClaTest {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		assert 1==2;
	}
}

interface test{
	String test() throws Exception;
}