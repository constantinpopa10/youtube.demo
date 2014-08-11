package examLab.exam1.q19;

import java.io.File;
import java.util.Arrays;

class A{
	A() throws InterruptedException{
		System.out.println("A");
		Thread.sleep(1000);
		System.out.println("B");
	}
}

public class B extends A implements Runnable{
	public void run(){
		System.out.print("C");
	}
	
	public static void main(String[] args) {
		Thread t = new Thread(new B());
		t.start();
	}
	
}
class TestAbstract_Sync{
	void test(){
		
	}
}
class C extends TestAbstract_Sync{
	synchronized void test(){
		Arrays.asList(a)
	}
}