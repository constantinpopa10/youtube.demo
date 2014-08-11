package examLab.Diagnostic.q12;

public class A {
	protected String runNow(){
		return "High";
	}
	
	static class B extends A{
		public String runNow(){
			return "Low";
		}
	}
	
	public static void main(String[] args) {
		A[] a = new B[]{new B(), new C()};
		for (A aa : a) {
			System.out.println(aa.runNow()+ " ");
		}
	}
	
}

class C extends A.B{
	public String runNow(){
		return "Out";
	}
}
