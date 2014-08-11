package heinz.newsletter194_trySynchronize;

import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class Symposium {
	private final ReentrantLock[] cups;
	private final Thinker[] thinkers;

	public Symposium(int delegates) {
		cups = new ReentrantLock[delegates];
		thinkers = new Thinker[delegates];
		for (int i = 0; i < cups.length; i++) {
			cups[i] = new ReentrantLock();
		}
		for (int i = 0; i < delegates; i++) {
			ReentrantLock left = cups[i];
			ReentrantLock right = cups[(i + 1) % delegates];
			thinkers[i] = new Thinker(i, left, right);
		}
	}

	public void run() throws InterruptedException {
		// do this after we created the symposium, so that we do not
		// let the reference to the Symposium escape.
		ExecutorService exec = Executors.newCachedThreadPool();
		CompletionService<String> results = new ExecutorCompletionService<String>(exec);
		for (Thinker thinker : thinkers) {
			results.submit(thinker);
		}
		System.out.println("Waiting for results");
		for (int i = 0; i < thinkers.length; i++) {
			try {
				System.out.println(results.take().get());
			} catch (ExecutionException e) {
				e.getCause().printStackTrace();
			}
		}
		exec.shutdown();
	}

	public static void main(String[] args) throws InterruptedException {
		Symposium symposium = new Symposium(5);
		symposium.run();
	}
}