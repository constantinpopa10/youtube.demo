package examLab.exam1.q40;

public class A {
	public static void printIT(){
		System.out.println("GIT");
	}
	
	public static void main(String argv[]) {
		A a = new A(){
			public static void printIT(){
				System.out.println("ICT");
			}
		};
		a.printIT();
	}
	static public class B {
		public static void printIT(){
			System.out.println("B");
		}
	}
	public class C{
		public static void printIT(){
			System.out.println("CC");
		}
	}
}
