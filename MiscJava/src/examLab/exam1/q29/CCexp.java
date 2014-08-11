package examLab.exam1.q29;

public class CCexp {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		Min m = null;
		b = (C)m;
		m = (Min)b;
		A a2 = (A)m;
		B b2 = (B)a2;
		Min m2 = (C)b2;
		C c2 = (C)m2;
	}
}
interface Min{}
class A{}
class B extends A implements Min{}
class C extends B{}

//B is a A, Min

//C is a B, A, Min

