package examLab.exam3.q27;

public class ThreadTest extends Thread {
	public ThreadTest(int x){
		this.x=x;
	}
	
	static String s = "";
	static volatile int x = 0;
	public static void doVIP(){
		s=s+x;
		try {
			Thread.sleep(10);
		} catch (Exception e) {
			s=s+x;
		}
	}
	
	public void run(){
		synchronized (s) {
			doVIP();
		}
	}
	
	public static void doDelay(long g){
		try {
			Thread.sleep(g);
		} catch (Exception e) {
			
		}
	}
	
	public static void main(String[] args) {
		ThreadTest tc1 = new ThreadTest(2);
		ThreadTest tc2 = new ThreadTest(1);
		ThreadTest tc3 = new ThreadTest(0);
		
		tc1.start(); doDelay(100); System.out.print(s);
		tc2.start(); doDelay(100); System.out.print(s);
		tc3.start(); doDelay(100); System.out.print(s);
		
		
	}
}
