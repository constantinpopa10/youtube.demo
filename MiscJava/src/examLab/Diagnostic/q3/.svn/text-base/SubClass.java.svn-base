package examLab.Diagnostic.q3;


class SuperClass{
	static void printMe(){
		System.out.println("super context");
	}
}

public class SubClass extends SuperClass{
	public static void printMe() throws ArithmeticException{
		System.out.println("sub context");
	}
	
	@SuppressWarnings("static-access")
	public static void main(String args[]){
		SuperClass sc = new SubClass();
		sc.printMe();
	}
}
