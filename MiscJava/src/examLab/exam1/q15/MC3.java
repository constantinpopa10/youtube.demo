package examLab.exam1.q15;

public class MC3 {
	public static void main(String[] args) {
		XSync ns = new XSync();
		Thread t1 = new Thread(ns);
		Thread t2 = new Thread(ns);
		t1.start();
		t2.start();
	}
}
