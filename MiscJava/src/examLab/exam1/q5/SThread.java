package examLab.exam1.q5;

public class SThread implements Runnable{
	String s;
	public void run(){
		try {
			System.out.println("A");
		    Thread.sleep(1000);
		    System.out.println("B");
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted");
		}
	}
	public static void main(String[] args) {
		Thread t = new Thread(new SThread());
		t.start(); t.interrupt();
		
	}
	final synchronized void testM(){
		
	}
}
