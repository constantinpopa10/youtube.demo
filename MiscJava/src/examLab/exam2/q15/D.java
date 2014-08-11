package examLab.exam2.q15;

final public class D extends B {
	public static void main(String[] args) {
		A a = new F();
		// Object ob = new Object();
		B b = new D();
		C c = new C();
		D d = null;
		b=(B)a;
	}

}

class A {
}

class B extends A {
}

class C extends A {
}

class F extends A {
}
