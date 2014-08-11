package examLab.exam2.q21;

public class Method_overloading {

	public Method_overloading(Object o ) {
		System.out.println("Object in");		
	}
	
	public Method_overloading(Integer o ) {
		System.out.println("Integer in");		
	}
	
	public Method_overloading(Number o ) {
		System.out.println("Number in");		
	}
	
	public Method_overloading(String o ) {
		System.out.println("String in");		
	}
	
	public static void main(String[] args) {
		//new Method_overloading(null);
	}
	
}
