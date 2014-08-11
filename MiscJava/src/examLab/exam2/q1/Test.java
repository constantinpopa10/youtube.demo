package examLab.exam2.q1;

public class Test extends Thread{
	private static Thread mainThread = null;

	public static void main(String[] args) {
		mainThread = Thread.currentThread();
		Thread t = new Thread(){
			public void run(){
				try {					
								
					Thread.sleep(1000);	
					Thread.currentThread().interrupt();	
					System.out.println("Thread B is interrupted: " + interrupted());
					System.out.println("Thread B is interrupted: " + mainThread.isInterrupted());
					System.out.println("ThreadB");
				} catch (InterruptedException e) {					
					e.printStackTrace();
				}
			}			
		};
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			System.out.println("main thread interrupted");
			e.printStackTrace();
		}
		System.out.println(mainThread.getState().toString());
		System.out.println("Main thread");
	}	
}
