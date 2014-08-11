package scjp.chapter10.q4b;
import scjp.chapter10.q4a.*;
public class Fiz extends Foo{
	public static void main(String[] args) {
		Foo f = new Foo();
		//System.out.println("  "  + f.a); -- compiler error
		//System.out.println(" " + f.b); -- compiler error
		//System.out.println(" " + new Fiz().a); -- compiler error
		System.out.println(" " + new Fiz().b);
		//System.out.println(" " + super.b);
	}
	public void test(){
		int b = super.b;
	}

	
}
