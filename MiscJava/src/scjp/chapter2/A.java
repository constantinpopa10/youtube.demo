package scjp.chapter2;

public class A {
	public static void main(String args[]) {
		new B();
		char c = (char) 70000;
		System.out.println(c);
	}
}

class B extends A {
	int num = 0;

	B() {
		this(2);
	}

	B(int num) {
		super();
		this.num = num;
	}

	public static void main(String args[]) {
		new B();
		char c = (char) 70000;
		System.out.println(c);
	}
}