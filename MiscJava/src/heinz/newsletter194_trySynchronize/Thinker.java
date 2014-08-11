package heinz.newsletter194_trySynchronize;

import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class Thinker implements Callable<String> {
	private static final int SYNC_JAVA_5 = 1;
	private static final int SYNC_UNSAFE = 2;
	private static final int SYNC_OLD_SCHOOL = 3;
	private final int id;
	private final ReentrantLock left, right;
	private static int TYPE_OF_SYNC = SYNC_UNSAFE;

	public Thinker(int id, ReentrantLock left, ReentrantLock right) {
		this.id = id;
		this.left = left;
		this.right = right;
	}

	public String call() throws Exception {
		for (int i = 0; i < 1000; i++) {
			drink(i);
			think(i);
		}
		return "Java is fun";
	}

	public void drink(int i) throws InterruptedException {
		if (TYPE_OF_SYNC==SYNC_JAVA_5) {
			while (true) {
				if (Thread.interrupted())
					throw new InterruptedException();
				if (left.tryLock()) {
					try {
						if (right.tryLock()) {
							try {
								System.out.printf("(%d) Drinking--(%d)--%n", id,i);
								return;
							} finally {
								right.unlock();
							}
						}
					} finally {
						left.unlock();
					}
				}else{
					System.out.printf("(%d) Cannot get lock--(%d)--%n", id,i);
				}
//				if (timeoutExceeded())
//					throw new TimeoutException();
//				sleepRandomTime();
			}
		} else if(TYPE_OF_SYNC==SYNC_OLD_SCHOOL) {
			synchronized (left) {
				synchronized (right) {
					System.out.printf("(%d) Drinking--(%d)--%n ", id, i);
				}
			}
		} else if(TYPE_OF_SYNC==SYNC_UNSAFE){
			while (true) {
				  if (Thread.interrupted()) throw new InterruptedException();
				  if (MonitorUtils.trySynchronize(left)) {
				    try {
				      if (MonitorUtils.trySynchronize(right)) {
				        try {
				          System.out.printf("(%d) Drinking--(%d)--%n ", id, i);
				          return;
				        } finally {
				          MonitorUtils.unsynchronize(right);
				        }
				      }
				    } finally {
				      MonitorUtils.unsynchronize(left);
				    }
				  }				 
				}
		}

	}

	public void think(int i) {
		System.out.printf("(%d) Thinking--(%d)--%n ", id, i);
	}
}