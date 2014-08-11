package heinz.newsletter152_theCorruptPolitician;

import java.util.concurrent.locks.*;

public class BankAccount {
  private int balance;
  private final ReadWriteLock lock =
      new ReentrantReadWriteLock();

  public BankAccount(int balance) {
    this.balance = balance;
  }

  public void deposit(int amount) throws InterruptedException {
    lock.writeLock().lockInterruptibly();
    try {
      int check = balance + amount;
      balance = check;
      if (balance != check) {
        throw new AssertionError("Data Race Detected");
      }
    } finally {
      lock.writeLock().unlock();
    }
  }

  public void withdraw(int amount) throws InterruptedException {
    deposit(-amount);
  }

  public int getBalance() throws InterruptedException {
    lock.readLock().lockInterruptibly();
    try {
      return balance;
    } finally {
      lock.readLock().unlock();
    }
  }
}