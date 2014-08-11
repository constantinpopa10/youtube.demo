package examLab.exam3;

public class A {
	public static void paint(byte s1){
		System.out.println("byte ");
	}
	
	public static void paint(short s1){
		System.out.println("short ");
	}
	
	public static void paint(Short s1){
		System.out.println("SHORT");
	}
	
	public static void paint(short...s1){
		System.out.println("short...");
	}
	
	public static void main(String[] args) {
		paint(4);
	}
}
