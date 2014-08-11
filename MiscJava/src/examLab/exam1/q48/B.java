package examLab.exam1.q48;

public class B extends A{
	B(){
		this(89);
		System.out.println("d");
	}
	
	B(int p){
		super(p);
		System.out.println("e");
	}
	
	public static void main(String[] args) {
		new B();
	}
}

class A{
	A(){
		super();
		System.out.println("a");
	}
	
	A(int i){
		this();
		System.out.println("b");
	}
	
	{
		System.out.println("c");
	}
}
