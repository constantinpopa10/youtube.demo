package heinz.newsletter149_LawOfHaberdashery;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class ThreadConstructTest {
	private static final int NUMBER_OF_THREADS = 100*1000;
	private Semaphore semaphore = new Semaphore(10);
	private final Runnable job = new Runnable(){
		public void run(){	
			int waits = semaphore.getQueueLength();
			if(waits >=1){
				System.err.println("Threads waiting to acquire: " + Thread.currentThread().getId() + " : " + waits);
			};
			semaphore.release();
		}
	};
	
	public void noThreadPool() throws InterruptedException{
		for (int i = 0; i < NUMBER_OF_THREADS; i++) {			
			semaphore.acquire();			
			new Thread(job).start();
		}
		//wait for all jobs to finish
		semaphore.acquire(10);
		semaphore.release(10);
	}
	
	public void fixedThreadPool() throws InterruptedException{
		ExecutorService pool = Executors.newFixedThreadPool(12);
		for (int i = 0; i < NUMBER_OF_THREADS; i++) {
			semaphore.acquire();
			pool.submit(job);
		}
		
		semaphore.acquire(10);
		semaphore.release(10);
		pool.shutdown();
	}
	
	public static void main(String[] args) throws InterruptedException {
		ThreadConstructTest test = new ThreadConstructTest();
		long time = System.currentTimeMillis();
		test.noThreadPool();
		System.out.println(System.currentTimeMillis() - time);
		
		time = System.currentTimeMillis();
		test.fixedThreadPool();
		System.out.println(System.currentTimeMillis() - time);
	}
}
