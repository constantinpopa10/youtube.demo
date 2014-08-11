package examLab.Diagnostic.q4;

public class A {
	A a;
	public A(A a){
		this.a = a;
	}
	
	public static void main(String[] args) {
		long mem = Runtime.getRuntime().totalMemory();
		System.out.println((mem/(1024*1024)) );
		A a1 =null;
		A a2 =new A( new A(null));
		A a3 =new A(a2);
		a1 = a3;
		a1.a = new A(null);
		a2.a = null;
		System.gc();
		
	}
}
