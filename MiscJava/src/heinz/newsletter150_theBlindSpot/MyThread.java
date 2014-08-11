package heinz.newsletter150_theBlindSpot;

import java.util.concurrent.TimeUnit;

public class MyThread extends Thread {
	private static ThreadCheck tc = new ThreadCheck();

	public void run() {
		synchronized (tc) {
			tc.running = true;
			while (tc.running) {
				try {
					TimeUnit.SECONDS.sleep(10);
					shutdown();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public void shutdown() {
		synchronized (tc) {
			tc.running = false;
		}

	}
}

class ThreadCheck {
	public boolean running = true;
}
