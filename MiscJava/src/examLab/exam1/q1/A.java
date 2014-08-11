package examLab.exam1.q1;

public class A {
	static class B{
		public void capture(){
			System.out.println("Cap:A.B");
		}
	}
	static class C extends B{
		public void capture(){
			System.out.println("Cap:A.C");
		}
	}
	public void capture(){System.out.println("Cap:A");	
	}
	public static void main(String[] args) {
		C ob = new C();
		ob.capture();
	}
}
