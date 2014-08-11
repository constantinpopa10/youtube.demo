package examLab.Diagnostic.q21;

public class Asrt {
	public static void main(String[] args) {
		boolean[] b = new boolean[] {true, false, true, false};
		if(b[1] && b[3]){
			b[0] = false;
			System.out.println("1");
		}
		
		if(b[1] && b[2])
		{
			b[0] = true;
			System.out.println("2");
		}
	
		System.out.println("Before Assert ");
		assert b[0] && b[2];
	    System.out.println("After Assert");
	}
}
