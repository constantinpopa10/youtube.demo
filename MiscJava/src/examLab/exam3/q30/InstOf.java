package examLab.exam3.q30;

interface I{}
class A{}
class B implements I{}
class C extends A{}
class D{}
final class E implements I{}
public class InstOf {
	public static void main(String[] args) {
		Boolean b;
		b= new E() instanceof I;
		b=new A[]{new A(), new C()} instanceof I[];
		System.out.println(b);
	}
}
