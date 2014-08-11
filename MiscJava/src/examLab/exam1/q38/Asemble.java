package examLab.exam1.q38;

public class Asemble {
	public static void main(String[] args) {
		try {
			go1();
		} catch (Exception e) {
			System.out.println("B");
		}
	}
	public static void go1() throws ArrayIndexOutOfBoundsException{
		go2();
	}
	public static void go2() throws ArithmeticException{
		go3();		
	}
	public static void go3() throws InterruptedException{
		go4();
	}

	public static void go4() throws NullPointerException{
		System.out.println("A");
		throw new ArrayIndexOutOfBoundsException();
	}
}
