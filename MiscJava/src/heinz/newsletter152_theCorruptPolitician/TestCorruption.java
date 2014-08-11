package heinz.newsletter152_theCorruptPolitician;

import java.util.concurrent.CountDownLatch;
import java.util.*;

public class TestCorruption {
  private static final int THREADS = 2;
  private static final CountDownLatch latch =
      new CountDownLatch(THREADS);
  private static final BankAccount heinz =
      new BankAccount(1000);

  public static void main(String[] args) {
    for (int i = 0; i < THREADS; i++) {
      addThread();
    }
    Timer timer = new Timer(true);
    timer.schedule(new TimerTask() {
      public void run() {
        try {
			System.out.println(heinz.getBalance());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      }
    }, 100, 1000);
  }

  private static void addThread() {
    new Thread() {
      { start(); } 
      public void run() {
        latch.countDown();
        try {
          latch.await();
        } catch (InterruptedException e) {
          return;
        }
        while (true) {
          try {
			heinz.deposit(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          try {
			heinz.withdraw(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        }
      }
    };
  }
}