package examLab.exam3.q28;

public class A extends Thread{
	public static void doDelay(long t){
		try {
			Thread.sleep(t);
		} catch (InterruptedException e) {
			System.out.println("Ex-A");
		}
	}
	
	public void run(){
		doDelay(3000);		
		halt();
	}
	
	public void halt(){
		try {
			Thread.currentThread().sleep(3000);
			System.out.println("did delay 3000");
		} catch (Exception e) {
			System.out.println("Ex-B");
		}
	}
	
	public static void main(String[] args) throws Exception{
		A a = new A();
		Thread t = new Thread(a);
		t.start();
		doDelay(1000);
		t.interrupt();
	}
}
