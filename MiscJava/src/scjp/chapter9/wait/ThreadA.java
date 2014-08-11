package scjp.chapter9.wait;

public class ThreadA {
	public static void main(String[] args) throws InterruptedException {
		ThreadB b = new ThreadB();
		b.start();
        Thread.sleep(5000);
		synchronized (b) {
			try {
				System.out.println("Waiting for b to complete...");
				if (b.isAlive())
				b.wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
			}

			System.out.println("Total is: " + b.total);

		}
	}
}

class ThreadB extends Thread {
	int total;

	public void run() {
		synchronized (this) {
			for (int i = 0; i < 100; i++) {
				total += i;
			}
			notify();
		}
	}
}